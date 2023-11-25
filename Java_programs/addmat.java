import java.io.*;
import java.util.*;
class addmat
{
public static void main(String args[])
{
int i,j;
int a[][]=new int[10][10];
int b[][]=new int[10][10];
int c[][]=new int[10][10];
Scanner s=new Scanner(System.in);


System.out.println("Enter the elements of a matrix");
for(i=0;i<2;i++){
{for(j=0;j<2;j++)
a[i][j]=s.nextInt();}}

System.out.println("Enter the elements of b matrix");
for(i=0;i<2;i++){
{for(j=0;j<2;j++)
b[i][j]=s.nextInt();}}

for(i=0;i<2;i++){
{for(j=0;j<2;j++)
c[i][j]=a[i][j]+b[i][j];}}

System.out.println("The sum of the matrices");

for(i=0;i<2;i++)
{for(j=0;j<2;j++)
{System.out.print(c[i][j]+" ");}
System.out.println();}

}}
