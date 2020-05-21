package com.zqf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingTest {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("My JFrame");

        JButton jButton_1 = new JButton("My Button");

//        jButton_1.addActionListener((e) -> {System.out.println("Button Pressed!");
//            System.out.println("hhhhhh");
//        });

        jButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Buttton Pressed");
            }
        });

        jFrame.add(jButton_1);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
