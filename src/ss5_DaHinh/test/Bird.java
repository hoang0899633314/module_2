package ss5_DaHinh.test;

public class Bird extends Animal implements Flyable{
    public void tiengKeu() {
        System.out.println("Chip chip");
    }
    public void fly() {
        System.out.println("Chim bay nhanh....");
    }
}
