import java.util.Scanner;
class currency$evenodd{public static void main(String args[])
{Scanner s=new Scanner(System.in);
byte a;
short b;
System.out.println("Enter any number ");
a=s.nextByte();
if(a%2==0)
System.out.println("It is an even number ");
else
System.out.println("It is an odd number ");
  
System.out.println("\n");
System.out.println("\n Enter any 4 digit number ");
b=s.nextShort();
System.out.println("\n5000 Notes "+(b/5000));
System.out.println("\n1000 Notes "+(b%5000/1000));
System.out.println("\n500 Notes "+(b%10000/500));
System.out.println("\n100 Notes "+(b%500/100));
System.out.println("\n50 Notes "+(b%100/50));
System.out.println("\n20 Notes "+(b%50/20));
System.out.println("\n10 Notes "+(b%20/10));
System.out.println("\n5 coins "+(b%10/5));
System.out.println("\n2 coins "+(b%5/2));
System.out.println("\n1 coins "+(b%2));


}}