package org.whrhs.dlamson.apa.exams.u4;

import java.awt.Color;

public class Pacman {
	private static int WORLD_WIDTH = 5;
	// what attributes will our Pacman have?
	private int speed, x;
	private boolean isAlive;
	private Color color;
	
	public Pacman() {
		speed = 1;
		x = 0;
		isAlive = true;
		color = new Color(0xff00ff);
	}
	
	// what behavior does Pacman have?
	public void move() {
		x+=speed;
	}
	
	public void attack() {
		System.out.println("Run for your life Pacman!!!");
	}
	
	public void render() {
		for(int i = 0; i < WORLD_WIDTH; i++) {
			if(i == x) {
				System.out.print("*");
			}
			else {
				System.out.print("-");
			}
		}
		System.out.print("\n");
	}
	
	public static void main(String[] args) {
		Pacman pinky = new Pacman();
		pinky.render();
	}
}
