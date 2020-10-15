import java.util.Scanner;

public class Add
{
   public static void main(String[] args)
   {
     String a;
      int b;
      
      Scanner in = new Scanner(System.in);
      
      a= in.next();
   
      
      System.out.println(a.replaceAll("[-0-9]", ""));
   }
}