package upDownGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class upDownGame {

	public static void main(String[] args) {
		int randInt = 0;
		randInt = (int)(Math.random()*100);
		System.out.println("���� �����Ͽ����ϴ�. ���߾� ������ !!������!!");
		System.out.println("0-99");
		Scanner scanner = new Scanner(System.in);
		String again = "a";
		
		while(true) {
			int i = 1;
			int n = 0;  //����� �Է� ����
			int min = 0, max = 99;
			
			while(true) {
				System.out.print(i+">>");
				try {
					n = scanner.nextInt();
				}
				catch(InputMismatchException e) {
					System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
					scanner.nextLine();
					if(i != 0)
						i--;
					continue;
				}
				
				if(n > randInt) {
					System.out.println("�� ����");
					if(i == 1 || max > n)
						max = n;
				}else if(n < randInt){
					System.out.println("�� ����");
					if(i == 1 || min < n)
						min = n;
				}else {
					System.out.println("�¾ҽ��ϴ�! �ٽ� �Ͻðڽ��ϱ�?(y/n)");
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
				System.out.println("�ٽ� �Է����ּ���(y/n)");
				again = scanner.next();
			}
			
		}

	}

}
