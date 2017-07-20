package exo4;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Fenetre extends JFrame {
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				Fenetre frame = new Fenetre();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public Fenetre() {
		this.setTitle("Ma première fenêtre Java");
		this.setSize(100, 150);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new Panneau());
		this.setVisible(true);
	}
}