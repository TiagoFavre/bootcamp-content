package projeto2.iPhone.navInternet;

public class Main {

	public static void main(String[] args) {
		
		IphoneNavegador navegador = new IphoneNavegador();

        PaginaWeb pagina1 = new PaginaWeb("https://www.exemplo1.com");
        PaginaWeb pagina2 = new PaginaWeb("https://www.exemplo2.com");

        navegador.adicionarNovaAba(pagina1);
        navegador.adicionarNovaAba(pagina2);

        navegador.setPaginaAtual(pagina1);
        navegador.exibirPaginaAtual();
        navegador.atualizarPaginaAtual();

        navegador.mostrarAbas();
    }
}

		
	