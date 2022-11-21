public class Basket {

    private final Purchase[] purchases;

    public Basket(int sizeOfArray) {
        this.purchases = new Purchase[sizeOfArray];
    }

    public void addPurchase(String title, int count) {
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == null) {
                purchases[i] = new Purchase(title, count);
                return;
            }
            if (purchases[i].getTitle().equals(title)) {
                purchases[i].setCount(purchases[i].getCount() + 1);
                return;
            }
        }
    }

    public Purchase[] getPurchases() {
        return purchases;
    }
}
