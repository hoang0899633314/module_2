package ss2_constructor.access_Modifier;

public class AnimalManagement {
    public static void main(String[] args) {
        Animal animal = new Animal();

      //  animal.id = 2;
        animal.name = "aaaaa";

        animal.setId(15);
        System.out.println("Id là: " + animal.getId());
    }
}
