import Shorts.shorts;
import java.util.Scanner;
import static java.lang.Math.abs;

public class swim implements Cloneable {
    public static int counter_one = 0;
    public inout _inout;
    private glasses _glasses = new glasses();
    private cap _cap = new cap();
    private shorts _shorts = new shorts();
    private slippers _slippers = new slippers();

    public void input() {
        _glasses.input();
        _cap.input();
        _shorts.input();
        _slippers.input();
    }

    public void output() {
        System.out.printf("%s", _glasses.toString());
        System.out.printf("%s", _cap.toString());
        _shorts.output();
        System.out.printf("%s", _slippers.toString());
    }

    public void res(func res) {
        res.sum = _glasses.getPrice() + _cap.getPrice() + _shorts.shorts_price + _slippers.getPrice();
        System.out.println("Итог: " + res.sum);
    }

    public void color() {
        if ((_glasses.getColor().equalsIgnoreCase(_cap.getColor())) && (_glasses.getColor().equalsIgnoreCase(_shorts.shorts_color)))
            System.out.println("У вас стильный total look");
        else
            System.out.println("У вас разноцветный комплект");
    }
    @Override
    public swim clone() {
        try {
            swim clone = (swim) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}


