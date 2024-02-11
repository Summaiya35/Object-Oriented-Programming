import java.util.Scanner;
class marksheet{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String name,edu;
byte ict,pre;
short seat_no;
float percent;
System.out.println("Enter your name ");
name=s.nextLine();
System.out.println("Enter your class ");
edu=s.nextLine();
System.out.println("Enter your seat number ");
seat_no=s.nextShort();

System.out.println("\n\n SUBJECTS\t\t\t\tMAX MARKS\t\t\t\t\t OBTAIN MARKS");
System.out.println("\n __________________________________________________________________________________________________________");
System.out.println("\n  Information Communication Technology\t\t100\t\tenter your ICT marks");
ict=s.nextByte();
System.out.println("\n  Precalculus\t\t\t100\t\t  enter your precalculus marks\t");
pre=s.nextByte();


System.out.println("\n\t  __________________________________");
System.out.println("\n\n\t   Name :  "           +name);
System.out.println("\n\t     Education : "       +edu);
System.out.println("\n\t     Seat number :"+seat_no);
System.out.println("\n\t     Total Obtain Marks :"+(short)(ict+pre));
percent = (float)((ict + pre)*100 /(float)200);

System.out.println("\n\t    Result Percentage %  :  "+percent);
if(percent>=80 && percent<=100)
System.out.println("\n\t A Grade");
else if(percent>=70 && percent<80)
System.out.println("\n\t B Grade ");
else
System.out.println("Fail");


}

}