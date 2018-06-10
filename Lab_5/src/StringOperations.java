import java.util.Scanner;

public class StringOperations {
    public static void main(String [] args){
//        System.out.println("Hello" + " world");
//        System.out.println("Hello".concat(" world"));
//        System.out.println("Can".concat(" Stop"));


        String a = "StringOperations";
        String b= new String("StringOperations");
        String c = a;
        String d = "stringoperations";

//        System.out.println("a.equals(b) = " + a.equals(b));
//        System.out.println("b.equals(a) = " + b.equals(a));
//        System.out.println("a.equals(c) = " + a.equals(c));
//        System.out.println("a.equals(d) = " + a.equals(d));
//        System.out.println("a.equalsIgnoreCase(d) = " + a.equals(b));


//        Scanner scan = new Scanner(System.in);
//        System.out.println("Input your surname");
//        String surname = scan.nextLine();
//
//        System.out.println("surname.equalsIgnoreCase(d) = " + surname.equals(b));

//        String name = "MyName";
//        System.out.println("Довжина рядка: " + name.length());
//
//
//        String string = "Hello World";
//        String substring1 = "Hello";
//        String substring2 = "Test";
//
//        System.out.println(string.indexOf(substring1)); // виводить 0
//        System.out.println(string.indexOf(substring2)); // виводить -1.


//        String string = "http://google.com";
//        System.out.println("Починається з http:// " + string.startsWith("http://"));
//        System.out.println("Починається з ftp:// " + string.startsWith("ftp://"));
//        System.out.println("Закінчується з .com " + string.endsWith(".com"));
//        System.out.println("Закінчується з .com.ua " + string.endsWith(".com.ua"));


//        String s = "Hello World";
//        System.out.println(s.substring(3));
//        System.out.println(s.substring(1, 5));


//        String s = "Це демонстрація getChars методу";
//        int start = 16;
//        int end = 25;
//        char buf[] = new char[end - start];
//        s.getChars(start, end, buf, 0);
//        System.out.println(buf);
//
//
//        String g = "Hello my brother";
//        int l = g.length()/2;
//        char def[] = new char [g.length()];
//        g.getChars(l,end,def,0);
//        System.out.println(def);


//        String surname = "Klovak";
//        System.out.println("To upper - " + surname.toUpperCase());
//        System.out.println("To lower - " + surname.toLowerCase());


//        String isbn = "978-3-16-148410-0";
//        String[] isbnParts = isbn.split("-");
//
//        System.out.println("префікс EAN.UCC: " + isbnParts[0]);
//        System.out.println("номер регістраційної групи: " + isbnParts[1]);
//        System.out.println("номер регістранту: " + isbnParts[2]);
//        System.out.println("номер видання: " + isbnParts[3]);
//        System.out.println("контрольна цифра: " + isbnParts[4]);


        String s = "www.mysite.com";
        boolean isContain1 = s.contains("mysite");
        System.out.println(isContain1);// знайдено - повертає true

        boolean isContain2 = s.contains("mysite.ua");
        System.out.println(isContain2);// не знайдено - повертає false


        String str = "Hello my friend, did you swimed";
        boolean qwer = str.contains("ed");
        System.out.println(qwer);


    }






}

