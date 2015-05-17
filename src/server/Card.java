/*
 * Card.java
 *
 * Created on February 23, 2015, 7:06 PM
 */

package server;
import javax.swing.ImageIcon;
/**
 *
 * @author  javastudent
 */
public class Card extends ImageIcon {
    public int card_val,suite;//0-spade 1-hearts 2-diamond 3-club
    public String filename;
    /** Creates a new instance of Card */
    public Card() {
        super("bin/cardgame/images/7.png");
        card_val=0;
        suite=0;
        filename="ada";
        
    }
    
    public Card(int a,int b,String filename) {
        card_val=a;
        suite=b;
        this.filename=filename;
    }
    
}
