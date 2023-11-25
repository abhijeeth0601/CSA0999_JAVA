import java.io.*;
import java.util.*;
class factors
{
public static void main(String args[])
{
int i=1,n;
Scanner s= new Scanner(System.in);
System.out.print("Enter n: ");
n=s.nextInt();
while(i<=n)
{
if(n%i==0)
	System.out.print(i+",");
i++;}

System.out.println();}}

