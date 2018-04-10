package GuessingView;

import java.awt.CardLayout;

import javax.swing.JPanel;

public class Layout extends JPanel{

	private CardLayout card = new CardLayout();
	
	StartPanel startPanel;
	PlayPanel playPanel;
	AnswerPanel answerPanel;
	
	public Layout() {
		
		startPanel = new StartPanel();
		playPanel = new PlayPanel();
		answerPanel = new AnswerPanel();
	
		this.setLayout(card);
		
		this.add(startPanel, "main");
		this.add(playPanel, "play");
		this.add(answerPanel, "answer");
		
		this.setFocusable(true);
		
		
	}
}
