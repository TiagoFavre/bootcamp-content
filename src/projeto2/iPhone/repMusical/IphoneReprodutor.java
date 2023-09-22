package projeto2.iPhone.repMusical;

//Classe que implementa o reprodutor musical
public class IphoneReprodutor implements ReprodutorMusical {
    private ItemMultimidia itemAtual;
    private boolean emReproducao;

    public void tocar() {
        if (itemAtual != null && !emReproducao) {
            System.out.println("Tocando: " + itemAtual.getNome());
            emReproducao = true;
        }
    }

    public void pausar() {
        if (emReproducao) {
            System.out.println("Pausando a reproducao");
            emReproducao = false;
        }
    }

    public void selecionarItem(ItemMultimidia item) {
        System.out.println("Selecionando: " + item.getNome());
        itemAtual = item;
        emReproducao = false;
    }
}
