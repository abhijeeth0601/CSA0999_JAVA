import java.io.*;
import java.util.*;
class sort
{
public static void main(String args[])
{
int i,n,j;
String x[]= new String[10],temp;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=0;i<n;i++)
{
x[i]=s.nextLine();
}


for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{if(x[i].compareTo(x[j])==-1)
{
temp=x[i];
x[i]=x[j];
x[j]=temp;
}
}
}
System.out.print("The sorted array is ");
for(i=0;i<n;i++)
{
System.out.print(x[i]+",");}
}
}
