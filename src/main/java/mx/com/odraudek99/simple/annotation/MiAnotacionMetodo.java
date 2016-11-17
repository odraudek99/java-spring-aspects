package mx.com.odraudek99.simple.annotation;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import mx.com.odraudek99.simple.neg.NegocioException;


@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.METHOD})
public @interface MiAnotacionMetodo
{
  String preMethod() default "";
  String postMethod() default "";
  
  Class exceptionClass() default NegocioException.class;
}
