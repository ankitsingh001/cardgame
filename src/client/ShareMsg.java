/*
 * ShareMsg.java
 *
 * Created on February 24, 2015, 8:15 PM
 */

package client;
import java.io.*;

/**
 *
 * @author  javastudent
 */
public class ShareMsg implements Serializable{
    String username;
    Card[] b1,b2,b3,b4,b5;
    int player1=0,player2=0;
    int containsarray;
    int con_card;
    int ufirst;
    Card c1;
    int turn;
    static final long serialVersionUID= 303L;
    
    /** Creates a new instance of ShareMsg */
    public ShareMsg() {
        b1=new Card[6];
        b2=new Card[6];
        b3=new Card[6];
        b4=new Card[6];
        b5=new Card[6];
        username="player";
        c1=new Card(0,0,"abc");
        containsarray=0;
        ufirst=1;
        con_card=0;
        turn=0;
    }
    
    public void setName(String msg)
    {
        this.username=msg;
    }
    
}
