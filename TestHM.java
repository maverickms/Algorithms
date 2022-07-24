import java.util.HashMap; 

class TestHM {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("c", 0);
		map.put("b", 1);		
		map.put("e", 2);		

		map.remove("c");

		System.out.println(map.toString());

		System.out.println(map.getOrDefault("f", 77));
		System.out.println(map.size());

	}
}