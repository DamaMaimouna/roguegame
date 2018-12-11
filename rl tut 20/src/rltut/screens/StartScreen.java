package rltut.screens;

import java.awt.event.KeyEvent;
import javax.swing.*;

import asciiPanel.AsciiPanel;

public class StartScreen implements Screen {
	
	
	@Override
	public void displayOutput(AsciiPanel terminal) {

		
		terminal.write("***************Roguelike***************", 1, 1);
		
		//terminal.createImage(100, 200);
		//terminal.repaint();
		///terminal.prepareImage("b.jpg", 20, 20, ImageObserver );
		terminal.writeCenter("-- press [enter] to start --", 22);
		System.out.println("Appuyer sur entrer pour comnencer le jeu");
		System.out.println("Bonne partie  Roguelike !!!!!!!");
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_ENTER ? new PlayScreen() : this;
	}
}
