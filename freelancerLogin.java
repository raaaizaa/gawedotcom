package com.mycompany.oop;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Raiza Rahman
 */
public class freelancerLogin extends javax.swing.JFrame {
    JFrame loginFrame = new JFrame();
    int temp;

    public freelancerLogin() {
        initComponents();
        setSize(380, 770);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        isi = new javax.swing.JPanel();
        freelancertop = new javax.swing.JLabel();
        star = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        bname = new javax.swing.JTextField();
        username = new javax.swing.JLabel();
        busername = new javax.swing.JTextField();
        pass = new javax.swing.JLabel();
        bpass = new javax.swing.JPasswordField();
        blogin = new javax.swing.JButton();
        categorybox = new javax.swing.JComboBox<>();
        category = new javax.swing.JLabel();
        bottom = new javax.swing.JPanel();
        top = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        isi.setBackground(new java.awt.Color(255, 245, 220));

        freelancertop.setFont(new java.awt.Font("Casual", 0, 48)); // NOI18N
        freelancertop.setForeground(new java.awt.Color(0, 56, 70));
        freelancertop.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        freelancertop.setText("FREELANCER");

        star.setIcon(new javax.swing.ImageIcon("C:\\Users\\Raiza Rahman\\OneDrive - Bina Nusantara University\\Documents\\NetBeansProjects\\oop\\src\\main\\java\\com\\mycompany\\oop\\asset\\star16.png")); // NOI18N

        name.setFont(new java.awt.Font("Bee Leave", 0, 15)); // NOI18N
        name.setForeground(new java.awt.Color(255, 127, 174));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("Name");

        bname.setFont(new java.awt.Font("Bee Leave", 0, 12)); // NOI18N
        bname.setForeground(new java.awt.Color(255, 178, 0));
        bname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        bname.setToolTipText("");
        bname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 178, 0)));
        bname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnameActionPerformed(evt);
            }
        });

        username.setFont(new java.awt.Font("Bee Leave", 0, 15)); // NOI18N
        username.setForeground(new java.awt.Color(255, 127, 174));
        username.setText("Username");

        busername.setFont(new java.awt.Font("Bee Leave", 0, 12)); // NOI18N
        busername.setForeground(new java.awt.Color(255, 178, 0));
        busername.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        busername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 178, 0)));
        busername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busernameActionPerformed(evt);
            }
        });

        pass.setFont(new java.awt.Font("Bee Leave", 0, 15)); // NOI18N
        pass.setForeground(new java.awt.Color(255, 127, 174));
        pass.setText("Password");

        bpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 178, 0)));
        bpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpassActionPerformed(evt);
            }
        });

        blogin.setBackground(new java.awt.Color(255, 178, 0));
        blogin.setFont(new java.awt.Font("Bee Leave", 0, 18)); // NOI18N
        blogin.setForeground(new java.awt.Color(255, 245, 220));
        blogin.setText("Login");
        blogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloginActionPerformed(evt);
            }
        });

        categorybox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Graphics & Design", "Video & Animation", "Music & Audio", "Programming" }));
        categorybox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryboxActionPerformed(evt);
            }
        });

        category.setFont(new java.awt.Font("Bee Leave", 0, 15)); // NOI18N
        category.setForeground(new java.awt.Color(255, 127, 174));
        category.setText("Category");

        javax.swing.GroupLayout isiLayout = new javax.swing.GroupLayout(isi);
        isi.setLayout(isiLayout);
        isiLayout.setHorizontalGroup(
            isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(isiLayout.createSequentialGroup()
                .addGroup(isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(isiLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(blogin, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(isiLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pass)
                            .addComponent(username)
                            .addComponent(name)
                            .addGroup(isiLayout.createSequentialGroup()
                                .addComponent(star)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(freelancertop, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE))
                            .addComponent(bname)
                            .addComponent(busername)
                            .addComponent(bpass)
                            .addComponent(categorybox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(category))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        isiLayout.setVerticalGroup(
            isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(isiLayout.createSequentialGroup()
                .addGroup(isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(isiLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(freelancertop, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(isiLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(star)))
                .addGap(28, 28, 28)
                .addComponent(name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(busername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bpass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(category)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(categorybox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(blogin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        bottom.setBackground(new java.awt.Color(255, 127, 174));

        javax.swing.GroupLayout bottomLayout = new javax.swing.GroupLayout(bottom);
        bottom.setLayout(bottomLayout);
        bottomLayout.setHorizontalGroup(
            bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        bottomLayout.setVerticalGroup(
            bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        top.setBackground(new java.awt.Color(255, 178, 0));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Raiza Rahman\\OneDrive - Bina Nusantara University\\Documents\\NetBeansProjects\\oop\\src\\main\\java\\com\\mycompany\\oop\\asset\\logo.png")); // NOI18N

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel6)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(isi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(1, 1, 1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(569, 569, 569)
                            .addComponent(bottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(isi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnameActionPerformed

    }//GEN-LAST:event_bnameActionPerformed

    private void busernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busernameActionPerformed

    }//GEN-LAST:event_busernameActionPerformed

    private void bpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpassActionPerformed

    }//GEN-LAST:event_bpassActionPerformed

    // Tiap pencet tombol login si string nama, username, sama password bakal di-check
    private void bloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloginActionPerformed
        String name = new String(bname.getText());
        String username = new String(busername.getText());
        String pass = new String(bpass.getPassword());
        int type = temp;

        userFreelancer loginAsFreelancer = new userFreelancer(name, username, pass, type);

        // Kalo bener masuk ke page sorrythispage karena untuk sekarang fokusnya ke sisi client dulu
        if(loginAsFreelancer.dummyFreelancerValidation(name, username, pass, type) == true){
            sorryThisPage freelancerPage = new sorryThisPage();
            freelancerPage.setVisible(true);
            dispose();
        }else{ // Lagi-lagi kalo salah, ya wassalam
            JOptionPane.showMessageDialog(loginFrame, "Login Failed", "Failed", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_bloginActionPerformed

    private void categoryboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryboxActionPerformed
        
        String selectedValue = categorybox.getSelectedItem().toString();
        
        if(selectedValue.equals("Graphics & Design")){
            temp = 1;
        }else if(selectedValue.equals("Video & Animation")){
            temp = 2;
        }else if(selectedValue.equals("Music & Audio")){
            temp = 3;
        }else if(selectedValue.equals("Programming")){
            temp = 4;
        }
        
    }//GEN-LAST:event_categoryboxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(freelancerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(freelancerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(freelancerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(freelancerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new freelancerLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blogin;
    private javax.swing.JTextField bname;
    private javax.swing.JPanel bottom;
    private javax.swing.JPasswordField bpass;
    private javax.swing.JTextField busername;
    private javax.swing.JLabel category;
    private javax.swing.JComboBox<String> categorybox;
    private javax.swing.JLabel freelancertop;
    private javax.swing.JPanel isi;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel name;
    private javax.swing.JLabel pass;
    private javax.swing.JLabel star;
    private javax.swing.JPanel top;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
