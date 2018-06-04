package spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring2/applicationContext.xml");
		Car car1=(Car) ac.getBean("car1");
		System.out.println(car1);
		
		Car car2=(Car) ac.getBean("car2");
		System.out.println(car2);
	}

}
