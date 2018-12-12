package rltut.screens;

import java.awt.event.KeyEvent;

import rltut.Creature;

import asciiPanel.AsciiPanel;

public class LoseScreen implements Screen {
	private Creature player;
	
	public LoseScreen(Creature player){
		this.player = player;
	}
	
	@Override
	public void displayOutput(AsciiPanel terminal) {
		
		//////////game over////////////
		terminal.writeCenter("R.I.P.", 4);
		terminal.write("***********************************************************************************",1,1);
		terminal.writeCenter("----------------------------------", 5);
		terminal.writeCenter("-----------------------------------", 6);
		terminal.writeCenter("------Envie de retenter????????----", 7);
		terminal.writeCenter(player.causeOfDeath(), 5);
	    terminal.writeCenter("-- appuyer [entrer] pour rejouer --", 22);
	    System.out.println("game over");
	       String s= player.causeOfDeath(); 
	       System.out.println(s);
	       System.out.println("-- appuyer [entrer] pour rejouer --");
	
	
	}
	
	
//////si on appuie enter alors restart the game/////
	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_ENTER ? new PlayScreen() : this;
	}
}
