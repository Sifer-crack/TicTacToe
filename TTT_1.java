import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;

public class TTT_1{
	int Score_P1 = 0;
	int Score_P2 = 0;
	int turn = 1;
	
	boolean player1turn = false;
	boolean player2turn = false;
	
	Icon cross = new ImageIcon("cross.png");
	Icon circle = new ImageIcon("circle.png");
	
	JFrame frame = new JFrame();
	JTextField scoreTextP1 = new JTextField();
	JTextField scoreTextP2 = new JTextField();
	JTextField scoreP1 = new JTextField();
	JTextField scoreP2 = new JTextField();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	JButton menu = new JButton();
	JButton next = new JButton();
	JPanel panel = new JPanel();
	
	
	
	TTT_1(){
		frame.setSize(620, 620);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setResizable(false);
		
		panel.setLayout(null);
		panel.setSize(620, 620);
		panel.setBackground(new Color(212, 190, 190));
		
		
		
		scoreP1.setBounds(190, 50, 75, 50);
		scoreP1.setText("Player 1: " + Score_P1);
		scoreP1.setBackground(new Color(212, 190, 190));
		scoreP1.setBorder(null);
		scoreP1.setEditable(false);
		scoreP1.setFocusable(false);
		
		scoreP2.setBounds(374, 50, 75, 50);
		scoreP2.setText("Player 2: " + Score_P2);
		scoreP2.setBackground(new Color(212, 190, 190));
		scoreP2.setBorder(null);
		scoreP2.setEditable(false);
		scoreP2.setFocusable(false);

		button1.setBounds(190, 140, 75, 75);
		button1.setBackground(Color.white);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent a) {
				if(a.getSource() == button1) {
					if(turn % 2 == 0) {
						button1.setIcon(cross);	
						turn++;
						button1.setEnabled(false);
					}
					else {
						button1.setIcon(circle);	
						turn++;
						button1.setEnabled(false);
					}	
				}
			}
		});
		
		button2.setBounds(275, 140, 75, 75);
		button2.setBackground(Color.white);
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent b) {
				if(b.getSource() == button2) {
					if(turn % 2 == 0) {
						button2.setIcon(cross);	
						turn++;
						button2.setEnabled(false);
					}
					else {
						button2.setIcon(circle);	
						turn++;
						button2.setEnabled(false);
					}
				}
			}
		});
		
		button3.setBounds(360, 140, 75, 75);
		button3.setBackground(Color.white);
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent c) {
				if(c.getSource() == button3) {
					if(turn % 2 == 0) {
						button3.setIcon(cross);	
						turn++;
						button3.setEnabled(false);
					}
					else {
						button3.setIcon(circle);	
						turn++;
						button3.setEnabled(false);
					}	
				}
			}
		});
		
		button4.setBounds(190, 225, 75, 75);
		button4.setBackground(Color.white);
		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent d) {
				if(d.getSource() == button4) {
					if(turn % 2 == 0) {
						button4.setIcon(cross);	
						turn++;
						button4.setEnabled(false);
					}
					else {
						button4.setIcon(circle);	
						turn++;
						button4.setEnabled(false);
					}	
				}
			}
		});
		
		button5.setBounds(275, 225, 75, 75);
		button5.setBackground(Color.white);
		button5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button5) {
					if(turn % 2 == 0) {
						button5.setIcon(cross);	
						turn++;
						button5.setEnabled(false);
					}
					else {
						button5.setIcon(circle);	
						turn++;
						button5.setEnabled(false);
					}	
				}
			}
		});
		
		button6.setBounds(360, 225, 75, 75);
		button6.setBackground(Color.white);
		button6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent f) {
				if(f.getSource() == button6) {
					if(turn % 2 == 0) {
						button6.setIcon(cross);	
						turn++;
						button6.setEnabled(false);
					}
					else {
						button6.setIcon(circle);	
						turn++;
						button6.setEnabled(false);
					}	
				}
			}
		});
		
		button7.setBounds(190, 310, 75, 75);
		button7.setBackground(Color.white);
		button7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent g) {
				if(g.getSource() == button7) {
					if(turn % 2 == 0) {
						button7.setIcon(cross);	
						turn++;
						button7.setEnabled(false);
					}
					else {
						button7.setIcon(circle);	
						turn++;
						button7.setEnabled(false);
					}
				}
			}
		});
		
		button8.setBounds(275, 310, 75, 75);
		button8.setBackground(Color.white);
		button8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent h) {
				if(h.getSource() == button8) {
					if(turn % 2 == 0) {
						button8.setIcon(cross);	
						turn++;
						button8.setEnabled(false);
					}
					else {
						button8.setIcon(circle);	
						turn++;
						button8.setEnabled(false);
					}	
				}
				
			}
			
		});
		
		button9.setBounds(360, 310, 75, 75);
		button9.setBackground(Color.white);
		button9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent i) {
				if(i.getSource() == button9) {
					if(turn % 2 == 0) {
						button9.setIcon(cross);	
						turn++;
						button9.setEnabled(false);
					}
					else {
						button9.setIcon(circle);	
						turn++;
						button9.setEnabled(false);
					}	
				}	
			}	
		});
		
		menu.setBounds(1, 1, 65, 65);
		menu.setFocusable(false);
		menu.setText("Menu");
		menu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent j) {
				if(j.getSource() == menu) {
					StartWindow menu = new StartWindow();
					frame.dispose();
					menu.Menu(frame);

					
				}
			}
		});
		
		next.setBounds(420, 400, 65, 25);
		next.setFocusable(false);
		next.setText("Start");
		next.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent k) {
				System.out.println("hello");
				
			}
			
		});
		
		panel.add(scoreP1);
		panel.add(scoreP2);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(menu);
		panel.add(next);
		frame.add(panel);
		frame.setVisible(true);
		
		if(turn % 2 == 0) {
			scoreP1.setForeground(Color.RED);
		}
		else {
			scoreP2.setForeground(Color.RED);
		}
		if(turn >= 9) {
			next.setText("Finish");
		}
	}
}