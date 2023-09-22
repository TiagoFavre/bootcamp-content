package projeto2.iPhone.aparTelefonico;

import java.util.ArrayList;
import java.util.List;

//Classe para representar um aparelho telefônico do iPhone
public class IphoneAparelho implements AparelhoTelefonico {
	
	 private boolean ligado;
	    private boolean emLigacao;
	    private List<Contato> contatos;

	    public IphoneAparelho() {
	        ligado = false;
	        emLigacao = false;
	        contatos = new ArrayList<>();
	    }

	    public void ligar() {
	        ligado = true;
	        System.out.println("Aparelho ligado");
	    }

	    public void atender() {
	        if (ligado && emLigacao) {
	            System.out.println("Chamada atendida");
	        }
	    }

	    public void iniciarCorreioVoz() {
	        if (ligado && !emLigacao) {
	            System.out.println("Iniciando correio de voz");
	        }
	    }

	    public void adicionarContato(Contato contato) {
	        contatos.add(contato);
	    }

	    public void mostrarContatos() {
	        System.out.println("Lista de Contatos:");
	        for (Contato contato : contatos) {
	            System.out.println(contato.getNome() + ": " + contato.getNumero());
	        }
	    }
	}