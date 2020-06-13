/**
Author:George Samu
Purpose: The purpose is to write and execute a small
program that creates three Date objects.

*/
import java.util.Date;

public class Chpt4Q18
{
	public static void main (String[]args)
	{
	// Three objects
	// 10/12/1989 624161871
	Date dateAndTimeOne= new Date();
	//5/12/2008 1210574224
	Date dateAndTimeTwo=new Date();
	
	
		
	System.out.println("The date and time back 30 years ago is: " +dateAndTimeOne);
	
	System.out.println("The date and time 12 years ago is: "+ dateAndTimeTwo);
	
	//Time now 1591930139
	Date dateAndTimeThree=new Date();
	
	System.out.println("The date and time is: "+ dateAndTimeThree);
	
	
	// four Methods
	
	String dateAndTimeNow=dateAndTimeOne.toString();
	System.out.println();
	System.out.println("To String"+ dateAndTimeNow);
	
	//Check if date and time is equals each other
	
	System.out.println();
	System.out.println("Is the TimeOne equals TimeTwo?: "+
						dateAndTimeOne.equals(dateAndTimeTwo));
	
	System.out.println("Is the TimeTwo equals TimeThree?: "+
						dateAndTimeTwo.equals(dateAndTimeThree));

	System.out.println("Is the TimeOne equals TimeThree?: "+
						dateAndTimeOne.equals(dateAndTimeThree));
	
	//Comparing two dates
	System.out.println();
	System.out.println("The following will compare two dates");
	System.out.println("The first date and second date compared are "+
						dateAndTimeOne.compareTo(dateAndTimeTwo));
	
	System.out.println("Compare second and third: " +
						dateAndTimeTwo.compareTo(dateAndTimeThree));
									
	//applying method before
	System.out.println();
	System.out.println("The dateAndTimeOne before dateAndTimeTwo is: "+
						dateAndTimeOne.before(dateAndTimeTwo));
	
	System.out.println("The dateAndTimeTwo before dateAndTimeThree is: "+
						dateAndTimeTwo.before(dateAndTimeThree));
	
	System.out.println("The dateAndTimeOne before dateAndTimeThree is: "+
						dateAndTimeOne.before(dateAndTimeThree));
	System.out.println("The dateAndTimeThree before dateAndTimeOne is: "+
						dateAndTimeThree.before(dateAndTimeOne));
	
	
	//applying after
	System.out.println();

	System.out.println("The dateAndTimeOne after dateAndTimeTwo is:"+
						dateAndTimeOne.after(dateAndTimeTwo));
						
	System.out.println("The dateAndTimeTwo after dateAndTimeThree is:"+
						dateAndTimeTwo.after(dateAndTimeThree));
						
	System.out.println("The dateAndTimeThree after dateAndTimeOne is: "+
						dateAndTimeThree.after(dateAndTimeOne));
	
	}//end main
}//end Chpt4Q18