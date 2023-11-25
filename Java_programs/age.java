import java.io.*;
import java.util.*;
class age
{
public static void main(String args[])
{
 int a;
Scanner s=new Scanner(System.in);
System.out.print("Enter the age ");
a=s.nextInt();
if(a>=18)
	System.out.print("Eligible");
else
	System.out.println("Not eligible wait for "+(18-a)+" years");
}}n
