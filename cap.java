import java.util.Scanner;

public class cap extends things implements inout {

    public cap() {
        this.setName("name");
        this.setColor("color");
        this.setPrice(0);
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        while (!getName().equalsIgnoreCase("arena") && !getName().equalsIgnoreCase("tyr") && !getName().equalsIgnoreCase("speedo")) {
            System.out.println("Введите название шапочки(arena/tyr/speedo):");
            String name = in.nextLine();
            setName(name);
        }
        while (!getColor().equalsIgnoreCase("red") && !getColor().equalsIgnoreCase("black") && !getColor().equalsIgnoreCase("silver") && !getColor().equalsIgnoreCase("blue")) {
            System.out.println("Введите цвет шапочки(red/blue/black/silver):");
            String color = in.nextLine();
            setColor(color);
        }
        System.out.println("Введите стоимость шапочки:");
        float price = in.nextFloat();
        setPrice(price);
    }

    @Override
    public void output() {

    }

    public String toString() {
        return "Название шапочки:" + getName() + " Цвет шапочки:" + getColor() + " Стоимость шапочки:" + getPrice() + "\n";
    }
}
