package tantocuarecardinfo;

/**
 * Created by NintendoM1 on 10/23/2015.
 */
public class Card implements java.io.Serializable {
    public final String name;
    public final String description;
    public final String imagePath;
    public final Integer heartCost;
    public final Integer victoryPoints;

    public Card(String name, String description, String imagePath, Integer heartCost, Integer victoryPoints)
    {
        this.name = name;
        this.description = description;
        this.imagePath = imagePath;
        this.heartCost = heartCost;
        this.victoryPoints = victoryPoints;
    }

    @Override
    public String toString() {
        return name.toString();
    }
}
