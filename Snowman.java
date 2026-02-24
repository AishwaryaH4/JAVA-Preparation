import javax.swing.*;
import java.awt.*;

public class Snowman extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(new Color(180, 220, 255)); // winter sky

        // Bottom snowball
        g.setColor(Color.WHITE);
        g.fillOval(150, 220, 200, 150);

        // Middle snowball
        g.fillOval(175, 140, 150, 120);

        // Head
        g.fillOval(200, 70, 100, 90);

        // Eyes
        g.setColor(Color.BLACK);
        g.fillOval(225, 100, 8, 8);
        g.fillOval(265, 100, 8, 8);

        // Nose (carrot)
        g.setColor(Color.ORANGE);
        int[] xNose = {250, 250, 290};
        int[] yNose = {115, 125, 120};
        g.fillPolygon(xNose, yNose, 3);

        // Mouth
        g.setColor(Color.BLACK);
        g.drawArc(225, 120, 50, 30, 180, 180);

        // Buttons
        g.fillOval(245, 165, 10, 10);
        g.fillOval(245, 185, 10, 10);
        g.fillOval(245, 205, 10, 10);

        // Arms (sticks)
        g.drawLine(175, 180, 120, 160);
        g.drawLine(325, 180, 380, 160);

        // Hat
        g.setColor(Color.BLACK);
        g.fillRect(215, 40, 70, 30);   // top
        g.fillRect(200, 65, 100, 10);  // brim
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snowman ⛄");
        frame.setSize(500, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Snowman());
        frame.setVisible(true);
    }
}