package projeto2.iPhone.repMusical;

//Classe para representar músicas
class MusicaMP3 extends ItemMultimidia {
	public MusicaMP3(String nome) {
		super(nome);
	}
}

//Interface para o reprodutor musical
interface ReprodutorMusical{
	void tocar();
	void pausar();
	void selecionarItem(ItemMultimidia item);
}
