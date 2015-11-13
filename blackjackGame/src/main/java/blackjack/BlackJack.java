package blackjack;

import blackjack.ui.MainWindow;


public class BlackJack 
{
	// main method
    public static void main( String[] args )
    {
    	BlackJack game = new BlackJack();
    	game.initialize();    	
    }
    
    private void initialize() {
    	// setup GUI
    	MainWindow window = new MainWindow();
    	window.createStartScreen();
    }
}
