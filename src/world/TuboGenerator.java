package world;

import entities.Entity;
import entities.Tubo;
import main.Game;

public class TuboGenerator {
	
	public int time;
	public int targetTime = 70;
	
	public void tick() {
		
		time++;
		if(time == targetTime) {
			
			int altura1 = Entity.rand.nextInt((60 - 40) + 40);
			
			if(altura1 < 16) {
				altura1 = 16;
			}else if(altura1 > 16 && altura1 < 32) {
				altura1 = 32;
			}else if(altura1 > 32 && altura1 < 48) {
				altura1 = 48;
			}else if(altura1 > 48 && altura1 < 64) {
				altura1 = 64;
			}else if(altura1 > 64 && altura1 < 80) {
				altura1 = 80;
			}
			
			Tubo tb1 = new Tubo(Game.WIDTH, 0, 16, altura1, 1, null);
			tb1.tb = 1;
			
			int altura2 = Entity.rand.nextInt((60 - 40) + 40);
			
			if(altura2 < 16) {
				altura2 = 16;
			}else if(altura2 > 16 && altura2 < 32) {
				altura2 = 32;
			}else if(altura2 > 32 && altura2 < 48) {
				altura2 = 48;
			}else if(altura2 > 48 && altura2 < 64) {
				altura2 = 64;
			}else if(altura2 > 64 && altura2 < 80) {
				altura2 = 80;
			}
			
			Tubo tb2 = new Tubo(Game.WIDTH, Game.HEIGHT - altura2, 16, altura2, 1, null);
			tb2.tb = 2;
			
			Game.entities.add(tb1);
			Game.entities.add(tb2);
			
			time = 0;
		}
		
	}

}
