package springaop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Computerproxy {
	private Computer computer;
	public Computerproxy(Computer computer){
		this.computer=computer;
	}
	//computer�����Ǵ���
	public Computer getComputerproxy(){
		ClassLoader loader=Computer.class.getClassLoader();
		Class[] interfaces={Computer.class};
		InvocationHandler h=new InvocationHandler() {
			
			//proxy:�������
			//method������������еķ���
			//args:�����еĲ���
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// TODO Auto-generated method stub
				System.out.println("���ڽ���"+method.getName());
				//ִ�б��������ĺ��ķ���
				Object o=method.invoke(computer, args);
				System.out.println("����"+method.getName());
				return o;
			}
		};
		Computer com=(Computer) Proxy.newProxyInstance(loader, interfaces, h);
		return com;
	}
}
