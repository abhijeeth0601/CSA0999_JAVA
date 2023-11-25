import java.io.*;
import java.util.*;
class squarecube
{
public static void main(String args[])
{
Scanner s = new Scanner (System.in);
float n,sq,cu;
System.out.print("Enter the n value: ");
n=s.nextFloat();
sq=n*n;
cu=n*n*n;
System.out.println("Square is "+sq);
System.out.println("Cube is "+cu);
}}