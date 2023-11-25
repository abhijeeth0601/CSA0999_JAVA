import java.io.*;
import java.util.*;
class oddfor
{
public static void main(String args[])
{
int sum=0,i,n;
Scanner s=new Scanner(System.in);
System.out.print("enter a num:");
n=s.nextInt();
for(i=1;i<=n;i=i+2)
{sum=sum+i;
}
System.out.println("The sum of the numbers is:"+sum);
}}

