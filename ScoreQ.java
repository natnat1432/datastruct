import java.util.Scanner;
public class ScoreQ {
	public static void main(String[] args) {	
   int student   , a , b=0;
   float [][] q1;
   q1=new float[100][100];
   float[][] q2;
   q2 =new float[100][100];
   float[][] q3;
   q3=new float[100][100];
   String [][] st;
   st=new String[100][100];
   float [][] total;
   total=new float[100][100];
   float [][]average;
   average =new float [100][100];   
   Scanner sc=new Scanner(System.in);

    
   System.out.print("Enter the number of students: ");
   student=sc.nextInt();
   System.out.print("\n----------------------------\n");   
   for( a = 1 ; a <= student ; a++){
   System.out.print("Enter the student#"+a+" name: ");   
   st[a][b]=sc.next();           
    }
   System.out.print("----------------------------\n");    
   for( a = 1 ; a <= student ; a++){
   System.out.print("Enter scores for "+st[a][b]+":");   
   System.out.print("\nQuiz#1: ");
   q1[a][b]=sc.nextFloat();      
   System.out.print("Quiz#2: ");
   q2[a][b]=sc.nextFloat();  
   System.out.print("Quiz#3: ");
   q3[a][b]=sc.nextFloat();
   System.out.print("\n");
    }   
   for(a=1;a<=student;a++){  
   total[a][b]=  q1[a][b]+q2[a][b]+q3[a][b];      
   average[a][b]= total[a][b]/ 3;
   }   
    
   System.out.print("Output :"); 
   System.out.print("\nStudent\tQuiz 1\tQuiz 2\tQuiz 3\tTotal\tAverage");
   for(a=1;a<=student;a++){    
   System.out.print("\n"+st[a][b]);
   System.out.print(String.format("\t"+"%.0f",q1[a][b]));
   System.out.print(String.format("\t"+"%.0f",q2[a][b]));        
   System.out.print(String.format("\t"+"%.0f",q3[a][b]));         
   System.out.print(String.format("\t"+"%.0f",total[a][b]));
            
   System.out.printf("\t");
   System.out.print(String.format("%.1f",+average[a][b]));  
        }       
   System.out.print("\n------End of list------");
   sc.close();
}          
 }