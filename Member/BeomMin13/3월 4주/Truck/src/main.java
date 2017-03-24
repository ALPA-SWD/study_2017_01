import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		truck t = new truck();
		Scanner s = new Scanner(System.in);
		int truck_num;
		int weight;
		int w;
		int L;
		int[] T;
		truck_num = s.nextInt();
		w = s.nextInt();
		L = s.nextInt();
		T = new int[truck_num]; 
		
		for(int i = 0; i < truck_num; i++) {
			weight = s.nextInt();
			T[i] = weight;
		}
		t.truck(T, L, w);
	}

}
