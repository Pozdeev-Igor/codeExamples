//Animation example



package GUI.Animation;

import GUI.MyDrawPanel;

import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {
    int x = 70; //создаем два поля в главном классе GUI
    int y = 70; //для координат х и у круга

    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();  //создаём виджеты и помещаем их во фрейм

        frame.getContentPane().add(drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);

        for (int i = 0; i < 130; i++) {
            x++;
            y++;

            drawPanel.repaint();

            try {
                Thread.sleep(25);
            } catch (InterruptedException e) { }
        }
    }

    class MyDrawPanel extends  JPanel {
        public void paintComponent (Graphics g) {
            g.setColor(Color.white);
            g.fillRect(0,0,this.getWidth(), this.getHeight());  //методы getWidth() и getHeight() унаследованы от JPanel
            g.setColor(Color.green);
            g.fillOval(x, y, 40, 40);
        }
    }
}
hi hi hi KISKA
