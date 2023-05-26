package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class test_score {

	public static void main(String[] args) {
		String test = JOptionPane.showInputDialog("What did you get on your test?");
		double test_double = Double.parseDouble(test);
		if (test_double<60) {
			JOptionPane.showMessageDialog(null, "You failed:( Good luck next time!");
		}
		else if (test_double>60 && test_double<80) {
			JOptionPane.showMessageDialog(null, "Good try, but make sure to study");
		}
		else if (test_double>80 && test_double<90) {
			JOptionPane.showMessageDialog(null, "Congrats on getting a B");
		}
		else if (test_double>90 && test_double<100) {
			JOptionPane.showMessageDialog(null, "Nice Job! Congrats on the A");
		}
		else {
			JOptionPane.showInputDialog("Good Job on getting 100% or higher!!!!");
		}
	}

}
