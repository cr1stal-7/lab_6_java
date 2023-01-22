import java.util.Scanner;

public class glasses extends things implements inout {

    public glasses() {
        this.setName("name");
        this.setColor("color");
        this.setPrice(0);
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        while (!getName().equalsIgnoreCase("arena") && !getName().equalsIgnoreCase("tyr") && !getName().equalsIgnoreCase("mp")) {
            System.out.println("Введите название очков(arena/tyr/mp):");
            String name = in.nextLine();
            setName(name);
        }
        while (!getColor().equalsIgnoreCase("red") && !getColor().equalsIgnoreCase("black") && !getColor().equalsIgnoreCase("silver") && !getColor().equalsIgnoreCase("blue")) {
            System.out.println("Введите цвет очков(red/blue/black/silver):");
            String color = in.nextLine();
            setColor(color);
        }
        System.out.println("Введите стоимость очков:");
        float price = in.nextFloat();
        setPrice(price);
    }

    @Override
    public void output() {

    }

    public String toString() {
        return "Название очков:" + getName() + " Цвет очков:" + getColor() + " Стоимость очков:" + getPrice() + "\n";
    }
}

