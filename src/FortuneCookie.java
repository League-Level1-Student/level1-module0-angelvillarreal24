import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {

	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();
	}

	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		button.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "The fortune you seek is in another cookie.");
		} else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "A closed mouth gathers no feet.");
		} else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "A conclusion is simply the place where you got tired of thinking.");
		} else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "A foolish man listens to his heart.");
		} else {
			JOptionPane.showMessageDialog(null, "You will die alone and poorly dressed.");
		}

	}

}
