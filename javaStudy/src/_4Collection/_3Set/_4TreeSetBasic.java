package _4Collection._3Set;

import java.util.TreeSet;

public class _4TreeSetBasic {
/*
TreeSet集合特点
元素有序：按照一定的规则进行排序，具体排序方式取决于构造方法
        TreeSet():根据其元素的自然排序进行排序 natural ordering
        TreeSet(Comparator comparator):根据指定的比较器进行排序
没有带索引的方法，所以不能用普通for循环遍历
由于是Set集合，所以不包含重复元素的集合
 */
public static void main(String[] args) {

    //  集合所有类型存储时使用的是其对应的包装类（like  Integer take place int）
    //  TreeSet<int> intTreeSet= new TreeSet<int>();
    Integer[] integers = {3,8,1,5,2,6,5,2,0,-1,-99,-4,-7,-3,-6,-4,};
    TreeSet<Integer> integerTreeSet = new TreeSet<>();
    for (Integer i :
            integers) {
        integerTreeSet.add(i);
    }


    for (Integer i :
            integerTreeSet) {
        System.out.println(i);
    }

    String[] strings = {"C","D","A","B","Z","F","B","D",};

    TreeSet<String> treeSet = new TreeSet<>();
    for (String str:strings
         ) {
        treeSet.add(str);
    }


    for (String str :
            strings) {
        System.out.println(str);
    }
}
}
