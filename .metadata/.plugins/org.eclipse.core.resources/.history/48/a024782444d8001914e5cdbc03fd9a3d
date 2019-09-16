/**
 * Purpose: deck
 * 
 * @author Ganesh Mule
 * @version 1.0
 * @since 09-09-2019
 **/
package com.bridglabz.oops;

import java.util.Random;

public class Cards {

	public static void main(String[] args) {
		
		String[] suit = {"Club", "Diamond", "Heart", "Spade"};
		String[] rank = {"2", "3", "4", "5","6", "7", "8", "9","10", "Jack", "Queen", "King", "Ace"};
		
		String[] cards = new String[52];
		
		int count = 0;
		for(int i=0; i<suit.length; i++)
		{
			for(int j=0; j<rank.length; j++)
			{
				cards[count] = suit[i]+" "+rank[j];
				count++;
			}			
		}
		
		for(String a: cards)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		
		String[] shuffledDeck=shuffleTheCards(cards);
		
		for(String a: shuffledDeck)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		
				
		int count1 = 0;
		for (int i = 1; i<=4; i++) 
		{
			System.out.print("\nPlayer "+i+" has recieved : ");
			for (int j = 0; j < 9; j++) 
			{
				System.out.print(shuffledDeck[count1]+" ");
				count1++;
			}
			System.out.println();
		}
	}
	
	private static String[] shuffleTheCards(String[] deck) {
		Random random = new Random();
		for(int i=0; i<deck.length-1; i++)
		{
			int value = random.nextInt(deck.length);
			String temp = deck[i];
			deck[i] = deck[value];
			deck[value] = temp;
			}
		return deck;
	}
}