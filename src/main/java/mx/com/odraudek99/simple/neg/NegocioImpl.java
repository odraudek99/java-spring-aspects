package mx.com.odraudek99.simple.neg;

import org.springframework.stereotype.Service;

import mx.com.odraudek99.simple.annotation.LogMetodo;
import mx.com.odraudek99.simple.annotation.MiAnotacionMetodo;

@Service
public class NegocioImpl {

	@MiAnotacionMetodo(preMethod="preTexto")
	public void preAspectoMetodo() {
		System.out.println("En Método preAspectoMetodo");
	}

	@MiAnotacionMetodo(postMethod="postTexto")
	public void postAspectoMetodo() {
		System.out.println("En Método postAspectoMetodo");
	}
	
	@MiAnotacionMetodo(preMethod="preTexto", postMethod="postTexto")
	public void prePostAspectoMetodo() {
		System.out.println("En Método prePostAspectoMetodo");
	}

	@LogMetodo
	public void metodoLog(String string) {
		System.out.println("En el metodosaludando a "+string);
	}


	
}
