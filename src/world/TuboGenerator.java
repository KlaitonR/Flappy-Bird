package world;

import entities.Entity;
import entities.Tubo;
import main.Game;

public class TuboGenerator {
	
	public int time;
	public int targetTime = 60;
	
	public void tick() {
		
		time++;
		if(time == 60) {
			
			int altura1 = Entity.rand.nextInt((60 - 40) + 40);
			Tubo tb1 = new Tubo(Game.WIDTH, 0, 20, altura1, 1, null);
			
			int altura2 = Entity.rand.nextInt((60 - 40) + 40);
			Tubo tb2 = new Tubo(Game.WIDTH, Game.HEIGHT - altura2, 20, altura2, 1, null);
			
			Game.entities.add(tb1);
			Game.entities.add(tb2);
			
			time = 0;
		}
		
	}

}
