
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {

	// 0. You can use the celebrity photos we have placed in the default java
	// package,
	// or if you prefer, get celebrity photos from the Internet, place them in the
	// default
	// package, and change the names below.

	String firstImage = "src/arnold.jpeg";
	String secondImage = "src/leonardo.jpeg";
	String thirdImage = "src/morgan.jpeg";
	String fourthImage = "src/jack.jpeg";

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	private void startQuiz() {
		// 1. Make an int variable to hold the score.
		int counter = 0;
		initializeGui();

		String guess = JOptionPane.showInputDialog("Who is this? Only type in his first name.");

		if (guess.equalsIgnoreCase("Arnold")) {
			JOptionPane.showMessageDialog(null, "You got it right!!!");

			counter += 1;
		} else {
			JOptionPane.showMessageDialog(null, "OmegaLUL you got it wrong.");
		}
		JOptionPane.showMessageDialog(null, "Your current score is " + counter + ".");
		showNextImage();

		guess = JOptionPane.showInputDialog("Who is this? Only type in his first name.");

		if (guess.equalsIgnoreCase("leonardo")) {
			JOptionPane.showMessageDialog(null, "You got it right!!!");

			counter += 1;
		} else {
			JOptionPane.showMessageDialog(null, "OmegaLUL you got it wrong.");
		}
		JOptionPane.showMessageDialog(null, "Your current score is " + counter + ".");
		showNextImage();

		guess = JOptionPane.showInputDialog("Who is this? Only type in his first name.");

		if (guess.equalsIgnoreCase("morgan")) {
			JOptionPane.showMessageDialog(null, "You got it right!!!");

			counter += 1;
		} else {
			JOptionPane.showMessageDialog(null, "OmegaLUL you got it wrong.");
		}
		JOptionPane.showMessageDialog(null, "Your current score is " + counter + ".");
		showNextImage();

		guess = JOptionPane.showInputDialog("Who is this? Only type in his first name.");

		if (guess.equalsIgnoreCase("Jack")) {
			JOptionPane.showMessageDialog(null, "You got it right!!!");

			counter += 1;
		} else {
			JOptionPane.showMessageDialog(null, "OmegaLUL you got it wrong.");
		}
		JOptionPane.showMessageDialog(null, "Your current score is " + counter + ".");
		showNextImage();



	}

	public void showNextImage() {
		panel.removeAll();
		panel.add(getNextImage());
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);

		// 3. Change the size of the window so that you can only see part of the image.
		frame.setSize(250, 125);

		showNextImage();

	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		return label;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(fourthImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		System.exit(0);
		return new JLabel();
	}
}
