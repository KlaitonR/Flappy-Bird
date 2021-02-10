package entities;

//import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import main.Game;

public class Tubo extends Entity{
	
	public int tb = 0;

	public Tubo(double x, double y, int width, int height, double speed, BufferedImage sprite) {
		super(x, y, width, height, speed, sprite);
	
	}
	
	public void tick() {
		x--;
		if(x+width <= 0 ) {
			Game.entities.remove(this);
			return;
		}
	}
	
	public void render(Graphics g) {
		
		int h = height/16;
		
		if(this.tb == 1) {
			if(h != 0) {
				for(int i = 0; i < h; i++) {
					if(i<h) {
						g.drawImage(Entity.TUBO_NORMAL, this.getX(), (16*i) - 16, null);
					}
				}
			}else {
				g.drawImage(Entity.TUBO1, this.getX(), 0, null);
			}
			g.drawImage(Entity.TUBO1, this.getX(), (16*h) - 16, null);
			
		}else {
			if(h != 0) {
				for(int i = 0; i < h; i++) {
					if(i<h) {
						g.drawImage(Entity.TUBO_NORMAL, this.getX(), Game.HEIGHT - 16*i, null);
					}
				}
			}else {
				g.drawImage(Entity.TUBO2, this.getX(), Game.HEIGHT - 16, null);
			}
			g.drawImage(Entity.TUBO2, this.getX(), Game.HEIGHT - 16*h, null);
		}
		
//		g.setColor(Color.black);
//		g.fillRect(this.getX(), this.getY(), width, height);
		
	}

}
