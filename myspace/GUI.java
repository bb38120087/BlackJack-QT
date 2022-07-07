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
	
	