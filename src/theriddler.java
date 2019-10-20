import javax.swing.JOptionPane;

public class theriddler {
	public static void main(String[] args) {
	int score = 0;
	String username=JOptionPane.showInputDialog("Hello user! Welcome to Today's Goal. Please enter your username:");
	JOptionPane.showMessageDialog(null, "Today, " + username + ", we will be giving you riddles and your goal is to answer them right!");
	JOptionPane.showMessageDialog(null, "If you get one right, you get a point. If not, no point. There are 4 riddles total every time.");
	String guess1=JOptionPane.showInputDialog("First Riddle: Who makes it, has no need for it. Who buys it, has no use for it. Who uses it can neither see nor feel it. What is it?");
	
}
}