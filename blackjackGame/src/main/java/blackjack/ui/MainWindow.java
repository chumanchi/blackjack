
package blackjack.ui;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow {
	
	private JFrame _frame;
	private EventHandler _handler;
	
	public MainWindow() {
		_frame = new JFrame("Super awesome blackjack game!");
		_frame.setVisible(true);
		_frame.setMinimumSize(new Dimension(1000, 600));
		_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		_handler = new EventHandler(this);
	}
	
	public void createStartScreen() {
		JPanel panel = new JPanel();
		_frame.getContentPane().add(panel);
		
		JButton button = new JButton("Start new game");
		button.setActionCommand("startGame");
		panel.add(button);
		button.addActionListener(_handler);
	}
	
	public void createGameScreen() {
		clearWindow();
		JPanel panel = new JPanel();
		_frame.getContentPane().add(panel);
		
		JButton button = new JButton("shuffle");
		button.setActionCommand("shuffle");
		panel.add(button);
		button.addActionListener(_handler);
	}
	
	private void clearWindow() {
		_frame.getContentPane().removeAll();
		_frame.getContentPane().revalidate();
		_frame.getContentPane().repaint();
	}
	
}
