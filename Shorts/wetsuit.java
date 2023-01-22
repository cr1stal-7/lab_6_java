package Shorts;
import java.util.Scanner;

public class wetsuit extends shorts {

        public wetsuit() {
                shorts ws = new shorts(wsPurpose, wsMaterial);
        }

        protected void Input() {
                Scanner in = new Scanner(System.in);
                System.out.println("Введите вид шорт: ");
                wsPurpose = in.nextLine();
                System.out.println("Введите материал шорт: ");
                wsMaterial = in.nextLine();
        }

        static void wsDisplay(String purpose, String material) {
                //ВЫЗОВ БАЗОВОГО КОНСТРУКТОРА//
                System.out.println("Вид шорт: " + wsPurpose + " Материал шорт: " + wsMaterial);
        }
}