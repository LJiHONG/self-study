package springaop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Computerproxy {
	private Computer computer;
	public Computerproxy(Computer computer){
		this.computer=computer;
	}
	//computer与我们代理
	public Computer getComputerproxy(){
		ClassLoader loader=Computer.class.getClassLoader();
		Class[] interfaces={Computer.class};
		InvocationHandler h=new InvocationHandler() {
			
			//proxy:代理对象
			//method：被代理对象中的方法
			//args:方法中的参数
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// TODO Auto-generated method stub
				System.out.println("正在进行"+method.getName());
				//执行被代理对象的核心方法
				Object o=method.invoke(computer, args);
				System.out.println("结束"+method.getName());
				return o;
			}
		};
		Computer com=(Computer) Proxy.newProxyInstance(loader, interfaces, h);
		return com;
	}
}
