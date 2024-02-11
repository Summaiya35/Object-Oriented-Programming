import java.util.Scanner;
class relational{
public static void main(String args [])
{
Scanner s=new Scanner(System.in);
byte b,$b;
System.out.println(" Enter any small number ");
b=s.nextByte();
System.out.println(" One more thime enter any small number ");
$b=s.nextByte();
if(b>$b)
System.out.println(" The number "+b+" is greater than  "+$b);
else if(b<$b)
System.out.println(" The number "+b+" is less than  "+$b);
else
System.out.println(" The number "+b+" is equal to  "+$b);










}


}