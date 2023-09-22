package orientacaoobjeto.pilares.polimorfismo.apps;

public class Telegram extends ServicoMensagemInstantanea {//extends = herança
	
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviar mensagem pelo Telegram");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");

	}
}


