

import java.util.Scanner;
import java.lang.Math;

public class GradeCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
       
        int choice;
        double max = 0, min = 0;//Finds highest and lowest grade

        double[] results = inputMarks();

       do{
        System.out.println("\nWhat would you like to do? Press -1 if you want to exit \n1)Display Results\n2)Display highest grade\n3)Display lowest grade\n4)Display the sum of the highest and lowest grade\n5)Display Marks entered previously\n");
        choice = sc.nextInt();
        switch(choice){
            case 1:
                returnResults(results);
            break;
            case 2:
                  max = returnHighestGrade(results);
            break;
            case 3:
                 min = returnlowestGrade(results);
            break;
            case 4:
                 returnSumOfHighestandLowestGrade(max, min);
            case 5:
                returnMarks(results);
                break;
        }
    
    }while(choice != -1);
   
    }

    public static double[] inputMarks(){
        Scanner input = new Scanner(System.in);
      
        double mark[] = new double[10];
        System.out.println("Enter a mark between 0 to 100 or -1 to quit: ");

        for (int i = 0; i < mark.length; i++) { 
            mark[i] = input.nextDouble(); 
            if(mark[i] == -1)
            System.exit(0);          
        }
        
        System.out.print("Marks stored: ");
            for (int i = 0; i < mark.length; i++){
            System.out.print(Math.round(mark[i]) + ",");
            } 

        System.out.println("\n");
        return mark;
    }

    public static void returnMarks(double[] marks) {
        System.out.println("Marks stored: ");
    for (int i = 0; i < marks.length; i++) {
        System.out.print(marks[i] + ",");
    }
        System.out.println("\n");
    }
    
    public static void returnResults(double[] results){
        double gradeACount = 0, gradeBCount = 0, gradeCCount = 0, gradeFCount = 0;
        int total = 0;
        for (int i = 0; i < results.length; i++) {
           
            if (results[i] == -1) {
                System.exit(0);
            }
            if (results[i] >= 90 && results[i]<= 100) {
                // Grade A
                gradeACount++;
            } else if (results[i] >= 70 && results[i]<= 89) {
                // Grade B
                gradeBCount++;
            } else if (results[i] >= 50 && results[i]<= 69) {
                // Grade C
                gradeCCount++;
            } else if (results[i] >= 0 && results[i]<= 49) {
                // Grade F
                gradeFCount++;
            }
            total++;

        }
        System.out.println("Total number of marks = " + Math.round(total));
        System.out.println("Total number of A's = " + Math.round(gradeACount));
        System.out.println("Total number of B's = " + Math.round(gradeBCount));
        System.out.println("Total number of C's = " + Math.round(gradeCCount));
        System.out.println("Total number of F's = " + Math.round(gradeFCount));
    }

    public static double returnHighestGrade(double[] results){
        double max = results[0];
       

        for (int i = 1; i < results.length; i++) {
            max = Math.max(max, results[i]);
        }

        if(max % 2 == 0){
        System.out.println("Highest Grade = " + Math.round(max));
        } else {
            System.out.println("Highest Grade = " + max);

        }
    
        return max;
    }

    public static double returnlowestGrade(double[] results){
        double min = results[0];

        for (int i = 0; i < results.length; i++) {
            min = Math.min(min, results[i]);
        }

        System.out.println("Lowest Grade = " + Math.round(min));
   
        return min;
    }

    public static void returnSumOfHighestandLowestGrade(double max, double min){
       
       double sum = max + min;
       
       if(sum % 2 == 0)
       System.out.println("Sum of the lowest and highest grades = " + Math.round(sum));
       else
       System.out.println("Sum of the lowest and highest grades = " + sum);
    }

    public static void returnAverageGrade(double[] results){
        int total = 0;

        for (int i = 0; i < results.length; i++) {
            total += results[i];
        }
        double Average = Double.valueOf(total);
        System.out.println("Average Grade = " +  Average);
    }
}
