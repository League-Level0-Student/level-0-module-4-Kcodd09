package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String score = JOptionPane.showInputDialog("What was your test score?");
		double Iscore = Double.parseDouble(score);
		if(Iscore>=80) {
			JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for that test! :)");
		}
		else if(Iscore>=70) {
			JOptionPane.showMessageDialog(null, "Well, at least you passed...");
		}
		else {
			JOptionPane.showMessageDialog(null, "Oof that sucks. Better luck next time.");
		}
		
		
		
}
}
