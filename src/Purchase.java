public class Purchase {
    private String title;
    private int count;
    private Purchase[] purchases;

    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public Purchase(int sizeOfArray) {
        this.purchases = new Purchase[sizeOfArray];
    }

    public void addPurchase(String title, int count) {
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == null) {
                purchases[i] = new Purchase(title, count);
                return;
            }
            if (purchases[i].title.equals(title)) {
                purchases[i].count += count;
                return;
            }
        }
    }

    public String getTitle() {
        return title;
    }

    public int getCount() {
        return count;
    }

    public Purchase[] getPurchases() {
        return purchases;
    }
}
