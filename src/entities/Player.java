package entities;

import java.awt.image.BufferedImage;

import main.Game;
import world.World;


public class Player extends Entity{
	
	public boolean isPressed;
	
	public Player(int x, int y, int width, int height,double speed,BufferedImage sprite) {
		super(x, y, width, height,speed,sprite);
		depth = 2;
	}
	
	public void tick(){
	
		if(!isPressed) {
			y+=2;
		}else {
			y-=2;
		}
		
		if(x+20 < Game.entities.get(Game.entities.size() - 1).getX()) {
			Game.score++;
		}
		
		
		
		if(y > Game.WIDTH) {
			World.restartGame();
		}
		
		for(int i =0; i < Game.entities.size(); i++) {
			Entity e = Game.entities.get(i);
			if(e != this) {
				if(Entity.isColidding(this, e)) {
					World.restartGame();
					return;
				}
			}
		}
		
	}

	

	


}
