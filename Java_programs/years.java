import java.io.*;
import java.util.*;
class years
{
public static void main(String args[])
{
int year,days,week,month,day;
Scanner s=new Scanner(System.in);
System.out.print("Enter number of days ");
days=s.nextInt();
year=days/365;
week=(days-(year*365))/7;
day=(days-(year*365+week*7));

System.out.println(year+" year(s) "+week+" week(s) "+day+" day(s)");}}
