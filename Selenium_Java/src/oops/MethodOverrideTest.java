package oops;

public class MethodOverrideTest extends MethodOverloadTest {

	int a=100;
	int b=200;

	void addition() {
		System.out.println("Addition of a and b in sub class is : " +(a+b));
	}

	/*static void addition(boolean b) {
		System.out.println("Boolean value in subclass is : " + b);
	}*/

	public static void main(String[] args) {

		MethodOverrideTest mot =new MethodOverrideTest();
		mot.addition();

	}


}
