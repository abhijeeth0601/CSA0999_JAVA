import java.io.*;
import java.util.*;

class cone
{
public static void main(String args[])
{
float r,h,volume;
Scanner s= new Scanner(System.in);
System.out.print("Enter radius of the cone:");
r=s.nextFloat();
System.out.print("Enter height of the cone:");
h=s.nextFloat();
volume=(4/3)*3.14f*r*r*h;
System.out.println("The volume of the cone is "+volume);
}}
