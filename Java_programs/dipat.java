import java.io.*;
import java.util.*;
class dipat
{
public static void main(String args[])
{
int i,j,n;
Scanner s=new Scanner(System.in);
System.out.println("Enter n");
n=s.nextInt();

for(i=0;i<(n/2+1);i++)
{for(j=0;j<=i;j++)
{
System.out.print("*");}
System.out.println();}
for(i=0;i<(n/2);i++)
{
for(j=i;j<(n/2);j++)
{
System.out.print("*");
}
System.out.println();
}


}}
