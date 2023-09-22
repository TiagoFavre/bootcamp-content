package orientacaoobjeto.pilares.interfac.equipamentos.multifuncional;

import orientacaoobjeto.pilares.interfac.equipamentos.copiadora.Copiadora;
import orientacaoobjeto.pilares.interfac.equipamentos.digitalizadora.Digitalizadora;
import orientacaoobjeto.pilares.interfac.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
	
	public void copiar() {
		System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
	}
	public void digitalizando() {
		System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
	}
	public void imprimir() {
		System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");


	}
	@Override
	public void digitalizar() {
		// TODO Auto-generated method stub
		
	}
}
