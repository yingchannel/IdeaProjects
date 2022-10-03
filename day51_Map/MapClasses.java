package day51_Map;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {
        //    key     value
        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(10, "Arthur");
        hashMap.put(20,"George");
        hashMap.put(3,"Jack");
        hashMap.put(40,"Emma");
        hashMap.put(5,"Isabella");
        hashMap.put(5,"Ahmet");
        hashMap.put(6,"Ahmet");
        hashMap.put(7,"Ahmet");
        hashMap.put(8,"Ahmet");
        hashMap.put(null,"Cihad");


        System.out.println("hashMap = " + hashMap);

        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20,"George");
        linkedHashMap.put(3,"Jack");
        linkedHashMap.put(40,"Emma");
        linkedHashMap.put(5,"Ahmet");
        linkedHashMap.put(5,"Isabella");
        linkedHashMap.put(null,"Cihad");

        System.out.println("linkedHashMap = " + linkedHashMap);


        Map<Integer,String> TreeMap = new TreeMap<>();
        TreeMap.put(10, "Arthur");
        TreeMap.put(20,"George");
        TreeMap.put(3,"Jack");
        TreeMap.put(40,"Emma");
        TreeMap.put(5,"Ahmet");
        TreeMap.put(5,"Isabella");
        //TreeMap.put(null,"Cihad");

        System.out.println("TreeMap = " + TreeMap);

        Map<Integer,String> Hashtable = new Hashtable<>();
        Hashtable.put(10, "Arthur");
        Hashtable.put(20,"George");
        Hashtable.put(3,"Jack");
        Hashtable.put(40,"Emma");
        Hashtable.put(5,"Ahmet");
        Hashtable.put(5,"Isabella");

        System.out.println("Hashtable = " + Hashtable);





    }
}
