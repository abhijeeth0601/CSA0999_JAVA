import java.io.*;
import java.util.*;
class simple
{
public static void main(String args[])
{
float p,si,r;
int n,ch;
Scanner s= new Scanner(System.in);
System.out.print("Enter the principle amount:");
p=s.nextInt();
System.out.print("Enter the no of years:");
n=s.nextInt();
System.out.println("Senior citizen??\n1--->Yes\n2--->No");
ch=s.nextInt();
if(ch==1)
	r=0.12f;
else
	r=0.1f;
si=p*(r/100)*n;
System.out.println("Simple Interest "+si);

}}

