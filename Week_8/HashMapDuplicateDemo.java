import java.util.*;

class HashMapDuplicateDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hMap = new HashMap<>();
        hMap.put(200, "OK");
        hMap.put(303, "See Other");
        hMap.put(404, "Not Found");
        hMap.put(500, "Internal Server Error");
        hMap.put(303, "Invalid entry"); // Overrides previous value for key 303
        hMap.put(101, "See Other");
        System.out.println(hMap);
    }
}