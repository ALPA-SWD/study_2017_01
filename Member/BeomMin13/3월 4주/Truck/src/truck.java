
public class truck {
	public void truck(int[] T, int L, int w) {
		int count = 0;
		int num = 0;
		int result = 0;
		int sum = T[0];
		int i = 0;
//		for(int i = 0; i < T.length; i++) {
		while(i < T.length) {
			while(L >= sum) {
				num++;
				if(i == T.length-1) {
					break;
				}
				else {
				sum += T[i+1];
				}
				if(num != 1)
				i++;
			}
			i++;
			count++;
			result += w+num;
			num = 0;
			if(i < T.length)
			sum = T[i];
			else 
				break;
			
//			i++;
		}
//			if(L < sum) {
//				count++;
//				sum = T[i];
//				num = 1;
//				result += w+num;
//			}
//			else {
//				sum += T[i+1];
////				num++;
//				result += w+num;
//				num++;
//			}
//		}
		result -= count-1;
		System.out.println(result);
	}
	

}
