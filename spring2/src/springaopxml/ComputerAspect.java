package springaopxml;

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


public class ComputerAspect{
	
	
	public void a(JoinPoint jp){
		
		Object[] args=jp.getArgs();
		String methodname=jp.getSignature().getName();
		System.out.println("调用"+methodname+"方法之前调用，参数为："+Arrays.asList(args));
	}
	
	public void b(JoinPoint jp){
		Object[] args=jp.getArgs();
		String methodname=jp.getSignature().getName();
		System.out.println("调用"+methodname+"方法之后调用，参数为："+Arrays.asList(args));
	}
	
	
	public void c(JoinPoint jp,Object result){
		Object[] args=jp.getArgs();
		String methodname=jp.getSignature().getName();
		System.out.println("调用"+methodname+"方法正常返回结果之后调用，参数为："+Arrays.asList(args)+"，正常返回结果为："+result);
	}
	
	public void d(JoinPoint jp,Exception ex){
		System.out.println("出现了异常"+ex.getMessage());
	}
}
