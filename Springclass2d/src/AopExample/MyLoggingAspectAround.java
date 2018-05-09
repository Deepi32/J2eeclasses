package AopExample;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspectAround {
	@Around("execution(* *.*(..))")
	public Object myAround(ProceedingJoinPoint pj) throws Throwable
	{
		System.out.println("ARound start Logic");
		Object result=pj.proceed();
		System.out.println("Around  end Logic");
		return result;
	}
}
