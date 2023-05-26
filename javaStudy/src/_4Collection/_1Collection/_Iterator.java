package _4Collection._1Collection;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class _Iterator {
    public static void main(String[] args) {
        Collection<String> stringCollection = new HashSet<String>();
        stringCollection.add("Hello");
        stringCollection.add("World");
        stringCollection.add("java");
        stringCollection.remove("java");
        stringCollection.add("Hello");
        System.out.println(stringCollection);
        Iterator<String> stringIterator = stringCollection.iterator();

        System.out.println(stringIterator.hasNext()?stringIterator.next():"donnot have next");
        System.out.println(stringIterator.hasNext()?stringIterator.next():"donnot have next");
        System.out.println(stringIterator.hasNext()?stringIterator.next():"donnot have next");
        System.out.println(stringIterator.hasNext()?stringIterator.next():"donnot have next");
        System.out.println(stringIterator.hasNext()?stringIterator.next():"donnot have next");
//How to use Iterator:
        Iterator<String> stringIterator2 = stringCollection.iterator();
        while (stringIterator2.hasNext()){
            String s = stringIterator2.next();
            System.out.println(s);
        }

    }
}
