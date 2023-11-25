import java.io.*;
import java.util.*;
class ap
{
public static void main(String args[])
{
int ch,a,b;
Scanner s = new Scanner(System.in);
System.out.print("Enter the number 1:");
a=s.nextInt();
System.out.print("Enter the number 2:");
b=s.nextInt();
System.out.println("1-->Addition");
System.out.println("2-->Subtraction");
System.out.println("3-->Multiplication");
System.out.println("4-->Division");
System.out.print("Enter your choice(1-4):");
ch=s.nextInt();
switch(ch)
{
case 1:
	System.out.println("Sum= "+(a+b));
	break;
case 2:
	System.out.println("Diff= "+(a-b));
	break;
case 3:
	System.out.println("Product = "+(a*b));
	break;
case 4:
	System.out.println("Quotient= "+(a/b));
	break;
default:
	System.out.println("Invalid	");
	break;
}}}
