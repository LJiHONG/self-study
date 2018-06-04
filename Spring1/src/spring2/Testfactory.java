package spring2;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring2/applicationContext.xml");
		DateFormat df = (DateFormat) ac.getBean("dateFormat");
		System.out.println(df);
		
		Date date =  (Date) ac.getBean("date");
		System.out.println(date);
	}

}
