import java.math.*;
import java.util.Scanner;
public class Samostiyna_1 {


        public static void main(String[]args)
        {
            double y;
            double max =-100;
            double min =100;
            int count = 0;
            for (double x = (double) 2; x < 5; x+=0.25 )
            {
                count++;
                if (x>3.5)
                    y = (Math.sin(x)*Math.log(x));
                else
                    y = (Math.cos(x)*Math.cos(x));



                if(y > max) max=x;
                if(y < min) min=x;

                System.out.format("y = %10.4f" ,y);
                System.out.println();
            }
            System.out.println("Kilk=:" + count);
            System.out.println("max=:" + max);
            System.out.println("min=:" + min);

        }




    }

