/**
* Alexander Perez Oliva - aperezoliva
* CIS175
* Feb 17, 2022
*/
package model;

import java.util.Random;

/**
 * @author krazy
 *
 */
public class GenerateTruthOrDare {
	private String randomDare;
	private String randomTruth;
	
	public String getRandomDare() {
		return randomDare;
	}
	public void setRandomDare(String randomDare) {
		this.randomDare = randomDare;
	}
	public String getRandomTruth() {
		return randomTruth;
	}
	public void setRandomTruth(String randomTruth) {
		this.randomTruth = randomTruth;
	}
	
	public String generateTruth() {
		String[] collectTruth = new String[5];
		Random ran = new Random();
		
		collectTruth[0] = "What would make you lie for your friend?";
		collectTruth[1] = "When was the last time you spied on someone's text messages?";
		collectTruth[2] = "If you woke up one day to find out that you had become invisible, what is the first thing that you would do?";
		collectTruth[3] = "Tell everyone who you like.";
		collectTruth[4] = "Why did you break up with your first girlfriend/boyfriend?";
	
		return collectTruth[ran.nextInt(4)];
	}
	
	public String generateDare() {
		String[] collectDare = new String[5];
		Random ran = new Random();
		
		collectDare[0] = "Wear a funny hat on your head for the next three rounds of questions.";
		collectDare[1] = "Belly dance to a country song.";
		collectDare[2] = "Make a freestyle rap song about each person in the group.";
		collectDare[3] = "Sing 'Rudolf The Red-nosed Reindeer'.";
		collectDare[4] = "Text your dad asking to borrow '50 bucks and a sledgehammer”.";
	
		return collectDare[ran.nextInt(4)];
	}
	
}
