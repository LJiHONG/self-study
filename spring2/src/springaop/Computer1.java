package springaop;

public class Computer1 implements Computer {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("���ڵ���add������������Ϊ��"+a+"\t"+b);
		int c=a+b;
		System.out.println("add����ִ����ɣ�������Ϊ��"+a+"\t"+b);
		return c;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("���ڵ���sub������������Ϊ��"+a+"\t"+b);
		int c=a-b;
		System.out.println("sub����ִ����ɣ�������Ϊ��"+a+"\t"+b);
		return c;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("���ڵ���mul������������Ϊ��"+a+"\t"+b);
		int c=a*b;
		System.out.println("mul����ִ����ɣ�������Ϊ��"+a+"\t"+b);
		return c;
	}

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("���ڵ���div������������Ϊ��"+a+"\t"+b);
		int c=a/b;
		System.out.println("div����ִ����ɣ�������Ϊ��"+a+"\t"+b);
		return c;
	}

}
