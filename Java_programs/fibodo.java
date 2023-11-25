import java.io.*;
import java.util.*;
class fibodo
{
public static void main(String args[])
{
int f0=0,f1=1,fib,i=3,n,sum=1;
Scanner s = new Scanner(System.in);
System.out.print("enter a num:");
n=s.nextInt();
System.out.print(" "+f0+" "+f1);
do
{
fib=f0+f1;
System.out.print(" "+fib);
f0=f1;
f1=fib;
if(fib%2!=0)
{sum=sum+fib;}
i=i+1;
}
while(i<=n);
System.out.println();
System.out.println("The sum of odd in fibo is "+sum);
}}


