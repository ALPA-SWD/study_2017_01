
public class truck {
	public void truck(int[] T, int L, int w) {
		int count = 0; //나눠서 가는 횟수
		int num = 0; //같이가는 트럭의 수
		int result = 0;
		int sum = T[0]; // 트럭무게합
		int i = 0;
//		for(int i = 0; i < T.length; i++) {
		while(i < T.length) {
			while(L >= sum) {
				num++; // 넘어가는 트럭의 수 = 1
				if(i == T.length-1) { // 마지막트럭
					break;
				}
				else {
				sum += T[i+1]; // 트럭의 무게합을 다음 트럭무게와 더함
				}
				if(num != 1) // 넘어가는 트럭의 수가 1대가 아니라면 다음다음 트럭이 넘어가야하므로 i 증가
				i++;
			}
			i++;
			count++; //트럭(n대)이 한번 넘어갈 때마다 증가
			result += w+num;
			num = 0;
			if(i < T.length)
			sum = T[i]; //sum을 다음 트럭의 무게로 초기화
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
