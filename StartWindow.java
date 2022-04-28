import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartWindow{
	StartWindow(){
		JFrame frame = new JFrame();
		
		frame.setSize(420, 420);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Welcome(frame);
		
	}
	public void Menu(JFrame frame){
		JPanel panel1 = new JPanel();

		JTextField text1= new JTextField();
		JTextField text2= new JTextField();
		JButton button1= new JButton();
		JButton button2= new JButton();
		
		panel1.setLayout(null);
		panel1.setSize(420, 420);
		panel1.setBackground(new Color(212, 190, 190));
		
		text1.setText("With friends");
		text1.setBackground(new Color(212, 190, 190));
		text1.setBounds(140, 60, 65, 40);
		text1.setBorder(null);
		text1.setFocusable(false);
		text1.setEditable(false);
		
		text2.setText("With AI");
		text2.setBackground(new Color(212, 190, 190));
		text2.setBounds(140, 132, 65, 40);
		text2.setBorder(null);
		text2.setEditable(false);
		text2.setFocusable(false);
		
		//With friend
		button1.setBounds(140, 100, 85, 32);
		button1.setBackground(new Color(212, 190, 190));
		button1.setFocusable(false);
		button1.addActionListener(new ActionListener() {
				@Override
			public void actionPerformed(ActionEvent a) {
				if(a.getSource() == button1) {
					frame.dispose();
					new TTT_1();
				}
			
			}
			
		});
		button1.setBorder(new RoundedBorder(10));
		button1.setText("1 VS 1");
		
		//AI
		button2.setBounds(140, 172, 75, 32);
		button2.setBackground(new Color(212, 190, 190));
		button2.setFocusable(false);
		button2.addActionListener(new ActionListener() {
				@Override
			public void actionPerformed(ActionEvent b) {
				if(b.getSource() == button2) {
					frame.dispose();
					new TTT_2();
				}
				
			}
			
		});
		button2.setBorder(new RoundedBorder(10));
		button2.setText("AI");
		
		panel1.add(text1);
		panel1.add(text2);
		panel1.add(button1);
		panel1.add(button2);	
		frame.add(panel1);
		frame.setVisible(true);
	}
	
	public void Welcome(JFrame frame) {
		JPanel panel2= new JPanel();
		JTextArea textArea= new JTextArea();
		JButton button3= new JButton();
		frame.setSize(420, 420);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel2.setLayout(null);
		panel2.setSize(420, 420);
		panel2.setBackground(new Color(212, 190, 190));
		
		
		
		textArea.setBounds(80, 50, 320, 100);
		textArea.setBorder(null);
		textArea.setText("Welcome to TicTacToe, please press continue.");
		textArea.setBackground(new Color(212, 190, 190));
		textArea.setEditable(false);
		textArea.setFocusable(false);
		
		button3.setBounds(155, 300, 100, 55);
		button3.setBackground(new Color(212, 190, 190));
		button3.setBorder(new RoundedBorder(10));
		button3.setFocusable(false);
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() ==button3) {
					Menu(frame);
					panel2.setVisible(false);
				}
			}
		});
		button3.setText("Continue");
		
		
		panel2.add(textArea);
		panel2.add(button3);
		
		frame.add(panel2);
		frame.setVisible(true);
	}
}
