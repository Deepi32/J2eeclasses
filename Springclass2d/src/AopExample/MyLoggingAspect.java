package AopExample;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {
	@Pointcut("execution(* *.*(..))")
	private void pointCutX() {}

	@Before("pointCutX()")
	public void myBefore(JoinPoint j)
	{
		System.out.println("Before logic");
		System.out.println("Join Point Kind"+j.getKind());
		System.out.println("Signature declaring name"+j.getSignature().getDeclaringTypeName());
		System.out.println("Signature name"+j.getSignature().getName());
		System.out.println("Arguments ::"+j.getArgs());
		System.out.println("Target class"+j.getTarget().getClass().getName());
	}
	@After("execution(* *.*(..))")
	public void myAfter(JoinPoint j)
	{
		System.out.println("After logic");
		System.out.println("Signature name"+j.getSignature().getName());
		
	}
	@AfterReturning(pointcut="pointCutX()",returning="result1")
	public void myAfterReturning(JoinPoint j,Object result1)
	{
		System.out.println("After returning logic"+j.getSignature().getName());
		System.out.println("returning is ::"+result1);
	}
	@AfterThrowing(pointcut="pointCutX()",throwing="except1")
	public void throwException(Exception except1)
	{
		System.out.println("Exception is ::"+except1);
	}
}
