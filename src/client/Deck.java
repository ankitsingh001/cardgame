/*
 * Deck.java
 *
 * Created on February 23, 2015, 7:09 PM
 */

package client;

/**
 *
 * @author  javastudent
 */
public class Deck {
    public Card[] card=new Card[300];
    public int k=0;
    /** Creates a new instance of Deck */
    public Deck() 
    {
        
        String filen;
        int p,i,j;
        for(i=1;i<=13;i++)
        {
            if((i!=2)&&(i!=3)&&(i!=4)&&(i!=5)&&(i!=6))
            {
                for(j=1;j<=4;j++)
                {   
                    if(i==7)
                    {
                        if((j==1||j==2))
                        {
                            p=i*j;
                            filen="//home//javastudent//bin//cardgame//images//"+i+""+j+".png";
                            card[k] =new Card(i,j,filen);
                            k++;
                        }
                    }
                    else
                    {
                        p=i*j;
                         filen="//home//javastudent//bin//cardgame//images//"+i+""+j+".png";
                        card[k] =new Card(i,j,filen);
                        k++;
                    }
                }
            }
        }
    }
    
    public void printall()
    {
        for(int l=0;l<k;l++)
        {
            System.out.println(card[l].card_val+" "+card[l].suite+" "+card[l].filename);
        }
    }
    
}
