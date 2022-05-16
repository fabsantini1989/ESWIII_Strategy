package view;

import controller.IImpostoStrategy;
import controller.ImpostoCuritiba;

public class Main {

	public static void main(String[] args) {
		
		IImpostoStrategy calc;

		calc = new ImpostoCuritiba();
		// calc = new ImpostoSaoPaulo();
		// calc = new ImpostoBeloHorizonte();
		// calc = new ImpostoPortoAlegre();
		
		calc.calcImposto();
		
	}

}
