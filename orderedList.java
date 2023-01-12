package com.mycompany.oop;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Raiza Rahman
 */
public class orderedList extends javax.swing.JFrame {

    public orderedList() {
        initComponents();
        setSize(380, 770);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bottom = new javax.swing.JPanel();
        top = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        isi = new javax.swing.JPanel();
        freelancertop = new javax.swing.JLabel();
        bback = new javax.swing.JButton();
        brefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        isi.setBackground(new java.awt.Color(255, 245, 220));

        freelancertop.setFont(new java.awt.Font("Casual", 0, 36)); // NOI18N
        freelancertop.setForeground(new java.awt.Color(0, 56, 70));
        freelancertop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        freelancertop.setText("Your Order");

        bback.setBackground(new java.awt.Color(255, 178, 0));
        bback.setFont(new java.awt.Font("Bee Leave", 0, 18)); // NOI18N
        bback.setForeground(new java.awt.Color(255, 245, 220));
        bback.setText("Back");
        bback.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbackActionPerformed(evt);
            }
        });

        brefresh.setBackground(new java.awt.Color(255, 178, 0));
        brefresh.setFont(new java.awt.Font("Bee Leave", 0, 18)); // NOI18N
        brefresh.setForeground(new java.awt.Color(255, 245, 220));
        brefresh.setText("Refresh");
        brefresh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        brefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout isiLayout = new javax.swing.GroupLayout(isi);
        isi.setLayout(isiLayout);
        isiLayout.setHorizontalGroup(
            isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(isiLayout.createSequentialGroup()
                .addGroup(isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(isiLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(bback, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(isiLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(freelancertop, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(brefresh)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        isiLayout.setVerticalGroup(
            isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(isiLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(freelancertop)
                    .addComponent(brefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(416, 416, 416)
                .addComponent(bback, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(isi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 10, Short.MAX_VALUE)))
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

    // Balik lagi ke frame selectcategory
    private void bbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbackActionPerformed
        kategori selectCategory = new kategori();
        selectCategory.setVisible(true);
        dispose();
    }//GEN-LAST:event_bbackActionPerformed

    // Tombol refresh untuk menampilkan list order client
    private void brefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brefreshActionPerformed
        JPanel[] orderListPanel = new JPanel[100];
        JLabel[] title = new JLabel[100];
        JLabel[] fees = new JLabel[100];
        isi.setSize(375, 600);
        
        try{
            
            // Scan isi file .txt
            File orderList = new File("orderList.txt");
            Scanner reader = new Scanner(orderList);
            
            // Initialize variabel i buat array, y buat posisi y dari masing-masing panel & label
            int i = 1;
            int y = 85;
            
            while(reader.hasNextLine()){
                
                String line = reader.nextLine();
                
                if(line.contains("SugaPackageOne")){
                    
                    // Buat panel dan isinya
                    orderListPanel[i] = new JPanel();
                    orderListPanel[i].setBounds(30, y, 315, 75);
                    orderListPanel[i].setBackground(new Color(255,178,0));
                    orderListPanel[i].setVisible(true);
                    
                    // Buat label untuk judul
                    title[i] = new JLabel();
                    title[i].setBounds(50, y - 10, 315, 75);
                    title[i].setForeground(Color.WHITE);
                    title[i].setFont(new Font("Bee Leave", 0, 18));
                    title[i].setText("Suga - Package 1");
                    title[i].setVisible(true);
                    
                    // Buat label untuk harga
                    fees[i] = new JLabel();
                    fees[i].setBounds(50, y + 15, 315, 75);
                    fees[i].setForeground(Color.WHITE);
                    fees[i].setFont(new Font("Bee Leave", 0, 14));
                    fees[i].setText("Rp15.000.000");
                    fees[i].setVisible(true);
                    
                    // Panel dan label yang tadi udah dibuat ditambahin ke dalem panel isi
                    isi.add(title[i]);
                    isi.add(fees[i]);
                    isi.add(orderListPanel[i]);
                    isi.setVisible(true);                    
                }else if(line.contains("SugaPackageTwo")){
                    
                    // Buat panel dan isinya
                    orderListPanel[i] = new JPanel();
                    orderListPanel[i].setBounds(30, y, 315, 75);
                    orderListPanel[i].setBackground(new Color(255,178,0));
                    orderListPanel[i].setVisible(true);
                    
                    // Buat label untuk judul
                    title[i] = new JLabel();
                    title[i].setBounds(50, y - 10, 315, 75);
                    title[i].setForeground(Color.WHITE);
                    title[i].setFont(new Font("Bee Leave", 0, 18));
                    title[i].setText("Suga - Package 2");
                    title[i].setVisible(true);
                    
                    // Buat label untuk harga
                    fees[i] = new JLabel();
                    fees[i].setBounds(50, y + 15, 315, 75);
                    fees[i].setForeground(Color.WHITE);
                    fees[i].setFont(new Font("Bee Leave", 0, 14));
                    fees[i].setText("Rp10.000.000");
                    fees[i].setVisible(true);
                    
                    // Panel dan label yang tadi udah dibuat ditambahin ke dalem panel isi
                    isi.add(title[i]);
                    isi.add(fees[i]);
                    isi.add(orderListPanel[i]);
                    isi.setVisible(true);
                }else if(line.contains("ApoyPackageOne")){
                    
                    // Buat panel dan isinya
                    orderListPanel[i] = new JPanel();
                    orderListPanel[i].setBounds(30, y, 315, 75);
                    orderListPanel[i].setBackground(new Color(255,178,0));
                    orderListPanel[i].setVisible(true);
                    
                    // Buat label untuk judul
                    title[i] = new JLabel();
                    title[i].setBounds(50, y - 10, 315, 75);
                    title[i].setForeground(Color.WHITE);
                    title[i].setFont(new Font("Bee Leave", 0, 18));
                    title[i].setText("Apoy - Package 1");
                    title[i].setVisible(true);
                    
                    // Buat label untuk harga
                    fees[i] = new JLabel();
                    fees[i].setBounds(50, y + 15, 315, 75);
                    fees[i].setForeground(Color.WHITE);
                    fees[i].setFont(new Font("Bee Leave", 0, 14));
                    fees[i].setText("Rp7.500.000");
                    fees[i].setVisible(true);
                    
                    // Panel dan label yang tadi udah dibuat ditambahin ke dalem panel isi
                    isi.add(title[i]);
                    isi.add(fees[i]);
                    isi.add(orderListPanel[i]);
                    isi.setVisible(true);
                }else if(line.contains("ApoyPackageTwo")){
                    
                    // Buat panel dan isinya
                    orderListPanel[i] = new JPanel();
                    orderListPanel[i].setBounds(30, y, 315, 75);
                    orderListPanel[i].setBackground(new Color(255,178,0));
                    orderListPanel[i].setVisible(true);
                    
                    // Buat label untuk judul
                    title[i] = new JLabel();
                    title[i].setBounds(50, y - 10, 315, 75);
                    title[i].setForeground(Color.WHITE);
                    title[i].setFont(new Font("Bee Leave", 0, 18));
                    title[i].setText("Apoy - Package 1");
                    title[i].setVisible(true);
                    
                    // Buat label untuk harga
                    fees[i] = new JLabel();
                    fees[i].setBounds(50, y + 15, 315, 75);
                    fees[i].setForeground(Color.WHITE);
                    fees[i].setFont(new Font("Bee Leave", 0, 14));
                    fees[i].setText("Rp3.000.000");
                    fees[i].setVisible(true);
                    
                    // Panel dan label yang tadi udah dibuat ditambahin ke dalem panel isi
                    isi.add(title[i]);
                    isi.add(fees[i]);
                    isi.add(orderListPanel[i]);
                    isi.setVisible(true);
                }
                
                // i ditambah biar array-nya pindah, y ditambah biar posisinya berubah
                i++;
                y += 100;
            }
        }catch(IOException e1){
            
        }
    }//GEN-LAST:event_brefreshActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new orderedList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bback;
    private javax.swing.JPanel bottom;
    private javax.swing.JButton brefresh;
    private javax.swing.JLabel freelancertop;
    private javax.swing.JPanel isi;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel top;
    // End of variables declaration//GEN-END:variables

}
