package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		// Write code to ask the user what day it is.
        String day = JOptionPane.showInputDialog("What day is it?");
		// Set the boolean isWeekend based on the value they enter
		if(day.equals("Saturday")) {
			isWeekend = true;
		}
		if(day.equals("Sunday")) {
			isWeekend = true;
		}
		else {
			isWeekend = false;
		}
		// If it is the weekend, tell the user they get to sleep in.
		if(isWeekend == true) {
			JOptionPane.showMessageDialog(null, "You get to sleep in! :)");
		}
		else {
			JOptionPane.showMessageDialog(null, "Get up and go to school!");
		}
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam
		String score = JOptionPane.showInputDialog("What score did you get on your exam?");
		double grade = Double.parseDouble(score);
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
		if(grade>=70) {
			passedExam = true;
		}
		else {
			passedExam = false;
		}
		// If the user passed the exam, congratulate them
		if(passedExam == true) {
			JOptionPane.showMessageDialog(null, "Congrats! You passed!");
		}
		// otherwise, wish them better luck next time.
		else {
			JOptionPane.showMessageDialog(null, "Oh. Better luck next time!");
		}
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true
			if(gameOver.equals("yes")) {
				gameIsOver = true;
			}
		}
		// Tell the user "game is over" 
			if(gameIsOver==true) {
				JOptionPane.showMessageDialog(null, "game is over");
			}
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed = false;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		 String draw = JOptionPane.showInputDialog("What color do you want to draw with?");
		 if(draw.equals("red")) {
			 isRed = true;
		 }
		
		boolean isSquare = false;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		String shape = JOptionPane.showInputDialog("What shape do you want to draw?");
		if(shape.equals("square")) {
			isSquare = true;
		}
		
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		if(isRed == true && isSquare == true) {
			drawRedSquare();
		}
		else {
			JOptionPane.showMessageDialog(null, "I don't know how to draw that shape.");
		}

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		// Complete the rest of this method
		rob.penDown();
		rob.setPenColor(255, 0, 0);
		rob.setSpeed(10);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
	}	
}
