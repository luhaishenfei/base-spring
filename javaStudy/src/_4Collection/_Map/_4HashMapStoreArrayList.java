package _4Collection._Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class _4HashMapStoreArrayList {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> arrayListHashMap = new HashMap<>();
        ArrayList<String> arrayList1= new ArrayList<>();
        arrayList1.add("ZhuHaoWen");
        arrayList1.add("XiaoLu");
        arrayList1.add("ZhuHaoYue");
        ArrayList<String> arrayList2= new ArrayList<>();
        arrayList2.add("R8");
        arrayList2.add("MiNi");
        ArrayList<String> arrayList3= new ArrayList<>();
        arrayList3.add("AJ6BlackToe");
        arrayList3.add("AJ13Chigego");
        arrayList3.add("AJ31Chameleon&Blank");
        arrayList3.add("AJ32BlackCat");
        arrayList3.add("AJ33WhiteCement");
        ArrayList<String> arrayList4= new ArrayList<>();
        //Aj14 Aj28 Aj32BlackCat
        arrayList4.add("AJ11Concore");
        arrayList4.add("AJ13Panda");
        arrayList4.add("KB8Height");
        arrayList4.add("FoampositeBeiJing/Bule");
        arrayList4.add("NikeAirUptempo");
        arrayList4.add("NikeCosmicUnity");
        arrayList4.add("KT6");
        arrayList4.add("VansSK8-Hi");


        arrayListHashMap.put("Name",arrayList1);
        arrayListHashMap.put("DreamCar",arrayList2);
        arrayListHashMap.put("GottenShoes",arrayList3);
        arrayListHashMap.put("DreamShoes",arrayList4);


        Set<String> keySet = arrayListHashMap.keySet();
        for (String str  :keySet
                ) {
            ArrayList<String> arrayListValue = arrayListHashMap.get(str);
            System.out.println("List:"+str);
            for (String s :
                    arrayListValue) {
                System.out.println("\t"+s);
            }
        }
    }
}
