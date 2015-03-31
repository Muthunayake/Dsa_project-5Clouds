
package logics;

import file.HouseFile;
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
        jLabel4 = new javax.swing.JLabel();
        jTextField_numBedRooms = new javax.swing.JTextField();
        jTextField_sqareFeet = new javax.swing.JTextField();
        jTextField_price = new javax.swing.JTextField();
        jTextField_lastName = new javax.swing.JTextField();
        jTextField_firstName = new javax.swing.JTextField();
        jTextField_lotNumber = new javax.swing.JTextField();
        jButton_reset = new javax.swing.JButton();
        jButton_next = new javax.swing.JButton();
        jButton_add = new javax.swing.JButton();
        jButton_delete = new javax.swing.JButton();
        jButton_list = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel_dis.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_dis.setForeground(new java.awt.Color(0, 0, 204));
        jLabel_dis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_dis.setText("Next House Displaed : ");
        jLabel_dis.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Lot Number:");

        jTextField_numBedRooms.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jTextField_sqareFeet.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jTextField_price.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jTextField_lastName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jTextField_firstName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jTextField_lotNumber.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

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

        jButton_delete.setText("Delete");
        jButton_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deleteActionPerformed(evt);
            }
        });

        jButton_list.setText("View");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_list, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton_delete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_next, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_sqareFeet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(jTextField_numBedRooms, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(jTextField_price, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(jTextField_lastName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(jTextField_firstName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(jTextField_lotNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel_dis, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel_dis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_lotNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_price, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_sqareFeet, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_numBedRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_next, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_list, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_resetActionPerformed

       clearForm();
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
                //                HouseFile FileSave = new HouseFile();
                //                FileSave.saveHouseFile(house);

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

    }//GEN-LAST:event_jButton_addActionPerformed

    private void jButton_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteActionPerformed

      

    }//GEN-LAST:event_jButton_deleteActionPerformed

    private void jButton_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_listActionPerformed

     
    }//GEN-LAST:event_jButton_listActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

      
    }//GEN-LAST:event_jButton6ActionPerformed

   
    public void clearForm() {

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
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_list;
    private javax.swing.JButton jButton_next;
    private javax.swing.JButton jButton_reset;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_dis;
    private javax.swing.JTextField jTextField_firstName;
    private javax.swing.JTextField jTextField_lastName;
    private javax.swing.JTextField jTextField_lotNumber;
    private javax.swing.JTextField jTextField_numBedRooms;
    private javax.swing.JTextField jTextField_price;
    private javax.swing.JTextField jTextField_sqareFeet;
    // End of variables declaration//GEN-END:variables
}
