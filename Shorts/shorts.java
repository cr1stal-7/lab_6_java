package Shorts;
import java.util.Scanner;

public class shorts {
    public String shorts_name;
    public String shorts_color;
    public float shorts_price;
    //ПРОТЕКТЕД//
    protected static String wsPurpose;
    protected static String wsMaterial;

    public shorts() {
        this.shorts_name = "name";
        this.shorts_color = "color";
        this.shorts_price = 0;
    }

    public shorts(String purpose, String material) {
        this.shorts_name = "name";
        this.shorts_color = "color";
        this.shorts_price = 0;
        wsPurpose = purpose;
        wsMaterial = material;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        while (!shorts_name.equalsIgnoreCase("tyr") && !shorts_name.equalsIgnoreCase("arena") && !shorts_name.equalsIgnoreCase("mp")) {
            System.out.println("Введите название шорт(arena/tyr/mp):");
            shorts_name = in.nextLine();
        }
        if (shorts_name.equalsIgnoreCase("arena")) {
            wetsuit ws = new wetsuit();
            ws.Input();
        }
        System.out.println("Введите цвет шорт:");
        shorts_color = in.nextLine();
        System.out.println("Введите стоимость шорт:");
        shorts_price = in.nextFloat();
    }
    public void output() {
        System.out.println("Название шорт: " + shorts_name + " Цвет: " + shorts_color + " Стоимость: " + shorts_price);
        if (shorts_name.equalsIgnoreCase("arena"))
            wetsuit.wsDisplay(wsPurpose, wsMaterial);
    }
}