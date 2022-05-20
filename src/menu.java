import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class menu extends JPanel{
    JTextField textField;
    JButton rand, sort;

    public menu() { 
        this.setBounds(0, 0, 900, 5);

        rand = new JButton("Randomize");
        sort = new JButton("Sort");

        this.add(addTextField());
        this.add(rand);
        this.add(sort);
    }

    private JTextField addTextField() {
        textField = new JTextField(5);
        return textField;
    }
}