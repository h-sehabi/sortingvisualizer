import java.awt.event.*;

public class App {
    public static void main(String[] args) throws Exception {
       frame frame = new frame();

        frame.menu.sort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.startSort(25);
            }
        });

    }
}



