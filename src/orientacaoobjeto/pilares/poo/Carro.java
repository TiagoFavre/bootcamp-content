package orientacaoobjeto.pilares.poo;

public class Carro extends Veiculo{ //herança
	
	//Metodo publico, unico visivel para operação  
	public void ligar() {
		
		confereCambio();
		confereCombustivel();
		System.out.println("CARRO LIGADO");
	} //Emcapsular em private 
	private void confereCombustivel() { 
		System.out.println("Conferindo combustivel");
	}
	private void confereCambio() {
		System.out.println("Conferindo cambio em P");
	}

}
