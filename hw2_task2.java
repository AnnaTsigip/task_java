// Написать метод, который будет эмулировать работу динамического массива (Без исопользования коллекций), 
//протестировать можно при выводе последовательности треугольного числа до n
// Приер
// 1
// 1 3
// 1 3 6



import java.util.Arrays;
import java.util.Scanner;

public class hw2_task2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("\nСколько будет элементов в массиве? \n");
        int Num = Scanner.nextInt();
        Scanner.close();

        int[] array = new int[0]; // создаем изначальный массив
        for (int i = 1; i <= Num; i++) {
            array = addMassive(array, i); // расширяем изначальный массив
            System.out.println(Arrays.toString(array));
        }
    }

    public static int new_nums(int num) { // вычисляем числа массива
        if (num == 1) {
            return 1;
        }
        return new_nums(num - 1) + num;
    }

    public static int[] addMassive(int[] array, int newElement) {
        int[] newArray = new int[array.length + 1]; // объявляем массив размерностью на единицу больше предыдущего
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = new_nums(newElement); // добавляем в новый массив новый элемент и возвращаем его
        return newArray;
    }
}