package teacherglass;

import java.util.Scanner;

public class TheGreaterNumberBetweentTheThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner (System.in);
 System.out.println("Enter first number");
 int firstn= sc.nextInt();
 
System.out.println("Enter second number");
 int secondn=sc.nextInt();
 
 System.out.println("Enter third number");
 int thirdn=sc.nextInt();
 
 
 if (firstn>secondn && firstn>thirdn) {
	 System.out.println("the greatest number between the three numbers is "+ firstn);
 }
 else if (secondn>firstn && secondn>thirdn) {
	 System.out.println("the greatest number between the three numbers is "+ secondn);
	 
 }
 else {System.out.println("the greatest number between the three numbers is "+ thirdn);}
	
	}

}
