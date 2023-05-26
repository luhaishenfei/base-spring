package _5IO._2IO;

import _1ObjectMethod.Student;

import java.io.*;

public class _19Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //序列化
        ObjectOutputStream oos =new ObjectOutputStream(
                new FileOutputStream("src\\_5IO\\_2IO\\_19Test.txt")
        );
        Student student = new Student("zhwHaoWen",23);
        oos.writeObject(student);
        oos.close();

        //反序列化
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("src\\_5IO\\_2IO\\_19Test.txt")
        );

        Student s1 = (Student) ois.readObject();
        ois.close();
        System.out.println(s1.getName()+s1.getAge());


    }


}
