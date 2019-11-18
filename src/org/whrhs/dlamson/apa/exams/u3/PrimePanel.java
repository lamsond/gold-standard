package org.whrhs.dlamson.apa.exams.u3;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrimePanel extends JPanel implements ActionListener{
	public static final int W = 300;
	public static final int H = 300;
	
	private JButton enterBtn = new JButton("ENTER");
	private JLabel previousLab = new JLabel("Previous Prime: ");
	private JLabel primeLab = new JLabel("Enter Prime: ");
	private JLabel scoreLab = new JLabel("Score: ");
	private JTextField primeField = new JTextField(5);
	
	private PrimeRound round = new PrimeRound();
	
	public PrimePanel() {
		setSize(W, H);
		setBackground(Color.ORANGE);
		add(previousLab);
		add(primeLab);
		add(primeField);
		add(scoreLab);
		enterBtn.addActionListener(this);
		add(enterBtn);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int answer = Integer.parseInt(primeField.getText());
		if(!round.isGameOver())
			round.playRound(answer);
		updateScreen();
	}
	
	public void updateScreen(){
		primeLab.setText("Previous Prime: " + round.getPrime());
		scoreLab.setText("Score: " + round.getScore());
	}
	
}
