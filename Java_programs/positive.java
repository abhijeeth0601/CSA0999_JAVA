import java.io.*;
import java.util.*;
class positive
{
public static void main(String args[])
{
int a;
Scanner s=new Scanner(System.in);
System.out.print("enter the num ");
a=s.nextInt();
if(a>0)
	System.out.println("Positive");
else if (a==0)
	System.out.println("Neither positive nor negative, its 0");
else
	System.out.println("Negative");
}}
