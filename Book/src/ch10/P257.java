package ch10;

class P257 {//�ٱ� Ŭ����
	P257() {//�ٱ� Ŭ������ ������
		System.out.println("A��ü ����");
	}
	
	static class B {//static ���� Ŭ����
		B() {//static ���� Ŭ������ ������
			System.out.println("C��ü ����");
		}
		int var1;
		static int var2;
		
		void method1() {
			System.out.println("static ���� Ŭ������ method1()");
		}
		static void method2() {
			System.out.println("static ���� Ŭ������ method2()");
		}
	}
   
	
	public class C{//�ν��Ͻ� ���� Ŭ����
		C() {//�ν��Ͻ� ���� Ŭ������ ������
			System.out.println("B ��ü ����");
		}
		
		int var1;
		void method1() {
			System.out.println("static ���� Ŭ������ method1()");
		}
	}
	void method() {//�ٱ� Ŭ������ �޼���
		
		class D {//���� ���� Ŭ����
			D(){
				System.out.println("D��ü ����");
		}
		int var1;
		
		void method1() {
			System.out.println("static ���� Ŭ������ method1()");
		}
	}
		D d = new D();
		d.var1 =3;
		d.method1();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}