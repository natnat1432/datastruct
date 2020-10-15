/*	

B. Write a program that given an integer between 0 and 6, prints the corresponding day of the week. Assume that the first day of the week (0) is Sunday.

Example:
Enter an integer: 2
Output: Tuesday

***********error case 1***************
Enter an integer: 9
Output: Invalid input. Please enter a value from 0-6

**********error case 2****************
Enter an integer: a
Output: Error! please input an integer!
*/

import java.util.Scanner;
public class Days
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String number;
      String day=null;
      boolean isDay=false;
    
   
      //Using do while loop in sanitizing user input with .replaceAll() and conditioning.
             int num=0;
   do{
            
        do {
           num = 0;
           System.out.print("Enter an integer: ");
           number = in.next();
               
             if(number.replaceAll("[0-9-]", "").length()>0){
               System.out.println("\n\n-------------------------------------\n");
               System.out.println("Output: Error! please input an integer!");
               System.out.println("-------------------------------------\n\n\n");
               isDay=false;
            }
               if(number.replaceAll("[^-]", "").length()>0 && number.replaceAll("[^0-9]", "").length()==0){
               System.out.println("\n\n-------------------------------------\n");
               System.out.println("Output: Error! please input an integer!");
               System.out.println("-------------------------------------\n\n\n");
               isDay=false;
            }
         
           if(number.replaceAll("[^0-9]", "").length()>0 && number.replaceAll("[^-]", "").length()>0)
            {
                System.out.println("-------------------------------------\n");
                System.out.println("Output: Invalid input. Please enter a value from 0-6");
               System.out.println("-------------------------------------\n");
              isDay=false;
            }
         
         
           if(number.replaceAll("[0-9]", "").length()==0)
           {
            isDay=true;
           }
        }while(isDay==false);
        num = Integer.parseInt(number);
        
        if(num>6 || num<0)
        {
        System.out.println("-------------------------------------\n");
        System.out.println("Output: Invalid input. Please enter a value from 0-6");
        System.out.println("-------------------------------------\n");
        }

      }while(num>6 || num<0);
      //Translating input number to String using If conditioning.
      
      if(num==0)
      {
         day = "Sunday";
      }
        if(num==1)
      {
         day = "Monday";
      }
        if(num==2)
      {
         day = "Tuesday";
      }
        if(num==3)
      {
         day = "Wednesday";
      }
        if(num==4)
      {
         day = "Thursday";
      }
        if(num==5)
      {
         day = "Friday";
      }
        if(num==6)
      {
         day = "Saturday";
      }
      
      //Output.
      System.out.println("-------------------------------------\n");
      System.out.println("Output: "+day);

         }
      
   
}