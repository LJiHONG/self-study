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


//1、通过order标注来指定切面的优先级@Order（整数类型），越小优先级越高
//2、实现一个Ordered接口,getOrder()方法，控制返回值
@Aspect
@Component
//@Order(1)
public class ComputerAspect implements Ordered{
	
	//重用切点表达式
	/*1、写一个方法，方法是没有方法体的
	2、给方法加入一个@Pointcut("切点表达式")
	3、通知当中pointcut="方法名称()"*/
	@Pointcut("execution(public int springaop.Computer2.*(..))")
	public void getException(){
		
	}
	//是否执行这个连接点
	//环绕通知需要在通知方法的参数列表中，提供一个ProceedingJoinPoint接口类型的形参
	/*@Around("execution(public int springaop.Computer2.*(..))")
	public void e(ProceedingJoinPoint pjp){
		try {
			//前置通知
			System.out.println("方法调用之前");
			Object result=pjp.proceed();
			//返回值通知
			System.out.println("正常返回一个结果为："+result);
		} catch (Throwable e1) {
			// TODO Auto-generated catch block
			//异常通知的内容，e1来获取异常的实例
			System.out.println("出现了异常，异常通知");
			e1.printStackTrace();
		}
		//后置通知
		System.out.println("方法调用之后");
	}*/
	
	
	//* ：通配符，所有
	//..:在方法的参数列表中使用，不限定类型、方法、个数
	@Before("getException()")
	//通知方法的参数当中，加入一个JoinPoint类型的数据即可
	public void a(JoinPoint jp){
		//通知方法的内部，如果想访问连接点的细节，如何完成？
		//JoinPoint：接口类型，连接点类型
		//如何获取方法的参数列表
		Object[] args=jp.getArgs();
		String methodname=jp.getSignature().getName();
		System.out.println("调用"+methodname+"方法之前调用，参数为："+Arrays.asList(args));
	}
	/*
	@After("execution(public int springaop.Computer2.*(..))")
	public void b(JoinPoint jp){
		Object[] args=jp.getArgs();
		String methodname=jp.getSignature().getName();
		System.out.println("调用"+methodname+"方法之后调用，参数为："+Arrays.asList(args));
	}
	//如何在返回值通知中获取方法执行之后的返回值
	1、需要在特定标注@AfterReturning（Returning="变量的名称"）作用：告知spring要获取目标对象（被代理对象）方法的返回值result
	2、通知的参数列表当中，指定一个形参名字和returning属性中的名字一致
	@AfterReturning(pointcut="execution(public int springaop.Computer2.*(..))",returning="result")
	public void c(JoinPoint jp,Object result){
		Object[] args=jp.getArgs();
		String methodname=jp.getSignature().getName();
		System.out.println("调用"+methodname+"方法正常返回结果之后调用，参数为："+Arrays.asList(args)+"，正常返回结果为："+result);
	}
	@AfterThrowing(pointcut="execution(public int springaop.Computer2.*(..))",throwing="ex")
	public void d(JoinPoint jp,Exception ex){
		System.out.println("出现了异常"+ex.getMessage());
	}*/

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 1;
	}
}
