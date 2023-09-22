package orientacaoobjeto.pilares.poo;

public abstract class Veiculo { //classe de herança
	//metodo abstract
private String chassi;
	
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public abstract void ligar();
	//abstract para definir o que é um veiculo

}

