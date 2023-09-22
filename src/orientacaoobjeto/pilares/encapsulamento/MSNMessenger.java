package orientacaoobjeto.pilares.encapsulamento; //01Nem tudo precisa ser estar disponível para todos!

public class MSNMessenger {
	
	public void enviarMensagem() {
		
		//primeiro confirmar se esta conectado a internet
		validarConectadoInternet();
		System.out.println("Enviando mensagem");
		//depois de enviada, salva o histórico da mensagem
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
	//métodos privadas, visíveis somente na classe
	private void validarConectadoInternet() {
		System.out.println("Validando se esta conectado a internet");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o historico da mensagem");
	}
}

