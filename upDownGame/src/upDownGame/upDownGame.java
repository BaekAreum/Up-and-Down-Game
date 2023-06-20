package upDownGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class upDownGame {

	public static void main(String[] args) {
		int randInt = 0;
		randInt = (int)(Math.random()*100);
		System.out.println("수를 결정하였습니다. 맞추어 보세요 !!ㅇㅁㅇ!!");
		System.out.println("0-99");
		Scanner scanner = new Scanner(System.in);
		String again = "a";
		
		while(true) {
			int i = 1;
			int n = 0;  //사용자 입력 변수
			int min = 0, max = 99;
			
			while(true) {
				System.out.print(i+">>");
				try {
					n = scanner.nextInt();
				}
				catch(InputMismatchException e) {
					System.out.println("정수가 아닙니다. 다시 입력하세욥!");
					scanner.nextLine();
					if(i != 0)
						i--;
					continue;
				}
				
				if(n > randInt) {
					System.out.println("더 낮게");
					if(i == 1 || max > n)
						max = n;
				}else if(n < randInt){
					System.out.println("더 높게");
					if(i == 1 || min < n)
						min = n;
				}else {
					System.out.println("맞았습니다! 다시 하시겠습니까?(y/n)");
					again = scanner.next();
					randInt = (int)(Math.random()*100);
					break;
				}
				i++;
				System.out.println(min + " - " + max);
				
			}
			
			if(again.equals("n"))
				break;
			else if(again.equals("y") ) {continue;}
			else {
				System.out.println("다시 입력해주세요(y/n)");
				again = scanner.next();
			}
			
		}

	}

}
