package ss10.Btap;

public class NewPhone extends Phone {
    private int warrantyMonths;

    public NewPhone(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String getType() {
        return "NewPhone";
    }

    @Override
    public String toString() {
        return super.toString() + " | Warranty: " + warrantyMonths + " months";
    }

    @Override
    public String toCSV() {
        return String.join(",", getType(), id, name, String.valueOf(price), String.valueOf(warrantyMonths));
    }
}
