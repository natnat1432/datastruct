import java.util.*;  
public class TwoArray
{  
   
   public static void main(String [] args)
   {
      int a = GetInput();
      int b = GetSub();
      String names[] = getName(a);  
      double[][] studesub = getEach(names,a,b);
      SortDisplay(names,studesub,a,b);
   }
   
   public static int GetInput()
   {  
      Scanner in = new Scanner(System.in);
      String userIn;
      int x;   
      while (true)
      {
         System.out.print("Enter number of students: ");
         userIn = in.next();
      try{
  
          x = Integer.parseInt(userIn);
          break;
      }

      catch (NumberFormatException ne)
         {
         System.out.println("Error Input! Please input a number.");
         }
       }
      return x;
   }
   public static int GetSub()
   {
    Scanner in = new Scanner(System.in);
      String userIn;
      int x;   
        while (true)
        {
         System.out.print("Enter number of subjects: ");
         userIn = in.next();
        try{
  
          x = Integer.parseInt(userIn);
          break;
         }

      catch (NumberFormatException ne)
         {
         System.out.println("Error Input! Please input a number.");
         }
       }
      return x;
   }
   

   public static String[] getName(int x)
   {
   Scanner in = new Scanner(System.in);
     String[] students = new String[x];
   
      for(int y=0;y<students.length;y++)
      {
       int num=0;
         ++num;
         System.out.print("Enter Student#"+num+" name: ");
         students[y] = in.next();
        
      }
      
      return students;
   }
   public static double[][] getEach(String[] name, int x, int y)
   {  
   y+=2;
    Scanner in = new Scanner(System.in);
    double [][] studesub = new double [x][y];
      double total =0;
      double avg = 0;

      for(int i=0;i<x;i++)
      {
       System.out.println("Enter scores for "+name[i]+":");
         for(int j=0;j<y-2;j++)
         {
           int a = j+1;
            System.out.print("Quiz#"+a+": ");
            studesub[i][j] = in.nextInt();
            total+=studesub[i][j];
            avg = total/(y-2);
            studesub[i][y-2] = total;
            studesub[i][y-1] = avg;
             
         }
         total=0;
         avg=0;
      }
      return studesub;
   }
   public static boolean verifyAD()
   {  Scanner in = new Scanner(System.in);
      String a;
      int b;
      do{
         b = 0;
         while (true) {
            System.out.println("----------------------------------------");
            System.out.print("Display as:\n1. Ascending\n2.Descending\n\n Input [1/2]: ");
            a = in.next();
            System.out.println("----------------------------------------\n\n"); 
         try {
            b = Integer.parseInt(a);
            break;
            }
         catch (NumberFormatException ne) {
            System.out.println("\n\n-------------------------------------\n");
            System.out.println("Error Input! Please input a number.");
            System.out.println("-------------------------------------\n");
            }
          if(b!=1 || b!=2)
          {
             System.out.println("\n\n-------------------------------------\n");
             System.out.println("Error Input! Please input 1/2.");
             System.out.println("-------------------------------------\n");
          }
        }
        }while( !(b==1 || b==2));
             if(b==1){
         return true;
         }
      else{
         return false;
         }     
   }
   
   public static void SortDisplay(String names[],double [][]studesub,int a,int b)
   {
      boolean ver = verifyAD();
      String[] studes = new String[a];
      int c = b+2;
      int n=1;
      
      System.out.print("Student     ");
      for(int h=0;h<b;h++)
      {
         System.out.print("Quiz "+n+"     ");
         n++;
      }
      System.out.print("Total     Average\n");
      for(int i=0; i<a;i++)
      {
         studes[i]="";
         studes[i]+=names[i]+"         ";
         for(int j=0;j<c;j++)
         {
           studes[i]+=studesub[i][j]+"       ";
         }
      }
      if(ver){
         String temp;
         for (int x = 0; x <a; x++) 
        {
            for (int y = x + 1; y < a; y++) 
            {
                if (studesub[x][c-1] > studesub[y][c-1]) 
                {
                    temp = studes[x];
                    studes[x] = studes[y];
                    studes[y] = temp;
                }
            }
        }
        }
       if(!ver)
       {
        String temp;
         for (int x = 0; x <a; x++) 
        {
            for (int y = x + 1; y < a; y++) 
            {
                if (studesub[x][c-1] < studesub[y][c-1]) 
                {
                    temp = studes[x];
                    studes[x] = studes[y];
                    studes[y] = temp;
                }
            }
        }
       }
      for(int z=0;z<a;z++)
      {
         System.out.println(studes[z]);
      }
   } 
}
        