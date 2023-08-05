import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("cards.jpg");
        image.getImage();

        // JLabel = a GUI display area for a string of text, an image, or both
        JLabel label = new JLabel(); // create a label
        label.setText("It's Wednesday my dudes"); // set text of label
        label.setIcon(image);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.add(label);

    }
}