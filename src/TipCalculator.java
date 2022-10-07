public class TipCalculator {
    private int numPeople;
    private double tipPercentage;
    private double totalBillBeforeTip;

    public TipCalculator(int numPeople, double tipPercentage, double totalBillBeforeTip){
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage/100;
        this.totalBillBeforeTip = totalBillBeforeTip;
    }

    public double getTotalBillBeforeTip(){
        return totalBillBeforeTip;
    }

    public double getTipPercentage(){
        return tipPercentage;
    }

    public void addMeal(double cost){
        cost += totalBillBeforeTip;
    }

    public double tipAmount(){
        return tipPercentage*totalBillBeforeTip;
    }

    public double totalBill(){
        return tipAmount()+totalBillBeforeTip;
    }

    public double perPersonCostBeforeTip(){
        return totalBillBeforeTip/numPeople;
    }

    public double perPersonTipAmount(){
        return tipAmount()/numPeople;
    }

    public double perPersonTotalCost(){
        return totalBill()/numPeople;
    }
}
