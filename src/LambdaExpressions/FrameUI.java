package LambdaExpressions;

import javax.swing.*;
import java.awt.*;

public class FrameUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Frame");
        frame.setSize(200, 200);
        frame.setLayout(new FlowLayout());
        Button button = new Button("Click");

//        Using the Anonymous class.

        /*
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hii,Good Morning");
            }
        });*/


//        Using LE.
//
        button.addActionListener((e -> {
            JOptionPane.showMessageDialog(null, "Hii,Good Morning");
        }));

        frame.add(button);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
