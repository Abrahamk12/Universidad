package java_collections_framework_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java_Collections_Framework_01 {

    /*
    Implementar una clase para representar una carta de una baraja.
    Cada carta se caracteriza por tener un valor (e.g. as, 2, 3, 4,...)
    y una figura (e.g. espada, trebol, corazón, diamante). 
    Modificar el programa Deal.java y desarrollar un programa 
    de donde que deben utilizar las dos
    implementaciones de List y la implementación de la clase para
    representar las cartas del punto 1 de la práctica.
     */
    static ArrayList<String> Suit = new ArrayList<String>();
    static ArrayList<String> Rank = new ArrayList<String>();

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: Deal hands cards");
            args = new String[2];
            args[0] = "3";
            args[1] = "5";
            //return;
        }
        int numHands = Integer.parseInt(args[0]);
        int cardsPerHand = Integer.parseInt(args[1]);

        // Make a normal 52-card deck.
        String[] suit = new String[]{
            "spades", "hearts", "diamonds", "clubs"};

        for (int i = 0; i < suit.length; i++) {
            Suit.add(suit[i]);
        }
        String[] rank = new String[]{
            "ace", "2", "3", "4", "5", "6", "7", "8",
            "9", "10", "jack", "queen", "king"};
        for (int i = 0; i < rank.length; i++) {
            Rank.add(rank[i]);
        }
        List<String> deck = new ArrayList<String>();

        for (int i = 0; i < Suit.size(); i++) {
            for (int j = 0; j < rank.length; j++) {
                deck.add(Rank.get(j) + " of " + Suit.get(i));
            }
        }

        // Shuffle the deck.
        Collections.shuffle(deck);

        if (numHands * cardsPerHand > deck.size()) {
            System.out.println("Not enough cards.");
            return;
        }

        for (int i = 0; i < numHands; i++) {
            System.out.println(dealHand(deck, cardsPerHand));
        }
    }

    public static <E> List<E> dealHand(List<E> deck, int n) {

        int deckSize = deck.size(); // cuantas cartas en la baraja

        // sacar n cartas de la baraja
        List<E> handView = deck.subList(deckSize - n, deckSize);

        // crear una mano de n cartas
        List<E> hand = new ArrayList<E>(handView);

        handView.clear();

        return hand;
    }
}
