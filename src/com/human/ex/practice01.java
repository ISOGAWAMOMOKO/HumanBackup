package com.human.ex;

public class practice01 {

	public static void main(String[] args) {
//		// 1.while���� for���� �̿��ؼ� ���� �������� ���α׷����� ������ ����.
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
//		//2.100�� ��� ���
//		int a=100;
//		for(int i=1;i<=a;i++) {
//			if(100%i==0) {
//				System.out.println(i);
//			}
//		}
//		
//		//3.�� ���� �Է¹޾� �μ��� ����� ����� ��� ����� ����.
//		System.out.print("�����Է�1>>");
//		int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//		System.out.print("�����Է�2>>");
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
//		//4.�μ��� �Է¹޾� �μ��� �ִ� ������� ���ϴ� ���α׷�
//		System.out.print("�����Է�1>>");
//		int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//		System.out.print("�����Է�2>>");
//		int b=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//		int c=0;//�ִ� �����
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
//		//5.����ڿ��� ���ڸ� �ϳ� �Է¹޾� �Է��� ���ڵ��� ���� 100�� �ɶ����� ����Է��� �޴ٰ� 100�� ������ �ջ��� ���
//		int sum=0;
//		while(sum<=100) {
//			System.out.print("���� 100�� �ɶ����� ����Է� �ϼ���>>");
//			int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//			sum+=a;
//		}
//		System.out.print(sum);
//		
//		
//		//6.����ڿ��� ����ؼ� ���ڸ� �Է¹޾� 1~10������ ���ڸ� 3�� �Է� �� �� ���� �ݺ��Ѵ�.
//		//�Է��� ������ �߸� �Է��� ȸ���� ����� �Է��� ȸ���� ����ϰ� ����ڰ� ����� �Է��� ������ ���
//		
//		int counta=0;
//		int countmiss=0;
//		int sum=0;
//		
//		for(;;) {
//			System.out.print("�����Է�>>");
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
//		System.out.println("�߸� �Է��� ȸ����>>"+countmiss);
//		System.out.println("����� �Է��� ȸ����>>"+counta);
//		System.out.println("�Է��� ������ ������"+sum);
//		
//		
//		//7.�μ��� �Է� �޾� ����� �� ���� ���� ����� �ּ� ������� ���
//		System.out.print("�����Է�1>>");
//		int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//		System.out.print("�����Է�2>>");
//		int b=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//		int c=0;
//		

//
//		//8.3���� ���� �Է� �޾� ���� ���� ���� ���� ū���� ���
//		System.out.print("�����Է�1>>");
//		int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//		System.out.print("�����Է�2>>");
//		int b=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//		System.out.print("�����Է�3>>");
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
//		System.out.println("���� ���� ����"+a);
//		System.out.println("���� ū����"+c);
//		
//		//9.100������ ���а��� ������ 5�� �Է¹޾� 60���� Ż���ڰ� ������� ����ϴ� ���α׷�
//		
//		int count=0;	
//		
//		for(int i=1;i<=5;i++) {
//			System.out.print("���а��� �����Է�"+i+"��>>");
//			int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//			if(a<60) {
//				count++;
//			}
//		}
//		System.out.print("�޶��ڴ�"+count+"��");
//		
//		//10. 1���� ���ʴ�� ���� ������ ���� 100�� �ѱ� �������� ������ ������� ������� ����Ͻÿ�.
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
//		//11. ���ڿ��� ���ڸ� �Է¹޾� �Է¹��� ���ڿ��� ���ڸ�ŭ ���
//		
//		//12. �Է¹��� �μ� ������ ���ڵ��� ���� ���ϴ� ���α׷�
//		System.out.print("�����Է�1>>");
//		int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//		System.out.print("�����Է�2>>");
//		int b=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());	
//		int sum=0;
//		
//		for(int i=a+1;i<b;i++) {
//			sum+=i;
//		}
//		System.out.print(sum);
//		
//		//13. ���� �ϳ� �Է¹޾� �Ҽ����� �ƴ��� �Ǻ��ϴ� ���α׷�
//		System.out.print("�����Է�>>");
//		int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//		int count=0;
//		
//		for(int i=1;i<=a;i++) {
//			if(a%i==0) {
//				count++;
//			}
//		}
//		if(count==2) {
//			System.out.print("�Ҽ��̴�");
//		}else if(count>2){
//			System.out.print("�Ҽ��ƴϴ�");
//		}
//		
//		//14. �� ���� �Է� �޾� ù ��°�� ���� �����Ͽ� �ϳ��� ī��Ʈ�Ͽ� �ι�°�� �� ��ŭ ȭ�鿡 ���
//		System.out.print("�����Է�1>>");
//		int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//		System.out.print("�����Է�2>>");
//		int b=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//		for(int i=1;i<=b;i++) {
//			System.out.print(a);
//			a++;
//		}
//		
//		//15. 1~9 ������ ���ڸ� �ϳ� �Է¹޾� �ش� ������ �������� ���
//		System.out.print("�����Է�>>");
//		int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//		int sum=0;
//		
//		System.out.println(a+"���� ������");
//		
//		for(int i=1;i<10;i++) {
//			sum=a*i;
//			System.out.println(a+"*"+i+"="+sum);
//		}
//		
//		//16. ���ڸ� �ϳ� �Է¹޾� 1~1000���̿� �Է¹��� ������ ����� �� ������ ���
//		System.out.print("�����Է�>>");
//		int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//		int count=0;
//		for(int i=1;i<=1000;i++){
//			if(i%a==0) {
//				count++;
//			}
//				
//		System.out.println("�Է¹��� ������ �����"+count+"��");
//		
		
		//17. ����ڿ���  ��� ���� �Է¹޾� ��� ���� ���缭 1���� 100���� ����ϴ� ���α׷�
		System.out.print("�����Է�>>");
		int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());//��
		System.out.print("�����Է�>>");
		int b=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());//��
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
		
		//19. �ش� ���� ���� ���ϰ� �ϼ��� �Է� �޾� �޷��� ����� ����.\t ���� �̿��ؼ� ����� ����.
		
		//20. ��ǻ�Ͱ� ���� ������ �ո� ���� �޸� ���� ���ߴ� ���α׷��� ������ ����. 
		//���� ȸ���� Ʋ�� ȸ���� ����ؼ� ��������.
		
		
		//21. ��ǻ�Ͱ� ���� �ֻ����� ���ߴ� ���α׷��� ������ ����. ���� ȸ���� Ʋ�� ȸ���� ����ؼ� ���� ����.
		
		
		
	}
}
