package _4Collection._3Set;

import _4Collection._1Collection._3Student;

import java.util.HashSet;
import java.util.Set;


//Set集合特点：不包含重复元素的集合
//HashSet：对集合的迭代顺序不作任何保证
/*
* 哈希值  JDK根据对象的地址或者字符串或者数字算出来的int类型的数值
*
* Object类中 有一个方法可以获取 对象的哈希值
* public int hashCode（）
*
* ------------------------------------------------------------------
*流程图见_1SetBasic_1hashSet_addMethod.png
*
*  final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
        Node<K,V>[] tab; Node<K,V> p; int n, i;
        //如果哈希表未初始化，就对其初始化
        * if ((tab = table) == null || (n = tab.length) == 0)
            n = (tab = resize()).length;
        //根据对象的哈希值计算对象的存储位置，如果该位置没有元素，就存储元素
        if ((p = tab[i = (n - 1) & hash]) == null)
            tab[i] = newNode(hash, key, value, null);
        else {
            Node<K,V> e; K k;
            *
            * //存入的元素和以前的元素比较哈希值
            *       如果哈希值不同，会继续向下执行，把元素添加到集合
            *       如果哈希值相同，会调用对象equals（）方法比较
            *           如果返回false，会继续向下执行，把元素添加到集合
            *           如果返回true，说明元素重复，不存储
            *
            *
            *
            if (p.hash == hash &&
                ((k = p.key) == key || (key != null && key.equals(k))))
                e = p;
            else if (p instanceof TreeNode)
                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
            else {
                for (int binCount = 0; ; ++binCount) {
                    if ((e = p.next) == null) {
                        p.next = newNode(hash, key, value, null);
                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                            treeifyBin(tab, hash);
                        break;
                    }
                    if (e.hash == hash &&
                        ((k = e.key) == key || (key != null && key.equals(k))))
                        break;
                    p = e;
                }
            }
            if (e != null) { // existing mapping for key
                V oldValue = e.value;
                if (!onlyIfAbsent || oldValue == null)
                    e.value = value;
                afterNodeAccess(e);
                return oldValue;
            }
        }
        ++modCount;
        if (++size > threshold)
            resize();
        afterNodeInsertion(evict);
        return null;
    }
* */
public class _1SetBasic     {
    public static void main(String[] args) {
        HashSet<String> s = new HashSet<String>();
        s.add("hello");
        s.add("World");
        s.add("java");
        s.add("hello");

        for (String str :
                s) {
            System.out.println(str);System.out.println(str.hashCode());
        }

        // Test hashCode()
        System.out.println( "Test hashCode()");
        _3Student student = new _3Student("ZhuHaoWen",23);
        _3Student student2 = new _3Student("XiaoLu",25);
        _3Student student3 = new _3Student("XiaoLu",25);
        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());


    }
}
