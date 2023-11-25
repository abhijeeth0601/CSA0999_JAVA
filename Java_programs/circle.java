import java.io.*;
import java.util.*;

class circle
{
public static void main(String args[])
{
float r,area,circumference;
Scanner s= new Scanner(System.in);
System.out.print("Enter radius of the circle:");
r=s.nextFloat();
area=3.14f*r*r;
circumference=2*3.14f*r;
System.out.println("The area of the circle is "+area);
System.out.println("The circumference of the circle is "+circumference);
}}
