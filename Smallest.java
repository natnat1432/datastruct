/*A. Write a program that, given three integers, returns the smallest value.
Example:
Enter first number: 6
Enter second number: 7
Enter third number: 2
-------------------------------------
Output: 2

***********error case*******************
Enter first number: f
-----------------------------------
Output: Error! please input an integer!
*/

import java.util.Scanner;

public class Smallest
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        String one;
        String two;
        String three;
        int smallest;
        
        
      //Using do while and .replaceAll to check if there are other characters than digit.

      do{
        System.out.print("Enter first number: ");
        one = in.next();
         if(one.replaceAll("[0-9]", "").length()>0)
         {
         System.out.println("-------------------------------------");
         System.out.println("Output: Error! please input an integer!");
         System.out.println("-------------------------------------\n");
         }
        }while(one.replaceAll("[0-9]", "").length()>0);
        
              
      do{
        System.out.print("Enter second number: ");
        two = in.next();
            if(two.replaceAll("[0-9]", "").length()>0)
             {
         System.out.println("-------------------------------------");
         System.out.println("Output: Error! please input an integer!");
         System.out.println("-------------------------------------\n");
              }
        }while(two.replaceAll("[0-9]", "").length()>0);
        
       do{
        System.out.print("Enter third number: ");
        three = in.next();
          if(three.replaceAll("[0-9]", "").length()>0)
          {
         System.out.println("-------------------------------------");
         System.out.println("Output: Error! please input an integer!");
         System.out.println("-------------------------------------\n");
          }
         }while(three.replaceAll("[0-9]", "").length()>0);
         
         //Converting String variables to Int for comparison
          int x = Integer.parseInt(one);
          int y = Integer.parseInt(two);
          int z = Integer.parseInt(three);
          
         //Getting the smallest number using nested ternary operator.
         
         smallest = x < y ? (x < z ? x : z) : (y < z ? y : z); 
         
         //Output display.
         System.out.println("-------------------------------------");
         System.out.println("Output: "+smallest);
    }
}