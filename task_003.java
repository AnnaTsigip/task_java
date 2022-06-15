// +Написать программу вычисления n-ого треугольного числа. url

import java.util.Scanner;

public class task_003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nСколько элементов в последовательности?\n");
        int n = in.nextInt();
    

        for (int i = 1; i < n+1; i++){
            System.out.println(i*(i+1)/2);
       
    }
}
}

    

