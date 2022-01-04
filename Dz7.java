/**
 * Java2 HomeWork#6
 *
 * @author Vladimir Gomenyuk
 * @version 04.01.2022
 */
public class Dz7 {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Murzik", 15), new Cat("Murka", 10), new Cat("Stepan", 20)
        };
        Plate plate = new Plate(50, 30);
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }

        System.out.println(plate);
        plate.add();
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.setFullness();
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}


class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }

    void setFullness() {
        fullness = false;
    }

    void eat(Plate plate) {
        if (!fullness) {
            fullness = plate.decreaseFood(appetite);
        }
    }

    @Override
    public String toString() {
        return "{name=" + name + ", appetite=" +
                appetite + ",fullness=" + fullness + "}";
    }
}

class Plate {
    int volume;
    private int food;

    Plate(int volume, int food) {
        this.volume = volume;
        this.food = food;
    }

    boolean decreaseFood(int portion) {
        if (food < portion) return false;
        food -= portion;
        return true;
    }

    void add() {
        if (this.food + 40 <= volume) {
            this.food += 40;
        }
    }

    @Override
    public String toString() {
        return "plate:" + food;
    }
}