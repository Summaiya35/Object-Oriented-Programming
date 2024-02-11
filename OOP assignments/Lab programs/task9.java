import java.util.Scanner;
class task9{
static void line()
{
System.out.println("============================================");}

public static void main(String args [])
{
Scanner s=new Scanner(System.in);
String name;
short id,unit;
System.out.println("\nEnter Your name");
name=s.nextLine();
System.out.println("\nEnter Your ID");
id=s.nextShort();
System.out.println("\nEnter Your electricity units");
unit=s.nextShort();

if((unit>0)&&(unit<=199))
{
line();
System.out.println("\n Name  : "+name);
line();
System.out.println("\n ID  : "+id);
line();
System.out.println("\n Bill  : "+(unit*5));
}
else if((unit>=200)&&(unit<=399))
{
line();
System.out.println("\n Name  : "+name);
line();
System.out.println("\n ID  : "+id);
line();
System.out.println("\n Bill  : "+(unit*10));
}



else if((unit>=400)&&(unit<=599))
{
line();
System.out.println("\n Name  : "+name);
line();
System.out.println("\n ID  : "+id);
line();
System.out.println("\n Bill  : "+(unit*15));
}



else 
{
line();
System.out.println("\n Name  : "+name);
line();
System.out.println("\n ID  : "+id);
line();
System.out.println("\n Bill  : "+(unit*20));
}










}}