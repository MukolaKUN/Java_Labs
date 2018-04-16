public class IfOperations {
    public static void main(String[] args) {
       /* int a = 10;
        int b = 12;
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }*/
/*
        int a = 10;
        int b = 12;
        if (a > b) {
            System.out.println(a);
        }
        else if (a != b) {
            System.out.println(b);
        }
        else {
            System.out.println("Значення рівні");
        }
*/

       /* int a = 10;
        int b = 12;
        if (a == b) {
            System.out.println("Значення рівні");
        }
        else if (a > b) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }*/

/*
            int a = 123;
            int b = 23;
            System.out.println((a > b) ? a : b);*/

/*а)	Дано змінні а = 10, b = 12, c = 34.
Використовуючи оператор if-else, виведіть на екран найбільше число, найменше число, суму змінних.

int a=10;
int b=12;
int c=34;
int max;
int min;
int suma;
if (a>b && a>c) {
    max=a;
}
else if (b>a && b>c){
    max=b;
}
else {
    max=c;
}
        if (a<b && a<c) {
            min=a;
        }
        else if (b<a && b<c){
            min=b;
        }
        else {
            min=c;
        }

        suma=a+b+c;

System.out.println("Max="+max);
System.out.println("Min="+min);
System.out.println("Suma="+suma);}*/

/*б)	Дано змінні a = 12, b = 42, c.
Обрахуйте значення змінної с як суми Вашого номера порядкового номера по журналі та номера місяця.
 Знайдіть суму змінних a та b, a та c, b та с.
Використовуючи оператор if-else, виведіть на екран найбільшу суму, середнє арифметичне найбільшої та найменшої суми.
        int a=12;
        int b=42;
        int c=9;
        int ab=a+b;
        int ac=a+c;
        int bc=b+c;
        int max=(((ab > ac))&&(ab > bc) ? ab : (ac > ab)&& (ac > bc)? ac : bc);
        int min=((ab < ac)&&(ab < bc) ? ab : (ac < ab)&& (ac < bc)? ac : bc);
        int aver=(max+min)/2;
        System.out.println(((ab > ac))&&(ab > bc) ? ab : (ac > ab)&& (ac > bc)? ac : bc);
        System.out.println("Середнє арифметичне ="+aver);*/


/*в)	Програма приймає 2 аргументи. Виведіть на екран аргумент, що майте більшу довжину.
 Виведіть на екран інформацію про те чи аргументи є рівними між собою чи ні.*/




    }
}
