package tantocuarecardinfo;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by NintendoM1 on 10/23/2015.
 * Generic deck class.
 */
public class Deck<T> {
    protected List<T> unusedCards;
    protected List<T> usedCards;

    public Deck() {
    }

    public Deck(List<T> listOfCards) {
        int length = listOfCards.size();
        unusedCards = listOfCards;
        usedCards = new ArrayList<T>(length);
    }

    /**
     * Draws a random card from the deck of cards
     */
    public T DrawRandomCard() {
        //https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle

        //Select a random card
        Random r = new Random();
        int nextCardIndex = r.nextInt(unusedCards.size() - 1);

        //Move the card over
        return DrawCardFromSlot(nextCardIndex);
    }

    /***
     * Drawas a card from a specific slot. Drawn cards are sent to the "used Cards" list.
     * @param slotIndex The slot to pull the card from.
     * @return
     */
    public T DrawCardFromSlot(int slotIndex)
    {
        //Throw exceptions if invalid input
        if(slotIndex < 0 || slotIndex >= unusedCards.size())
            throw new IllegalArgumentException("The slot index provided exceeds the actual number of undrawn cards.");

        //Draw card from that slot exactly.
        T drawnCard = unusedCards.remove(slotIndex);
        usedCards.add(drawnCard);
        Log.d(this.getClass().getSimpleName(), "Drawn Card: " + drawnCard);
        return drawnCard;
    }

    /***
     * Shows card. Moves it to the "used cards" pile.
     * @return
     */
    public T DrawCard() {
        //Draw the first card (in the 0 index)
        if(unusedCards.size() <= 0)
            return null;

        final int FIRST_CARD = 0;
        return DrawCardFromSlot(FIRST_CARD);
    }

    /***
     * All cards are now unused. Order is not restored.
     */
    public void ResetDeck() {
        int numOfUsedCards = usedCards.size();
        for(int i = 0; i < numOfUsedCards; i++)
        {
            final int ONE_CARD = 0;
            unusedCards.add(usedCards.remove(ONE_CARD));
        }
    }

    /***
     * Shows if there are cards to draw.
     * @return
     */
    public boolean HasCardsToDraw() {
        return unusedCards.size() > 0;
    }
}
