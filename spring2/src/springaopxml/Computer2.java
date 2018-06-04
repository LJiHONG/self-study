package springaopxml;

import org.springframework.stereotype.Component;

@Component
public class Computer2 implements Computer {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		int c=a+b;
		return c;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		int c=a-b;
		return c;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		int c=a*b;
		return c;
	}

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		int c=a/b;
		return c;
	}

}
