import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class FractionalKnapsack {
	
	class ItemCostPerUnit implements Comparable<ItemCostPerUnit> {

		public float cost; 
		public int idx; 

		@Override
		public int compareTo(ItemCostPerUnit obj) {
			return obj.cost > this.cost ? 1 : -1;
		}

		@Override
		public String toString() {
			return this.cost + " " + this.idx;
		}
	}

	public float getMaxValue(int capacity, int[] value, int[] wts) {

		ItemCostPerUnit[] cpu = new ItemCostPerUnit[value.length];
		for(int i=0; i<value.length; i++) {
			cpu[i] = new ItemCostPerUnit();
			cpu[i].cost = (float)value[i] / (float)wts[i];
			cpu[i].idx = i; 
		}
		Arrays.sort(cpu);
		float loot = 0f;

		for(int i=0; i<cpu.length; i++) {
			int idx = cpu[i].idx;
			float fraction = (float)capacity / (float)wts[idx];
			if(fraction > 1.0f) fraction = 1.0f;
			loot += value[idx] * fraction;
			capacity -= wts[idx] * fraction;
		}

		return loot;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		FractionalKnapsack k = new FractionalKnapsack();

		int num_items = s.nextInt();
		int capacity = s.nextInt();
		int[] value = new int[num_items], wts = new int[num_items];

		for(int i=0; i<num_items; i++) {
			value[i] = s.nextInt();
			wts[i] = s.nextInt();
		}

		float loot = k.getMaxValue(capacity, value, wts);
		System.out.println(String.format("%.4f", loot));	
	}
}