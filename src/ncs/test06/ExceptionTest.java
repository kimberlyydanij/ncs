package ncs.test06;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("2~5 사이의 정수 값을 입력하세요.");
			
		Calculator cal = new Calculator();
		System.out.println(cal.getSum(sc.nextInt()));
		sc.close();


	} // end main

} // end class
