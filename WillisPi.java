package konkuk.sw.CalPi;

public class WillisPi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double err = 1; // 새로 곱하는 수
		double total = 1;
		int cnt = 1; // 반복횟수
		do{
			total *=err;
			err = 1-1/(4*Math.pow(cnt,2));
			cnt++;
		}while(Math.abs(1-err)>0.000000001); //허용오차 = 0.000000001 보다 err가 적을 때까지 반복.
		System.out.println("반복 횟수 = "+cnt);
		System.out.println("원주율 = "+(1/total)*2);
		
		
	}

}
