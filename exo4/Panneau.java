package exo4;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panneau extends JPanel {
	@Override
	public void paintComponent(Graphics g) {
		// Vous verrez cette phrase chaque fois que la m�thode sera invoqu�e
		System.out.println("Je suis ex�cut�e !");
		g.fillOval(20, 20, 75, 75);
	}
}