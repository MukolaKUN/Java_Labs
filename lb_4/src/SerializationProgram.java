
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
public class SerializationProgram {
    public static void main (String[] args){

        Student student1 = new Student();
        try {
            FileOutputStream fileOutput = new FileOutputStream("file.txt");
            ObjectOutputStream objectOutput;
            objectOutput = new ObjectOutputStream(fileOutput);
            objectOutput.writeObject(student1);



        }

        catch (Exception e) {
            e.printStackTrace();
        }

        student1.setName("Bohdan");
        student1.setAge(18);








    }
}
