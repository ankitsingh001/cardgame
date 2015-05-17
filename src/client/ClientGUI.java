/*
 * ClientGUI.java
 *
 * Created on February 23, 2015, 7:05 PM
 */

package client;

import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.net.*;
/**
 *
 * @author  javastudent
 */
public class ClientGUI extends javax.swing.JFrame {
        
    ShareMsg obj1,obj2;
    Card c;
    static String address="192.168.1.80";
    private static final int PORTNUM=1234;
    
    
    /** Creates new form ClientGUI */
    public ClientGUI(ShareMsg obj) {
        initComponents();
        jLabel1.setText(obj.username);
        obj1=new ShareMsg();
        obj2=new ShareMsg();
        obj1=obj;
        sop("In clientGUI");
        try
        {
            //socket=new Socket(address,PORTNUM);
            //toserver=new ObjectOutputStream(socket.getOutputStream());

           // fromserver=new ObjectInputStream(socket.getInputStream());
            //Card c=new Card(1,2,"//home//javastudent//bin//cardgame//images//4.png");
            //setButtonImage(card17,c);
            // ImageIcon ii1=new ImageIcon("//home//javastudent//bin//cardgame//images//4.png");
            sop(obj.username+" in client gui");
            sop(obj.containsarray+" ");
            if(obj.containsarray==1)
            {
                setButtonImage(card1,obj.b1[0]);
                setButtonImage(card2,obj.b1[1]);
                setButtonImage(card3,obj.b1[2]);
                setButtonImage(card4,obj.b1[3]);
                setButtonImage(card5,obj.b1[4]);
                setButtonImage(card6,obj.b3[0]);
                setButtonImage(card7,obj.b3[1]);
                setButtonImage(card8,obj.b3[2]);
                setButtonImage(card9,obj.b3[3]);
                setButtonImage(card10,obj.b3[4]);
                setButtonImage(card11,obj.b4[0]);
                setButtonImage(card12,obj.b4[1]);
                setButtonImage(card13,obj.b4[2]);
                setButtonImage(card14,obj.b4[3]);
                setButtonImage(card15,obj.b4[4]);
            }
            if(obj1.ufirst==0)
            {
                jButton1.setLabel("Receive from server");
            }
            else
            {
                jButton1.setLabel("Send to server");
            }   
        }
        catch(Exception e)
        {
            
        }
        //setButtonImage(card1);        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        card1 = new javax.swing.JButton();
        card2 = new javax.swing.JButton();
        card8 = new javax.swing.JButton();
        card4 = new javax.swing.JButton();
        card5 = new javax.swing.JButton();
        card10 = new javax.swing.JButton();
        card9 = new javax.swing.JButton();
        card3 = new javax.swing.JButton();
        card7 = new javax.swing.JButton();
        card6 = new javax.swing.JButton();
        card11 = new javax.swing.JButton();
        card12 = new javax.swing.JButton();
        card13 = new javax.swing.JButton();
        card14 = new javax.swing.JButton();
        card15 = new javax.swing.JButton();
        card16 = new javax.swing.JButton();
        card17 = new javax.swing.JButton();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        getContentPane().setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 5000, 5000));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        card1.setPreferredSize(new java.awt.Dimension(72, 96));
        card1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card1ActionPerformed(evt);
            }
        });

        getContentPane().add(card1);
        card1.setBounds(20, 550, 72, 96);

        card2.setPreferredSize(new java.awt.Dimension(72, 96));
        card2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card2ActionPerformed(evt);
            }
        });

        getContentPane().add(card2);
        card2.setBounds(160, 550, 72, 96);

        card8.setPreferredSize(new java.awt.Dimension(72, 96));
        card8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card8ActionPerformed(evt);
            }
        });

        getContentPane().add(card8);
        card8.setBounds(300, 410, 72, 96);

        card4.setPreferredSize(new java.awt.Dimension(72, 96));
        card4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card4ActionPerformed(evt);
            }
        });

        getContentPane().add(card4);
        card4.setBounds(440, 550, 72, 96);

        card5.setPreferredSize(new java.awt.Dimension(72, 96));
        card5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card5ActionPerformed(evt);
            }
        });

        getContentPane().add(card5);
        card5.setBounds(570, 550, 72, 96);

        card10.setPreferredSize(new java.awt.Dimension(72, 96));
        card10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card10ActionPerformed(evt);
            }
        });

        getContentPane().add(card10);
        card10.setBounds(570, 410, 72, 96);

        card9.setPreferredSize(new java.awt.Dimension(72, 96));
        card9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card9ActionPerformed(evt);
            }
        });

        getContentPane().add(card9);
        card9.setBounds(440, 410, 72, 96);

        card3.setPreferredSize(new java.awt.Dimension(72, 96));
        card3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card3ActionPerformed(evt);
            }
        });

        getContentPane().add(card3);
        card3.setBounds(300, 550, 72, 96);

        card7.setPreferredSize(new java.awt.Dimension(72, 96));
        card7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card7ActionPerformed(evt);
            }
        });

        getContentPane().add(card7);
        card7.setBounds(160, 410, 72, 96);

        card6.setPreferredSize(new java.awt.Dimension(72, 96));
        card6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card6ActionPerformed(evt);
            }
        });

        getContentPane().add(card6);
        card6.setBounds(20, 410, 72, 96);

        card11.setPreferredSize(new java.awt.Dimension(72, 96));
        getContentPane().add(card11);
        card11.setBounds(20, 20, 72, 96);

        card12.setPreferredSize(new java.awt.Dimension(72, 96));
        getContentPane().add(card12);
        card12.setBounds(160, 20, 72, 96);

        card13.setPreferredSize(new java.awt.Dimension(72, 96));
        getContentPane().add(card13);
        card13.setBounds(300, 20, 72, 96);

        card14.setPreferredSize(new java.awt.Dimension(72, 96));
        getContentPane().add(card14);
        card14.setBounds(440, 20, 72, 96);

        card15.setPreferredSize(new java.awt.Dimension(72, 96));
        getContentPane().add(card15);
        card15.setBounds(570, 20, 72, 96);

        card16.setPreferredSize(new java.awt.Dimension(72, 96));
        getContentPane().add(card16);
        card16.setBounds(230, 210, 72, 96);

        card17.setPreferredSize(new java.awt.Dimension(72, 96));
        getContentPane().add(card17);
        card17.setBounds(380, 210, 72, 96);

        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Player Name", "Score"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCellSelectionEnabled(true);
        getContentPane().add(jTable1);
        jTable1.setBounds(670, 180, 310, 120);

        getContentPane().add(jLabel1);
        jLabel1.setBounds(820, 60, 140, 60);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        getContentPane().add(jButton1);
        jButton1.setBounds(800, 430, 60, 60);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1000)/2, (screenSize.height-680)/2, 1000, 680);
    }//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
            if(obj1.turn==1)
            {

                ShareMsg m=new ShareMsg();
                m=obj1;

                try
                {
                    m.con_card=1;
                    m.c1=c;
                    sop("Before sending card");
                    ClientStart.toserver.writeObject(m);
                }
                catch(Exception e)
                {
                    sop("Error"+e);
                }
            }
            else
            {
                String str=new String();
                //str=ClientStart.fromserver.readLine();
                obj2=(ShareMsg)ClientStart.fromserver.readObject();
                obj1=obj2;
                sop(obj2.c1.card_val+"");
                //sop(str.charAt(0)+"");
                //sop(str.charAt(1)+"");
                sop("in else");
                if(obj2.ufirst==0)
                {   
                    sop("if ufirst 0");
                    setButtonImage(card17,obj2.c1);
                }
            }
        }
        catch(Exception f)
        {
            sop("Exception "+f);
        }
        if(jButton1.getLabel()=="Receive from server")
        {
            jButton1.setLabel("Send to server");
        }
        else
        {
            jButton1.setLabel("Receive from server");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void card10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card10ActionPerformed
        // TODO add your handling code here:
      c=obj1.b3[4];
        
      buttonAction(card10,c);
    }//GEN-LAST:event_card10ActionPerformed

    private void card9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card9ActionPerformed
        // TODO add your handling code here:Card c=obj1.b1[0];
        
      c=obj1.b3[3];
        
      buttonAction(card9,c);
    }//GEN-LAST:event_card9ActionPerformed

    private void card8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card8ActionPerformed
        // TODO add your handling code here:
       c=obj1.b3[2];
        
      buttonAction(card8,c);
    }//GEN-LAST:event_card8ActionPerformed

    private void card7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card7ActionPerformed
        // TODO add your handling code here:
        c=obj1.b3[1];
        
      buttonAction(card7,c);
    }//GEN-LAST:event_card7ActionPerformed

    private void card6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card6ActionPerformed
        // TODO add your handling code here:
        Card c=obj1.b3[0];
        
      buttonAction(card6,c);
    }//GEN-LAST:event_card6ActionPerformed

    private void card5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card5ActionPerformed
        // TODO add your handling code here:
       c=obj1.b1[4];
        
      buttonAction(card5,c);
    }//GEN-LAST:event_card5ActionPerformed

    private void card4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card4ActionPerformed
        // TODO add your handling code here:
        c=obj1.b1[3];
        
      buttonAction(card4,c);
    }//GEN-LAST:event_card4ActionPerformed

    private void card3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card3ActionPerformed
        // TODO add your handling code here:
        c=obj1.b1[2];
        
      buttonAction(card3,c);
    }//GEN-LAST:event_card3ActionPerformed

    private void card2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card2ActionPerformed
        // TODO add your handling code here:
       c=obj1.b1[1];
        
      buttonAction(card2,c);
    }//GEN-LAST:event_card2ActionPerformed

    public void buttonAction(JButton b,Card c)
    {
        
        try
        {
         if(obj1.turn==1)
         {
            if(b==card1||b==card2||b==card3||b==card4||b==card5)
            {
                b.setVisible(false);
                sop(obj1.turn+"turn1");
                Icon i=b.getIcon();
                if(obj1.ufirst==1)
                {
                    sop("in true if");
                    card16.setIcon(i);
                }
                else
                {
                    sop("in true else");
                    card17.setIcon(i);
                }
             }
            else if(b==card6||b==card7||b==card8||b==card9||b==card10)
            {
                Icon i=b.getIcon();
                if(obj1.ufirst==1)
                {
                    sop("in true if");
                    card16.setIcon(i);
                }
                else
                {
                    sop("in true else");
                    card17.setIcon(i);
                }
                
                if(b==card6)
                    setButtonImage(card6,obj1.b2[0]);
                else if(b==card7)
                    setButtonImage(card7,obj1.b2[1]);
                else if(b==card8)
                    setButtonImage(card8,obj1.b2[2]);
                else if(b==card9)
                    setButtonImage(card9,obj1.b2[3]);
                else if(b==card10)
                    setButtonImage(card10,obj1.b2[4]);
                   
                
            }
            
                
         }
        }
        catch(Exception e)
        {
            
        }
        /*
        if(obj1.turn==1)
        {
            if(b==card1||b==card2||b==card3||b==card4||b==card5)
            {
                b.setVisible(false);
                sop(obj1.turn+"turn1");
                Icon i=b.getIcon();
                if(obj1.ufirst==1)
                {
                    sop("in true if");
                    card16.setIcon(i);
                }
                else
                {
                    sop("in true else");
                    card17.setIcon(i);
                }
            }*/
            
        
    }
    
    private void card1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card1ActionPerformed
        // TODO add your handling code here:
       c=obj1.b1[0];
        
      buttonAction(card1,c);
    }//GEN-LAST:event_card1ActionPerformed
    
    void setButtonImage(JButton b,Card c)
    {
        ImageIcon ii1=new ImageIcon(c.filename);
        b.setIcon(ii1);
    }
    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm
    
    static public void sop(String msg)
    {
        System.out.println(msg);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       // new ClientGUI().show();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton card1;
    private javax.swing.JButton card10;
    private javax.swing.JButton card11;
    private javax.swing.JButton card12;
    private javax.swing.JButton card13;
    private javax.swing.JButton card14;
    private javax.swing.JButton card15;
    private javax.swing.JButton card16;
    private javax.swing.JButton card17;
    private javax.swing.JButton card2;
    private javax.swing.JButton card3;
    private javax.swing.JButton card4;
    private javax.swing.JButton card5;
    private javax.swing.JButton card6;
    private javax.swing.JButton card7;
    private javax.swing.JButton card8;
    private javax.swing.JButton card9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    
}
