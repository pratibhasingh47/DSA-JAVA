import java.util.HashMap;
import java.util.Map;

class HashMapIterationDemo {
    public static void main(String[] args) {
        Map<String, String> mapCountryCodes = new HashMap<>();
        mapCountryCodes.put("1", "USA");
        mapCountryCodes.put("44", "United Kingdom");
        mapCountryCodes.put("33", "France");
        mapCountryCodes.put("81", "Japan");
        mapCountryCodes.put("91", "India");

        System.out.println("Using keySet():");
        for (String code : mapCountryCodes.keySet()) {
            System.out.println(code + " => " + mapCountryCodes.get(code));
        }

        System.out.println("Using values():");
        for (String country : mapCountryCodes.values()) {
            System.out.println(country);
        }

        System.out.println("Using entrySet():");
        for (Map.Entry<String, String> entry : mapCountryCodes.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println("Using forEach:");
        mapCountryCodes.forEach((code, country) -> System.out.println(code + " => " + country));
    }
}