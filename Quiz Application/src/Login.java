import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class Login extends JFrame implements ActionListener {
    JButton rules,back;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);

        JLabel heading=new JLabel("Next Step");
        heading.setBounds(800,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,44));
        heading.setForeground(new Color(30,144,254));
        add(heading);

        JLabel fname=new JLabel("Enter Your Name");
        fname.setBounds(810,150,300,25);
        fname.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        //fname.setForeground(new Color(30,144,254));
        add(fname);

        tfname=new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);


         rules=new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

         back=new JButton("Exit");
        back.setBounds(915,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setVisible(true);
        setLocation(200,150);
        setSize(1200,500);
    }
    public static void main(String[] args) {

        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==rules){
          String name=tfname.getText();
          setVisible(false);
          new Rules(name);
      }else if(e.getSource()==back){
          setVisible(false);
      }
    }
}
