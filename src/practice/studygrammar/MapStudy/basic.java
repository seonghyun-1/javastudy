package studygrammar.MapStudy;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class basic {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("key01",1);
        map.put("key02",2);
        map.put("key03",3);
        map.put("key04",4);
        map.put("key05",5);

        System.out.println("------------#1-----------");


        // #1 엔트리로 받아서 키를 가져오는 방법
        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("------------#2-----------");


        // #2 keyset으로 받아서 키를 가져와서 map.get(key)으로 호출하는 방법
        for(String key : map.keySet()) {
            int value = map.get(key);
            System.out.println(key+" "+value);
        }

        System.out.println("------------#3-----------");

        // #3 entrySet().iterator()로 호출하는 방법
        Iterator<Map.Entry<String,Integer>> iteratorE = map.entrySet().iterator();
        while(iteratorE.hasNext()) {
            Map.Entry<String,Integer> entry = (Map.Entry<String,Integer>)iteratorE.next();
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + " " + value);
        }


        System.out.println("------------#4-----------");

        // #4
        Iterator<String> iteratorK = map.keySet().iterator();
        while(iteratorK.hasNext()) {
            String key = iteratorK.next();
            int value = map.get(key);
            System.out.println(key + " " + value);
        }

        System.out.println("------------#5 lambda-----------");
        map.forEach((key,value) -> {
            System.out.println(key + " " + value);
        });

        System.out.println("------------#6 stream-----------");
        map.entrySet().stream().forEach(entry->{
            System.out.println(entry.getKey() + ", [value]:"+entry.getValue());
        });

        System.out.println("------------#6-2 내림차순-----------");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entry->{
            System.out.println(entry.getKey()+" "+entry.getValue());
        });

        System.out.println("------------#6-3 오름차순-----------");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }
}
