import java.io.*;
import java.util.*;
class eveoddarray
{
public static void main(String args[])
{
int i,n,eve=0,odd=0;
int x[]=new int [10];
Scanner s=new Scanner(System.in);
System.out.println("enter a num:");
n=s.nextInt();
System.out.println("enter the elements:");
for(i=0;i<n;i++)
{
x[i]=s.nextInt();
}
for(i=0;i<n;i++)
{if(x[i]%2==0)
{eve=eve+x[i];
}
else
{
odd=odd+x[i];
}}
System.out.println("Sum of even "+eve);
System.out.println("Sum of odd "+odd);
 
}}

