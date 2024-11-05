
public class Product {
    String name;
    int number;
    int quantity;
    double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String name, int number, int quantity, double price) {
        this.name = name;
        this.number = number;
        this.quantity = quantity;
        this.price = price;
    }

    public void print() {
        System.out.println("Nama Objek     : "+name);
        System.out.println("Nomor Objek    : "+number);
        System.out.println("Quantity Objek : "+quantity);
        System.out.println("Price Objek    : "+price);
    }

}
