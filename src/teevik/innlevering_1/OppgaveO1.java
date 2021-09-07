package teevik.innlevering_1;

import javax.swing.JOptionPane;

public class OppgaveO1 {
	public static void main(String[] args) {
		double grossIncome = Double.parseDouble(JOptionPane.showInputDialog("Bruttointekt :"));
		
		int taxStep;
		if (grossIncome <= 164_100.) {
			taxStep = 0;
		} else if (grossIncome <= 230_950.) {
			taxStep = 1;
		} else if (grossIncome <= 580_650.) {
			taxStep = 2;
		} else if (grossIncome <= 934_050.) {
			taxStep = 3;
		} else {
			taxStep = 4;
		}
		
		double taxRate = FindTaxRate(taxStep);
		double taxAmount = grossIncome * taxRate;
		
		JOptionPane.showMessageDialog(null, "Trinn: " + taxStep + ", Skatt: " + Math.round(taxAmount));
	}
	
	public static double FindTaxRate(int taxStep) {
		switch (taxStep) {
			case 0: return 0.;
			case 1: return 0.93 / 100.;
			case 2: return 2.41 / 100.;
			case 3: return 11.52 / 100.;
			case 4: return 14.52 / 100.;
			default: return 0.; // Burde kaste et error
		}
	}
}
