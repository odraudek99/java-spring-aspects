package mx.com.odraudek99.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mx.com.odraudek99.simple.neg.NegocioImpl;

public class MainAspectos {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/spring.xml");

		NegocioImpl negocioImpl = (NegocioImpl) context.getBean(NegocioImpl.class);

		negocioImpl.preAspectoMetodo();
		System.out.println("-----------");
		negocioImpl.postAspectoMetodo();
		System.out.println("-----------");
		negocioImpl.prePostAspectoMetodo();

		System.out.println("-----------");
		negocioImpl.metodoLog("Hola");

		
	}

}
