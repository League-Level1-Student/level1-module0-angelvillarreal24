import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JackInTheBox implements ActionListener {

	int buttonP = 0;
	String woohoo = "homer-woohoo.wav";

	public static void main(String[] args) {
		new JackInTheBox().createUI();
	}

	JButton button = new JButton();

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	private void createUI() {
		frame.add(panel);
		frame.setVisible(true);
		button.setText("Suprise");
		button.addActionListener(this);
		panel.add(button);
		frame.pack();
		frame.setTitle("Jack-In-The-Box");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();

		buttonPressed.getName();
		if (buttonPressed.equals(button)) {
			buttonP++;
		}
		if (buttonP == 5) {
			showPicture("jackInTheBox.png");
			playSound(woohoo);
		}

	}

	private void showPicture(String fileName) {
		try {
			JLabel imageLabel = createLabelImage(fileName);
			JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private JLabel createLabelImage(String fileName) {
		try {
			URL imageURL = getClass().getResource(fileName);
			if (imageURL == null) {
				System.err.println("Could not find image " + fileName);
				return new JLabel();
			} else {
				Icon icon = new ImageIcon(imageURL);
				JLabel imageLabel = new JLabel(icon);
				return imageLabel;
			}
		} catch (Exception e) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
	}

	private void playSound(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
