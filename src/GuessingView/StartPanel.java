package GuessingView;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartPanel extends JPanel {
	JButton [] buttons = new JButton[3];
	JLabel TitleLb = new JLabel();
	ImageIcon i = new ImageIcon("src/img/guessing_music_background.jpg");	//background 
	
	
	public StartPanel() {
		setLayout(null);		//default Layout reset

		buttons[0] = new JButton("Start") {
			ImageIcon i = new ImageIcon("src/img/startbutton.png");
			
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 318, 120, null);
			}
		};
		
		buttons[1] = new JButton("info") { // information button
			ImageIcon i = new ImageIcon("src/img/Information-icon.png");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 70, 70, null);
			}
		};
		
		buttons[2] = new JButton("ExitWhite") { // Exit button with White background 
			ImageIcon i = new ImageIcon("src/img/Exit_White.png");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 64, 64, null);
			}
		};
		
		MainFrame.resetBtn(buttons);	//등록된 버튼들 죄다 기능 추가 
		for(int i = 0; i<buttons.length; i++) {
			add(buttons[i]);
		}
		////////////////////////////////////buttons/////////////////////////////////////
		buttons[0].setBounds(350, 450, 318, 120);		// start button 위치 및 크기
		buttons[1].setBounds(700, 480, 70, 70); // info buttonW
		buttons[2].setBounds(740, 0, 64, 64); // Exit button
		////////////////////////////////////buttons/////////////////////////////////////
		
		/////////////////////////////////////label///////////////////////////////////////
		
		TitleLb = new JLabel() {
			ImageIcon i = new ImageIcon("src/img/guessing_game_logo.png");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 295, 155, null);
			}
		};
		
		TitleLb.setBounds(300, 100, 295, 155); //Title logo absolute position set
		add(TitleLb);
		
		/////////////////////////////////////label///////////////////////////////////////
	}
	
	public void paintComponent(Graphics g) {// background 부분의 함수 선언해두면 실행됨
		g.drawImage(i.getImage(), 0, 0, 800, 600, null);
	}
}
