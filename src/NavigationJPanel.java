import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author nickonofrio
 */
public class NavigationJPanel extends JPanel
{
    
    JButton jbIntro, jbInstructions, jbDesigners;
    
    public NavigationJPanel()
    {
        super();
    
        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(1300,100));
        
        //Create JButtons
        jbIntro = new JButton("Introduction");
        jbInstructions = new JButton("Instructions");
        jbDesigners = new JButton("Designers");
        
        //Add Components
        add(jbIntro);
        add(jbInstructions);
        add(jbDesigners);
        
    }
    
}