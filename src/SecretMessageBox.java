import javax.swing.JOptionPane;


public class SecretMessageBox {
	public static void main(String[] args) {
		String password="iwillgetthiswrong";
		JOptionPane.showMessageDialog(null, "User, this is an important message! Please do not click out.");
		JOptionPane.showMessageDialog(null, "You're still there? Good. Click OK.");
		String answer=JOptionPane.showInputDialog("Now that you're listening, tell me your dark secret~");
		JOptionPane.showMessageDialog(null, "Wow, who knew you kept something like this?");
		JOptionPane.showMessageDialog(null, "Don't worry, your secret is safe with me. Now you can take your leave and let the second user come along.");
		JOptionPane.showMessageDialog(null, "... has the User 1 left yet?");
		JOptionPane.showMessageDialog(null, "... still making sure!");
		JOptionPane.showMessageDialog(null, "Hello, user 2, today is your special day!");
		JOptionPane.showMessageDialog(null, "You will get the chance to guess the first user's dark secret. (Sorry, user 1!)");
		JOptionPane.showMessageDialog(null, "All you need to do is type the password.");
		JOptionPane.showMessageDialog(null, "Yes, a password! Did you think it would be free?");
		String attempt=JOptionPane.showInputDialog("Now, type your guess here. Make it count!");
			JOptionPane.showMessageDialog(null,  "You got the password right! Here is user 1's dark secret: "+ answer +" :Yep, it's true!");
		
		}
	}

//SECRET: EVERY PASSWORD WORKS! SO TECHNICALLY USER 1'S SECRET WILL BE FOUND ANYWAY!