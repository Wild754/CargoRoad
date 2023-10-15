package Invoice;

public class SaleCost extends Order{ //  Liskov Substitution

    public SaleCost(int prod, int newRoute, int main) {
        super(prod, newRoute, main);
    }

    public static int TotalCost(){
        return product + route + maintenance;
    }
    public static double Sale() {
        int totalCost = TotalCost();
        double discount = 0.10;
        return totalCost - (totalCost * discount);

    }
    public static void TotalSaleOut() {
        double SaleCost = Invoice.SaleCost.Sale();
        System.out.println("Total Cost: " + SaleCost);
    }
}

