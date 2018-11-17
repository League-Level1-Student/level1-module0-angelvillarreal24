/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
                String x = "https://t5.rbxcdn.com/75fa5ba942d1ed749182425d14ea8401";
		// 2. create a variable of type "Component" that will hold your image
                Component c;
		// 3. use the "createImage()" method below to initialize your Component
                c = createImage(x);
		// 4. add the image to the quiz window
                quizWindow.add(c);
		// 5. call the pack() method on the quiz window
                quizWindow.pack();
		// 6. ask a question that relates to the image
                String ans = JOptionPane.showInputDialog("What is this twitch emote? hint: it may be Omega_LUL, Feelsbadman, or 4head.");
		// 7. print "CORRECT" if the user gave the right answer
                if(ans.equalsIgnoreCase("Omega_LUL")) {
                	System.out.println("CORRECT!!!");
                }
		// 8. print "INCORRECT" if the answer is wrong
                else {
                	System.out.println("INCORRECT!");
                }
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
                quizWindow.remove(c);
		// 10. find another image and create it (might take more than one line of code)
                String y = "https://www.google.com/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwiJt6OtkdzeAhWrwVQKHZsaBLsQjRx6BAgBEAU&url=http%3A%2F%2Fwww.stickpng.com%2Fimg%2Fmemes%2Fpepe-the-frog%2Fsad-pepe-feelsbadman&psig=AOvVaw0UdtvoTVY7eY3kEK7HHJDG&ust=1542568366334904";
                Component f;
                f = createImage(y);
		// 11. add the second image to the quiz window
                
		// 12. pack the quiz window
                quizWindow.pack();
		// 13. ask another question
                String anz = JOptionPane.showInputDialog("What is this emote? hint: it may be feelsbadman, feelsgoodman, or 4head.");
		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





