package lv.rvt;

public class ProductWarehouse extends Warehousing {
    private String productName;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    public String getName() {
        return productName;
    }

    public String toString() {
        return "balance = " + getBalance() + ", space left " + howMuchSpaceLeft();
    }
}