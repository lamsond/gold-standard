package org.whrhs.dlamson.apa.exams.u4;

import java.awt.Color;

public class Ghost {
	
	// static variables
	private static final int WORLD_WIDTH = 10;
	private static final int WORLD_HEIGHT = 8;
	
	// instance variables
	private int speed, x, y;
	private boolean isAlive;
	private Color color;
	
	// constructor
	public Ghost(Color c) {
		speed = 1;
		x = 0;
		y = 0;
		isAlive = true;
		color = c;
	}
	
	// methods
	public void attack() {
		System.out.println("Run for life, Pacman!!!");
	}
	
	public void move(int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	public void render() {
		for(int j = 0; j < WORLD_HEIGHT; j++) {
			for(int i = 0; i < WORLD_WIDTH; i++) {
				if(x == i && y == j) {
					System.out.print("*");
				}
				else {
					System.out.print("-");
				}
			}
			System.out.println("");
		}
	}
	
	public String toString() {
		return "Ghost with speed: " + speed;
	}
	
	public static void main(String[] pizza) {
		Ghost pinky = new Ghost(Color.PINK);
		pinky.render();
		pinky.move(2, 3);
		System.out.println("");
		pinky.render();
	}
}
