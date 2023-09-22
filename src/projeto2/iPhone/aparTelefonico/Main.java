package projeto2.iPhone.aparTelefonico;

public class Main {

	public static void main(String[] args) {

		AparelhoTelefonico iphone = new IphoneAparelho();
        iphone.ligar();

        Contato contato1 = new Contato("Amigo 1", "123456789");
        Contato contato2 = new Contato("Familiar 1", "987654321");

        ((IphoneAparelho) iphone).adicionarContato(contato1);
        ((IphoneAparelho) iphone).adicionarContato(contato2);

        ((IphoneAparelho) iphone).mostrarContatos();

        ((IphoneAparelho) iphone).iniciarCorreioVoz();
        ((IphoneAparelho) iphone).atender();
	}

}
