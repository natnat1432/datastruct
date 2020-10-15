 /*Write a program that accepts n number of integers and display the largest odd number.
Example:
Enter number of integers: 10
Enter # 1: 6
Enter # 2: 50
Enter # 3: 1
Enter # 4: 2
Enter # 5: 13
Enter # 6: 26
Enter # 7: 30
Enter # 8: 16
Enter # 9: 26
Enter # 10: 31
*/
import java.util.Scanner;

public class Odd
{  
   public static void main(String[] args)
   {
      int n;
      Scanner in = new Scanner(System.in);
      
       while (true)
            try {
                System.out.print("Enter number of integers: ");
                n = Integer.parseInt(in.nextLine());
                break;
                } catch (NumberFormatException nfe) {
                System.out.println("Error! Try again: ");
                }

      int num[] = new int [n]; 
      int odd=0;
      int z = 1;
      for(int x = 0; x<n;x++)
      {
       
         System.out.print("Enter # "+z+": ");
           try {
                System.out.print("Enter number of integers: ");
                n = Integer.parseInt(in.nextLine());
                break;
                } catch (NumberFormatException nfe) {
                System.out.println("Error! Try again: ");
                }

         z++;
         if(num[x]%2!=0)
         {
            if(odd<num[x])
            {
            odd= num[x]; 
            } 
         }
      }
      System.out.println("Output: \nLargest Odd Number: "+odd);
      
   }
      
}