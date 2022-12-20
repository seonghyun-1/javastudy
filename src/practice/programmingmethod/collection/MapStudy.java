package programmingmethod.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapStudy {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String,Integer>();
        map.put("신용권",32);
        map.put("신용강",31);
        map.put("신용빈",33);
        map.put("신용헌",31);
        map.put("신용완",34);
        System.out.println("총 Entry 수: " + map.size());
        System.out.println("\t홍길동 : " + map.get("신용권"));
        System.out.println();
        // 키 vs 엔트리(키:밸류)
        //객체를 하나씩 처리 - #1 - keyset으로 키를 얻고 Iterator를 씌워서 사용
        Set<String> keySet = map.keySet();// <- 키셋얻기
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()){ // 아무것도 없는 주소로 부터 시작
            String key = keyIterator.next(); // 다음 키를 가져옴 : 인덱스 0을 먼저 가리킴. 즉 초기값 -1
            Integer value = map.get(key); // 인덱스 0에 있는 값
            System.out.println("\t" + key + " : " + value);
        }
        //객체를 하나씩 처리 - #2 - entry셋으로 맵을 덮어서 사용
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // 엔트리 -> 키:밸류를 한묶음으로 보는것!
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();
    }
}
