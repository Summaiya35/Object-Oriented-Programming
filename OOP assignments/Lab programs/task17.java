import java.util.Scanner;
class task17{
public static void main(String args [])
{
Scanner s=new Scanner(System.in);

byte b=1,guess;
do
{

System.out.println("\n Guess the number I thought in my mind");
guess=s.nextByte();
if(guess>b)
System.out.println("Too high");
else if(guess<b)
System.out.println("Too low");

}

while(guess!=1);
System.out.println("Correct !");
}}