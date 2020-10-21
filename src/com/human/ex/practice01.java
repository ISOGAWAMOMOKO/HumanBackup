package com.human.ex;

public class practice01 {

	public static void main(String[] args) {
//		// 1.while문과 for문을 이용해서 왼쪽 순서도를 프로그램으로 구현해 보자.
//		int a=2;
//		int b=1;
//		b++;
//		System.out.println(a);
//		System.out.println(b);
//		
//		
//		while(b<15) {
//			a=a+1;
//			b=b+a;
//		}
//		System.out.println(a);
//		System.out.println(b);
//		
//		//2.100의 모든 약수
//		int a=100;
//		for(int i=1;i<=a;i++) {
//			if(100%i==0) {
//				System.out.println(i);
//			}
//		}
//		
//		//3.두 수를 입력받아 두수의 공통된 약수를 모두 출력해 보자.
//		System.out.print("숫자입력1>>");
//		int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//		System.out.print("숫자입력2>>");
//		int b=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//		for(int i=1;i<=a;i++) {
//			if(a%i==0) {
//				for(int j=1;j<=b;j++) {
//					if(b%j==0) {
//						if(i==j) {
//							System.out.println(j);
//						}
//					}
//				}
//			}
//		}
//		
//		
//		//4.두수를 입력받아 두수의 최대 공약수를 구하는 프로그램
//		System.out.print("숫자입력1>>");
//		int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//		System.out.print("숫자입력2>>");
//		int b=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//		int c=0;//최대 공약수
//		for(int i=1;i<=a;i++) {
//			if(a%i==0) {
//				for(int j=1;j<=b;j++) {
//					if(b%j==0) {
//						if(i==j) {
//							c=i;
//						}
//					}
//				}
//			}
//		}
//		System.out.println(c);
//		
//		//5.사용자에게 숫자를 하나 입력받아 입력한 숫자들의 합이 100이 될때까지 계속입력을 받다가 100이 넘으면 합산을 출력
//		int sum=0;
//		while(sum<=100) {
//			System.out.print("합이 100이 될때까지 계속입력 하세요>>");
//			int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//			sum+=a;
//		}
//		System.out.print(sum);
//		
//		
//		//6.사용자에게 계속해서 숫자를 입력받아 1~10사이의 숫자를 3번 입력 할 때 까지 반복한다.
//		//입력이 끝나면 잘못 입력한 회수와 제대로 입력한 회수를 출력하고 사용자가 제대로 입력한 총합을 출력
//		
//		int counta=0;
//		int countmiss=0;
//		int sum=0;
//		
//		for(;;) {
//			System.out.print("숫자입력>>");
//			int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//			if(a>0&&a<=10) {
//				sum+=a;
//				counta++;
//			}else {
//				countmiss++;
//			}
//			if(counta==3) {
//				break;
//			}
//		}
//		System.out.println("잘못 입력한 회수는>>"+countmiss);
//		System.out.println("제대로 입력한 회수는>>"+counta);
//		System.out.println("입력한 숫자의 총합은"+sum);
//		
//		
//		//7.두수를 입력 받아 공배수 중 가장 작은 배수를 최소 공배수를 출력
//		System.out.print("숫자입력1>>");
//		int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//		System.out.print("숫자입력2>>");
//		int b=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//		int c=0;
//		

//
//		//8.3개의 수를 입력 받아 가장 작은 수와 가장 큰수를 출력
//		System.out.print("숫자입력1>>");
//		int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//		System.out.print("숫자입력2>>");
//		int b=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//		System.out.print("숫자입력3>>");
//		int c=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//		
//		if(a>b) {
//			int t;
//			t=a;
//			a=b;
//			b=t;
//			if(b>c) {
//				t=c;
//				c=b;
//				b=t;
//			}
//		}
//		System.out.println("가장 작은 수는"+a);
//		System.out.println("가장 큰수는"+c);
//		
//		//9.100이하의 수학과목 점수를 5번 입력받아 60이하 탈락자가 몇명인지 출력하는 프로그램
//		
//		int count=0;	
//		
//		for(int i=1;i<=5;i++) {
//			System.out.print("수학과목 점수입력"+i+"번>>");
//			int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//			if(a<60) {
//				count++;
//			}
//		}
//		System.out.print("달락자는"+count+"명");
//		
//		//10. 1부터 차례대로 더한 총합이 최초 100을 넘기 직전까지 누적한 결과값을 순서대로 출력하시오.
//		//1:1 2:3 3:6 4:10 5:15 6:21
//		int sum=0;
//		for(int i=1;;i++) {
//			if(sum<=100) {
//				sum+=i;
//				System.out.println(i+":"+sum);
//			}else {
//				break;
//			}	
//		}
//		
//		//11. 문자열과 숫자를 입력받아 입력받은 문자열을 숫자만큼 출력
//		
//		//12. 입력받은 두수 사이의 숫자들의 합을 구하는 프로그램
//		System.out.print("숫자입력1>>");
//		int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//		System.out.print("숫자입력2>>");
//		int b=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());	
//		int sum=0;
//		
//		for(int i=a+1;i<b;i++) {
//			sum+=i;
//		}
//		System.out.print(sum);
//		
//		//13. 수를 하나 입력받아 소수인지 아닌지 판별하는 프로그램
//		System.out.print("숫자입력>>");
//		int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//		int count=0;
//		
//		for(int i=1;i<=a;i++) {
//			if(a%i==0) {
//				count++;
//			}
//		}
//		if(count==2) {
//			System.out.print("소수이다");
//		}else if(count>2){
//			System.out.print("소수아니다");
//		}
//		
//		//14. 두 수를 입력 받아 첫 번째수 부터 시작하여 하나씩 카운트하여 두번째수 수 만큼 화면에 출력
//		System.out.print("숫자입력1>>");
//		int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//		System.out.print("숫자입력2>>");
//		int b=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//		for(int i=1;i<=b;i++) {
//			System.out.print(a);
//			a++;
//		}
//		
//		//15. 1~9 사이의 숫자를 하나 입력받아 해당 숫자의 구구단을 출력
//		System.out.print("숫자입력>>");
//		int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//		int sum=0;
//		
//		System.out.println(a+"단의 구구는");
//		
//		for(int i=1;i<10;i++) {
//			sum=a*i;
//			System.out.println(a+"*"+i+"="+sum);
//		}
//		
//		//16. 숫자를 하나 입력받아 1~1000사이에 입력받은 숫자의 배수가 몇 개인지 출력
//		System.out.print("숫자입력>>");
//		int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//		int count=0;
//		for(int i=1;i<=1000;i++){
//			if(i%a==0) {
//				count++;
//			}
//				
//		System.out.println("입력받은 숫자의 배수는"+count+"게");
//		
		
		//17. 사용자에게  행과 열을 입력받아 행과 열에 맞춰서 1부터 100까지 출력하는 프로그램
		System.out.print("숫자입력>>");
		int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());//행
		System.out.print("숫자입력>>");
		int b=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());//열
		int c=1;
		int j;
		for(int i=1;i<=b;i++) {
			for(j=c;j<=a;j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		}
		
		//18.1   2   3   4   5
		//   10  9   8   7   6
		//   11 12  13  14  15
		//   21 22  23  24  25
		
		//19. 해당 달의 시작 요일과 일수를 입력 받아 달력을 출력해 보자.\t 탭을 이용해서 만들어 보자.
		
		//20. 컴퓨터가 던진 동전이 앞면 인지 뒷면 인지 맞추는 프로그램을 구현해 보자. 
		//맞춘 회수와 틀린 회수를 기록해서 보여주자.
		
		
		//21. 컴퓨터가 던진 주사위를 맞추는 프로그램을 구현해 보자. 맞춘 회수와 틀린 회수를 기록해서 보여 주자.
		
		
		
	}
}
