import java.util.HashMap;
import java.util.Map;

class HashMapAccessDemo {
	public static void main(String[] args) {
		Map<String, Double> hMap = new HashMap<>();
		hMap.put("John Doe", 3434.34);
		hMap.put("Tom Smith", 123.22);
		hMap.put("Jane Baker", 1378.00);
		hMap.put("Tod Hall", 99.22);
		hMap.put("Ralph Smith", -19.08);

		double balance = hMap.get("John Doe");
		hMap.put("John Doe", balance + 1000);
		System.out.println("John Doe's current balance: " + hMap.get("John Doe"));
	}
}