import java.awt.Color;

import javax.swing.*;

public class TTT_2 {
	int Score_P1 = 0;
	int Score_P2 = 0;
	int turn = 1;
	
	boolean player1turn = false;
	boolean player2turn = false;
	
	Icon cross = new ImageIcon("cross.png");
	Icon circle = new ImageIcon("circle.png");
	
	JFrame frame = new JFrame();
//	JTextField scoreTextP1 = new JTextField();
//	JTextField scoreTextP2 = new JTextField();
//	JTextField scoreP1 = new JTextField();
//	JTextField scoreP2 = new JTextField();
//	JButton button1 = new JButton();
//	JButton button2 = new JButton();
//	JButton button3 = new JButton();
//	JButton button4 = new JButton();
//	JButton button5 = new JButton();
//	JButton button6 = new JButton();
//	JButton button7 = new JButton();
//	JButton button8 = new JButton();
//	JButton button9 = new JButton();
//	JButton menu = new JButton();
//	JButton next = new JButton();
	JPanel panel = new JPanel();
	JTextField text = new JTextField();
	
	TTT_2(){
		frame.setSize(620, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		panel.setLayout(null);
		panel.setSize(620, 620);
		panel.setBackground(new Color(212, 190, 190));
		
		
		text.setBounds(310, 310, 100, 50);
		text.setText("TicTacToe with an AI");
		text.setBorder(null);
		
		panel.add(text);
		frame.add(panel);
		frame.setVisible(true);
	}
}
