 

class TestStr {
	public static void main(String[] args) {
		// Queue<String> q = new LinkedList<>();
		// String str = "Sabbatical";
		// q.add(str);
		// System.out.println(str.substring(5, 7));
		// q.add(str.substring(5, 7));
		// System.out.println(str.concat(" Ended"));
		// q.add(str.concat(" Ended"));
		// System.out.println(str.toUpperCase());

		// System.out.println(q.toString());
		// System.out.println(q.remove());
		// q.add("test");
		// System.out.println(q.remove());
		// System.out.println(q.toString());


		// List<Integer> tmp = new ArrayList<>();
		// tmp = Arrays.asList(1, 2, 4);

		// System.out.println(tmp);

		StringBuilder[] sbs = new StringBuilder[3];
    	for(int i=0; i<3; i++) {
	      StringBuilder sb = new StringBuilder();
		  sb.append("test");
		  sb.append(" again");
	      sbs[i] = sb;
	    }

	    for(int i=0; i<sbs.length; i++) 
	    	System.out.println(sbs[i].toString());
	}
}