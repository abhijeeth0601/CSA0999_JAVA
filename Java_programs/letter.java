import java.io.*;
import java.util.*;
class letter
{
public static void main(String args[])
{
int i,n,vow=0;
Scanner S=new Scanner(System.in);
String s="Java was developed by James Goasling in 1985";
n=s.length();
System.out.print("enter the letter ");
char search=S.next().charAt(0);
for(i=0;i<n;i++)
{if(s.charAt(i)==search)
{
vow++;}}

System.out.println("The number of charecter is "+vow);
}}
