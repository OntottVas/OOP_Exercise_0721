public abstract class Product {
    private final String name;
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

    public String getName() {
        return name;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


}
