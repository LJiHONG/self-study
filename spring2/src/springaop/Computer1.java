package springaop;

public class Computer1 implements Computer {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("正在调用add方法，操作数为："+a+"\t"+b);
		int c=a+b;
		System.out.println("add方法执行完成，操作数为："+a+"\t"+b);
		return c;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("正在调用sub方法，操作数为："+a+"\t"+b);
		int c=a-b;
		System.out.println("sub方法执行完成，操作数为："+a+"\t"+b);
		return c;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("正在调用mul方法，操作数为："+a+"\t"+b);
		int c=a*b;
		System.out.println("mul方法执行完成，操作数为："+a+"\t"+b);
		return c;
	}

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("正在调用div方法，操作数为："+a+"\t"+b);
		int c=a/b;
		System.out.println("div方法执行完成，操作数为："+a+"\t"+b);
		return c;
	}

}
