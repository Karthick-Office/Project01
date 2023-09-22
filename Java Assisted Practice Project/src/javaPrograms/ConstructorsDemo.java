package javaPrograms;

public class ConstructorsDemo {

	public ConstructorsDemo() {   
		System.out.println("Do");
	}
	public ConstructorsDemo(int a) {   
		System.out.println("Do"+" "+a);
	}
	public ConstructorsDemo(int a,String b) {   
		System.out.println("Do"+" "+a+" "+b);
	}
	public static void main(String[] args) {
		ConstructorsDemo obj=new ConstructorsDemo();
		ConstructorsDemo obj1=new ConstructorsDemo(1);
		ConstructorsDemo obj2=new ConstructorsDemo(2,"Thing");
	}

}
