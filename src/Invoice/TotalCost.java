package Invoice;

public class TotalCost extends Order { // Liskov Substitution

    public TotalCost(int prod, int newRoute, int main) {
        super(prod, newRoute, main);
    }
    public static int TotalCost(){
        return product + route + maintenance;
    }

    public static void TotalOut() {
        int totalCost = TotalCost.TotalCost();
        System.out.println("Total Cost: " + totalCost);
    }
}






