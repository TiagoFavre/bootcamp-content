package projeto2.iPhone.navInternet;

//Interface para representar uma página da internet
interface PaginaInternet {
    void exibirPagina();
    void atualizarPagina();

public class AbaNavegador {
	
	 private PaginaInternet paginaAtual;

	    public void exibirPaginaAtual() {
	        if (paginaAtual != null) {
	            paginaAtual.exibirPagina();
	        } else {
	            System.out.println("Nenhuma página selecionada");
	        }
	    }

	    public void atualizarPaginaAtual() {
	        if (paginaAtual != null) {
	            paginaAtual.atualizarPagina();
	        }
	    }

	    public void setPaginaAtual(PaginaInternet pagina) {
	        paginaAtual = pagina;
	    }
}
}