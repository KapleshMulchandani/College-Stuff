class KnapSack {
	static int[] w = {10, 40, 20, 30};
	static int[] v = {60, 40, 100, 120};
	static int len = w.length;
	static double c = 50;
	public static void main(String...args) {
		knapsack();
	}
	public static void knapsack() {
		double p = 0;
		int[] r = new int[len];
		for(int i = 0; i < len; i++)
			r[i] = v[i]/w[i];
		int max = 0;
		for(int i = 0; i < len -1; i++) {
			max = i;
			for(int j = i+1; j < len; j++)
				if(r[j] > r[max])
					max = j;
			int temp = r[max];
			r[max] = r[i];
			r[i] = temp;
			temp = w[max];
			w[max] = w[i];
			w[i] = temp;
			temp = v[max];
			v[max] = v[i];
			v[i] = temp;
		}
		for(int i = 0; i < len; i++) {
			if(c - w[i] >= 0) {
				c = c - w[i];
				p = p + v[i];
				System.out.println(p);
			}
			else {
				double d = c/w[i];
				p = p + (v[i] * d);
				c = c - (w[i] * d);
				System.out.println(p);
				break;
			}
		}
		System.out.println("Total Profit Made: " + p);
	}
}