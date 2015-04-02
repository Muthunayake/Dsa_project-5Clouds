package logics;

import file.HouseFile;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class RealEstate extends javax.swing.JFrame {

    private List<DataStore> houses;
    private int row = 0;

    private Boolean checkAdd = true;

    public RealEstate() {
        initComponents();
        setLocationRelativeTo(null);   //this is set application to middle when it start

        HouseFile fm = new HouseFile();     //this is for add button
        houses = fm.readFile();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_dis = new javax.swing.JLabel();
        jButton_reset = new javax.swing.JButton();
        jButton_next = new javax.swing.JButton();
        jButton_add = new javax.swing.JButton();
        jButton_list = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton_delete1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_numBedRooms = new javax.swing.JTextField();
        jTextField_price = new javax.swing.JTextField();
        jTextField_sqareFeet = new javax.swing.JTextField();
        jTextField_lastName = new javax.swing.JTextField();
        jTextField_firstName = new javax.swing.JTextField();
        jTextField_lotNumber = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel_dis.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_dis.setForeground(new java.awt.Color(0, 0, 204));
        jLabel_dis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_dis.setText("Next House Displaed : ");
        jLabel_dis.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton_reset.setText("Reset");
        jButton_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_resetActionPerformed(evt);
            }
        });

        jButton_next.setText("Next");
        jButton_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nextActionPerformed(evt);
            }
        });

        jButton_add.setText("Add");
        jButton_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addActionPerformed(evt);
            }
        });

        jButton_list.setText("Clear");
        jButton_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_listActionPerformed(evt);
            }
        });

        jButton6.setText("Find");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton_delete1.setText("Delete");
        jButton_delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_delete1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Lot Number:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("First Name:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Last Name:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Price:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Square Feet:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Number Of Bedrooms:");

        jTextField_numBedRooms.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_numBedRoomsKeyTyped(evt);
            }
        });

        jTextField_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_priceKeyTyped(evt);
            }
        });

        jTextField_sqareFeet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_sqareFeetKeyTyped(evt);
            }
        });

        jTextField_lastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_lastNameKeyTyped(evt);
            }
        });

        jTextField_firstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_firstNameKeyTyped(evt);
            }
        });

        jTextField_lotNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_lotNumberActionPerformed(evt);
            }
        });
        jTextField_lotNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_lotNumberKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel_dis, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton_reset, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jButton_add, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jButton_list, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton_next, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton_delete1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                    .addGap(16, 16, 16)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField_sqareFeet, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_numBedRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_price, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_lotNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel_dis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(366, 366, 366)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_next, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_list, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField_lotNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_price, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_sqareFeet, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_numBedRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(195, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_resetActionPerformed
        
        HouseFile h = new HouseFile();
        try {
            h.clearFile();
        } catch (Exception e) {
            System.out.println("erro "+e.getMessage());
        }
    }//GEN-LAST:event_jButton_resetActionPerformed

    private void jButton_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nextActionPerformed

        checkAdd = false;
        DataStore house = houses.get(row);
        jLabel_dis.setText("Next House Displaed : " + (row + 1));

        jTextField_firstName.setText(house.getFName());
        jTextField_lastName.setText(house.getLName());
        jTextField_lotNumber.setText(house.getLotNo() + "");
        jTextField_numBedRooms.setText(house.getNoOfRoom() + "");
        jTextField_price.setText(house.getPrice() + "");
        jTextField_sqareFeet.setText(house.getSqFeet() + "");

        Integer i = houses.size();
        if (--i != row) {
            row++;
        }
    }//GEN-LAST:event_jButton_nextActionPerformed

    private void jButton_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addActionPerformed

        try {
            if (jTextField_lotNumber.getText().equals("") || jTextField_firstName.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "You Should Enter Values ", "Error", JOptionPane.WARNING_MESSAGE);
                jTextField_lotNumber.requestFocusInWindow();
            } else {
                if (checkAdd) {

                    DataStore house = new DataStore();
                    house.setFName(jTextField_firstName.getText());
                    house.setLName(jTextField_lastName.getText());
                    house.setLotNo(Long.parseLong(jTextField_lotNumber.getText()));
                    house.setNoOfRoom(Integer.parseInt(jTextField_numBedRooms.getText()));
                    house.setPrice(Long.parseLong(jTextField_price.getText()));
                    house.setSqFeet(Long.parseLong(jTextField_sqareFeet.getText()));

                    Boolean check = false;
                    for (DataStore h : houses) {
                        if (Objects.equals(h.getLotNo(), house.getLotNo())) {
                            check = true;
                        }
                    }

                    if (check) {
                        JOptionPane.showMessageDialog(rootPane, "Lot Number", "Error", JOptionPane.WARNING_MESSAGE);
                    } else {
                

                        SortedList sl = new SortedList();
                        sl.saveFile(house);

                        HouseFile fileRead = new HouseFile();
                        houses = fileRead.readFile();

                        JOptionPane.showMessageDialog(rootPane, "Successfully Added", "Success", JOptionPane.INFORMATION_MESSAGE);

                        clearForm();
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "You need to rest befor add !", "Error", JOptionPane.WARNING_MESSAGE);
                }

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "You Should Enter Number ", "Error", JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_jButton_addActionPerformed

    private void jButton_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_listActionPerformed
        clearForm();
        ListHouse lh = new ListHouse(this, rootPaneCheckingEnabled, houses);
        lh.setVisible(true);    
    }//GEN-LAST:event_jButton_listActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        jTextField_lotNumber.requestFocusInWindow();
        jTextField_firstName.enable(false);
        jTextField_lastName.enable(false);
        jTextField_numBedRooms.enable(false);
        jTextField_price.enable(false);
        jTextField_sqareFeet.enable(false);
           
        if(!"".equals(jTextField_lotNumber.getText())) {
            
        Long lot_no = Long.parseLong(jTextField_lotNumber.getText());

        HouseFile hf = new HouseFile();

        List<DataStore> list = hf.readFile();

        for (DataStore ds : list) {

            if (ds.getLotNo().equals(lot_no)) {
                jTextField_firstName.setText(ds.getFName());
                jTextField_lastName.setText(ds.getLName());
                jTextField_numBedRooms.setText(ds.getNoOfRoom().toString());
                jTextField_price.setText(ds.getPrice().toString());
                jTextField_sqareFeet.setText(ds.getSqFeet().toString());
            }
        }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Enter Lot Number ", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton_delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_delete1ActionPerformed

        List<DataStore> newList = new ArrayList<>();

        for (DataStore h : houses) {
            if (!(h.getLotNo().toString().equals(jTextField_lotNumber.getText()))) {
                newList.add(h);
            }
        }

        JOptionPane.showMessageDialog(rootPane, "Successfully Delete", "Success", JOptionPane.INFORMATION_MESSAGE);

        clearForm();

        HouseFile hf = new HouseFile();
        hf.saveHouseList(newList);

        houses = hf.readFile();

    }//GEN-LAST:event_jButton_delete1ActionPerformed

    private void jTextField_lotNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_lotNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_lotNumberActionPerformed

    private void jTextField_lotNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_lotNumberKeyTyped
        char c=evt.getKeyChar();
        if( ((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE)) || (c == KeyEvent.VK_DELETE))){
        } else {
            JOptionPane.showMessageDialog(null,"Please Use Only Numbers !");
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_lotNumberKeyTyped

    private void jTextField_priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_priceKeyTyped
        char c=evt.getKeyChar();
        if( ((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE)) || (c == KeyEvent.VK_DELETE)) || c == '.'){
        } else {
            JOptionPane.showMessageDialog(null,"Please Use Only Numbers !");
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_priceKeyTyped

    private void jTextField_sqareFeetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_sqareFeetKeyTyped
        char c=evt.getKeyChar();
        if( ((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE)) || (c == KeyEvent.VK_DELETE)) || c == '.'){
        } else {
            JOptionPane.showMessageDialog(null,"Please Use Only Numbers !");
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_sqareFeetKeyTyped

    private void jTextField_numBedRoomsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_numBedRoomsKeyTyped
        char c=evt.getKeyChar();
        if( ((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE)) || (c == KeyEvent.VK_DELETE))){
        } else {
            JOptionPane.showMessageDialog(null,"Please Use Only Numbers !");
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_numBedRoomsKeyTyped

    private void jTextField_firstNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_firstNameKeyTyped
        char c=evt.getKeyChar();
        if((Character.isDigit(c))){
            JOptionPane.showMessageDialog(null,"Please Use Only Characters !");
            evt.consume();
        } else {
        }
    }//GEN-LAST:event_jTextField_firstNameKeyTyped

    private void jTextField_lastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_lastNameKeyTyped
        char c=evt.getKeyChar();
        if((Character.isDigit(c))){
            JOptionPane.showMessageDialog(null,"Please Use Only Characters !");
            evt.consume();
        } else {
        }
    }//GEN-LAST:event_jTextField_lastNameKeyTyped

    public void clearForm() {

        
        jTextField_firstName.enable(true);
        jTextField_lastName.enable(true);
        jTextField_numBedRooms.enable(true);
        jTextField_price.enable(true);
        jTextField_sqareFeet.enable(true);
           
        
        
        jTextField_firstName.setText("");
        jTextField_lastName.setText("");
        jTextField_lotNumber.setText("");
        jTextField_numBedRooms.setText("");
        jTextField_price.setText("");
        jTextField_sqareFeet.setText("");

        jLabel_dis.setText("Next House Displaed : ");
        row = 0;

        checkAdd = true;
    }

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");        /* Set the  look and feel */

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(RealEstate.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(RealEstate.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(RealEstate.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(RealEstate.class.getName()).log(Level.SEVERE, null, ex);
                }

                new RealEstate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_delete1;
    private javax.swing.JButton jButton_list;
    private javax.swing.JButton jButton_next;
    private javax.swing.JButton jButton_reset;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_dis;
    private javax.swing.JTextField jTextField_firstName;
    private javax.swing.JTextField jTextField_lastName;
    private javax.swing.JTextField jTextField_lotNumber;
    private javax.swing.JTextField jTextField_numBedRooms;
    private javax.swing.JTextField jTextField_price;
    private javax.swing.JTextField jTextField_sqareFeet;
    // End of variables declaration//GEN-END:variables
}
