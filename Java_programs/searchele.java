import java.io.*;
import java.util.*;
class searchele
{
public static void main(String args[])
{
int i,n,search,fou=0;
int x[]=new int [10];
Scanner s=new Scanner(System.in);
System.out.println("enter a num:");
n=s.nextInt();
System.out.println("enter the elements:");
for(i=0;i<n;i++) 
{
x[i]=s.nextInt();
}
System.out.println("enter the search element:");
search=s.nextInt();
for(i=0;i<n;i++)
{if(x[i]==search)
{fou=1;}
}
if(fou==1)
{
System.out.println("Element found");}
else
System.out.println("Element not found :(");
}}

