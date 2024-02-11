import java.util.Scanner;
class words{
public static void main(String args [])
{Scanner s=new Scanner (System.in);
byte smallCount=0,upperCount=0,space=0,specialCharacter=0,sentence=0;
String S;
System.out.println("Enter any string literal ");
S=s.nextLine();
for(byte b=0;b<S.length();b++)
 {char c=S.charAt(b);


 	if((c>=65)&&(c<=90))
 	upperCount+=1;

        if((c>=97)&&(c<=122))
 	smallCount+=1;

         if(c==' ')
 	space+=1;

         if(!(c>=97||c<=122)&&(!(c>=65)&&(c<=90)))
 	  specialCharacter+=1;

         if(c=='.')
 	sentence+=1;}
 
 System.out.println("\n\t THe number of upper letters in string are "+upperCount);
 
 System.out.println("\n\t THe number of small letters in string are "+smallCount);
 
 System.out.println("\n\t THe number of words in string are "+space+1);
 
 System.out.println("\n\t THe number of special characters in string are "+specialCharacter);
 
 System.out.println("\n\t THe number of sentences in string are "+sentence);
 
 
 





}



}