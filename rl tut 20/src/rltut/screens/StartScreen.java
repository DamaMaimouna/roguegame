package rltut.screens;

import java.awt.event.KeyEvent;
import javax.swing.*;

import asciiPanel.AsciiPanel;

public class StartScreen implements Screen {
	
	
	@Override
	public void displayOutput(AsciiPanel terminal) {

		
		terminal.write("***********************************************", 1, 1);
		terminal.write("*********************************************", 2, 2);
		terminal.write("*******************************************", 3, 3);
		terminal.write("*****************************************", 4, 4);
		terminal.write("***************************************", 5, 5);
		terminal.write("*************************************", 6, 6);
		
		terminal.write("******************* Roguelike *****************", 1, 1);
		//terminal.createImage(100, 200);
		//terminal.repaint();
		///terminal.prepareImage("b.jpg", 20, 20, ImageObserver );
		terminal.writeCenter("-- appuyer [enter] pour commencer --", 22);
		System.out.println("Appuyer sur entrer pour comnencer le jeu");
		System.out.println("Bonne partie  Roguelike !!!!!!!");
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_ENTER ? new PlayScreen() : this;
	}
}
