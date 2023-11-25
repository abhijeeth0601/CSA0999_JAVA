import java.io.*;
import java.util.*;
class great
{
public static void main(String args[])
{
int x,y,z;
Scanner s = new Scanner(System.in);
System.out.print("Enter num1: ");
x=s.nextInt();
System.out.print("Enter num2: ");
y=s.nextInt();
System.out.print("Enter num3: ");
z=s.nextInt();
if(x>y&&x>z)
	System.out.print("num 1 is greater");

else if(y>x&&y>z)
	System.out.print("num 2 is greater");
else
	System.out.print("num 3 is greater");
}}
