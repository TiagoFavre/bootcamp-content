package orientacaoobjeto.pilares.abstracao;

public class ComputadorPedrinho {

	public static void main(String[] args) {

		//abrindo MSN Messenger
		System.out.println("MSN");
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		
		System.out.println("");
		
		//abrindo MSN Facebook Messenger
		System.out.println("Facebook");
		FacebookMessenger fcb = new FacebookMessenger();
		fcb.enviarMensagem();
		fcb.receberMensagem();
		
		System.out.println("");
		
		//abrindo MSN Messenger
		System.out.println("Telegram");
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
	}

}
