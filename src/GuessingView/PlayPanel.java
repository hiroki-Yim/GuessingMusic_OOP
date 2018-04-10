package GuessingView;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PlayPanel extends JPanel{

	private JButton buttons[] = new JButton[2];
	ImageIcon i = new ImageIcon("src/img/music_listning.jpg");
	
	public PlayPanel() {
		
		setLayout(null);
		
		buttons[0] = new JButton("play") { // play music button
			ImageIcon i = new ImageIcon("src/img/playbutton2.png");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 147, 147, null);
			}
		};
		
		buttons[1] = new JButton("ExitBlack") { // Exit button
			ImageIcon i = new ImageIcon("src/img/Exit_Black.png");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 64, 64, null);
			}
		};
		
		MainFrame.resetBtn(buttons);		//buttons seting
		for(int i = 0; i<buttons.length; i++) {
			add(buttons[i]);
		}
		buttons[0].setBounds(100, 350, 147, 147); // music player button
		buttons[1].setBounds(740, 0, 64, 64);		//Exit button
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(i.getImage(), 0, 0, 800, 600, null);
	}
	
}
