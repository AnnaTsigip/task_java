// Написать программу возрващающее число, которе без остатка делится на сумма цифр этого числа.

import java.util.Scanner;


public class task_004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nВедеите число: \n");
        int num = in.nextInt();
        int num2 = num;
        System.out.println(num);
        int sum = 0;

        while(num != 0){
            //Суммирование цифр числа
             sum += (num % 10);
             num/=10;
     }
     System.out.println(sum + " ");

     if (num2 % sum == 0){
        System.out.println("Число " + num2  + " делится на число " + sum  + " без остатка");
     }
     else{
        System.out.println("Число " + num2  + " НЕ делится на число " + sum  + " без остатка");
     }
        

    }
    
}
