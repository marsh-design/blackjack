#Lab 5: Cards and BlackJack# 

The objective of this lab is to implement a Card class, a Card Pile class, a Simple UI class, and fix the Blackjack Game class. The lab also involves using an ArrayList and performing user I/O.

Duration
This lab is expected to take approximately two weeks to complete.

Game Description
Blackjack is the most popular casino gambling game in the world. In this lab, we will be implementing a simplified version of the game, where the rules favor the casino and the Ace always has a score of 1.

Here's how the game works:

Both the player and the House (the Casino) are dealt two cards: one is face up and the other face down. The player can see only one of the House's cards, and the House can see only one of the player's cards. However, both the player and the House can discretely peek at their face down cards.

Each card has a score as follows:

An Ace has a score of 1.
A Jack, Queen or King has a score of 10.
All other cards have a score equal to their rank. (For example, the 4 of Hearts or the 4 of any suit have a rank of 4 and a score of 4.)
The House will obtain additional cards until its score is 17 or more.

The player is asked if they want another card. If they answer yes, they get another face down card and are asked again. This continues until the player says "no". This ends the game.

All cards are now turned face-up and the scores of the player and the House are calculated.

The player loses if their score is more than 21 (no matter what the House's score is).
The player loses if their score is the same as the House's.
The player wins if:
They don't go over 21 and the House does go over 21.
Both the player's and the House's scores are 21 or under and the player's score is more than the House's.
Classes
The following classes are implemented as part of this lab:

Card: This class represents a single card in a deck of cards. It has fields for the rank and suit of the card.

Card Pile: This class represents a pile of cards, such as a deck or a hand. It includes methods for adding and removing cards from the pile.

Simple UI: This class provides a simple user interface for the Blackjack game, allowing the player to enter commands and view the current state of the game.

Blackjack Game: This class represents a game of Blackjack. It includes methods for dealing cards, checking for a win or loss, and allowing the player to hit or stand.

ArrayList
An ArrayList is used to store the cards in the Card Pile class. This allows for flexible resizing of the pile as cards are added and removed.

User I/O
The Simple UI class provides user input and output for the Blackjack game. It prompts the player to enter commands and displays the current state of the game.

Additional Notes
Be sure to get the Card Pile class working before proceeding to the other classes. It has its own main method for testing.
The BlackjackGame and SimpleUI classes have



Regenerate response
