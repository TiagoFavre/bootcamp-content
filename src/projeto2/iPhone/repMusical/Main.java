package projeto2.iPhone.repMusical;

public class Main {

	public static void main(String[] args) {
		
		MusicaMP3 musica1 = new MusicaMP3("Musica 1");
		MusicaMP3 musica2 = new MusicaMP3("Musica 2");
		
		ReprodutorMusical reprodutor = new IphoneReprodutor();
		reprodutor.selecionarItem(musica1);
		reprodutor.tocar();
		reprodutor.pausar();
		reprodutor.selecionarItem(musica2);
		reprodutor.tocar();

	}

}
