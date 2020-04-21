package konkuk.sw;

public class calculatePi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double err = 0; // 새로 더하는 수
		double sum = 0;
		int cnt = 1; // 반복횟수
		do{
			sum +=err;
			err = (Math.pow(-1, cnt+1)/(2*cnt-1));
			cnt++;
		}while(Math.abs(err)>0.00001); //허용오차 = 0.00001 보다 err가 적을 때까지 반복.
		System.out.println("반복 횟수 = "+cnt);
		System.out.println("원주율 = "+4*sum);
	}

}
