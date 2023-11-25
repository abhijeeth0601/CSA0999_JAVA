import java.io.*;
import java.util.*;
class factorialdo
{
public static void main(String args[])
{
int fact=1,i=1,n;
Scanner s=new Scanner(System.in);
System.out.print("enter a num:");
n=s.nextInt();
do
{fact=fact*i;
i=i+1;
}
while(i<=n);
System.out.println("The factorial is: "+fact);
}}

