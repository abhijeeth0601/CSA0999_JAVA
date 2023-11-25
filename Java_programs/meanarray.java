import java.io.*;
import java.util.*;
class meanarray
{
public static void main(String args[])
{
int i,n,mean=0,mode=0,sum=0,temp,mid,om,j,count=1;
int x[]=new int [10];
Scanner s=new Scanner(System.in);
System.out.println("enter a num:");
n=s.nextInt();

System.out.println("enter the elements:");
for(i=0;i<n;i++)
{x[i]=s.nextInt();}

for(i=0;i<n;i++)
{sum=sum+x[i];}
mean=sum/n;
System.out.println("Mean "+mean);
System.out.print("Median ");

for(i=0;i<n;i++)
{for(j=i+1;j<n;j++)
{if(x[i]>x[j])
{temp=x[i];
x[i]=x[j];
x[j]=temp;}}}

if(n%2!=0)
{mid=n/2;
System.out.print(x[mid]);}
else
{
mid=n/2;
om=(x[mid]+x[mid+1])/2;
System.out.println(x[om]);
}

for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(x[i]==x[j])
{count++;
mode=i;}}}

System.out.println("Mode "+x[mode]);
System.out.println();
}}

