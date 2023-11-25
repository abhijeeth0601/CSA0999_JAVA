import java.io.*;
import java.util.*;
class simple
{
public static void main(String args[])
{
int p,n;
float si,r;
Scanner s=new Scanner(System.in);
System.out.print("Enter principle amount ");
p=s.nextInt();
System.out.print("Enter number of years ");
n=s.nextInt();
System.out.print("Enter rate of interest ");
r=s.nextFloat();
si=(p*n*r)/100;
System.out.println("Simple interest is "+si);}}
