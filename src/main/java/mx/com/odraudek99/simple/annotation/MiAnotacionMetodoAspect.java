package mx.com.odraudek99.simple.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.util.StringUtils;

@Aspect
public class MiAnotacionMetodoAspect {
	
	
	@Around("execution(* *(..)) && @annotation(propagable)")
	public Object propagar(ProceedingJoinPoint pjp, MiAnotacionMetodo propagable) throws Throwable {
		Object resultado = null;
		
		
		if (!StringUtils.isEmpty(propagable.preMethod())) {
			System.out.println(propagable.preMethod());
		}
		
		resultado = pjp.proceed();
		if (!StringUtils.isEmpty(propagable.postMethod())) {
			System.out.println(propagable.postMethod());
		}
		
		return resultado;
	}
}