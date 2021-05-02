package com.michaeljjf.chapter11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("lili", 101010);
        map.put("nana", 12345234);
        map.put("feifei", 34563465);
//        System.out.println(map.put("lili", 34565677));
        map.put("mingming", 12323);
//        map.clear();
//        System.out.println(map.remove("lili"));
//        System.out.println(map);


        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("------------------------------");
        Collection<Integer> collection = map.values();
        for (Integer integer : collection) {
            System.out.println(integer);
        }
        System.out.println("------------------------------");
        Set<String> set2 = map.keySet();
        for (String s : set2) {
            System.out.println(map.get(s));
        }
        System.out.println("------------------------------");
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }
    }
}
