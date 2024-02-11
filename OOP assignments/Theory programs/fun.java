public class fun{

    
    static byte add(byte a, byte b) {
       byte sum = (byte)(a + b);
        return sum;
    }

   static void line()
{System.out.println("====================================================");}

    public static void main(String[] args) {
        byte result =(byte) add((byte)3,(byte)5);
        line();
        System.out.println("Sum of 3 and 5 is: " + result);
        line();
    }
}
