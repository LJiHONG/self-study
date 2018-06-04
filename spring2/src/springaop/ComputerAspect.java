package springaop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


//1��ͨ��order��ע��ָ����������ȼ�@Order���������ͣ���ԽС���ȼ�Խ��
//2��ʵ��һ��Ordered�ӿ�,getOrder()���������Ʒ���ֵ
@Aspect
@Component
//@Order(1)
public class ComputerAspect implements Ordered{
	
	//�����е���ʽ
	/*1��дһ��������������û�з������
	2������������һ��@Pointcut("�е���ʽ")
	3��֪ͨ����pointcut="��������()"*/
	@Pointcut("execution(public int springaop.Computer2.*(..))")
	public void getException(){
		
	}
	//�Ƿ�ִ��������ӵ�
	//����֪ͨ��Ҫ��֪ͨ�����Ĳ����б��У��ṩһ��ProceedingJoinPoint�ӿ����͵��β�
	/*@Around("execution(public int springaop.Computer2.*(..))")
	public void e(ProceedingJoinPoint pjp){
		try {
			//ǰ��֪ͨ
			System.out.println("��������֮ǰ");
			Object result=pjp.proceed();
			//����ֵ֪ͨ
			System.out.println("��������һ�����Ϊ��"+result);
		} catch (Throwable e1) {
			// TODO Auto-generated catch block
			//�쳣֪ͨ�����ݣ�e1����ȡ�쳣��ʵ��
			System.out.println("�������쳣���쳣֪ͨ");
			e1.printStackTrace();
		}
		//����֪ͨ
		System.out.println("��������֮��");
	}*/
	
	
	//* ��ͨ���������
	//..:�ڷ����Ĳ����б���ʹ�ã����޶����͡�����������
	@Before("getException()")
	//֪ͨ�����Ĳ������У�����һ��JoinPoint���͵����ݼ���
	public void a(JoinPoint jp){
		//֪ͨ�������ڲ��������������ӵ��ϸ�ڣ������ɣ�
		//JoinPoint���ӿ����ͣ����ӵ�����
		//��λ�ȡ�����Ĳ����б�
		Object[] args=jp.getArgs();
		String methodname=jp.getSignature().getName();
		System.out.println("����"+methodname+"����֮ǰ���ã�����Ϊ��"+Arrays.asList(args));
	}
	/*
	@After("execution(public int springaop.Computer2.*(..))")
	public void b(JoinPoint jp){
		Object[] args=jp.getArgs();
		String methodname=jp.getSignature().getName();
		System.out.println("����"+methodname+"����֮����ã�����Ϊ��"+Arrays.asList(args));
	}
	//����ڷ���ֵ֪ͨ�л�ȡ����ִ��֮��ķ���ֵ
	1����Ҫ���ض���ע@AfterReturning��Returning="����������"�����ã���֪springҪ��ȡĿ����󣨱�������󣩷����ķ���ֵresult
	2��֪ͨ�Ĳ����б��У�ָ��һ���β����ֺ�returning�����е�����һ��
	@AfterReturning(pointcut="execution(public int springaop.Computer2.*(..))",returning="result")
	public void c(JoinPoint jp,Object result){
		Object[] args=jp.getArgs();
		String methodname=jp.getSignature().getName();
		System.out.println("����"+methodname+"�����������ؽ��֮����ã�����Ϊ��"+Arrays.asList(args)+"���������ؽ��Ϊ��"+result);
	}
	@AfterThrowing(pointcut="execution(public int springaop.Computer2.*(..))",throwing="ex")
	public void d(JoinPoint jp,Exception ex){
		System.out.println("�������쳣"+ex.getMessage());
	}*/

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 1;
	}
}
