package lv.rvt;

public class Product {
    public String initialName;
    public double initialPrice;
    public Integer initialQuantity;

    public Product (String initialName, double initialPrice, Integer initialQuantity){
        this.initialName = initialName;
        this.initialPrice = initialPrice;
        this.initialQuantity = initialQuantity;
    }

    public void printProduct(){
        System.out.println(this.initialName +  ", price " + this.initialPrice + ", " + this.initialQuantity + " pcs");
    }
}
