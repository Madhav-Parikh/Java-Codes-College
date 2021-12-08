import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GridCard extends JFrame implements ActionListener {

    CardLayout cd;
    JButton btn1, btn2, btn3;
    Container cPane;

    GridCard() {

        cPane = getContentPane();

        cd = new CardLayout();

        cPane.setLayout(cd);

        btn1 = new JButton("Blue");
        btn2 = new JButton("Human");
        btn3 = new JButton("Dog");

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        cPane.add("a", btn1);
        cPane.add("b", btn2);
        cPane.add("c", btn3);

    }

    public void actionPerformed(ActionEvent e) {

        cd.next(cPane);
    }

    
    GridCard(int a) {
        
        JFrame f;
        f = new JFrame();

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        
      
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
       

       
        f.setLayout(new GridLayout(3, 3));
        f.setSize(700, 700);
        f.setVisible(true);
        f.setTitle("GRIDLAYOUT FRAME");
    }

    public static void main(String argvs[]) {

        GridCard cdl = new GridCard();
        GridCard n1 = new GridCard(1);
        cdl.setSize(350, 350);
        cdl.setVisible(true);
        cdl.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}