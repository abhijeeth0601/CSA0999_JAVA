import java.io.*;
import java.util.*;
class pypat
{
public static void main(String args[])
{
int i,j,n;
Scanner s=new Scanner(System.in);
System.out.println("Enter n");
n=s.nextInt();

for(i=0;i<n;i++)
{
for(j=0;j<i;j++)
{
System.out.print(" ");
}
for(j=i;j<n;j++)
{
System.out.print("* ");
}
System.out.println();
}

}}
