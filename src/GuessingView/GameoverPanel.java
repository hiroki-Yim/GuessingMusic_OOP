package GuessingView;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class GameoverPanel extends JPanel{

	private JButton [] buttons = new JButton[2];
	ImageIcon i = new ImageIcon("src/img/Thxforplaying.jpg");
	
	public GameoverPanel() {
		setLayout(null);
		
		buttons[0] = new JButton("ExitWhite") { // Exit button with White background 
			ImageIcon i = new ImageIcon("src/img/Exit_White.png");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 64, 64, null);
			}
		};
		
		buttons[0].setBounds(740, 0, 64, 64); // Exit button
		
		MainFrame.resetBtn(buttons);
		for(int i = 0; i<buttons.length; i++) {
			add(buttons[i]);
		}
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(i.getImage(), 0, 0, 800, 600, null);
	}
}
