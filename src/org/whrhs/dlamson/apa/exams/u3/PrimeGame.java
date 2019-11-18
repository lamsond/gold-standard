package org.whrhs.dlamson.apa.exams.u3;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class PrimeGame extends JFrame{
	
	public PrimeGame() {
		PrimePanel panel = new PrimePanel();
		add(panel);
		setSize(PrimePanel.W, PrimePanel.H);
		setTitle("Prime Number Challenge");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			PrimeGame game = new PrimeGame();
			game.setVisible(true);
		});
	}

}
