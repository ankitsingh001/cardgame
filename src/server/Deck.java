/*
 * Deck.java
 *
 * Created on February 23, 2015, 7:09 PM
 */

package server;

/**
 *
 * @author  javastudent
 */
public class Deck {
    public Card[] card=new Card[300];
    public int k=0;
    public Card[] a1,a2,a3,a4,a5,a6;
    
    
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
    
    
    public void distribute()
    {
        int a=0,b=0,c=0,d=0,e=0,f=0;
        a1=new Card[6];
        a2=new Card[6];
        a3=new Card[6];
        a4=new Card[6];
        a5=new Card[6];
        a6=new Card[6];
        for(int i=0;i<k;i++)
        {
            if(i%6==0)
            {
                a1[a]=card[i];
                a++;
            }
            if(i%6==1)
            {
                a2[b]=card[i];
                b++;
            }
            if(i%6==2)
            {
                a3[c]=card[i];
                c++;
            }
            if(i%6==3)
            {
                a4[d]=card[i];
                d++;
            }
            if(i%6==4)
            {
                a5[e]=card[i];
                e++;
            }
            if(i%6==5)
            {
                a6[f]=card[i];
                f++;
            }
        }
    }
}
