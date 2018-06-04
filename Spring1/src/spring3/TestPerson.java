package spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		/*Person p=(Person) ac.getBean("abc");
		//Person p=(Person)ac.getBean("person");
		p.eat();*/
		Action a=(Action) ac.getBean("action");
		a.excute();
	}

}
