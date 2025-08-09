package ss2_constructor.access_Modifier;

public class Animal {
    private int id;
    String name; // default
    protected String color;
    public int age;

    void input() {
        this.id = 1;
        this.name = "abc";
        this.color = "red";
        this.age = 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
