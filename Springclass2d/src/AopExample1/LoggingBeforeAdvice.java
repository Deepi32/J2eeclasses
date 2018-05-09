package AopExample1;

import org.springframework.aop.MethodBeforeAdvice;


public class LoggingBeforeAdvice implements MethodBeforeAdvice
{
	

	@Override
	public void before(java.lang.reflect.Method arg0, Object[] arg1, Object arg2) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("before logic");
		
	}
} 