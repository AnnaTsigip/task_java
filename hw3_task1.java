import java.security.Permission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;



/*
 * Задание 1.
Создать карту (Map), будет хранить в себе данные телефонной книги (Фамилии и телефонные номера), 
если будут дубликаты фамилий, то должны выводиться оба номера 
(если помним Map не может хранить дубликаты, будет заменять номер телефона по ключу, 
нужно подумать как не допустить такого)
 */
// использовать :
// Map<String,ArrayList<String>> map =new HashMap<String >, ArrayList<String>>();

public class hw3_task1 {

    public static void main(String[] Strings) {

        HashMap<String, ArrayList<String>> phone_name = new HashMap<String, ArrayList<String>>();
        ArrayList<String> number = new ArrayList<String>();
        number.add("896523");
        number.add("587521");
        phone_name.put("Maksim", number);
        }
    }

//     