package PCGucet6doJavy;

import java.time.LocalDate;


public class Program {

	public static void main(String[] args) {
		
		//Date d1 = new Date(28, 12, 1988);  //
		
		Person o1 = new Person("Petr", new Date(2, 8, 1999)); //
		Account u1 = new Account(o1, 100);
		Account u2 = new Account(new Person("Jan", new Date(7, 12, 1968)), 100);  //2
		Person o3 = new Person("Romuald", 23, 12, 2000);                         //3
		u1.insertInto(100); u2.insertInto(100);
		u1.transferTo(u2, 50);
		u1.writeBalance(); u2.writeBalance();
		o1.writeAccounts();
		System.out.println(o1.accounts[0]);
		System.out.println("rok narození ownera účtu1: " + u1.owner.dateOfBirth.year); //
			
		
		//reseni vypsani uplne presneho veku z data 
		
		//DateTime narozen = Convert.ToDateTime(o1.dateOfBirth.year.ToString() + "/" + o1.dateOfBirth.month.ToString() + "/" + o1.dateOfBirth.day);
		//DateTime narozen = Convert.ToDateTime(o1.dateOfBirth.year.ToString() + "/" + o1.dateOfBirth.month.ToString() + "/" + o1.dateOfBirth.day);
		//int vek;
		//if (DateTime.Today.DayOfYear < narozen.DayOfYear)
		//{
		//	vek = DateTime.Today.Year - narozen.Year - 1;
		//}
		//else
		//{
		//	vek = DateTime.Today.Year - narozen.Year;
		//}
		
		
		LocalDate localDate = LocalDate.now();
		int year1 = localDate.getYear();
		//int month1 = localDate.getMonthValue();
		//int date1 = localDate.getDayOfMonth();
		int date2 = localDate.getDayOfYear();
	//	LocalDate localDate2 = LocalDate.now();
		LocalDate date3 = LocalDate.of(o1.dateOfBirth.year, o1.dateOfBirth.month, o1.dateOfBirth.day);
		int date4 = date3.getDayOfYear();
		int vek;
		if (date2 < date4)
		{
			vek =year1 - o1.dateOfBirth.year - 1;
		}
		else
		{
			vek =year1 - o1.dateOfBirth.year;
		}
		System.out.println(date2);
		System.out.println(vek);
		//hardcore vytvoreni noveho uctu
		//Account u3 = new Account(new Person("Hynek", new Date(10, 10, 2001)), 500);
		System.out.println(o3.dateOfBirth.year);

	}

}
