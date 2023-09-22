package orientacaoobjeto.pilares.interfac.estabelecimento;

import orientacaoobjeto.pilares.interfac.equipamentos.impressora.Impressora;
import orientacaoobjeto.pilares.interfac.equipamentos.impressora.Laserjet;
import orientacaoobjeto.pilares.interfac.equipamentos.multifuncional.EquipamentoMultifuncional;
import orientacaoobjeto.pilares.interfac.equipamentos.copiadora.Copiadora;
import orientacaoobjeto.pilares.interfac.equipamentos.digitalizadora.Digitalizadora;

public class Fabrica {
	
	public static void main(String[] args) {
		
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
		
	}
}
