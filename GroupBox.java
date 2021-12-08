import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

public class GroupBox extends Frame {

    Button buttons[];

    public GroupBox() {

        buttons = new Button[4];

        for (int i = 0; i < 4; i++) {

            buttons[i] = new Button("Button " + (i + 1));

            add(buttons[i]);
        }
        
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setSize(800, 800);
        setVisible(true);
        setTitle("BOX LAYOUT");
    }

    GroupBox(int a) {

        JFrame frame = new JFrame("GroupLayoutExample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container myPanel = frame.getContentPane();

        GroupLayout groupLayout = new GroupLayout(myPanel);
        groupLayout.setAutoCreateGaps(true);
        groupLayout.setAutoCreateContainerGaps(true);
        myPanel.setLayout(groupLayout);

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");

        groupLayout.setHorizontalGroup(groupLayout.createSequentialGroup()
                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(b1).addComponent(b3))
                .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addComponent(b2)));

        groupLayout.setVerticalGroup(groupLayout.createSequentialGroup()
                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(b1).addComponent(b2))
                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(b3)));

        frame.pack();
        frame.setVisible(true);
        frame.setTitle("GROUPLAYOUT");
    }

    public static void main(String args[]) {
        GroupBox b = new GroupBox();
        GroupBox c = new GroupBox(4);
    }
}
