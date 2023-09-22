package orientacaoobjeto.pilares.polimorfismo;

import orientacaoobjeto.pilares.polimorfismo.apps.FacebookMessenger;
import orientacaoobjeto.pilares.polimorfismo.apps.MSNMessenger;
import orientacaoobjeto.pilares.polimorfismo.apps.ServicoMensagemInstantanea;
import orientacaoobjeto.pilares.polimorfismo.apps.Telegram;

public class ComputadorPedrinho {

	public static void main(String[] args) {
		
ServicoMensagemInstantanea smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="???"; 
		
		if(appEscolhido.equals("msn"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();

		
	}

}
