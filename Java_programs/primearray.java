import java.io.*;
import java.util.*;
class primearray
{
public static void main(String args[])
{
int n,i,m;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value of n:");
n=s.nextInt();
m=s.nextInt();
System.out.print("Composite number:");
for(i=n+1;i<m;i++)
{
if(i%2==0||i%3==0||i%5==0||i%7==0)
{System.out.print(i+" ");}
}


}}
