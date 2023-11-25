import java.io.*;
import java.util.*;
class eb
{
public static void main(String args[])
{
int units,ch;
Scanner s= new Scanner(System.in);
System.out.print("1-->Domestic\n2-->Industrial\n");
System.out.print("Enter the type of board:");
ch=s.nextInt();
switch(ch)
{
case 1:
	System.out.println("Domestic....");
	System.out.print("Enter the number of units: ");
	units=s.nextInt();
	if(units<=100)
		System.out.println("Cost is "+(0*units));	
	else if(units>100 && units<=300)
		System.out.println("Cost is "+(2.5*units));
	else if(units>300 && units<=500)
		System.out.println("Cost is "+(4*units));
	else
		System.out.println("Cost is "+(7*units));
	break;
case 2:
	System.out.println("Industrial...");
	System.out.print("Enter the number of units: ");
	units=s.nextInt();
	if(units<=100)
		System.out.println("Cost is "+(0*units));	
	else if(units>100 && units<=300)
		System.out.println("Cost is "+(4*units));
	else if(units>300 && units<=500)
		System.out.println("Cost is "+(7*units));
	else
		System.out.println("Cost is "+(100*units));
	break;
default:
	System.out.println("Invalid choice");
}
}}

