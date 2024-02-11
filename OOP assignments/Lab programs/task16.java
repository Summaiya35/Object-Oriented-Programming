import java.util.Scanner;
class task16{
public static void main(String args [])
{
Scanner s=new Scanner(System.in);
short N;
System.out.println("\n\t How many numbers do you have ");
 N=s.nextShort();
  if (N<0)
 System.out.println("\n\t Opp! Invalid Entry");
 else if(N==0)
System.out.println("\n\t Opps! I do not have any number to process on");
 else
 {
 	float number,highest,lowest;
 	
 	System.out.println("\n\t Enter any number");
 number=s.nextFloat();
	highest=number;
	lowest=number;
	for(int i=1;i<N;i++)
	{ System.out.println("\n\t Enter next number");
number=s.nextFloat();
 	if(number>highest)
 	{highest=number;
 	}
	if(number<lowest)
 	{lowest=number;
	}}
System.out.println("\n\t Higest number :"+highest);
System.out.println("\n\t Lowest number:"+lowest);
}



}}