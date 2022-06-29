import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Написать программу перебора n комбинаций из цифр от 0 - 9 
//(n длина массива) те
// 0 0 0
// 0 0 1
// 0 0 2 - - - 
//9 9 9 
//n - длина одной строки

public class sem3_task2 {
    public static List<List<Integer>> generateList = new ArrayList<>();

    /**
     *
     */
    
    

    // public static int ScannerNumber() { // метод ввода данных
    //     Scanner in = new Scanner(System.in);
    //     System.out.print("Input a number: ");
    //     int number = in.nextInt();
    //     in.close();
    //     return number;
    // }
    

public static void generate (int[]comb, int index, int n){
    if (comb.length == index){
        System.out.println(Arrays.toString(comb));
        return;
    }
    for (int i = 0; i < n; i++) {
        comb[index] = i;
        generate(comb, index +1, n);
        
    }
        
    }


    public static void main(String[] args) {
        int n = 3;
        generate(new int[n], 0, 10);
       
        
    }
}
