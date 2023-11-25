import java.io.*;
import java.util.*;
class sumdo
{
public static void main(String args[])
{
int sum=0,i=0,n;
Scanner s=new Scanner(System.in);
System.out.print("enter a num:");
n=s.nextInt();
do
{sum=sum+i;
i=i+1;
}
while(i<=n);
System.out.println("The sum of the numbers is:"+sum);
}}

