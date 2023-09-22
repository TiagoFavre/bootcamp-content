package orientacaoobjeto.pilares.abstracao;

public class Telegram extends ServicoMensagemInstantanea {//extends = herança
	
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Telegram");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");

}
}


