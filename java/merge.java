import java.util.Scanner;

public class merge {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
double total= 0, moneySpent, weeklyAllownce = 40;
double lunchMoney[] = new double[2];
for (int i = 0; i < 6; i++){

    System.out.println("Amount of money spent: ");
    moneySpent = input.nextDouble();

        total += moneySpent;
        lunchMoney[0] = moneySpent;
      
}



System.out.println("total money spent for week: " + total);

if(total > weeklyAllownce)
    System.out.println("Weekly lunch allowance exceeded!\nThe number of days for the week that the money spent on lunch exceeded " + Math.round(weeklyAllownce) + " dollars.");



    }
}
