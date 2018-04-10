package GuessingView;

import java.awt.Graphics;

import javax.swing.*;

public class GuessingMusic_View extends JFrame {

	private JFrame frame;
	private JPanel[] panel = new JPanel [10];
	private JButton[] button = new JButton[10];
	private JLabel label; 
	private JTextField Tfield;
	private JTextArea Tarea;
	
	public GuessingMusic_View() {
		
		/////
		panel[0] = new JPanel() { // panel에 들어가는 background
			ImageIcon i = new ImageIcon("src/img/guessing_music_background.jpg");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 800, 600, null);
			}
		};

		panel[1] = new JPanel() {
			ImageIcon i = new ImageIcon("src/img/music_listning.jpg");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 800, 600, null);
			}
		};		

		panel[2] = new JPanel() {
			ImageIcon i = new ImageIcon("src/img/answer_background.png");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 800, 600, null);
			}
		};
		
		panel[3] = new JPanel() {
			ImageIcon i = new ImageIcon("src/img/answer_background.png");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 800, 600, null);
			}
		};
		
		panel[4] = new JPanel() {
			ImageIcon i = new ImageIcon("src/img/Thxforplaying.jpg");
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 800, 600, null);
			}
		};
		panel[5] = new JPanel() {	//info_1 panel
			ImageIcon i = new ImageIcon("src/img/info_1.png");
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 794, 565, null);
			}
		};
		panel[6] = new JPanel() {	//info_2 panel
			ImageIcon i = new ImageIcon("src/img/info_2.png");
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 794, 565, null);
			}
		};
		/////
	}
}
