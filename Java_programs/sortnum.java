import java.io.*;
import java.util.*;
class sortnum
{
public static void main(String args[])
{
int i,n,temp,j;
int x[]=new int[10];
Scanner s=new Scanner(System.in);
System.out.print("enter a num: ");
n=s.nextInt();
for(i=0;i<n;i++)
{
x[i]=s.nextInt();}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(x[i]>x[j])
{temp=x[i];
x[i]=x[j];
x[j]=temp;}}}

for(i=0;i<n;i++)
{
System.out.print(x[i]+" ");
}
}}
