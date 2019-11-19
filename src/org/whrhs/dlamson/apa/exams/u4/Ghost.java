package org.whrhs.dlamson.apa.exams.u4;

import java.awt.Color;

public class Ghost {
	
	// static variables
	private static final int WORLD_WIDTH = 10;
	
	// instance variables
	private int speed, x;
	private boolean isAlive;
	private Color color;
	
	// constructor
	public Ghost(Color c) {
		speed = 1;
		x = 0;
		isAlive = true;
		color = c;
	}
	
	// methods
	public void attack() {
		System.out.println("Run for life, Pacman!!!");
	}
	
	public void move() {
		x += speed;
	}
	
	public void render() {
		for(int i = 0; i < WORLD_WIDTH; i++) {
			if(x == i) {
				System.out.print("*");
			}
			else {
				System.out.print("-");
			}
		}
		System.out.println("");
	}
	
	public String toString() {
		return "Ghost with speed: " + speed;
	}
	
	public static void main(String[] pizza) {
		Ghost pinky = new Ghost(Color.PINK);
		pinky.speed = 2;
		pinky.attack();
		pinky.render();
		pinky.move();
		pinky.render();
		pinky.move();
		pinky.render();
	}
}
