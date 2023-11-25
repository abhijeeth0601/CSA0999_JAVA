import java.io.*;
import java.util.*;
class student
{
public static void main(String args[])
{
int a1,a2,a3;
Scanner s=new Scanner(System.in);
System.out.print("enter the mark1: ");
a1=s.nextInt();
System.out.print("enter the mark2 ");
a2=s.nextInt();
System.out.print("enter the mark3 ");
a3=s.nextInt();
if(a1>=50&&a2>=50&&a3>=50)
	System.out.println("Pass");
else
	System.out.println("Fail");
}}

