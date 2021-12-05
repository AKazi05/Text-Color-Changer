import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

class TextColorChanger extends Frame implements ActionListener{
    static JButton red;
    static JButton green;
    static JButton black;
    static JButton blue;
    static JTextField output;
    static JTextField textField;
    public static void main(String [] args) {
        
        Frame frame = new Frame();
        frame.setSize(750, 750);
        red = new JButton ("RED");
        red.addActionListener(new TextColorChanger());
        green = new JButton ("GREEN");
        green.addActionListener(new TextColorChanger());
        blue = new JButton("BLUE");
        blue.addActionListener(new TextColorChanger());
        black = new JButton("Black");
        black.addActionListener(new TextColorChanger());
        JButton clear = new JButton ("CLEAR");

        JLabel label = new JLabel ("Enter text:");
        textField = new JTextField (25);

        label.setLocation(54, 76);
        textField.setLocation(50, 50);
        
        output = new JTextField (25);
        output.setLocation(200, 200);
        output.setEditable(false);

        Panel p = new Panel();
        p.add(red);
        p.add(green);
        p.add(blue);
        p.add(black);
        p.add(clear);
        p.add(label);
        p.add(textField);
        p.add(output);
        
        p.setLocation(0,0);
        p.setSize(500, 500);

        // green.addActionListener(e -> output.setForeground(Color.GREEN));
        
        clear.addActionListener(r -> {
                textField.setText("");
                textField.requestFocus();
                output.setText("");
                output.requestFocus();
            });
        frame.add(p);

        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == red){
            output.setText(textField.getText());
            output.setForeground(Color.RED);
        }
        if(e.getSource() == green){
            output.setText(textField.getText());
            output.setForeground(Color.GREEN);
        }
        if(e.getSource() == blue){
            output.setText(textField.getText());
            output.setForeground(Color.BLUE);
        }
        if(e.getSource() == black){
            output.setText(textField.getText());
            output.setForeground(Color.BLACK);
        }
        if(e.getSource() == null){
            System.exit(0);
        }
    }
}
