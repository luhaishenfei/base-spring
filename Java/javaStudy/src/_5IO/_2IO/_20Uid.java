package _5IO._2IO;

import _1ObjectMethod.Student;

import java.io.*;
/*
*
 public class InvalidClassException
extends ObjectStreamException当序列化运行时检测到类中的以下问题之一时抛出。
类的串行版本与从流中读取的类描述符的类型不匹配
该类包含未知的数据类型
该类没有可访问的无参数构造函数

*
* transient 修饰的成员变量变量不参与序列化 (age)
* */


public class _20Uid {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       // write();
       read();
    }

    private static void read() throws IOException, ClassNotFoundException {
        //反序列化
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("src\\_5IO\\_2IO\\_20Test.txt")
        );

        Student s1 = (Student) ois.readObject();
        ois.close();
        System.out.println(s1.getName()+s1.getAge());


    }

    private static void write() throws IOException {
        //序列化
        ObjectOutputStream oos =new ObjectOutputStream(
                new FileOutputStream("src\\_5IO\\_2IO\\_20Test.txt")
        );
        Student student = new Student("zhwHaoWen",23);
        oos.writeObject(student);
        oos.close();
    }
}

