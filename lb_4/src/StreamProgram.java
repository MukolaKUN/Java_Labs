import java.io.FileOutputStream;
import java.io.FileInputStream;

public class StreamProgram {

    public static void main(String[] args) {

        try {
            FileOutputStream output = new FileOutputStream("file.txt");
            output.write("Hello world".getBytes());
            output.close();
            FileInputStream input =new FileInputStream("file.txt");
            byte[] buffer = new byte[10];
            int length = input.read(buffer);
            while (length != -1) {
                System.out.println(new String(buffer, 0, length));
                length = input.read(buffer);
            }

        }

        catch (Exception e) {
            e.printStackTrace();
        }




    }
}
