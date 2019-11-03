import javax.swing.JOptionPane;

public class theriddler {
	public static void main(String[] args) {
	int score = 0;
	String answer = "a coffin";
	String AnswerSecond = "incorrectly";
	String AnswerThird = "chess pawns";
	String AnswerFourth = "a towel";
			
	String username=JOptionPane.showInputDialog("Hello user! Welcome to Today's Goal. Please enter your username:");
	JOptionPane.showMessageDialog(null, "Today, " + username + ", we will be giving you riddles and your goal is to answer them right!");
	JOptionPane.showMessageDialog(null, "If you get one right, you get a point. If not, no point. There are 4 riddles total every time.");
	String guess=JOptionPane.showInputDialog("First Riddle: Who makes it, has no need for it. Who buys it, has no use for it. Who uses it can neither see nor feel it. What is it?");
	if(guess.equals (answer)) {  
		score ++;
			JOptionPane.showMessageDialog(null, "Correct! Pretty confusing, right?");

	}
	else {
		JOptionPane.showMessageDialog(null, "Incorrect.");
	
	String guess2=JOptionPane.showInputDialog("Second Riddle: Which word in the dictionary is spelled incorrectly?");
	if(guess2.equals (AnswerSecond)) {
		score ++;
			JOptionPane.showMessageDialog(null, "Correct! That one is an actually pretty hard one to crack.");
			
	}
	else {
		JOptionPane.showMessageDialog(null, "Incorrect. Got you!");
	}
	
		String guess3=JOptionPane.showInputDialog("The eight of us go forth not back to protect our king from a foes attack. What are they?");
		if(guess3.equals (AnswerThird)) {
			score ++;
			JOptionPane.showMessageDialog(null, "Correct! You're doing good!");
		}
			else {
				JOptionPane.showMessageDialog(null, "Incorrect.");
			}
		
		String guess4=JOptionPane.showInputDialog("What gets wetter and wetter the more it dries?");
		if(guess4.equals(AnswerFourth)) {
		score ++;
		JOptionPane.showMessageDialog(null, "Correct! You did good!");
		}
	else {
		JOptionPane.showMessageDialog(null, "Incorrect.");
	}
	
	}
	
JOptionPane.showMessageDialog(null, "You did well, great job! Your score is " + score);
}
}
