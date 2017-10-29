import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.InputMismatchException;

	public class Stuform 
	{
		String name;
		String email;
		long rn;
		String address;
		String ph;
		double hsc;
		double ug;
		
		public Stuform() throws IOException
		{
			try{
				InputStreamReader isr=new InputStreamReader(System.in);
				BufferedReader br=new BufferedReader(isr);
				System.out.println("Roll No.:");
				rn=Long.parseLong(br.readLine());
				System.out.println("Name:");
				name=br.readLine();
				while(true)
				{
					System.out.println("Phone Number:");
					ph=br.readLine();
					if(ph.length()==10)
					{
						
						break ;
					}
					System.out.println("*Invalid*");
				}
				while(true)
				{
					System.out.println("Email id of candidate:");
					email=br.readLine();
					if(email.contains("@") && email.endsWith(".com"))
					{
						break ;
					}
					System.out.println("*Invalid*");
				}
				System.out.println("Address of candidate:");
				address=br.readLine();
				System.out.println("HSC Marks(%) of candidate:");
				hsc=Double.parseDouble(br.readLine());
				System.out.println("UG Marks(%)of candidate:");
				ug=Double.parseDouble(br.readLine());
			}
			catch(NumberFormatException e)
			{
				System.out.println("Caught "+e);
			}
			catch(InputMismatchException e)
			{
				System.out.println("Caught "+e);
			}
			catch(NullPointerException e)
			{
				System.out.println("Caught "+e);
			}
		}
		void check()
		{
			if(hsc>=60 && ug>=70)
			{
				System.out.println("Eligible for National Institute");
			}
			else
			{
				System.out.println("Not Eligible for National Institute");
			}
		}
		public static void main(String args[])
		{
			try{
			Stuform obj=new Stuform();
			obj.check();
			}
			catch(IOException e)
			{
				System.out.println("Caught "+e);
			}
		}
	}