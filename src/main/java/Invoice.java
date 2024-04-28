package src.main.java;

public class Invoice {

    private String product_number, product_description;
    private int quantity;
    private double pricePerItem;

    public Invoice(String id, String desc, int q, double ppt) {
        this.product_number = id;
        this.product_description = desc;
        this.quantity = q;
        this.pricePerItem = ppt;
    }

    public void setProduct_number(String id) {
        this.product_number = id;
    }
    public void setProduct_description(String desc) {
        this.product_description = desc;
    }
    public void setQuantity(int q) {
        this.quantity = q;
    }
    public void setPricePerItem(double ppt) {
        this.pricePerItem = ppt;
    }

    public String getProduct_number() {
        return product_number;
    }
    public String getProduct_description() {
        return product_description;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPricePerItem() {
        return pricePerItem;
    }

    public double Amount() {

        if (pricePerItem <= 0 || quantity <= 0) {
            return 0;
        } else {
            return pricePerItem * quantity;
        }

    }

}
