import java.io.*;
import java.util.*;
class average
{
public static void main(String args[])
{
int m1,m2,m3,m4,m5,avg,total,reg;
String name;
Scanner s=new Scanner(System.in);
System.out.print("Enter Student name: ");
name=s.nextLine();
System.out.print("Enter Register number: ");
reg=s.nextInt();
System.out.print("Enter the mark1: ");
m1=s.nextInt();
System.out.print("enter the mark2 ");
m2=s.nextInt();
System.out.print("enter the mark3 ");
m3=s.nextInt();
System.out.print("enter the mark4 ");
m4=s.nextInt();
System.out.print("enter the mark5 ");
m5=s.nextInt();
total=m1+m2+m3+m4+m5;
avg=total/5;
System.out.println("XYZ Engineering College");
System.out.println("\t Chennai");
System.out.println("Name: "+name);
System.out.println("Register Number: "+reg);
System.out.println("Subject 1: "+m1);
System.out.println("Subject 2: "+m2);
System.out.println("Subject 3: "+m3);
System.out.println("Subject 4: "+m4);
System.out.println("Subject 5: "+m5);
if(avg>=90)
	System.out.println("Grade is S");
else if(avg>=81&&avg<=89)
	System.out.println("Grade is A");
else if(avg>=71&&avg<=80)
	System.out.println("Grade is B");
else if(avg>=61&&avg<=70)
	System.out.println("Grade is C");
else 
	System.out.println("Grade is F");
}}



