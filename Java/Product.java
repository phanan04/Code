public class Product {
    private String name;
    private double price;
    private double tax;

    public Product(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public void nhapThongTin() {

    }

    public void xuatThongTin() {

    }

    public double getTaxPrice(double price, double tax) {
        return price * tax;
    }

    public static void main(String[] args) {
        System.out.println("Run product");
    }
}
