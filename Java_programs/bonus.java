import java.io.*;
import java.util.*;
class bonus
{
public static void main(String args[])
{
float a;
Scanner s = new Scanner(System.in);
System.out.print("Enter Salar: ");
a=s.nextFloat();
if(a<10000)
{
System.out.print("Bonus = " +(a*0.05f));
}
else if(a>=10000&&a<50000)
{
System.out.print("Bonus = " + (a*0.1f));}
else if(a>=50000&&a<100000)
{
System.out.print("Bonus = " + (a*0.2f));}
else if(a>=100000&&a<500000)
{
System.out.print("Bonus = " + (a*0.5f));}
else
{
System.out.print("Bonus = " + (a*0.4f));}
}}

