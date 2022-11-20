import java.util.Map;

public class SumOfPurchases {

    public static long sum(Map<String, Integer> prices, Purchase purchase) {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (Purchase purch : purchase.getPurchases()) {
            if (purch == null) continue;
            long sumOfPurchase = (long) purch.getCount() * prices.get(purch.getTitle());
            System.out.println("\t" + purch.getTitle() + " " + purch.getCount() + " шт. в сумме " + (sumOfPurchase) + " руб.");
            sum += sumOfPurchase;
        }
        return sum;
    }
}
