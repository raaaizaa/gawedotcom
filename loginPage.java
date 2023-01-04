public class loginPage extends JFrame implements ActionListener{
    
    JFrame loginFrame = new JFrame();
    
    JLabel appLogo = new JLabel();
    JLabel usernameLabel = new JLabel();
    JLabel passwordLabel = new JLabel();
    
    JPanel mainPanel = new JPanel();
    JPanel usernameLabelPanel = new JPanel();
    JPanel passwordLabelPanel = new JPanel();
    JPanel usernamePanel = new JPanel();
    JPanel passwordPanel = new JPanel();
    JPanel buttonPanel = new JPanel();

    ImageIcon logo = new ImageIcon("logosementara.png");

    JTextField usernameField = new JTextField();
    JTextField passwordField = new JTextField();

    JButton loginButton = new JButton("Login");

    loginPage(){

        // Main panel:
        mainPanel.add(appLogo);
        mainPanel.setBounds(0, 0, 700, 400);
        mainPanel.setBackground(new Color(255, 178, 0));
        mainPanel.setVisible(true);

        // Panel for username label:
        usernameLabelPanel.setBounds(0, 400, 700, 30);
        usernameLabelPanel.setBackground(new Color(98, 189, 238));
        usernameLabelPanel.setVisible(true);
        usernameLabelPanel.add(usernameLabel);

        // Panel for username textfield:
        usernamePanel.setBounds(0, 430, 700, 50);
        usernamePanel.setBackground(new Color(98, 189, 238));
        usernamePanel.add(usernameField);

        // Panel for password label:
        passwordLabelPanel.setBounds(0,480,700,30);
        passwordLabelPanel.setBackground(new Color(98, 189, 238));
        passwordLabelPanel.setVisible(true);
        passwordLabelPanel.add(passwordLabel);

        // Panel for password textfield:
        passwordPanel.setBounds(0,510,700,50);
        passwordPanel.setBackground(new Color(98, 189, 238));
        passwordPanel.setVisible(true);
        passwordPanel.add(passwordField);

        // Panel for login button:
        buttonPanel.setBounds(0,560,700,140);
        buttonPanel.setBackground(new Color(98, 189, 238));
        buttonPanel.setVisible(true);
        buttonPanel.add(loginButton, BorderLayout.CENTER);

        // Username label:
        usernameLabel.setText("Email : ");
        usernameLabel.setForeground(Color.WHITE);
        usernameLabel.setFont(new Font("Roboto", Font.BOLD, 20));

        // Password label:
        passwordLabel.setText("Password : ");
        passwordLabel.setForeground(Color.WHITE);
        passwordLabel.setFont(new Font("Roboto", Font.BOLD, 20));

        // Login button:
        loginButton.setBounds(300,600,100,50);
        loginButton.addActionListener(this);

        // Username textfield:
        usernameField.setPreferredSize(new Dimension(250,40));

        // Password textfield:
        passwordField.setPreferredSize(new Dimension(250,40));
        passwordField.setEchoChar('*');

        //Logo
        appLogo.setIcon(logo);
        appLogo.setHorizontalAlignment(JLabel.CENTER);
        appLogo.setVerticalAlignment(JLabel.TOP);

        //Login Frame
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(700,700);
        loginFrame.setLayout(null);
        loginFrame.setVisible(true);
        loginFrame.add(mainPanel);
        loginFrame.add(usernameLabelPanel);
        loginFrame.add(usernamePanel);
        loginFrame.add(passwordLabelPanel);
        loginFrame.add(passwordPanel);
        loginFrame.add(buttonPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == loginButton){
            try{
                int temp = 0;

                String loginUsername = new String(usernameField.getText());
                String loginPassword = new String(passwordField.getPassword());
                File userData = new File("userData.txt");

                Scanner reader = new Scanner(userData);

                while(reader.hasNextLine()){
                    String dataRead = reader.nextLine();
                    String[] userA =dataRead.split("#");
                    String name = user[0];
                    String username = user[1];
                    String password = user[2];
                    String type = user[3];

                    user data = new user(username, password, type);

                    if(data.username.equals(loginUsername) && data.password.equals(loginPassword)){
                        if(data.type.equals("freelancer")){
                            temp = 2;
                            return;
                        }else if(data.type.equals("client")){
                            temp = 1;
                            break;
                        }
                    }
                }
                if(temp == 1){
                    JOptionPane.showMessageDialog(loginFrame, "Login Success", "Success", JOptionPane.INFORMATION_MESSAGE);
                    mainPageApp test = new mainPageApp();
                }else{
                    JOptionPane.showMessageDialog(loginFrame, "Login Failed", "Failed", JOptionPane.ERROR_MESSAGE);
                }
                reader.close();
            }catch(IOException e1){
                
            }
        }
    }
}
