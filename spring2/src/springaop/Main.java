package springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//spring:IOC容器，可以动态的帮我们创建对象
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Computer com=new Computer1();
		int r=com.add(3, 9);
		System.out.println(r);*/
		/*Computer com=new Computer2();
		Computerproxy proxy=new Computerproxy(com);
		com=proxy.getComputerproxy();
		int a=com.add(1, 2);
		System.out.println(a);*/
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Computer computer=(Computer) ac.getBean("computer2");
		System.out.println(computer.div(9,3));
	}

}
