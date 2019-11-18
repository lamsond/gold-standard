package org.whrhs.dlamson.apa.exams.u3;

public class PrimeRound{
	private int prime, previous, score;
	private boolean gameOver;
	
	public PrimeRound() {
		prime = 1;
		previous = 1;
		score = 0;
		gameOver = false;
	}
	
	private static boolean isPrime(int n) {
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public int getPrime() {
		return prime;
	}
	
	public int getScore() {
		return score;
	}
	
	public boolean isGameOver() {
		return gameOver;
	}
	
	public void playRound(int guess) {
		if(isPrime(guess) && guess > previous) {
			score++;
			previous = prime;
			prime = guess;
		}
		else {
			gameOver = true;
		}
	}
}
