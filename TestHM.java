import java.util.HashMap; 

class TestHM {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("c", 0);
		map.put("b", 1);		
		map.put("e", 2);		

		map.remove("c");

		HashMap<String, Integer> map2 = new HashMap<>();
		map2.putAll(map);

		System.out.println("Map 1 \n ---------- ");

		// System.out.println(map.toString());

		// System.out.println(map.getOrDefault("f", 77));
		// System.out.println(map.size());

		// System.out.println(map.keySet());
		// System.out.println(map.values());
		System.out.println(map.entrySet());	

		System.out.println();

		System.out.println("Map 2 \n ---------- ");
		System.out.println(map2.entrySet());	


	}
}