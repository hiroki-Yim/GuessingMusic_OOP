package GuessingView;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
	StartPanel startPanel;
	PlayPanel playPanel;
	AnswerPanel answerPanel;
	
	Layout cardPanel;
	
	public static void resetBtn(JButton[] buttons) {		//Panel마다 버튼속성 입히기(호출해서 사용가능)
		for(int i=0; i < buttons.length; i++) {
			buttons[i].setContentAreaFilled(false);
			buttons[i].setBorderPainted(false);
			buttons[i].setFocusPainted(false);	
			//나중에 여기다가 더 필요한거 넣을수도 있겠지???
		}//쓸떄는
	}/*for(JButton btn : buttons) {	고수}*/

	public MainFrame() {
/*		startPanel = new StartPanel();		playPanel = new PlayPanel();		answerPanel = new AnswerPanel();*/
		
		cardPanel = new Layout(); // setting cardlayout display
		
		this.add(cardPanel);        //this.add(startPanel);//this.add(playPanel); 을 다 포함하는 Panel을 만든 것
	
		
		setTitle("Guessing Music!");
		setSize(800, 600); // 화면 해상도
		setResizable(false); // 화면 크기 고정
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new MainFrame();
	}
}
