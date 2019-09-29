import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String other=JOptionPane.showInputDialog("When's your birthday? (mm/dd)");
		
		String birthday="9/22";
		
	if(other.equals(birthday)) {
		
		JOptionPane.showMessageDialog(null, "Wow, your birthday is today? Happy Birthday! ");
	}
	else {
		JOptionPane.showMessageDialog(null, "Ok. Bye. *walks away*");
	}
}
}
