import sun.reflect.generics.tree.Tree;

import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        Set<String> hset= new HashSet<>();

        hset.add("ss");
        hset.add(null);
        hset.add(null);

        Set<String> tset= new TreeSet<>();
        tset.add(null);//not allowed- throws NPE

        Map<String,String> hmap= new HashMap<>();
        hmap.put("A","AA");
        hmap.put(null,"sss");
        hmap.put(null,"bbbb");

        Map<String, String> tmap= new TreeMap<>();
        tmap.put("ss","ssss");
        //tmap.put(null, "sssss");//not allowed-throws NPE
        System.out.println(tset);
    }
}
