package spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testauto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring1/applicationContext.xml");
		Person p1=(Person) ac.getBean("person1");
		Person p2=(Person) ac.getBean("person2");
		Person p3=(Person) ac.getBean("person3");
		System.out.println(p2);
		System.out.println(p1);
		System.out.println(p3);
		Person p4=(Person) ac.getBean("person4");
		System.out.println(p4);
		Person p5=(Person) ac.getBean("person5");
		System.out.println(p5);
		
		Person p6=(Person) ac.getBean("person6");
		System.out.println(p6);
	}

}
