package PCGucet6doJavy;

class Person
{
	public String name;
	public Date dateOfBirth;                   //
	public Account[] accounts = new Account[10];
	public int countOfAccounts = 0;
	public Person(String name, Date datnar)
	{ //    
		this.name = name;
		dateOfBirth = datnar;                         //
	}

	public Person(String name, int den, int mesic, int rok)
		//4  
	{                                   
		this(name, new Date(den, mesic, rok)) ;
	}

	public void writeAccounts()
	{
		System.out.println(this.dateOfBirth.year);
		for (int i = 0; i < countOfAccounts; i++)
		{
			System.out.println(i+". účet: "+accounts[i]);
			
			accounts[i].writeBalance();
		}
	}
}