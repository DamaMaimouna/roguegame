package rltut.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class WinScreen implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println("Bravooooooooo Vous avez gagn�!!!!!!!!!!!!!!");
		
		terminal.write("You won.", 1, 1);
		
		System.out.println("-----Appuyez entrer pour redemarrer----.");
		terminal.writeCenter("-- press [enter] to restart --", 22);
		
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_ENTER ? new PlayScreen() : this;
	}
}
