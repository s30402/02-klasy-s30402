package src.main.java;

public class Card {

    private int value;
    private String color;
    private enum Colors {
        KIER, KARO, PIK, TREFL;
    }
    // -- -- -- -- -- // -- -- -- -- -- // -- -- -- -- -- // -- -- -- -- -- //
    public int getValue() { return this.value; }
    public String getColor() { return this.color; }

    // -- -- -- -- -- // -- -- -- -- -- // -- -- -- -- -- // -- -- -- -- -- //
    public void setValue(int value) {
        this.value = value;
    }
    public void setColor(String color) {

        for (Colors c : Colors.values()) {
            if (c.name().equals(color)) {
                this.color = color;
                break;
            }
        }

        if (this.color == null) {
            throw new IllegalStateException("Podany kolor karty, nie istnieje.");
        }
    }

    // -- -- -- -- -- // -- -- -- -- -- // -- -- -- -- -- // -- -- -- -- -- //

    public int WarResult(Card card) {

        if(this.getValue() > card.getValue()) {
            return 1;
        } else if (this.getValue() == card.getValue()) {
            return 0;
        } else {
            return 2;
        }
    }

}
