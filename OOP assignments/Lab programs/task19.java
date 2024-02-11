import java.util.Scanner;
class task19{
public static void main(String args [])
{
Scanner s=new Scanner(System.in);
byte size,sum=0;
System.out.println("\nEnter array size ");
size=s.nextByte();
int arr[]=new int[size];
for(byte b=0;b<size;b++)
{
System.out.println("\nEnter value number "+(b+1));
arr[b]=s.nextByte();
sum+=(byte)(arr[b]);
}
System.out.println("\nSum of all array values is :"+sum);




}}