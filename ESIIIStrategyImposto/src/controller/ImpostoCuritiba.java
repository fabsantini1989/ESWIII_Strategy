package controller;

import javax.swing.JOptionPane;

public class ImpostoCuritiba implements IImpostoStrategy {

	@Override
	public void calcImposto() {
		int area = Integer.parseInt(JOptionPane.showInputDialog(null, "Área: "));
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade do imóvel: "));
		float imposto;
		
		if (idade > 50) {
			imposto = (area * 5) + (idade * 3);
		} else if (idade > 20) {
			imposto = (area * 5) + (idade * 2);
		} else {
			imposto = (float) ((area * 5) + (idade * 2.5));
		}

		System.out.println("Imposto a pagar em CTB: " + imposto);
	}

}
