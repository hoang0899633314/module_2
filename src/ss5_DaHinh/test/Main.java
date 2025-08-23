package ss5_DaHinh.test;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(new Cat());
        animalList.add(new Bird());

        for (Animal animal : animalList) {
            animal.tiengKeu();
            if (animal instanceof Bird){
                // Kiểm tra xem animal có phải là một thể hiện
                // của bird hay không
                ((Bird) animal) .fly();
            }
        }

    }
}
