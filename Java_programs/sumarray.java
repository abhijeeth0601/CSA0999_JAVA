import java.io.*;
import java.util.*;
class sumarray
{
public static void main(String args[])
{
int i,n,sum=0,diff=0,;
int x[]=new int [10];
Scanner s=new Scanner(System.in);
System.out.println("enter num of elements:");
n=s.nextInt();
System.out.println("enter the elements:");
for(i=0;i<n;i++) 
{
x[i]=s.nextInt();
}
sum=x[0]+x[n-1];
diff=x[n-1]-x[0];
System.out.println("Sum is "+sum+"\nDiff is "+diff);}
}

