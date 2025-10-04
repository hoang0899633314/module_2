package ss10.Btap;

public abstract class Phone {
    protected String id;
    protected String name;
    protected double price;

    public Phone(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }

    public abstract String getType();

    public abstract String toCSV();

    @Override
    public String toString() {
        return String.format("[%s] ID: %s | Name: %s | Price: %.2f",
                getType(), id, name, price);
    }
}
