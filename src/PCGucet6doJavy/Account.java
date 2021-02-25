package PCGucet6doJavy;

import java.util.Calendar;

class Account
{
	public int balance;
	public Person owner;
	public Account(Person majitel, int castka)
	{
		owner = majitel; balance = castka;
		majitel.accounts[majitel.countOfAccounts] = this;
		majitel.countOfAccounts++;
	}
	public void insertInto(int castka)
	{
		balance += castka;
	}
	public void writeBalance()       //na dalším řádku je změna
	{
		int year = Calendar.getInstance().get(Calendar.YEAR);
		System.out.println("vlastník účtu: " + owner.name + " je starý "+ (year - owner.dateOfBirth.year)+" let, na účtu je: "+balance);
	}
	public String toString()
	{
		return "owner:"+ owner.name + "\n balance: "+ balance;
	}
	public void transferTo(Account ucet, int castka)
	{
		ucet.balance += castka;
		balance -= castka;
	}
}