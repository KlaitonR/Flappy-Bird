package world;

//import java.awt.Graphics;
//import java.awt.image.BufferedImage;
//import graficos.Spritesheet;
import entities.Player;
import main.Game;

public class World {

	public static int WIDTH,HEIGHT;
	public static final int TILE_SIZE = 16;
	
//	public static BufferedImage BACKGROUND = Game.spritesheet.getSprite(0, 0, 240, 150);
	
	public static void restartGame(){
		Game.score = 0;
		Game.player.cont = 0;
		Game.player = new Player(Game.WIDTH/2 - 30,Game.HEIGHT/2,16,16,2,Game.spritesheet.getSprite(0,0,16,16));
		Game.entities.clear();
		Game.entities.add(Game.player);
		return;
	}
	
//	public void render(Graphics g){
//		
//		g.drawImage(BACKGROUND, 0, 0, 0, 0, null);
//		
//	}
	
	}
