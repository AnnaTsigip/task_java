// У вас есть отсортированный массив, 
// нужно используя минимальное колличество попыток найти загаданное число

package seminar2;

import java.util.Random;
import java.util.Scanner;

public class exp_005 {
    public static void main(String[] args) {
        Random random = new Random();

        int answer = random.nextInt(1, 100); // задаем случайное число в диапазоне от 1 до 100
        boolean flag = false; // угадано или нет
        int count = 0;
        int low = 1;
        int hight = 100;

        System.out.println(
                "\nУгадайте число от 1 до 100");

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите число: ");
            int userAnswer = in.nextInt();
            count += 1;

            

            if (userAnswer == answer) { // 1) попытка отгадать удалась
                System.out.println("Вы угадали! Загаданное число это " + answer + "!");
                break;}
             
             else if (count == 1 && userAnswer < answer) { // меньше загаданного числа
                low = userAnswer;
                System.out.println(userAnswer + " меньше загаданного\n Введите число от " + userAnswer + " до 100");
                

            } else if (count == 1 && userAnswer > answer) { // больше загаданного
                hight = userAnswer;
                System.out.println(userAnswer + " больше загаданного. Введите число от 1 до " + userAnswer);
                
            }
            else if (count > 1 && userAnswer < answer) { 
                low = userAnswer;// 
                System.out.println(userAnswer + " меньше загаданного\n Введите число от " + low + " до " + hight);
                //mem = userAnswer;
            } else if (count > 1 && userAnswer > answer) {
                hight = userAnswer;
                System.out.println(userAnswer + " больше загаданного. Введите число от " + low + " до " + hight);
                
            }
        }
    }
}