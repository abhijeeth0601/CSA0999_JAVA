import java.io.*;
import java.util.*;
class student_marks
{
public static void main(String args[])
{
int regno;
float m1,m2,m3,m4,m5,sum,avg;
String name;
Scanner s=new Scanner(System.in);
System.out.print("Enter name ");
name=s.nextLine();
System.out.print("Enter regno ");
regno=s.nextInt();
System.out.print("Enter mark1 ");
m1=s.nextFloat();
System.out.print("Enter mark2 ");
m2=s.nextFloat();
System.out.print("Enter mark3 ");
m3=s.nextFloat();
System.out.print("Enter mark4 ");
m4=s.nextFloat();
System.out.print("Enter mark5 ");
m5=s.nextFloat();
sum=m1+m2+m3+m4+m5;
avg=sum/5;
System.out.println("Hi "+name+" "+regno);
System.out.println("Sum "+sum);
System.out.println("Average is "+avg);}}
