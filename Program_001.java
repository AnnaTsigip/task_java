// https://metanit.com/java/tutorial/2.9.php
import java.util.Scanner; 
 
// public class Program_001 {
   
//     public static void main(String[] args) {
           
//         Scanner in = new Scanner(System.in); // Для создания самого объекта Scanner в его конструктор 
//         //передается объект System.in. После этого мы можем получать вводимые значения. 
//         //Например, в данном случае вначале выводим приглашение к вводу
//         // и затем получаем вводимое число в переменную num.

//         System.out.print("Input a number: ");
//         int num = in.nextInt(); //метод in.nextInt();
//         // который возвращает введенное с клавиатуры целочисленное значение.
          
//         System.out.printf("Your number: %d \n", num);
//         in.close();
//     }
// }

/*
 * Класс Scanner имеет еще ряд методов, которые позволяют получить введенные пользователем значения:

next(): считывает введенную строку до первого пробела

nextLine(): считывает всю введенную строку

nextInt(): считывает введенное число int

nextDouble(): считывает введенное число double

nextBoolean(): считывает значение boolean

nextByte(): считывает введенное число byte

nextFloat(): считывает введенное число float

nextShort(): считывает введенное число short
 */


 
public class Program_001 {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input age: ");
        int age = in.nextInt();
        System.out.print("Input height: ");
        float height = in.nextFloat();
        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);
        in.close();
    }
}