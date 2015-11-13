package blackjack.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener {
	
	private MainWindow _mainWindow;

	public EventHandler(MainWindow mainWindow) {
		_mainWindow = mainWindow;
	}
	
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "startGame":
			_mainWindow.createGameScreen();
			break;

		default:
			break;
		}
	}

}
