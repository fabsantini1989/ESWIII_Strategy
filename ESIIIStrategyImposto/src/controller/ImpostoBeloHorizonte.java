package controller;

import javax.swing.JOptionPane;

public class ImpostoBeloHorizonte implements IImpostoStrategy {

	@Override
	public void calcImposto() {
		int area = Integer.parseInt(JOptionPane.showInputDialog(null, "�rea: "));
		int nmrQuartos = Integer.parseInt(JOptionPane.showInputDialog(null, "N�mero de Quartos: "));
		float imposto = (area * 7) + (nmrQuartos * 4);

		System.out.println("Imposto a pagar em BH: " + imposto);
	}

}
