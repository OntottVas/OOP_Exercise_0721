public abstract class Product {
    private String name;
    private int expirationDate;
    private int cost;

    public Product(String name, int expirationDate, int cost) {
        this.name = name;
        this.expirationDate = expirationDate;
        this.cost = cost;
    }

    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
        this.expirationDate = 30;
    }
}
