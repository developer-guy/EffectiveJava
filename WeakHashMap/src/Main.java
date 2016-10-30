import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class Main {

    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap();
        Map<String,Integer> weakHashMap = new WeakHashMap();

        String keyHashMap = new String("10");
        String keyWeakHashMap = new String("20");

        hashMap.put(keyHashMap,10);
        weakHashMap.put(keyWeakHashMap,20);

        System.gc();
        System.out.println("Before nullify the keys : " + hashMap.get("10") + " " + weakHashMap.get("20"));

        keyHashMap = null;
        keyWeakHashMap = null;

        System.gc();

        System.out.println("After nullify the keys : " + hashMap.get("10") + " " + weakHashMap.get("20"));

    }
}
