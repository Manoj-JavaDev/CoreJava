package corejava.assessment2;
import java.io.*;
public class SerializationDemo {
    public static void main(String[] args) {
        /*
            Serialization is used to convert the java objects to bytes to store in databases and files.
         */
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/corejava/assessment2/SerialInput.txt"))) {

            Student s1 = new Student("Manoj", 11);
            out.writeObject(s1);

        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
            Deserialization is used to convert the byte object into normal object!
         */
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/corejava/assessment2/SerialInput.txt"))) {

            Student s2 = (Student) in.readObject();
            System.out.println("name: " + s2.name );
            System.out.println("age: " + s2.age);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();

        }
    }

    static class Student implements Serializable {

        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}

