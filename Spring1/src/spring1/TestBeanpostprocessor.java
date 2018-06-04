package spring1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
//ר����������IOC���������е�bean�ĳ�ʼ��֮ǰ��֮����д���
public class TestBeanpostprocessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("ִ�г�ʼ��֮��ķ���"+beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("ִ�г�ʼ��֮ǰ�ķ���"+beanName);
		return bean;
	}

}
