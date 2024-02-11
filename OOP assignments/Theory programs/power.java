import java.util.Scanner;
class power{
public static void main(String args [])
{
Scanner s=new Scanner (System.in);
byte base,power;
System.out.println("Enter Base ");
base=s.nextByte();

System.out.println("Enter Power ");
power=s.nextByte();
 
  byte num=1;
for(byte b=1;b<=power;b++)
num*=power;
if(power>0)
System.out.println("The answer to the base and power is "+num);
else
System.out.println("The answer to the base and power is 1/"+num);









}

}