package projeto2.iPhone.navInternet;

//Classe para representar uma página específica da internet
public class PaginaWeb implements PaginaInternet {
	private String url;
	
	 public PaginaWeb(String url) {
	        this.url = url;
	    }

	    public void exibirPagina() {
	        System.out.println("Exibindo pagina da web: " + url);
	    }

	    public void atualizarPagina() {
	        System.out.println("Atualizando pagina da web: " + url);
	    }
}