package konkuk.sw.CalPi;

public class RamanujanPi {

	static int factorial(int n) {
		int fact = 1;
		if(n==0)
			return 1;
		else if(n!=1)
			return n*factorial(--n);
		else 
			return fact;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double err = 0; // ���� ���ϴ� ��
		double total = 0;
		int cnt = 0; // �ݺ�Ƚ��
		do{
			total +=err;
			err = (factorial(4*cnt)*(1103+26390*cnt))/(Math.pow(factorial(cnt),4)*Math.pow(396, 4*cnt));
			cnt++;
		}while(Math.abs(err)>Math.pow(10, -4)); //������ = 0.00001 ���� err�� ���� ������ �ݺ�.
		System.out.println("�ݺ� Ƚ�� = "+cnt);
		System.out.println("������ = "+ 1/(Math.sqrt(8)/9801*total));
		
	}

}
