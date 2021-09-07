package teevik.innlevering_1;

import javax.swing.JOptionPane;

public class OppgaveO3 {
	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog("Heltall :"));
		
	    long factorial = 1;
	    for (int i = 2; i <= number; i++) {
	        factorial = factorial * i;
	    }

		JOptionPane.showMessageDialog(null, "Resultat fakultet: " + factorial);
	}
}
