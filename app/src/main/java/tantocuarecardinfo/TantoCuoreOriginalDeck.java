package tantocuarecardinfo;

import java.util.ArrayList;

/**
 * Created by NintendoM1 on 10/23/2015.
 */
public class TantoCuoreOriginalDeck extends Deck implements java.io.Serializable {

    public TantoCuoreOriginalDeck()
    {
        this.unusedCards = InitializeDeck();
        this.usedCards = new ArrayList<Card>();
    }

    /***
     * Hardcoded list. TODO: Move this list to an xml or other external resource.
     * @return
     */
    private ArrayList<Card> InitializeDeck()
    {
        return new ArrayList<Card>() {{
            add(new Card("Rogue Crescent", "Chamebermaid", ".", 2, 1));
            add(new Card("Viola Cresecent", "Chamebermaid", ".", 2, 1));
            add(new Card("Azure Crescent", "Chamebermaid", ".", 2, 1));
            add(new Card("Safran Virginie", "Chamebermaid", ".", 3, null));
            add(new Card("Claire Saint-Juste", "White Maid", ".", 3, 0));
            add(new Card("Kagari Ichinomiya", "Sewing Maid", ".", 3, 0));
            add(new Card("Eliza Rosewater", "Policing Maid", ".", 2, 0));
            add(new Card("Moine de Lefevre", "Employing Maid", ".", 5, 0));
            add(new Card("Genevieve Daubigny", "Cooking Maid", ".", 5, 0));
            add(new Card("Ophelia Grail", "All-purpose Maid", ".", 6, null));
            add(new Card("Anise Greenaway", "Treasury Maid", ".", 7, 3));
            add(new Card("Sainsbury Lockwood", "Laundry Maid", ".", 5, 0));
        }};
    }
}
