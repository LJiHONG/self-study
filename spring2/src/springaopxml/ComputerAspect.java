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
		System.out.println("����"+methodname+"����֮ǰ���ã�����Ϊ��"+Arrays.asList(args));
	}
	
	public void b(JoinPoint jp){
		Object[] args=jp.getArgs();
		String methodname=jp.getSignature().getName();
		System.out.println("����"+methodname+"����֮����ã�����Ϊ��"+Arrays.asList(args));
	}
	
	
	public void c(JoinPoint jp,Object result){
		Object[] args=jp.getArgs();
		String methodname=jp.getSignature().getName();
		System.out.println("����"+methodname+"�����������ؽ��֮����ã�����Ϊ��"+Arrays.asList(args)+"���������ؽ��Ϊ��"+result);
	}
	
	public void d(JoinPoint jp,Exception ex){
		System.out.println("�������쳣"+ex.getMessage());
	}
}
