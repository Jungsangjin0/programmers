package programmers.one;

//2016년 1월 1일은 금요일이다
//2016년 a월 b 일은 무슨 요일인가
//2016년은 윤년이다
public class programmers2016 {

	public static void main(String[] args) {
		String[] str = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"}; 
		int a = 5;
		int b = 24;//일요일
		a -= 1;
		int total = 0;
		while(true) {
			if(a == 0) break;
			
			if(a < 8 && (a % 2 == 1)) {
				total += 31;
			}else if(a < 8 && (a % 2 == 0)) {
				if(a == 2) {
					total += 29;
				}else {
					total += 30;
				}
			}else if(a >= 8 && (a % 2 == 0)) {
				total += 31;
			}else if(a >= 8 && (a % 2 == 1)) {
				total += 30;
			}
			
			a--;
		}
		//1일에서 빼줘야 해서 - 1
		//total + b 는 월을 일로 바꾼 일수와 일 만 더한것이기 때문에
		//1일기준으로 계산을 해야 하기 때문에 - 1 해줘야함
		total = total + b - 1;
		System.out.println(total);
		System.out.println(str[total % 7]);
	}
}
