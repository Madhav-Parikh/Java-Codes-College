import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonExample implements ActionListener {
 JLabel jlab;

 ButtonExample() {

  JFrame jfrm = new JFrame("Button Example");
 
  jfrm.setLayout(new FlowLayout());

  jfrm.setSize(320, 110);

  jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  JButton jbtnUp = new JButton("Before");
  JButton jbtnDown = new JButton("After");

  jbtnUp.addActionListener(this);
  jbtnDown.addActionListener(this);

  jfrm.add(jbtnUp);
  jfrm.add(jbtnDown);

  jlab = new JLabel("Press a button.");
  
  jfrm.add(jlab);

  jfrm.setVisible(true);
 }

 
 public void actionPerformed(ActionEvent ae) {

  if(ae.getActionCommand().equals("Before"))

   jlab.setText("You have pressed Before.");

  else

   jlab.setText("You have pressed After.");
 }

 public static void main(String args[]) {

  SwingUtilities.invokeLater(new Runnable() {
   public void run() {
    new ButtonExample();
   }
  });
 }
}