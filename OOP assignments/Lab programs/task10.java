import java.util.Scanner;
class task10{
public static void main(String args [])
{
Scanner s=new Scanner(System.in);
String a,b;

System.out.println("Do you have ID card ");
a=s.nextLine();
if(a.equalsIgnoreCase("yes")||a.equalsIgnoreCase("Yes"))
{
System.out.println("Which is your department?");
b=s.nextLine();
if(b.equalsIgnoreCase("CS"))
System.out.println("Go to block 1");
else if(b.equalsIgnoreCase("BBA"))
System.out.println("Go to block 2");
else if(b.equalsIgnoreCase("B.ED"))
System.out.println("Go to knowledge center");
else if(b.equalsIgnoreCase("EE"))
System.out.println("Go to block 3");
else
System.out.println("Invalid Entry");

}
else
System.out.println("You are not allowed! ");
}}