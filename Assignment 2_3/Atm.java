import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.NoSuchElementException;
import java.util.InputMismatchException;

public class atm
{
	int pin;
	String accNo;
	int bal;
	int check=0;
	public atm()
	{
		try
		{ 
			Scanner sc=new Scanner(System.in);
			System.out.print("\nEnter your account number:");
			accNo=sc.nextLine();
			System.out.print("\nEnter your PIN number:");
			pin=sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.print("\nEnter the valid input");
		}
		catch(NumberFormatException e)
		{
			System.out.print("\nConversion not valid");
		}
	}
	void deposit(int n)
	{
		this.bal+=n;
	}
	void withdrawl(int n)
	{
		this.bal-=n;
	}
	void display()
	{
		System.out.println("\nTotal balance : "+this.bal);
	}
	public static void main(String args[])throws ClassNotFoundException
	{
		
		Map<String,Integer> mp=new HashMap<String,Integer>(); 
		mp.put("aaaa",1234);
		mp.put("bbbb",5678);
		mp.put("cccc",9112);
		mp.put("dddd",1133);
		
		Scanner sc=new Scanner(System.in);
		atm obj=new atm();
		
		try{
			int am,amt;
			for(Map.Entry<String,Integer> entry : mp.entrySet())
			{
				if( obj.accNo.equals(entry.getKey()) && obj.pin==entry.getValue())
				{
					obj.check++;
					while(true)
					{
						System.out.println("\nEnter Your Choice: 1.Deposit 2.Withdrawl 3.Show balance 4.Exit");
						int n=sc.nextInt();
						switch(n)
						{
						case 1:
							System.out.print("\nAmount:");
							am=sc.nextInt();
							obj.deposit(am);
							break;
						case 2:
							System.out.print("\nAmount:");
							amt=sc.nextInt();
							obj.withdrawl(amt);
							break;
						case 3:
							obj.display();
							break;
						case 4:
							System.exit(1);
							break;
						}
					}
					
				}
			}
		}
		catch(NullPointerException e)
		{
			System.out.print("\nNo operation is performed with null string");
		}
		catch(InputMismatchException e)
		{
			System.out.print("\nEnter the valid input");
		}
		catch(NoSuchElementException e)
		{
			System.out.print("\nElement not found");
		}

		if(obj.check==0)
		{
			System.out.println("\nInvalid pin number");
		}
	}
}