import java.awt.*;
import javax.swing.*;

public class FlowBorder {
    public static void main(String[] args) {

        JButton btnA = new JButton("Button1 (Left)");
        JButton btnB = new JButton("Button2 (Right)");
        JButton btnC = new JButton("Button3 (Left)");
        JButton btnD = new JButton("Button4 (Right)");

        btnA.setPreferredSize(new Dimension(150, 30));
        btnB.setPreferredSize(new Dimension(150, 30));
        btnC.setPreferredSize(new Dimension(150, 30));
        btnD.setPreferredSize(new Dimension(150, 30));

        JPanel btnAPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel btnBPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JPanel btnCPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel btnDPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        btnAPanel.add(btnA);
        btnBPanel.add(btnB);
        btnCPanel.add(btnC);
        btnDPanel.add(btnD);

        JPanel panelGrid = new JPanel(new BorderLayout());
        panelGrid.add(btnAPanel, BorderLayout.SOUTH);
        panelGrid.add(btnBPanel, BorderLayout.NORTH);
        panelGrid.add(btnCPanel, BorderLayout.EAST);
        panelGrid.add(btnDPanel, BorderLayout.WEST);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panelGrid);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}