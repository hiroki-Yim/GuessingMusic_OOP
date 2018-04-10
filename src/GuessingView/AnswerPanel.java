package GuessingView;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AnswerPanel extends JPanel{

	private JButton [] buttons = new JButton[2];
	private JLabel Answer = new JLabel();
	ImageIcon i = new ImageIcon("src/img/answer_background.png");

	public AnswerPanel() {
		setLayout(null);
		
		buttons[0] = new JButton("ExitWhite") { // Exit button with White background 
			ImageIcon i = new ImageIcon("src/img/Exit_White.png");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 64, 64, null);
			}
		};
		
		buttons[1] = new JButton("Retry") { // Retry button
			ImageIcon i = new ImageIcon("src/img/RetryButton.png");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 64, 64, null);
			}
		};
		
		buttons[0].setBounds(740, 0, 64, 64); // Exit button
		buttons[1].setBounds(732, 500, 64, 64); // Retry button

		
		MainFrame.resetBtn(buttons);
		for(int i = 0; i<buttons.length; i++) {
			add(buttons[i]);
		}
		
	}
}
