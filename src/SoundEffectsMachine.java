import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();

	public static void main(String[] args) {
		new SoundEffectsMachine().createUI();
	}

	private void createUI() {
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.add(panel);
		frame.setVisible(true);

		button1.setText("Woooohooo!");
		button2.setText("bummmm...");
		button3.setText("tinnnng....");
		button4.setText("Hehehe..");

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);

		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();

		buttonPressed.getName();

		if (buttonPressed.equals(button1)) {
			playSound("homer-woohoo.wav");
		} else if (buttonPressed.equals(button2)) {
			playSound("drum.wav");
		} else if (buttonPressed.equals(button3)) {
			playSound("cymbal.wav");
		} else if (buttonPressed.equals(button4)) {
			playSound("laugh.wav");
		}

	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
