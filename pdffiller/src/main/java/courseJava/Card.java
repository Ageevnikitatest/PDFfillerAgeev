package courseJava;

/**
 * Created by ANS on 20/10/15.
 */
public class Card {


    public Card (int value , String lear) {

        this.lear = lear;
        this.value = value;
    }


    int value;
    String lear;

    @Override
    public String toString(){
        return "Card: "+value+" lear="+lear;


    }
}

