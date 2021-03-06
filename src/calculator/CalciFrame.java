/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculator;

/**
 *
 * @author sharu
 */
public class CalciFrame extends javax.swing.JFrame {

   double num , answer;
   int calculation;
    
    public CalciFrame() {
        initComponents();
    }

    public void arithmetic_operations()
    {
        switch(calculation)
        {
            case 1:
                   answer = num + Double.parseDouble(txt_display.getText());
                   txt_display.setText(Double.toString(answer));
                   break;
            case 2:
                   answer = num - Double.parseDouble(txt_display.getText());
                   txt_display.setText(Double.toString(answer));
                   break;
            case 3:
                   answer = num * Double.parseDouble(txt_display.getText());
                   txt_display.setText(Double.toString(answer));
                   break;
            case 4:
                   answer = num / Double.parseDouble(txt_display.getText());
                   txt_display.setText(Double.toString(answer));
                   break;
                   }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt_display = new javax.swing.JTextField();
        btn_clr = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_dot = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_div = new javax.swing.JButton();
        btn_sub = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_mul = new javax.swing.JButton();
        btn_equal = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        btn_label = new javax.swing.JLabel();

        jButton5.setText("jButton2");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        txt_display.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txt_display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_display.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 204, 204), new java.awt.Color(0, 204, 204), new java.awt.Color(0, 204, 204)));
        txt_display.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_displayActionPerformed(evt);
            }
        });

        btn_clr.setBackground(new java.awt.Color(0, 204, 204));
        btn_clr.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_clr.setForeground(new java.awt.Color(0, 0, 0));
        btn_clr.setLabel("CLEAR");
        btn_clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clrActionPerformed(evt);
            }
        });

        btn_2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_2.setText("2");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_1.setText("1");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_4.setText("4");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_5.setText("5");
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_7.setText("7");
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_8.setText("8");
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        btn_0.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_0.setText("0");
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });

        btn_dot.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_dot.setText(".");
        btn_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dotActionPerformed(evt);
            }
        });

        btn_9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_9.setText("9");
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        btn_6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_6.setText("6");
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_3.setText("3");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_div.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_div.setText("/");
        btn_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divActionPerformed(evt);
            }
        });

        btn_sub.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_sub.setText("-");
        btn_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subActionPerformed(evt);
            }
        });

        btn_add.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_add.setText("+");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_mul.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_mul.setText("*");
        btn_mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mulActionPerformed(evt);
            }
        });

        btn_equal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_equal.setText("=");
        btn_equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equalActionPerformed(evt);
            }
        });

        btn_back.setBackground(new java.awt.Color(0, 204, 204));
        btn_back.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_back.setForeground(new java.awt.Color(0, 0, 0));
        btn_back.setText("BACK");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        btn_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_label.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_label, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_display)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btn_back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btn_4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                        .addComponent(btn_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(34, 34, 34)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btn_2, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                        .addComponent(btn_8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_dot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btn_mul, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btn_div, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btn_equal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btn_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_clr, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btn_label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_display, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_back, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(btn_clr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mul, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dot, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_div, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_equal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_displayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_displayActionPerformed

    private void btn_clrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clrActionPerformed
        txt_display.setText("");
    }//GEN-LAST:event_btn_clrActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        txt_display.setText(txt_display.getText() + "2");
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
              txt_display.setText(txt_display.getText() + "4");

    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        txt_display.setText(txt_display.getText() + "5");

    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
                txt_display.setText(txt_display.getText() + "7");

    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
               txt_display.setText(txt_display.getText() + "8");

    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
               txt_display.setText(txt_display.getText() + "0");

    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dotActionPerformed
               txt_display.setText(txt_display.getText() + ".");

    }//GEN-LAST:event_btn_dotActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
               txt_display.setText(txt_display.getText() + "9");

    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        txt_display.setText(txt_display.getText() + "6");

    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        txt_display.setText(txt_display.getText() + "3");

    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divActionPerformed
         num = Double.parseDouble(txt_display.getText());
        calculation = 4;
        txt_display.setText("");
        btn_label.setText(num + "  /");
    }//GEN-LAST:event_btn_divActionPerformed

    private void btn_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subActionPerformed
         num = Double.parseDouble(txt_display.getText());
        calculation = 2;
        txt_display.setText("");
        btn_label.setText(num + "  -");
    }//GEN-LAST:event_btn_subActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        num = Double.parseDouble(txt_display.getText());
        calculation = 1;
        txt_display.setText("");
        btn_label.setText(num + "  +");
        
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mulActionPerformed
         num = Double.parseDouble(txt_display.getText());
        calculation = 3;
        txt_display.setText("");
        btn_label.setText(num + "  *");
    }//GEN-LAST:event_btn_mulActionPerformed

    private void btn_equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equalActionPerformed
      arithmetic_operations();
      btn_label.setText("");
    }//GEN-LAST:event_btn_equalActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        txt_display.setText(txt_display.getText() + "1");
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        int length = txt_display.getText().length();
        int number = txt_display.getText().length() - 1;
        
        String store;
        
        if(length > 0)
        {
            StringBuilder back = new StringBuilder(txt_display.getText());
            back.deleteCharAt(number);
            store = back.toString();
            txt_display.setText(store);
        }
    }//GEN-LAST:event_btn_backActionPerformed

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
            java.util.logging.Logger.getLogger(CalciFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalciFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalciFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalciFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalciFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_clr;
    private javax.swing.JButton btn_div;
    private javax.swing.JButton btn_dot;
    private javax.swing.JButton btn_equal;
    private javax.swing.JLabel btn_label;
    private javax.swing.JButton btn_mul;
    private javax.swing.JButton btn_sub;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_display;
    // End of variables declaration//GEN-END:variables
}
