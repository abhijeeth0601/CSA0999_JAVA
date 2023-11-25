import java.io.*;
import java.util.*;
class vowel
{
public static void main(String args[])
{
int i,n,vow=0;
Scanner s1 = new Scanner(System.in);
String s;
s=s1.nextLine();
n=s.length();
for(i=0;i<n;i++)
{if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
{
vow++;}}

System.out.println("The number of vowels is "+vow);
}}
