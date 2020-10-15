/*
 Write a program that accepts n number of integer and check if n is in the entered list.
Example:
Enter number of integers: 5
Enter#1: 10
Enter#2: 15
Enter#3: 25
Enter#4: 5
Enter#5: 20

Search: 5
"5" is in the list!

Search: 8
"8" is NOT in the list! */
import java.util.Scanner;
public class Enter
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.print("Enter number of integers: ");
      int n = in.nextInt();
      int z =1;
      int num[] = new int[n];
      boolean found=false;
      
      for(int x=0;x<n;x++)
      {
         System.out.print("Enter#"+z+": ");
         num[x] = in.nextInt();
         z++;
         
         if(num[x]==n)
         {
            found = true;
         }
      }     
      if(found)
      {
         System.out.println("Search: "+n);
         System.out.println("'"+n+"' is in the list!");
      }
      else
      {
         System.out.println("Search: "+n);
         System.out.println("'"+n+"' is NOT in the list!");
      }
   }
   
}