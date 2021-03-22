package br.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail; 

public class Email {

	
	public void sendEmail() throws EmailException {
		SimpleEmail  email = new SimpleEmail();
		System.out.println("alterando hostname...");
		email.setHostName("");
		email.setSmtpPort();
	
		email.addTo("email", "");
		email.setFrom("email","");
		email.setSubject("mensagem");
		email.setMsg("mensagem");
		System.out.println("autenticando...");
		email.setSSLOnConnect(true);
		email.setAuthentication("email", "senha");
		System.out.println("enviando...");
		email.send();
	}

}
