import java.util.Scanner;
class electricity{
public static void main(String args [])
{
Scanner s=new Scanner (System.in);

int unit,bill=0;
float total_bill=0;
System.out.println(" Enter your consumed units ");
unit=s.nextInt();
if ((unit>0)&&(unit<=100))
{
bill=unit*10;
System.out.println("\n\t\t Bill to be payed : " +bill+" Rs");}

else if((unit>100)&&(unit<=200))
{
bill=20*(unit-100)+100*10;
System.out.println("\n\t\t Bill to be payed : " +bill+" Rs");

} 
else if((unit>200)&&(unit<=300))
{
bill=30*(unit-200)+200*20;
System.out.println("\n\t\t Bill to be payed : " +bill+" Rs");}
else if(unit>300)
{bill=40*(unit-300)+300*30;
System.out.println("\n\t\t Bill to be payed : " +bill+" Rs");
}
else 
System.out.println("\n\t  Invalid Entry");


if((bill>2000)&&(bill<=3000))
 {System.out.println("\n\t  10% tax : "+(10*((float)bill/100)));
 total_bill=(10*((float)bill/100))+bill;
 System.out.println("\n\t Total Bill "+total_bill);}
else if((bill>3000)&&(bill<=4000))
{System.out.println("\n\t  20% tax : "+(20*((float)bill/100)));
total_bill=(20*((float)bill/100))+bill;
System.out.println("\n\t Total Bill"+total_bill);
}
else if((bill>4000)&&(bill<=5000))
 {System.out.println("\n\t  30% tax : "+(30*((float)bill/100)));
total_bill=(30*((float)bill/100))+bill;
System.out.println("\n\t Total Bill"+total_bill);}
  else if(bill>5000)
  	
  {System.out.println("\n\t  40% tax : "+(40*((float)bill/100)));
total_bill=(40*((float)bill/100))+bill;
System.out.println("\n\t Total Bill"+total_bill);}
  
  else
  System.out.println("\n\t No Tax");

System.out.println("\n\t  Have a nice day");

if(bill<2000)
{
System.out.println(" \n\tNotes 5000 \t"+bill/5000);
System.out.println(" \n\tNotes 1000   \t"+bill%5000/1000);
System.out.println("\n\t Notes  500  \t"+bill%1000/500);
System.out.println(" \n\tNotes  100    \t"+bill%500/100);
System.out.println(" \n\tNotes  50     \t"+bill%100/50);
System.out.println(" \n\tNotes  20     \t"+bill%50/20);
System.out.println(" \n\tNotes  10     \t"+10/bill%20);// if bill divide by 10 always 1 note or if 10 divide by bill always 0 notes whay
System.out.println(" \n\t        5     \t"+bill%10/5);
System.out.println(" \n\t        2     \t"+bill%5/2);
System.out.println(" \n\t        1     \t"+bill%2);}
else
{System.out.println(" \n\tNotes 5000    \t"+total_bill/5000);
System.out.println(" \n\tNotes 1000     \t"+total_bill%5000/1000);
System.out.println("\n\t Notes  500     \t"+total_bill%1000/500);
System.out.println(" \n\tNotes  100     \t"+total_bill%500/100);
System.out.println(" \n\tNotes  50      \t"+total_bill%100/50);
System.out.println(" \n\tNotes  20      \t"+total_bill%50/20);
System.out.println(" \n\tNotes  10      \t"+10/total_bill%20);// if bill divide by 10 always 1 note or if 10 divide by bill always 0 notes whay
System.out.println(" \n\t        5     \t"+total_bill%10/5);
System.out.println(" \n\t        2     \t"+total_bill%5/2);
System.out.println(" \n\t        1     \t"+total_bill%2);}




}


}