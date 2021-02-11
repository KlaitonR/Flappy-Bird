package entities;

//import java.awt.Color;
//import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import main.Game;
import world.World;

public class Player extends Entity{
	
	public boolean isPressed;
	public int cont;
	
	public BufferedImage subir;
	public BufferedImage descer;
	
	public Player(int x, int y, int width, int height,double speed,BufferedImage sprite) {
		super(x, y, width, height, speed, sprite);
		depth = 2;
		
		maskx = -2;
		masky = -2;
		maskw = 0;
		maskh = 4;
		
		x -= maskx;
		y -= masky;
		width -= maskw;
		height -= maskh;
		
		subir = Game.spritesheet.getSprite(0, 16, 16, 16);
		descer = Game.spritesheet.getSprite(0, 32, 16, 16);
		
	}
	
	public void tick(){
	
		if(!isPressed) {
			y+=2;
		}else {
			y-=2;
		}
		
		if(x+16 < Game.entities.get(Game.entities.size() - 1).getX()) {
			cont++;
			if(cont >= 3)
			Game.score++;
		}
		
		if(y > Game.WIDTH - 80 || y < 0) {
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

	
	public void render(Graphics g) {
		
//		Graphics2D g2 = (Graphics2D) g;
		
		if(!isPressed) {
			g.drawImage(descer, Game.player.getX(), Game.player.getY(), null);
//			g2.rotate(Math.toRadians(20), this.getX() + width/2 - maskx,this.getY() + height/2 - masky);
//			g2.drawImage(sprite, this.getX(), this.getY(), null);
//			g2.rotate(Math.toRadians(-20), this.getX() + width/2 - maskx,this.getY() + height/2 - masky);
		}else {
			g.drawImage(subir, Game.player.getX(), Game.player.getY(), null);
//			g2.rotate(Math.toRadians(-20), this.getX() + width/2 - maskx,this.getY() + height/2 - masky);
//			g2.drawImage(sprite, this.getX(), this.getY(), null);
//			g2.rotate(Math.toRadians(20), this.getX() + width/2 - maskx,this.getY() + height/2 - masky);
		}
		
//		g.setColor(Color.black);
//		g.fillRect(this.getX() - maskx, this.getY() - masky, width - maskw, height - maskh);
		
	}
	


}
