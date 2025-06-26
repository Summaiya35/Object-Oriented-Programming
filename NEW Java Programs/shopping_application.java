import java.util.Scanner;
class shopping_application
{              static int ShoesTotalQty=0;
                 static int BooksTotalQty=0;
                 static int PensTotalQty=0;
   
     private static void shoes(Scanner obj)
    {         
              int Qty;
              System.out.println("Enter quatity for shoes : ");
             Qty=obj.nextInt();
             ShoesTotalQty+=Qty;
            
    }

   private static void books(Scanner obj)
    {     
              int Qty;
           System.out.println("Enter quatity for books : ");
             Qty=obj.nextInt();
           BooksTotalQty +=Qty;
        

    }

    private static void pens(Scanner obj)
    {
             
        int Qty;
           System.out.println("Enter quatity for Pens : ");
             Qty=obj.nextInt();
           PensTotalQty+=Qty;
       
    }

private static void PrintResult(int shoes,  int ShoesPrice, int books ,int BooksPrice ,int pens, int PensPrice)
    {
                 
                  int ShoesTotal=shoes*ShoesPrice;
                   int BooksTotal=books*BooksPrice;
                    int PensTotal=pens*PensPrice;
                  
                    System.out.println("You bought : "+shoes+"Shoes for total price "+ShoesTotal);
                     System.out.println("You bought : "+books+"Books for total price "+BooksTotal);
                     System.out.println("You bought : "+pens+"Pens for total price "+PensTotal);

                     System.out.println("The total Bill is "+(ShoesTotal+BooksTotal+PensTotal));
                  
      
  
    }
   
    public static void main(String args[])
    {             Scanner obj=new Scanner(System.in);
                  final int ShoesPrice=500;
                  final int BooksPrice=800;
                  final int PensPrice=100;
                  
                  
                   int input;

                  do{
                             
                              
                             System.out.println("From given data below , choose the number for product you want or select 0 to exit program .");
                             System.out.println("1. Shoes [price 500 per pair]");
                             System.out.println("2. Books [800 per book]");
                             System.out.println("3. Pens [100 per pen]");
                             System.out.println("0. Exit program, show result");
                            input=obj.nextInt();

                             switch(input)
                             {
                                case 1:
                                shoes(obj);
                                break;

                                case 2:
                                books(obj);
                                break;

                                case 3:
                                pens(obj);
                                break;

                                case 0:
                                PrintResult(ShoesTotalQty,ShoesPrice,BooksTotalQty,BooksPrice,PensTotalQty, PensPrice);
                                break;
                                 
                                default:
                                System.out.println("Invalid number entry");
                             }

                  }
                  while(input!=0);
                  obj.close();

    }
}