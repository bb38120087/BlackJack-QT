package blackjack2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JFrame {
	int aW = 1280;
	int aH = 800;
	
	//色
	Color colorBackground = new Color(39, 119, 20); //背景
	Color colorButton = new Color(204, 204, 0);
	
	//フォント
	Font fontButton = new Font("Times New Roman", Font.PLAIN, 30);	
	//ボタン
	JButton bHit = new JButton();
	JButton bStay = new JButton();
	JButton bYes = new JButton();
	JButton bNo = new JButton();
	
	public GUI() {
		this.setSize(aW+6, aH+29);
		this.setTitle("BlackJack");
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Board board = new Board();
		this.setContentPane(board);
		
		bHit.setBounds(400, 400, 120, 80);
		bHit.setBackground(colorButton);
		bHit.setFont(fontButton);
		bHit.setText("HIT");
		board.add(bHit);
		this.setLayout(null);
	}
	
	public class Board extends JPanel {
		public void paintComponent(Graphics g) {
			g.setColor(colorBackground);
			g.fillRect(0, 0, aW, aH);
		}
	}
	
	public class ActHit implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自動生成されたメソッド・スタブ
			
		}
		
	}
}