package com.human.ex;

public class JavaTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=0;i<10;i++) {
//			System.out.println(i);
//		}
//		
//		//break
//		for(int i=0;i<10;i++) {
//			if(i==5) {
//				break;
//			}
//			System.out.println(i);
//		}
//		
//		//continue
//		for(int i=0;i<10;i++) {
//			if(i==5) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		//사용자가 1004를 입력할때까지 반복해보자
		for(;;) {
			System.out.println(">>");
			int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
			if(a==1004) {
				break;
			}
		}
		System.out.println("for문 중료");
		
		while(true) {
			System.out.println(">>");
			int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
			if(a==1004) {
				break;
			}
		}
		System.out.println("for문 중료");
		
		
	}

}
