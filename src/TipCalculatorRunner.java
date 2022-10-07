import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Your total bill: ");
        double totalBill = scan.nextDouble();

        System.out.print("Tip percentage: ");
        double tipPercentage = scan.nextInt();

        System.out.print("Number of people in the party: ");
        int numberOfPeople = scan.nextInt();

        TipCalculator calc = new TipCalculator(numberOfPeople, tipPercentage, totalBill);

        System.out.println("Your total tip amount is $" + String.format("%.2f",calc.tipAmount()));
        System.out.println("Your total bill including tip is $" + String.format("%.2f", calc.totalBill()));
        System.out.println("Each person pays $" + String.format("%.2f", calc.perPersonTipAmount()) + " in tips");
        System.out.println("Each person pays $" + String.format("%.2f", calc.perPersonTotalCost()) + " in total including bill and tip");
    }
}
