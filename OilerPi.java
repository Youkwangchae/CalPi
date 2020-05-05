package konkuk.sw.CalPi;

public class OilerPi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double err = 0; // 새로 더하는 수
		double sum = 0;
		int cnt = 1; // 반복횟수
		do{
			sum +=err;
			err = 1/Math.pow(cnt,2);
			cnt++;
		}while(Math.abs(err)>0.000000001); //허용오차 = 0.000000001 보다 err가 적을 때까지 반복.
		System.out.println("반복 횟수 = "+cnt);
		System.out.println("원주율 = "+Math.sqrt(6*sum));
		
	}

}
