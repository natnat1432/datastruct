/*. Write a program that accepts a list of students and output their names.
Example:
Enter number of students: 3
Enter student#1: Art
Enter student#2: Tim
Enter student#3: Hue

Output:
Student list:
Art
Tim
Hue
*/
import java.util.Scanner;
public class Name
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       int z = 1;
       int n;
       while (true)
            try {
                System.out.print("\nEnter a number of students: ");
                n = Integer.parseInt(in.nextLine());
                break;
                } catch (NumberFormatException nfe) {
                System.out.println("Error! Try again: ");
                }
           String students[] = new String [n]; 
   
      for(int x=0; x<n;x++)
      { 
         System.out.print("Enter student#"+z+": ");
         students[x] = in.next();
         z++;
      }
      System.out.println("Output:\nStudent list:");
      for(int y=0;y<n;y++)
      {
         System.out.println(students[y]);
      }

   }
   
}