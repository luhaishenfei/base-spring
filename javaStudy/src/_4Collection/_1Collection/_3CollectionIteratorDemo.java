package _4Collection._1Collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class _3CollectionIteratorDemo {
    public static void main(String[] args) {


        _3Student student1 = new _3Student("zhuHaoWen",23);
        _3Student student2 = new _3Student("xiaoLu",25);
        _3Student student3 = new _3Student("zhuHaoWen",23);

        Collection<_3Student>  studentCollection = new HashSet<_3Student>();
        studentCollection.add(student1);
        studentCollection.add(student2);
        studentCollection.add(student3);
        studentCollection.add(student1);

        Iterator<_3Student> studentIterator = studentCollection.iterator();
        while (studentIterator.hasNext()){
            studentIterator.next().introduce();

        }

    }
}
