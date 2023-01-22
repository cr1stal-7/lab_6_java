import java.util.Scanner;

public class slippers extends things implements inout {

    public slippers() {
        this.setName("name");
        this.setSize(0);
        this.setPrice(0);
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        while (!getName().equalsIgnoreCase("tyr") && !getName().equalsIgnoreCase("speedo") && !getName().equalsIgnoreCase("mp")) {
            System.out.println("Введите название сланцев(tyr/speedo/mp):");
            String name = in.nextLine();
            setName(name);
        }
        System.out.println("Введите размер сланцев:");
        int size = in.nextInt();
        setSize(size);
        System.out.println("Введите стоимость сланцев:");
        float price = in.nextFloat();
        setPrice(price);
    }

    @Override
    public void output() {

    }

    public String toString() {
        return "Название сланцев:" + getName() + " Размер сланцев:" + getSize() + " Стоимость сланцев:" + getPrice() + "\n";
    }
}

