package orientacaoobjeto.pilares.polimorfismo.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {//extends = herança
	
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviar mensagem pelo Fscebook Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");

	}
}