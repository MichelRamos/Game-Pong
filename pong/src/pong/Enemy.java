package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Enemy {
	
	public double x, y;
	public double width, height;
	
	public Enemy(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = 30;
		this.height = 5;
	}
	
	public void tick() {
		x += (Game.ball.x - x - 4) * 0.1; //changing the '0.1' value to a higher one will make the enemy harder to beat
	}
	
	public void render(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect((int)x, (int)y, (int)width, (int)height);
	}
	
}
