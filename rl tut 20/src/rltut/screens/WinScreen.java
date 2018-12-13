package rltut.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class WinScreen implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println("Bravooooooooo Vous avez gagn�!!!!!!!!!!!!!!");
		
		terminal.write("Felicitations.", 1, 1);
		
		System.out.println("-----Appuyez entrer pour redemarrer----.");
		terminal.writeCenter("-- appuyer entrer pour une nouvelle partie --", 22);
		
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_ENTER ? new PlayScreen() : this;
	}
}
