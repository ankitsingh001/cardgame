/*
 * ShareMsg.java
 *
 * Created on February 24, 2015, 8:39 PM
 */

package server;
import java.io.*;
/**
 *
 * @author  javastudent
 */
public class ShareMsg implements Serializable{
    
    String username;
    Card[] b1,b2,b3,b4,b5;
    int containsarray;   
    int  player1=0,player2=0;
    int con_card;
    Card c1;
    int turn;
    int ufirst;
    static final long serialVersionUID=303L;
    /** Creates a new instance of ShareMsg */
    public ShareMsg() {
        b1 = new Card[6];
        b2 = new Card[6];
        b3 = new Card[6];
        b4 = new Card[6];
        b5 = new Card[6];
        c1=new Card(0,0,"abc");
        ufirst=0;
        username="player";
        containsarray=0;
        con_card=0;
        turn=0;
        
        
    }
    public void setName(String msg)
    {
        this.username=msg;
    } 
}
