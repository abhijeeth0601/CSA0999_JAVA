import java.io.*;
import java.util.*;
class larray
{
public static void main(String args[])
{
int arr[]= new int[10];
int i,n,temp,m,j;
Scanner s= new Scanner(System.in);
System.out.print("Enter n");
n=s.nextInt();
System.out.print("Enter the elements");
for(i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
System.out.print("Enter the number to find nth largest number:");
m=s.nextInt();
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}}}

System.out.print(m +" Largest number is "+arr[n-m]);
}}