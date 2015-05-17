/*
 * Server.java
 *
 * Created on February 24, 2015, 7:17 PM
 */

package server;
import java.io.*;
import java.net.*;
import java.util.*;
/**
 *
 * @author  javastudent
 */
public class Server {
    
    private int port;
    String chance;
    /** Creates a new instance of Server */
    public Server(int port) {
        this.port=port;
        chance=null;
    }
    public void start()
    {
        int count=0;
        Socket socket1=null,socket2=null;
        try
        {
            ServerSocket s=new ServerSocket(port);
            
                System.out.println("server listening on port "+port);
                socket1= s.accept();
                System.out.println("server connected to some client");
                ObjectInputStream sInput1,sInput2;
                ObjectOutputStream sOutput1,sOutput2;
                ShareMsg obj1=new ShareMsg();
                ShareMsg obj2=new ShareMsg();
                String player_name;
                sOutput1=new ObjectOutputStream(socket1.getOutputStream());
                sInput1=new ObjectInputStream(socket1.getInputStream());
                obj1=(ShareMsg) sInput1.readObject();
                System.out.println(obj1.username+" Just connected");


                //sOutput1.writeObject(obj1);

                System.out.println("server listening on port "+port);
                socket2= s.accept();
                sOutput2=new ObjectOutputStream(socket2.getOutputStream());
                sInput2=new ObjectInputStream(socket2.getInputStream());

                obj2=(ShareMsg) sInput2.readObject();
                System.out.println(obj2.username+" Just connected");
                //obj1.username="asdf";
                //obj2.username="qwerty";
                Deck d1=new Deck();
                d1.distribute();
                for(int b=0;b<6;b++)
                {    
                    obj1.b1[b]=d1.a1[b];//private
                    obj1.b2[b]=d1.a2[b];//private invisible
                    obj1.b3[b]=d1.a3[b];//private visible
                    obj1.b4[b]=d1.a4[b];//other's visible
                    obj1.b5[b]=d1.a5[b];//other's invisible
                    obj1.turn=1;
                    //obj1.isplayer=1;
                    obj1.ufirst=1;
                    obj1.containsarray=1;
                }
                for(int b=0;b<6;b++)
                {
                    obj2.b1[b]=d1.a6[b];//private                   
                    obj2.b2[b]=d1.a5[b];//private invisble
                    obj2.b3[b]=d1.a4[b];//private's visible
                    obj2.b4[b]=d1.a3[b];//other's visible
                    obj2.b5[b]=d1.a2[b];//other's invisble
                    obj2.containsarray=1;
                    //obj2.isplayer=0;
                    obj2.ufirst=0;
                    obj2.turn=0;
                }
                chance="obj1";
                sOutput1.writeObject(obj1);
                sOutput2.writeObject(obj2);
                System.out.println("Before sending dummy object to 1");
                sOutput1.writeObject(obj1);
                System.out.println("After sending dummy object to 1");
                int play=1;                
                while(play<=30)
                {
                    String str2;
                    play++;
                    if(chance=="obj1")
                    {
                        obj1=(ShareMsg) sInput1.readObject();
                        System.out.println(obj1.c1.card_val+"");
                        System.out.println(obj1.c1.suite+"");
                        System.out.println(obj1.username+"");
                        obj2.turn=1;
                        //str2=""+obj1.c1.card_val;
                        //str2=str2+obj1.c1.suite;
                        
                        obj2.c1.card_val=obj1.c1.card_val;
                        
                        obj2.c1.suite=obj1.c1.suite;
                        
                        obj2.con_card=1;
                        
                        System.out.println(obj2.toString());
                        //obj2.c1=obj1.c1;
                        obj2.ufirst=0;
                        
                        System.out.println("before writing moved play to client 2");
                        System.out.println(obj2.c1.card_val+"");
                        System.out.println(obj2.c1.suite+"");
                        System.out.println(obj2.username+"");
                        sOutput2.writeObject(obj2);
                        System.out.println("before reading moved play from client 2");
                        obj2=(ShareMsg) sInput2.readObject();
                        System.out.println("after reading moved play from client 2");
                        if(obj2.c1.card_val>obj1.c1.card_val)
                        {
                            chance="obj2";
                            obj1.player2++;
                            obj2.player2++;
                            obj2.ufirst=1;
                            obj1.ufirst=0;
                            obj2.turn=1;
                            obj1.turn=0;
                            sOutput1.writeObject(obj1);
                            sOutput2.writeObject(obj2);
                            sOutput2.writeObject(obj2);

                        }
                        else
                        {
                            chance="obj1";
                            obj1.player1++;
                            obj2.player1++;
                            obj1.ufirst=1;
                            obj2.ufirst=0;
                            obj1.turn=1;
                            obj2.turn=0;
                            sOutput1.writeObject(obj1);
                            sOutput2.writeObject(obj2);
                            sOutput1.writeObject(obj1);
                        }

                    }
                    else
                    {
                        obj2=(ShareMsg) sInput2.readObject();
                        obj1.turn=1;
                        obj1.con_card=1;
                        obj1.c1=obj2.c1;
                        sOutput1.writeObject(obj1);
                        obj2=(ShareMsg) sInput2.readObject();
                        if(obj2.c1.card_val>obj1.c1.card_val)
                        {
                            chance="obj2";
                            obj1.player2++;
                            obj2.player2++;
                            obj2.ufirst=1;
                            obj1.ufirst=0;
                            obj2.turn=1;
                            obj1.turn=0;
                            sOutput1.writeObject(obj1);
                            sOutput2.writeObject(obj2);
                            sOutput2.writeObject(obj2);
                        }
                        else
                        {
                            chance="obj1";
                            obj1.player1++;
                            obj2.player1++;
                            obj1.ufirst=1;
                            obj2.ufirst=0;
                            obj1.turn=1;
                            obj2.turn=0;
                            sOutput1.writeObject(obj1);
                            sOutput2.writeObject(obj2);
                            sOutput1.writeObject(obj1);
                        }
                    }
                }
                

                    
                
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            try
            {
                socket1.close();
                socket2.close();
            }
            catch(IOException t)
            {
                
            }
        }
    }
    public static void main(String args[])
    {
        int port=1234;
        Server s=new Server(port);
        s.start();
    }
    
    
}

