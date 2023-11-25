import java.io.*;
import java.util.*;
class leap
{
public static void main(String args[])
{
char s2;
String s1,s3="";
int n=0,i,l,c=0;
Scanner s = new Scanner(System.in);
System.out.print("Enter date: ");
s1=s.nextLine();
l=s1.length();
for(i=0;i<l;i++)
{
s2=s1.charAt(i);
if(c==2)
{
s3=s1.substring(i,l);
break;
}
if(s2 == '/')
{
c++;
}
}


n=Integer.parseInt(s3);

if(n%4==0||n%400==0&&n%100!=0)
{System.out.println("Leap year");}

else
{System.out.println("Not a leap year");}


}}