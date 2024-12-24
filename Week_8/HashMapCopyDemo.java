import java.util.HashMap;
import java.util.Map;


class HashMapCopyDemo {
    public static void main(String[] args) {
        Map<String, Double> hMap1 = new HashMap<>();
        hMap1.put("John Doe", 3434.34);
        hMap1.put("Tom Smith", 123.22);
        hMap1.put("Jane Baker", 1378.00);
        hMap1.put("Tod Hall", 99.22);
        hMap1.put("Ralph Smith", -19.08);
        System.out.println("Original Map: " + hMap1);

        Map<String, Double> hMap2 = new HashMap<>(hMap1);
        hMap1.put("Robin Keith", 423.22);
        hMap2.put("Peter Hwang", 178.00);
        System.out.println("Copied Map: " + hMap2);
    }
}