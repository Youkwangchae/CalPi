package konkuk.sw;

public class calculatePi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double err = 0; // ���� ���ϴ� ��
		double sum = 0;
		int cnt = 1; // �ݺ�Ƚ��
		do{
			sum +=err;
			err = (Math.pow(-1, cnt+1)/(2*cnt-1));
			cnt++;
		}while(Math.abs(err)>0.00001); //������ = 0.00001 ���� err�� ���� ������ �ݺ�.
		System.out.println("�ݺ� Ƚ�� = "+cnt);
		System.out.println("������ = "+4*sum);
	}

}
