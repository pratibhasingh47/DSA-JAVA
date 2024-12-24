import java.util.HashMap;
import java.util.Map;

class HashMapRemoveDemo {
    public static void main(String[] args) {
        Map<String, Double> hMap = new HashMap<>();
        hMap.put("John Doe", 3434.34);
        hMap.put("Tom Smith", 123.22);
        hMap.put("Jane Baker", 1378.00);
        hMap.put("Tod Hall", 99.22);
        hMap.put("Ralph Smith", -19.08);

        Double val = hMap.remove("Jane Baker");
        if (val != null) {
            System.out.println("Removed value: " + val);
        }
        System.out.println(hMap);

        hMap.remove("Tod Hall", 99.22);
        System.out.println(hMap);

        hMap.replace("Ralph Smith", 545.67);
        System.out.println(hMap);
    }
}