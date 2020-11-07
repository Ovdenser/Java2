package Lesson1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Actions> creatures = new ArrayList<>();
        creatures.add(new Cat(2000, 5));
        creatures.add(new Human(500, 3));
        creatures.add(new Robot(1500, 2));

        List<Object> obstacles = new ArrayList<>();
        obstacles.add(new Wall(3));
        obstacles.add(new Treadmill(1000));

        for (Actions act : creatures) {
            for (Object obs : obstacles) {
                boolean result;
                if (obs instanceof  Wall) {

                    result = act.jump((Wall) obs);

                } else {
                    result = act.run((Treadmill) obs);

                }
                if (!result) {
                    break;
                }
            }
        }
    }
}