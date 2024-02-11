import java.util.Scanner;
class task8{
public static void main(String args [])
{
Scanner s=new Scanner(System.in);
short a,b,c;
System.out.println("\n Enter number 1,2 and 3");
a=s.nextShort();
b=s.nextShort();
c=s.nextShort();
if((a>b)&&(a>c))
System.out.println(a +" Is the largest of all ");
else if((b>a)&&(b>c))
System.out.println(b +" Is the largest of all ");
else if((c>b)&&(c>a))
System.out.println(c +" Is the largest of all ");
else
System.out.println(" All numbers are equal ");








}}