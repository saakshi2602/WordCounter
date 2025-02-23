import javax.swing.*;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame  implements ActionListener {

    JLabel label1,label2,label3;
    JButton btn , btn2;
    JTextArea textarea;


    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,600);
        this.setTitle("JAVA WORD COUNTER");
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(192,192,192));

        // Create Text Area
        textarea = new JTextArea();
        textarea.setBounds(10,100,700,400);
        textarea.setFont(new Font("Arial",Font.PLAIN,18));
       // textarea.setBackground(Color.DARK_GRAY);
       label1 = new JLabel();
        label1.setBounds(25,25,350,50);
        label1.setFont(new Font("Arial",Font.BOLD,14));
        label1.setForeground(Color.blue);

       label2 = new JLabel();
        label2.setBounds(500,25,350,50);
        label2.setFont(new Font("Arial",Font.BOLD,14));
        label2.setForeground(Color.BLUE);

        label3 = new JLabel("Enter your text Below :");
        label3.setBounds(50,35,550,100);
        label3.setFont(new Font("Arial",Font.BOLD,14));
        label3.setForeground(Color.DARK_GRAY);

       btn = new JButton("Number of words");
        btn.setBounds(55,600,200,50);
        btn.setFont(new Font("Arial",Font.BOLD,15));
        btn.setForeground(Color.black);

        btn2 = new JButton("Number of Characters");
        btn2.setBounds(550,600,200,50);
        btn2.setFont(new Font("Arial",Font.BOLD,15));
        btn2.setForeground(Color.BLACK);

        btn.addActionListener(this);
        btn2.addActionListener(this );


this.add(label1);
this.add(label2);
this.add(label3);
this.add(textarea);
this.add(btn);
this.add(btn2);

this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent evt) {

        String str = textarea.getText();
        String words[]= str.split("\\s");

     if(evt.getSource()==btn) {
         label1.setText("The Number of Words is : " + words.length);
     } else if (evt.getSource()==btn2) {


         label2.setText("The Number of Characters is : " + str.length());
     }

    }
}
