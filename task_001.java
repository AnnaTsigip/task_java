// +Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму. 
// Пример 1: а = 3, b = 2, ответ: 9 
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено

import java.util.Scanner;

public class task_001 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("\n\nВведите число: ");
        int a = iScanner.nextInt();
        System.out.print("Введите степень числа: ");
        int b = iScanner.nextInt();

        if (b == 0) {
            System.out.println("Число " + a + " в нулевой степени = единице!");
        } else if (b == 1) {
            System.out.println("Число " + a + " ^ " + b + " = " + a + " .");
        } else {
            double c = a;
            for (int i = 1; i < Math.abs(b); i++) {
                c = c * a;
            }
            if (0 < b) {
                System.out.println("Число " + a + " ^ " + b + " = " + c + " .");
            }
            if (b < 0) {
                System.out.println("Число " + a + " ^ " + b + " = " + 1 / c + " .");
            }
        }

    }
}
