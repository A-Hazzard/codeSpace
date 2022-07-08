import java.util.Scanner;
public class random {
    public static void main(String[] args) {
        int[] studentCount = ClassInput();//Stores the amount of students in the class
        int[] studentGrades = grades(studentCount);//Stores the different grades in the class
        returnGrades(studentGrades);
        calculateAverageGrade(studentGrades);
        findHighestGrade(studentGrades);
    }

    public static int[] ClassInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many students are in the class?");
        int studentCount = input.nextInt();//example 5 students
        int[] grades = new int[studentCount];


        return grades;//returns the array size
    }

    public static int[] grades(int[] studentCount){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the different student grades respectively");
        ;
        for (int i = 0; i < studentCount.length; i++) {
            studentCount[i] = input.nextInt();//example 1,2,3 etc
        }


        return studentCount;
    }

    public static void returnGrades(int[] grades){
        System.out.println("The different grades for the students are as followed:");

        for (int i : grades) {
     
            System.out.print(i + ",");
        }

        System.out.println("\n");

   
}

    public static void calculateAverageGrade(int[] grade){
        int total = 0;

        for( int i = 0; i < grade.length; i++){
            total += grade[i];
        }
        int average = total / grade.length;
        System.out.println("Average grade: " + average); 
           //returns the average grade
    }

    public static void findHighestGrade(int[] grade){
        int max = grade[0];

        for (int i = 0; i < grade.length; i++) {
            max = Math.max(max, grade[i]);
        }

        System.out.println("Highest grade: " + max);
    }
}
