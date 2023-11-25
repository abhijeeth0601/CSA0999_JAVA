import java.io.*;
import java.util.*;
class valid
{
public static void main(String args[])
{
String a,b;
Scanner s=new Scanner(System.in);
System.out.print("enter the username: ");
a=s.nextLine();
System.out.print("Re-enter the username: ");
b=s.nextLine();
if(a.equals(b))
	System.out.println("Valid");
else
	System.out.println("Invalid");
}}

