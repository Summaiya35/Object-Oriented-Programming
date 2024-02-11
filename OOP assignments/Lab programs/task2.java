import java.util.Scanner;
class task2{
public static void main(String args [])
{
Scanner s=new Scanner (System.in);

int a;
System.out.println("\nEnter any five digit number ");
a=s.nextInt();
System.out.println((a/1)%10);
System.out.println((a/10)%10);
System.out.println((a/100)%10);
System.out.println((a/1000)%10);
System.out.println((a/10000)%10);



}

}