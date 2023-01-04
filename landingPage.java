import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class landingPage extends JFrame implements ActionListener{
    JButton yesButton = new JButton("Yes");
    JButton noButton = new JButton("No");
    JLabel title = new JLabel();
    JPanel mainPanel = new JPanel();
    JPanel panelButton = new JPanel();
    ImageIcon logo = new ImageIcon("logosementara.png");

    landingPage(){

        // Main panel:
        mainPanel.add(title);
        mainPanel.setBounds(0, 0, 700, 700);
        mainPanel.setBackground(new Color(255, 178, 0));

        // Button panel:
        btnPanel.add(yesButton);
        btnPanel.add(noButton);
        btnPanel.setBackground(new Color(255, 178, 0));
        btnPanel.setBounds(0, 500, 700, 200);

        // Yes button:
        yesButton.setFocusable(false);
        yesButton.setBounds(10, 16, 20, 4);
        yesButton.addActionListener(this);

        // No button:
        noButton.setFocusable(false);
        noButton.addActionListener(this);

        // Title:
        title.setIcon(logo);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.TOP);
        title.setText("Do you have an account?");
        title.setHorizontalTextPosition(JLabel.CENTER);
        title.setVerticalTextPosition(JLabel.BOTTOM);
        title.setIconTextGap(-50);
        title.setFont(new Font("Roboto", Font.BOLD, 20));
        title.setForeground(Color.white);

        // Main frame
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(700, 700);
        this.setTitle("Look - Er");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(mainPanel);
        this.add(btnPanel);
    }

    @Override
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == yesButton){
            loginPage login = new loginPage();
            dispose();
        }else if(e.getSource() == noButton){
            registerPage register = new registerPage();
            dispose();
        }
    }
    
}