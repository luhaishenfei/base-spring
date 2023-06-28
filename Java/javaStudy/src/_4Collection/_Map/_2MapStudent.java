package _4Collection._Map;

import _4Collection._1Collection._3Student;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _2MapStudent {
    public static void main(String[] args) {
        _3Student student1= new _3Student("ZhuHaoWen",23);
        _3Student student2= new _3Student("XiaoLu",25);
        _3Student student3= new _3Student("ZhuHaoYue",14);
        _3Student student4= new _3Student("XiaoLu",18);
        _3Student student5= new _3Student("NiHao",18);

        Map<String,_3Student> studentMap = new HashMap<>();
        studentMap.put("sudent1",student1);
        studentMap.put("sudent2",student2);
        studentMap.put("sudent3",student3);
        studentMap.put("sudent4",student4);
        studentMap.put("sudent5",student5);

        Set<Map.Entry<String, _3Student>> entries = studentMap.entrySet();
        for (Map.Entry<String, _3Student> map:
             entries) {
            System.out.println(map.getKey()+":"+ map.getValue().getName());
            map.getValue().introduce();
        }
        System.out.println("-----------");

        Map<_3Student,String> studentInformationMap = new HashMap<>();
        studentInformationMap.put(student1,"This student fall in love with XiaoLu");
        studentInformationMap.put(student2,"She is student1's goddess");
        studentInformationMap.put(student3,"She is student1's sister");
        studentInformationMap.put(student4,"Student2 in age 18");
        studentInformationMap.put(student5,"Hello");

        Set<Map.Entry<_3Student, String>> entriesStudentInformation = studentInformationMap.entrySet();
        for (Map.Entry<_3Student,String > map:
                entriesStudentInformation) {
            if (map.getKey() == student1){
                System.out.println("Get role");

            }
            System.out.println(map.getKey().getName()+":"+ map.getValue());

        }

    }
}
