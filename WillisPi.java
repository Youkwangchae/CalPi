package konkuk.sw.CalPi;

public class WillisPi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double err = 1; // ���� ���ϴ� ��
		double total = 1;
		int cnt = 1; // �ݺ�Ƚ��
		do{
			total *=err;
			err = 1-1/(4*Math.pow(cnt,2));
			cnt++;
		}while(Math.abs(1-err)>0.000000001); //������ = 0.000000001 ���� err�� ���� ������ �ݺ�.
		System.out.println("�ݺ� Ƚ�� = "+cnt);
		System.out.println("������ = "+(1/total)*2);
		
		
	}

}
