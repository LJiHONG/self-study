package springaop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
//@Order(0)
public class ValidateAspect implements Ordered{
	@Before("execution(public int springaop.Computer2.*(..))")
	public void a(){
		System.out.println("���ǵ�������֤�����ǰ�ô���");
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 0;
	}
}
