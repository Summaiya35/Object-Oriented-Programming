import java.util.Scanner;
class evenodd{
public static void main(String args[])
{
Scanner s=new Scanner (System.in);
short a,sum_e=0,sum_o=0,square_e_sum=0,square_o_sum=0;

System.out.println("Enter any number ");
a=s.nextShort();
if(((a/1000)%10)%2==0)
{
sum_e+=(byte)((a/1000)%10);
square_e_sum=(short)(((a/1000)%10)*((a/1000)%10));}
else
{
sum_o+=(short)((a/1000)%10);
square_o_sum=(short)(((a/1000)%10)*((a/1000)%10));}
if(((a/100)%10)%2==0)
{
sum_e+=a/100%10;
square_e_sum+=(short)((a/100%10)*(a/100%10));}
else 
{
sum_o+=(a/100)%10;
square_o_sum+=(short)(((a/100)%10)*((a/100)%10));}
if(((a/10)%10)%2==0)
{
sum_e+=a/10%10;
square_e_sum+=(short)((a/10%10)*(a/10%10));}
else
{
sum_o+=a/10%10;
square_o_sum+=(short)((a/10%10)*(a/10%10));}
 if(((a/1)%10)%2==0)
{
sum_e+=a/1%10;
square_e_sum+=(short)((a/1%10)*(a/1%10));}
else
{
sum_o+=(short)(a/1%10);
square_o_sum+=(short)((a/1%10)*(a/1%10));}

System.out.println("\n\n\t Sum of Even digits : "+sum_e);
System.out.println("\n\n\t Sum of Odd digits  :"+sum_o);
System.out.println("\n\n\t Sum of Square of Even digits  :"+square_e_sum);
System.out.println("\n\n\t Sum of Square of Odd digits  : "+square_o_sum);







}

}