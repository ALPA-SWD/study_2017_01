
public class truck {
	public void truck(int[] T, int L, int w) {
		int count = 0; //������ ���� Ƚ��
		int num = 0; //���̰��� Ʈ���� ��
		int result = 0;
		int sum = T[0]; // Ʈ��������
		int i = 0;
//		for(int i = 0; i < T.length; i++) {
		while(i < T.length) {
			while(L >= sum) {
				num++; // �Ѿ�� Ʈ���� �� = 1
				if(i == T.length-1) { // ������Ʈ��
					break;
				}
				else {
				sum += T[i+1]; // Ʈ���� �������� ���� Ʈ�����Կ� ����
				}
				if(num != 1) // �Ѿ�� Ʈ���� ���� 1�밡 �ƴ϶�� �������� Ʈ���� �Ѿ���ϹǷ� i ����
				i++;
			}
			i++;
			count++; //Ʈ��(n��)�� �ѹ� �Ѿ ������ ����
			result += w+num;
			num = 0;
			if(i < T.length)
			sum = T[i]; //sum�� ���� Ʈ���� ���Է� �ʱ�ȭ
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
