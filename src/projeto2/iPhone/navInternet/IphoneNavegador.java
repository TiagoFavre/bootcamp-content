package projeto2.iPhone.navInternet;

import java.util.ArrayList;
import java.util.List;

import projeto2.iPhone.navInternet.PaginaInternet.AbaNavegador;

public class IphoneNavegador {

private List<PaginaInternet> abas;
private PaginaInternet paginaAtual;

public IphoneNavegador() {
    abas = new ArrayList<>();
}

public void adicionarNovaAba(PaginaInternet aba) {
    abas.add(aba);
}

public void mostrarAbas() {
    System.out.println("Lista de Abas:");
    for (int i = 0; i < abas.size(); i++) {
        System.out.println("Aba " + (i + 1));
    }
}

public void exibirPaginaAtual() {
    if (paginaAtual != null) {
        paginaAtual.exibirPagina();
    } else {
        System.out.println("Nenhuma pagina selecionada");
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