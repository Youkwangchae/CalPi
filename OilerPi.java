package konkuk.sw.CalPi;

public class OilerPi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double err = 0; // ���� ���ϴ� ��
		double sum = 0;
		int cnt = 1; // �ݺ�Ƚ��
		do{
			sum +=err;
			err = 1/Math.pow(cnt,2);
			cnt++;
		}while(Math.abs(err)>0.000000001); //������ = 0.000000001 ���� err�� ���� ������ �ݺ�.
		System.out.println("�ݺ� Ƚ�� = "+cnt);
		System.out.println("������ = "+Math.sqrt(6*sum));
		
	}

}
