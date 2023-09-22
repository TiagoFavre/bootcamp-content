package projeto2.iPhone.aparTelefonico;

//Interface para representar um aparelho telefônico
	interface AparelhoTelefonico {
	    void ligar();
	    void atender();
	    void iniciarCorreioVoz();
	}

//Classe base para representar contatos
	public class Contato {
	    private String nome;
	    private String numero;

	    public Contato(String nome, String numero) {
	        this.nome = nome;
	        this.numero = numero;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public String getNumero() {
	        return numero;

}
}