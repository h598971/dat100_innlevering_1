package teevik.innlevering_1;

import javax.swing.JOptionPane;

public class OppgaveO2 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			boolean succesfullyCheckedGrade = false;
			
			// Prøve å sjekke karakter helt til brukeren angir en gyldig poengsum
			while (!succesfullyCheckedGrade) {
				succesfullyCheckedGrade = CheckGrade();
			}
		}
	}
	
	private static boolean CheckGrade() {
		double points = Double.parseDouble(JOptionPane.showInputDialog("Poengsum :"));

		if (points >= 0. && points <= 100.) {
			char grade;
			
			if (points <= 39.) {
				grade = 'F';
			} else if (points <= 49.) {
				grade = 'E';
			} else if (points <= 59.) {
				grade = 'D';
			} else if (points <= 79.) {
				grade = 'C';
			} else if (points <= 89.) {
				grade = 'B';
			} else {
				grade = 'A';
			}
			
			JOptionPane.showMessageDialog(null, "Karakter: " + grade);
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Ugyldig poengsum!");
			return false;
		}
	}
}