// Написать метод, который будет эмулировать работу динамического массива (Без исопользования коллекций), протестировать можно при выводе последовательности треугольного числа до n
// Приер
// 1
// 1 3
// 1 3 6

// for (int i = 1; i < n+1; i++){
//     System.out.println(i*(i+1)/2);



public class exp_006 {
    public static void main(String[] args){

        int[] original = new int[] {1};
        int[]temp = new int[original.length + 1];
     
        for (int i = 0; i < 10; i++){
        temp[i] = original[i];}
      
        original = temp;
        System.out.println(original);
        
    }

  }


// public void increaseSize() {
//     String[] original = new String[1];
//     String[]temp = new String[original.length + 1];

//     for (int i = 0; i < original.length; i++){
//     temp[i] = original[i];
//  }
//     original = temp;
//     System.out.println(original);