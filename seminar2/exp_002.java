//Сократить строку вида aaabbbssskkk до a3b3s3k3
package seminar2;

public class exp_002 {
    public static void main(String[] args) {
        System.out.println(encod("aaabbbssskkk"));
    }

    public static String encod(String str) {
        char[] charString = str.toCharArray();
        String new_str = "";
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1) {
                if (charString[i] == charString[i + 1]) {
                    count += 1;
                } else {
                    new_str = new_str + charString[i] + count;
                    count = 1;
                }
            } else {
                new_str += charString[i] + String.valueOf(count);
            }
        }
        return new_str;
    }

}
