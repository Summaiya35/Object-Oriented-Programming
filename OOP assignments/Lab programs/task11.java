import java.util.Scanner;
class task11{
public static void main(String args [])
{
Scanner s=new Scanner(System.in);
char a;
 System.out.println("\n\t Enter any letter");
 a=s.next().charAt(0);
 switch(a)
{case 'a': case 'e': case 'i': case 'o': case 'u': 
 System.out.println("\n\t It is a vowel");
 break;
default:
 System.out.println("\n\t It is a consonant");
 }




}}