import java.util.Scanner;
public class ArrayOfValues {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

       
    int values[] = new int[10];
           
       System.out.println("Enter values in the array: ");
       for (int i = 0; i < values.length; i++) {//3
           values[i] = sc.nextInt();
              
       }
       printValues(values);
       System.out.println("\n");
        findAvg(values);
        System.out.println("\n");
      findMax(values);
    }
   

    public static void printValues(int values[]){

        // display the elements (values) in values[]
        System.out.println("Values:");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + ",");
        }
     
     }
     
     public static double findAvg(int values[]){ 
     
        // calculate and return the average of the values in values[]
     double total = 0;

        for(int i = 0; i < values.length; i++){
        	total = total + values[i];
        }
       
        double average = total / values.length;
    
        System.out.printf("The average is: %.2f", average);
        return average;
    }
     
   
     public static int findMax(int values[]){
     
        // find and return the maximum value in values[]
      int maxValue = values[0];
        for(int i = 1; i < values.length; i++){
            if(values[i] > maxValue){
                
                maxValue = values[i];
    }
   
  }
  System.out.println("Maximum Value:" + maxValue);
  return maxValue;
     }
    
}
