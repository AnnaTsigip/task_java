import java.util.Scanner;

// //Написать метод, который проверяет валидность логина и пароля
//  (где нибудь в переменных сохраните) и при помощи конструкции 
//  try-catch рекурсивно принимайте данные 
//  (нужно ограничить колиичество попыток до 6 и после 3 попытки должно быть сообщение, 
//  мол вы привысили количество попыток, немного пододождите 
//  //тут можете поток заслипить на некоторое время. А когда попытки кончатся - выйти)

public class hw3_task2 {

    public static void main(String[] args) throws InterruptedException {
        int countAttempt = 6;
        checkData(countAttempt);

    }

   
    public static String[] checkData(int count) throws InterruptedException {
        String[] array = new String[2];
        if (0 < count) {
            if (count == 3) {
                System.out.println("\nСлишком много попыток, ввод временно заблокирован!");
                Thread.sleep(5000);
            }
            try (Scanner sc = new Scanner(System.in)) {
                String userName; // объявляю переменную для сохранения имени пользователя
                String userPassword; // объявленные переменные для сохранения паролей
                System.out.println("*************************");
                System.out.println("* Вход пользователя *");
                System.out.println("*************************");
                System.out.println("Введите имя пользователя: ");
                userName = sc.next();
                System.out.println("Введите пароль: ");
                userPassword = sc.next();
                while (!validation_Data(userName, userPassword)) { // функция логина и пароля на совпадение
                    System.out.println("Имя пользователя или пароль введены!");
                    return checkData(count - 1); // рекурсивный вызов самой себя с уменьшением количества попыток
                }
                System.out.println("Доступ разрешон. Добро пожаловать!\n\n");
                array[0] = userName;
                array[1] = userPassword;
            }
        } else {
            System.out.println("Превышено количество попыток, ввод заблокирован. попробуйте позже!\n");
            array[0] = "";
            array[1] = "";
        }

        return array;
    }

    public static boolean validation_Data(String userName, String userPassword) {
        boolean result = false;
        String name = "marot";
        String parol = "111";
        try {
            if (userName != null & userPassword != null) {

                name.equals(userName);
                parol.equals(userPassword);

                result = name.equals(userName) && parol.equals(userPassword);
            }

        } catch (Exception ex) {
            result = false;
        }

        return result;
    }
}