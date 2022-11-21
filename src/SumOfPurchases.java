import java.util.Map;

public class SumOfPurchases {

    public static long sum(Map<String, Integer> prices, Basket basket) {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (Purchase purchase : basket.getPurchases()) {
            if (purchase == null) continue;
            long sumOfPurchase = (long) purchase.getCount() * prices.get(purchase.getTitle());
            System.out.println("\t" + purchase.getTitle() + " " + purchase.getCount() + " шт. в сумме " + (sumOfPurchase) + " руб.");
            sum += sumOfPurchase;
        }
        return sum;
    }
}
