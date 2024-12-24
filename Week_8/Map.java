import java.util.*;

class HashMapCreateDemo {
    public static void main(String[] args) {
        HashMap<Double, String> hMap = new HashMap<>();
        hMap.put(200.0, "OK");
        hMap.put(303.0, "See Other");
        hMap.put(404.0, "Not Found");
        hMap.put(500.0, "Internal Server Error");
        System.out.println(hMap);
    }
}

