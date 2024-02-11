import java.util.Scanner;
class Factorial{
public static void main(String args[]){
Scanner s =new Scanner(System.in);
byte a,fac=1;

System.out.println("Enter any positive number ");
a=s.nextByte();
if(a>0)
{
for(byte b=1;b<=a;b++)
fac*=b;
System.out.println("Factorial of providid number is "+fac);



}
else
System.out.println("Sorry the number provided is negative");






}
}