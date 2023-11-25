import java.io.*;
import java.util.*;
class actress
{
public static void main(String args[])
{
int ch;
Scanner s = new Scanner(System.in);
System.out.print("Enter your choice(1-4):");
ch=s.nextInt();
switch(ch)
{
case 1:
	System.out.println("Your favourite actress is Kajol");
	break;
case 2:
	System.out.println("Your favourite actress is Trisha");
	break;
case 3:
	System.out.println("Your favourite actress is Anushka");
	break;
case 4:
	System.out.println("Your favourite actress is Samantha");
	break;
default:
	System.out.println("Your favourite actress is Thara");
	break;
}}}
