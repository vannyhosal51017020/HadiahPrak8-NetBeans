/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.*;
/**
 *
 * @author Hosal
 */
public class Orang extends Panel {
    Orang(){
        setBackground(Color.WHITE);
    }
    @Override
    public void paint(Graphics g) {
    //Badan
        g.drawLine(175, 300, 175, 160);
        
        //Kaki
        g.drawLine(155, 310,175,250 );
        g.drawLine(195, 310,175,250 );
        
        //Tangan
        g.drawLine(140, 250, 175, 200);
        g.drawLine(215, 250, 175, 200);
        
        //Bagian Kepala
        g.drawRoundRect(145, 103, 60 , 60,60, 60);
        
        
        //Bagian Wajah
        g.drawRoundRect(160, 125, 12, 10,10, 10);
        g.drawRoundRect(177, 125, 12, 10,10, 10);
       
       
        g.drawArc(145, 140, 130, 60, -20, 20);
       
        
       
    }
    public static void main(String[] args) {
        Frame f =  new Frame("Testing Graphics Panel");
        Orang gp = new Orang();
        f.add(gp);
        f.setSize(900,900);
        f.setVisible(true);
                
    }
    
}
