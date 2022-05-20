import javax.swing.*;
import java.awt.*;

public class panel extends JPanel{
    public JPanel panel;
    int[] numbers;
    int WIDTH, HEIGHT;

    public panel(int width, int height) {
        WIDTH = width;
        HEIGHT = height;
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    public void setn(int n) {
        numbers = new int[n];

        for(int i = 0; i<numbers.length; i++) {
            numbers[i] = (int)(Math.random()*HEIGHT); 
        }
    }

    public void sortn(int k, int l) {
        int temp = HEIGHT + 1;
        for(int i = k; i < numbers.length; i++) {
            for(int j = l; j < numbers.length; j++ ) {
                if(numbers[j] > numbers[i]) {
                    temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                    return;
                }
            }
        }  
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        this.setBackground(Color.BLACK);

        g2d.setColor(Color.WHITE);

        for(int i  = 0; i < numbers.length; i++) {
            g2d.fillRect(i*WIDTH/numbers.length, HEIGHT-numbers[i], WIDTH/numbers.length-1, numbers[i]);
        }
    }
}
