package day49_Collections;

import java.util.*;

public class SetInterfacePractice {

    public static void main(String[] args) {

        List<Integer> ArrayList = new ArrayList<>();

        ArrayList.addAll(Arrays.asList(10,200,300,40,90));
        ArrayList.addAll(Arrays.asList(10,200,300,40,90));
        ArrayList.addAll(Arrays.asList(10,200,300,40,90));
        ArrayList.addAll(Arrays.asList(10,200,300,40,90));
        ArrayList.addAll(Arrays.asList(null, null,null));

        System.out.println("ArrayList = " + ArrayList);

        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(null,null, null));

        System.out.println("hashSet = " + hashSet);


        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(null,null, null));

        System.out.println("linkedHashSet = " + linkedHashSet);

        Set<Integer> TreeSet = new TreeSet<>();

        TreeSet.addAll(Arrays.asList(10,200,300,40,90));
        TreeSet.addAll(Arrays.asList(10,200,300,40,90));
        TreeSet.addAll(Arrays.asList(10,200,300,40,90));
        TreeSet.addAll(Arrays.asList(10,200,300,40,90));
        //TreeSet.addAll(Arrays.asList(null,null,null));

        System.out.println("TreeSet = " + TreeSet);
    }

}
