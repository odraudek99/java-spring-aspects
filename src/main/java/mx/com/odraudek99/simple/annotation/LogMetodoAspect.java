package mx.com.odraudek99.simple.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.util.StringUtils;


@Aspect
public class LogMetodoAspect {

	@Around("execution(* *(..)) && @annotation(propagable)")
	public Object propagar(ProceedingJoinPoint pjp, LogMetodo propagable) throws Throwable {
		Object resultado = null;
		
		
		System.out.println("Log 4 method: "+pjp.getSignature());
		StringBuilder sb = new StringBuilder();
		for (Object ob : pjp.getArgs()) {
			sb.append(ob);
		}
		System.out.println("Args: "+sb.toString());
		
		resultado = pjp.proceed();
		return resultado;
	}
}
