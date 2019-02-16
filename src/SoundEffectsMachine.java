import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button1 = new JButton();
		JButton	button2 = new JButton();
		JButton	button3 = new JButton();
		JButton	button4 = new JButton();
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.add(panel);
		frame.setVisible(true);
		
		button1.setText("Reeeee!");
		button2.setText("Haha!");
		button3.setText("FeelsBadMan.");
		button4.setText("Why?");
		frame.pack();
	}
}
