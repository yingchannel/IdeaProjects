package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        // 1. Update the "M" to Male and "F" to Female

        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            System.out.println(entry);

            if (entry.getValue().equalsIgnoreCase("M")){
                entry.setValue("Male");
                //employeeMap.replace(entry.getKey(), "Male");
            }

            if (entry.getValue().equalsIgnoreCase("F")){
                entry.setValue("Female");
            }

        }

       /* for (String Key : employeeMap.keySet()) {
            if ( employeeMap.get(Key).equalsIgnoreCase("M") ){
                employeeMap.replace(Key, "Male");
            }

            if ( employeeMap.get(Key).equalsIgnoreCase("F")){
                employeeMap.replace(Key, "Female");
            }
        }*/

        System.out.println(employeeMap);


        // 2. Display the names of all female employees

        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equalsIgnoreCase("Female")){
                System.out.println(entry.getKey());
            }
        }



    }

}
