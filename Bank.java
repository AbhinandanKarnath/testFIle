import java.util.*;

class BankAccount {
    int account_no;
    int balance;
    String name;
    String email;
    int ph_no;


    public int getAccount_no()
    {
        return account_no;
    }

    public int getBalance()
    {
        return balance;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public int getPh_no()
    {
        return ph_no;
    }

    


    public void setAccount_no(int account_no)
    {
		if(account_no <  50)
		{
			
		}
        this.account_no = account_no;
    }

    public void setBalance(int balance)
    {
        this.balance = balance;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setPh_no(int ph_no)
    {
        this.ph_no = ph_no;
    }
}

public class Bank
{
	public static void main(String[] args)
	{
		BankAccount obj = new BankAccount();
		System.out.println("Enter the account no , balance , name , email , ph_no");
		Scanner sc = new Scanner(System.in);
		obj.setAccount_no(Integer.parseInt(sc.nextLine()));
		obj.setBalance(Integer.parseInt(sc.nextLine()));
		obj.setName(sc.nextLine());
		obj.setEmail(sc.nextLine());
		obj.setPh_no(Integer.parseInt(sc.nextLine()));
		
		System.out.println("\nThe Account no is :"+obj.getAccount_no());
		System.out.println("\nThe Balance is :"+obj.getBalance());
		System.out.println("\nThe Name is :"+obj.getName());
		System.out.println("\nThe Email is :"+obj.getEmail());
		System.out.println("\nThe phone no is :"+obj.getPh_no());
		
		
	}
}