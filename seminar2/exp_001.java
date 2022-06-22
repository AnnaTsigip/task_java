//Определение является ли строка полиндромом
package seminar2;
import java.util.Scanner;

public class exp_001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a word: ");
        String str1 = in.nextLine();

        System.out.println(str1);
        in.close();

        

        StringBuffer rev = new StringBuffer(str1).reverse(); 

        String strRev = rev.toString(); 

        System.out.print(str1.equalsIgnoreCase(strRev)); 


    }
}
 
