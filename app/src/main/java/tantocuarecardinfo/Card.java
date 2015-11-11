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
    private boolean enable;

    public Card(String name, String description, String imagePath, Integer heartCost, Integer victoryPoints)
    {
        this.name = name;
        this.description = description;
        this.imagePath = imagePath;
        this.heartCost = heartCost;
        this.victoryPoints = victoryPoints;
        this.enable = true;
    }

    @Override
    public String toString() {
        return name.toString();
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
