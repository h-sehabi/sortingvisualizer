import javax.swing.*;


public class frame extends JFrame{
    panel panel;

    public frame(int n) {
        new JFrame();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new panel(900, 600);
        this.add(panel);
        panel.setn(n);
        this.pack();
        this.setVisible(true);
        wait(2000);
    }

    public void startGame(int n) {
        for(int k = 0; k < n; k++){
            for(int l = 0; l<n; l++) {
                panel.sortn(k, l);
                panel.repaint();
                wait(25);
            }
       } 
    }

    public void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch(Exception e) {
        }
    }

}
