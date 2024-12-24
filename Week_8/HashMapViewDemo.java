import java.util.HashMap;

class HashMapViewDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hMap = new HashMap<>();
        hMap.put(200, "OK");
        hMap.put(303, "See Other");
        hMap.put(404, "Not Found");
        hMap.put(500, "Internal Server Error");

        if (hMap.isEmpty()) {
            System.out.println("Error: The container is empty");
        } else {
            System.out.println(hMap);
        }
        System.out.println("Size: " + hMap.size());
    }
}