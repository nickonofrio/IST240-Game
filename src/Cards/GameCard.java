package Cards;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ChangeEvent;

/**
 *
 * @author nickonofrio
 */
public class GameCard extends JPanel implements ActionListener, javax.swing.event.ChangeListener {
    
    JSlider accuracy, power;
    JButton b1, b2, b3, b4;
    JLabel l1;
    Timer tAccuracy;
    Timer tPower;
    int limit = 0;  
    int aDelay = 0;
    int dDelay = 0;
    int i = 0;
    int j = 0;
    int a = 1, vA = 1;
    int p = 1, vP = 1;
    

    public GameCard()
    {
        super();
        
        setLayout(null);
        setBackground(Color.gray);
        
        //------TIMER -------------------------------------------
  	aDelay = 10; //milliseconds
        dDelay = 10; //milliseconds
        tAccuracy = new Timer(aDelay, this);
        tPower = new Timer(dDelay, this);
     
        
        //Create JButtons
        b1 = new JButton("Start Accuracy");
        b1.addActionListener(this);
        b1.setHorizontalAlignment(JButton.CENTER);
        
        b2 = new JButton("Stop Accuracy");
        b2.addActionListener(this);
        b2.setHorizontalAlignment(JButton.CENTER);
        
        b3 = new JButton("Start Power");
        b3.addActionListener(this);
        b3.setHorizontalAlignment(JButton.CENTER);
        
        b4 = new JButton("Stop Power");
        b4.addActionListener(this);
        b4.setHorizontalAlignment(JButton.CENTER);
        
        
        //Create Sliders
        accuracy = new JSlider(JSlider.HORIZONTAL,0,100,0);
        accuracy.setMajorTickSpacing(25);
        accuracy.setBorder(BorderFactory.createTitledBorder("Accuracy"));
        
        power = new JSlider(JSlider.VERTICAL,0,100,0);
        power.setMajorTickSpacing(25);
        power.setBorder(BorderFactory.createTitledBorder("power"));
        
        
        
        //Add Components
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(accuracy);
        add(power);
    
        
        //------------Placing------------------------------------
        // x,y, length, height)
        accuracy.setBounds(new Rectangle(500,600,300,100));
        power.setBounds(new Rectangle(800,400,100,300));
        b1.setBounds(new Rectangle(100,10,100,100));
        b2.setBounds(new Rectangle(100,120,100,100));
        b3.setBounds(new Rectangle(600,10,100,100));
        b4.setBounds(new Rectangle(600,120,100,100));
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        String choice = e.getActionCommand();
        
            if (a < 0 || a > 100){
                    vA = -vA;
                }
            
            if (p < 0 || p > 100){
                    vP = -vP;
                }
            a += vA;
            p += vP;
        
        
	    if (obj == b1){tAccuracy.start();}
            
            if (obj == b2){tAccuracy.stop();}
            
            if (obj == b3){tPower.start();}
            
            if (obj == b4){tPower.stop();}
            
            if (obj == tAccuracy)
		{
		i = i+1;
                accuracy.setValue(a);
                }
            
            if (obj == tPower)
            {
                j = j+1;
                power.setValue(p);
            }
            
            repaint();
        
    
    
}

    @Override
    public void stateChanged(ChangeEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}