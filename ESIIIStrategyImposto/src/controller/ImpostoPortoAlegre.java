package controller;

import javax.swing.JOptionPane;

public class ImpostoPortoAlegre implements IImpostoStrategy {

	@Override
	public void calcImposto() {
		int area = Integer.parseInt(JOptionPane.showInputDialog(null, "Área: "));
		int garagem = Integer.parseInt(JOptionPane.showInputDialog(null, "Área garagem: "));
		float imposto;
		if (garagem == 0) {
			 imposto = area * 8;
		} else {
			imposto = (float) ((area * 7.5) + (garagem * 2.5));
		}
		

		System.out.println("Imposto a pagar em PA: " + imposto);
	}
}
