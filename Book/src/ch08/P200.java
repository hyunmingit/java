package ch08;

public class P200 {
	public static void main(String[] args) {
		
		Child child = new Child();
		child.print();
		
	}

}

class Parent {
	int number = 3;
	public Parent() {
		System.out.println("�θ� ��ü ����");
		// TODO Auto-generated constructor stub
	}
}

class Child extends Parent {
	int number = 2;
	
	Child(){
		System.out.println("�ڽ� ��ü ����");
		
	}
	void print() {
		int number = 1;
		System.out.println(number);
		System.out.println(this.number);
		System.out.println(super.number);
	}
}