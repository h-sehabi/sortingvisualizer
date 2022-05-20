import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class frame extends JFrame {
    panel panel;
    JPanel mainPanel;
    menu menu;
    int n = 25;

    public frame() {
        new JFrame();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainPanel = new JPanel();
        
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        panel = new panel(900, 600);
        menu = new menu();
        mainPanel.add(panel);
        mainPanel.add(menu);
        this.add(mainPanel);
        panel.setn(n);
        menu.rand.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    n = Integer.parseInt(menu.textField.getText());
                } catch(Exception err) {
                     return;
                }
                panel.setn(n);
                panel.repaint();
            }
        });
        menu.sort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startSort(n);
            }
        });
        this.pack();
        this.setResizable(false);
        this.setVisible(true);
        wait(2000);
    }

    public void startSort(int n) {
      /*  for(int k = 0; k < n; k++){
            for(int l = 0; l<n; l++) {
               // panel.sortn(k, l);
                panel.setn(l);
                panel.repaint();
                System.out.println("test" + l + " " + k);
                wait(25);
            }
       }  */

       for(int i = 1; i<=450; i++) {
           panel.setn(i);
           panel.repaint();
           System.out.println(i);
           wait(25);
       }
    }

    public void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch(Exception e) {
        }
    }

}
