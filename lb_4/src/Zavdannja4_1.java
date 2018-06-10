import java.io.*;

public class Zavdannja4_1 {
        public static void main(String[] args) throws IOException {
//            char c;
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            System.out.println("Введіть символ, '5' для завершення роботи...");
//            do {
//                c = (char) br.read();
//                System.out.println(c);
//            } while (c == '5' && c == '7');
//
//
//            int number = 225;
//            System.out.println(number + "  у двійковій системі "
//                    + Integer.toBinaryString(number));
//            System.out.println(number + "  у шістнадцятковій системі "
//                    + Integer.toHexString(number));
//            System.out.println(number + "  у вісімковій системі "
//                    + Integer.toOctalString(number));



            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str;
            int i;
            int suma = 0;
            System.out.println("Введіть довільні числа від 0 до quit...");
            do {
                str = br.readLine();
                try {
                    i = Integer.parseInt(str);
                } catch (NumberFormatException e) {
                    System.out.println("Невірний формат");
                    i = 0;
                }
                suma += i;
                System.out.println("Поточна сума рівна: " + suma);
            } while (i != 0);
        }


}




