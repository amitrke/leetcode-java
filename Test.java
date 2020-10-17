import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    
    public static void main(String[] args) {
        MyCache<Integer, Integer> lhm = new MyCache<>(4);
        lhm.put(1, 11);
        lhm.put(2, 22);
        lhm.put(3, 33);
        lhm.get(1);
        lhm.put(4, 44);
        lhm.put(5, 55);
        System.out.println(lhm.toString());
    }
}

class MyCache<K,V> extends LinkedHashMap<K,V> {
    private int maxSize;

    MyCache(int maxSize){
        super(maxSize, 0.75f, true);
        this.maxSize = maxSize;
    }

    protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
        return size() > maxSize;
    }

}
