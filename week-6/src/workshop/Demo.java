package workshop;

public class Demo {
	
//	void run() {
//		while (true) {
//			System.out.println();
//		}
//	}
//	
//	void study(int value) {
//		for (int i = 1; i<value; i++) {
//			System.out.println("Hey");
//		}
//	}
//	
//	int sum(int a) {
//		return a+1000;
//	}
	
	void sumNatural(int a) {
		for (int i = 1; i<=a; i*=2) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Demo  std = new Demo();
//		System.out.println(std.sum(10));
		std.sumNatural(10);
	}

}
