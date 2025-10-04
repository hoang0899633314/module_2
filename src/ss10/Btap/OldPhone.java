package ss10.Btap;

public class OldPhone extends Phone {
    private String condition;

    public OldPhone(String id, String name, double price, String condition) {
        super(id, name, price);
        this.condition = condition;
    }

    @Override
    public String getType() {
        return "OldPhone";
    }

    @Override
    public String toString() {
        return super.toString() + " | Condition: " + condition;
    }

    @Override
    public String toCSV() {
        return String.join(",", getType(), id, name, String.valueOf(price), condition);
    }
}
