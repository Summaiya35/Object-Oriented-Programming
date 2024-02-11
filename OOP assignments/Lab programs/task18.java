import java.util.Scanner;
class task18{
public static void main(String args [])
{
Scanner s=new Scanner(System.in);
byte size;

System.out.println("\nEnter array size ");
size=s.nextByte();
int arr[]=new int[size];
for(int i=0;i<size;i++)
{
System.out.println("\n Enter value number "+(i+1));
arr[i]=s.nextInt();
}
System.out.println("\nNumbers in reverse order are ");
for(int i=size-1;i>=0;i--)
System.out.println(arr[i]+" ");



}}