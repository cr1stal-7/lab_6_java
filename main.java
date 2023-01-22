import Shorts.shorts;
import java.util.Scanner;
import java.util.*;

public class main {
    public static void main(String[] args) {
        int opt = 0, i = 0;
        swim[] set_one = new swim[20];
        while(opt != 4){
            System.out.println("Введите:");
            System.out.println("1 - Ввести комплект");
            System.out.println("2 - Вывести комплект");
            System.out.println("3 - Шаблон класса");
            System.out.println("4 - Завершить работу программы");
            Scanner in = new Scanner(System.in);
            try{    //TRY блок
                opt = in.nextInt();
                if (opt > 4 || opt < 1)
                    throw new OptException("invalid range");
            } catch (InputMismatchException e) {
                System.err.println("Нужно вводить цифру");
            } catch (OptException e) {
                System.err.println("Диапазон 1-4");
            }
            func sum = new func();
            switch (opt) {
                case 1:
                    set_one[i] = new swim();
                    set_one[i].input();
                    set_one[i].res(sum);
                    set_one[i].color();
                    swim set = new swim();
                    set = (swim)set_one[i].clone();
                    System.out.println("\nКлонирование");
                    set.output();
                    i++;
                    swim.counter_one++;
                    System.out.println("\n");
                    break;
                case 2:
                    for (int j = 0; j < swim.counter_one; j++) {
                        set_one[j].output();
                        set_one[j].res(sum);
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    index<Integer> test = new index<Integer>(8765);
                    Integer testNumber = test.getNumber();
                    System.out.println("test: " + testNumber);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
