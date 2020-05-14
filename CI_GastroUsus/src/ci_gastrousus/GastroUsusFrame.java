package ci_gastrousus;

public class GastroUsusFrame extends javax.swing.JFrame {
    private Staphylococus staphylococus;
    private Jamur jamur;
    private Salmonellae salmonellae;
    private Clostridium clostridium;
    private Campylobacter campylobacter;
    private double persentase = 0;
    
    public GastroUsusFrame() {
        initComponents();
        staphylococus = new Staphylococus();
        jamur = new Jamur();
        salmonellae = new Salmonellae();
        clostridium = new Clostridium();
        campylobacter = new Campylobacter();
    }

    public double getPersentase() {
        return persentase;
    }
    public void setPersentase(double persentase) {
        this.persentase = persentase;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cb1 = new javax.swing.JCheckBox();
        cb2 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        cb4 = new javax.swing.JCheckBox();
        cb5 = new javax.swing.JCheckBox();
        cb6 = new javax.swing.JCheckBox();
        cb7 = new javax.swing.JCheckBox();
        cb8 = new javax.swing.JCheckBox();
        cb9 = new javax.swing.JCheckBox();
        cb10 = new javax.swing.JCheckBox();
        cb11 = new javax.swing.JCheckBox();
        cb12 = new javax.swing.JCheckBox();
        cb13 = new javax.swing.JCheckBox();
        cb14 = new javax.swing.JCheckBox();
        cb15 = new javax.swing.JCheckBox();
        cb16 = new javax.swing.JCheckBox();
        cb17 = new javax.swing.JCheckBox();
        cb18 = new javax.swing.JCheckBox();
        cb19 = new javax.swing.JCheckBox();
        threshold_l = new javax.swing.JLabel();
        proses_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        staphylococus_l = new javax.swing.JLabel();
        jamur_l = new javax.swing.JLabel();
        salmonellae_l = new javax.swing.JLabel();
        clostridium_l = new javax.swing.JLabel();
        campylobacter_l = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        infeksi_l = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cb1.setText("Sering mengalami BAB > 2 kali");
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        cb2.setText("Mengalami berak encer");
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });

        cb3.setText("Mengalami berak berdarah");
        cb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb3ActionPerformed(evt);
            }
        });

        cb4.setText("Mengalami lesu dan tidak bergairah");
        cb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb4ActionPerformed(evt);
            }
        });

        cb5.setText("Tidak selera makan");
        cb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb5ActionPerformed(evt);
            }
        });

        cb6.setText("Merasa mual dan sering muntah > 1 kali");
        cb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb6ActionPerformed(evt);
            }
        });

        cb7.setText("Merasa sakit di bagian perut");
        cb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb7ActionPerformed(evt);
            }
        });

        cb8.setText("Mengalami tekanan darah anda rendah");
        cb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb8ActionPerformed(evt);
            }
        });

        cb9.setText("Merasa pusing");
        cb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb9ActionPerformed(evt);
            }
        });

        cb10.setText("Mengalami pingsan");
        cb10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb10ActionPerformed(evt);
            }
        });

        cb11.setText("Mengalami suhu badan yang tinggi");
        cb11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb11ActionPerformed(evt);
            }
        });

        cb12.setText("Mengalami luka di bagian tubuh tertentu");
        cb12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb12ActionPerformed(evt);
            }
        });

        cb13.setText("Tidak dapat menggerakkan anggota badan tertentu");
        cb13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb13ActionPerformed(evt);
            }
        });

        cb14.setText("Pernah memakan sesuatu");
        cb14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb14ActionPerformed(evt);
            }
        });

        cb15.setText("Memakan daging");
        cb15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb15ActionPerformed(evt);
            }
        });

        cb16.setText("Memakan jamur");
        cb16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb16ActionPerformed(evt);
            }
        });

        cb17.setText("Memakan makanan kaleng");
        cb17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb17ActionPerformed(evt);
            }
        });

        cb18.setText("Membeli susu");
        cb18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb18ActionPerformed(evt);
            }
        });

        cb19.setText("Meminum susu");
        cb19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb19ActionPerformed(evt);
            }
        });

        threshold_l.setText("Threshold");

        proses_btn.setText("PROSES");
        proses_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proses_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Campylobacter :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Staphylococus :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Jamur :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Clostridium :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Salmonellae :");

        staphylococus_l.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        staphylococus_l.setText("---");

        jamur_l.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jamur_l.setText("---");

        salmonellae_l.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        salmonellae_l.setText("---");

        clostridium_l.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        clostridium_l.setText("---");

        campylobacter_l.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        campylobacter_l.setText("---");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Anda mengalami infeksi :");

        infeksi_l.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        infeksi_l.setText("---");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SISTEM PAKAR - GASTRO USUS");

        jLabel8.setText("%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb9)
                            .addComponent(cb8)
                            .addComponent(cb7)
                            .addComponent(cb6)
                            .addComponent(cb5)
                            .addComponent(cb12)
                            .addComponent(cb4)
                            .addComponent(cb1)
                            .addComponent(cb2)
                            .addComponent(cb3)
                            .addComponent(cb10)
                            .addComponent(cb11)
                            .addComponent(cb13)
                            .addComponent(cb14)
                            .addComponent(cb15)
                            .addComponent(cb16)
                            .addComponent(cb17)
                            .addComponent(cb18)
                            .addComponent(cb19))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(staphylococus_l)
                            .addComponent(jamur_l)
                            .addComponent(salmonellae_l)
                            .addComponent(clostridium_l)
                            .addComponent(campylobacter_l)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(threshold_l)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(64, 64, 64)
                        .addComponent(proses_btn)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(infeksi_l)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(cb1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cb6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(staphylococus_l)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jamur_l)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salmonellae_l)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clostridium_l)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campylobacter_l)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb19)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(infeksi_l)
                    .addComponent(proses_btn)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threshold_l)
                    .addComponent(jLabel8))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed

    }//GEN-LAST:event_cb1ActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb2ActionPerformed

    private void cb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb3ActionPerformed

    private void cb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb4ActionPerformed

    private void cb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb5ActionPerformed

    private void cb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb6ActionPerformed

    private void cb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb7ActionPerformed

    private void cb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb8ActionPerformed

    private void cb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb9ActionPerformed

    private void cb10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb10ActionPerformed

    private void cb11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb11ActionPerformed

    private void cb12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb12ActionPerformed

    private void cb13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb13ActionPerformed

    private void cb14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb14ActionPerformed

    private void cb15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb15ActionPerformed

    private void cb16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb16ActionPerformed

    private void cb17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb17ActionPerformed

    private void cb18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb18ActionPerformed

    private void cb19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb19ActionPerformed

    private void proses_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proses_btnActionPerformed
        // TODO add your handling code here:
        if(cb1.isSelected() == true){
            staphylococus.setPersentase(staphylococus.getPersentase() + (0.25)*(100/5));
            jamur.setPersentase(jamur.getPersentase() + (0.25)*(100/5));
            salmonellae.setPersentase(salmonellae.getPersentase() + (0.25)*(100/6));
            campylobacter.setPersentase(campylobacter.getPersentase() + (0.2)*(100/4));
        }
        if(cb2.isSelected() == true){
            staphylococus.setPersentase(staphylococus.getPersentase() + (0.25)*(100/5));
            jamur.setPersentase(jamur.getPersentase() + (0.25)*(100/5));
            salmonellae.setPersentase(salmonellae.getPersentase() + (0.25)*(100/6));
            campylobacter.setPersentase(campylobacter.getPersentase() + (0.2)*(100/4));
        }
        if(cb3.isSelected() == true){
            campylobacter.setPersentase(campylobacter.getPersentase() + (0.2)*(100/4));
        }
        if(cb4.isSelected() == true){
            staphylococus.setPersentase(staphylococus.getPersentase() + (0.25)*(100/5) + (0.33)*(100/5) + (0.5)*(100/5) + (0.33)*(100/5));
            jamur.setPersentase(jamur.getPersentase() + (0.25)*(100/5) + (0.33)*(100/5) + (0.5)*(100/5));
            salmonellae.setPersentase(salmonellae.getPersentase() + (0.25)*(100/6) + (0.33)*(100/6) + (0.5)*(100/6) + (0.25)*(100/6) + (0.25)*(100/6));
            clostridium.setPersentase(clostridium.getPersentase() + (0.33)*(100/3) + (0.5)*(100/3));
            campylobacter.setPersentase(campylobacter.getPersentase() + (0.2)*(100/4) + (0.5)*(100/4) + (0.25)*(100/4));
        }
        if(cb5.isSelected() == true){
            staphylococus.setPersentase(staphylococus.getPersentase() + (0.25)*(100/5) + (0.33)*(100/5));
            jamur.setPersentase(jamur.getPersentase() + (0.25)*(100/5) + (0.33)*(100/5));
            salmonellae.setPersentase(salmonellae.getPersentase() + (0.25)*(100/6) + (0.33)*(100/6) + (0.25)*(100/6));
            clostridium.setPersentase(clostridium.getPersentase() + (0.33)*(100/3));
            campylobacter.setPersentase(campylobacter.getPersentase() + (0.2)*(100/4) + (0.25)*(100/4));
        }
        if(cb6.isSelected() == true){
            staphylococus.setPersentase(staphylococus.getPersentase() + (0.33)*(100/5));
            jamur.setPersentase(jamur.getPersentase() + (0.33)*(100/5));
            salmonellae.setPersentase(salmonellae.getPersentase() + (0.33)*(100/6));
            clostridium.setPersentase(clostridium.getPersentase() + (0.33)*(100/3));
        }
        if(cb7.isSelected() == true){
            staphylococus.setPersentase(staphylococus.getPersentase() + (0.5)*(100/5));
            jamur.setPersentase(jamur.getPersentase() + (0.5)*(100/5));
            salmonellae.setPersentase(salmonellae.getPersentase() + (0.5)*(100/6));
            campylobacter.setPersentase(campylobacter.getPersentase() + (0.5)*(100/4));
        }
        if(cb8.isSelected() == true){
            staphylococus.setPersentase(staphylococus.getPersentase() + (0.33)*(100/5));
            jamur.setPersentase(jamur.getPersentase() + (0.5)*(100/5));
            salmonellae.setPersentase(salmonellae.getPersentase() + (0.25)*(100/6));
        }
        if(cb9.isSelected() == true){
            staphylococus.setPersentase(staphylococus.getPersentase() + (0.33)*(100/5));
            salmonellae.setPersentase(salmonellae.getPersentase() + (0.25)*(100/6));
            campylobacter.setPersentase(campylobacter.getPersentase() + (0.25)*(100/4));
        }
        if(cb10.isSelected() == true){
            jamur.setPersentase(jamur.getPersentase() + (0.5)*(100/5));
        }
        if(cb11.isSelected() == true){
            salmonellae.setPersentase(salmonellae.getPersentase() + (0.25)*(100/6) + (0.25)*(100/6));
            campylobacter.setPersentase(campylobacter.getPersentase() + (0.25)*(100/4));
        }
        if(cb12.isSelected() == true){
            salmonellae.setPersentase(salmonellae.getPersentase() + (0.25)*(100/6));
        }
        if(cb13.isSelected() == true){
            clostridium.setPersentase(clostridium.getPersentase() + (0.5)*(100/3));
        }
        if(cb14.isSelected() == true){
            staphylococus.setPersentase(staphylococus.getPersentase() + (0.5)*(100/5));
            jamur.setPersentase(jamur.getPersentase() + (0.5)*(100/5));
            salmonellae.setPersentase(salmonellae.getPersentase() + (0.5)*(100/6));
            clostridium.setPersentase(clostridium.getPersentase() + (0.5)*(100/3));
        }
        if(cb15.isSelected() == true){
            staphylococus.setPersentase(staphylococus.getPersentase() + (0.5)*(100/5));
            salmonellae.setPersentase(salmonellae.getPersentase() + (0.5)*(100/6));
        }
        if(cb16.isSelected() == true){
            jamur.setPersentase(jamur.getPersentase() + (0.5)*(100/5));
        }
        if(cb17.isSelected() == true){
            clostridium.setPersentase(clostridium.getPersentase() + (0.5)*(100/3));
        }
        if(cb18.isSelected() == true){
            campylobacter.setPersentase(campylobacter.getPersentase() + (0.5)*(100/4));
        }
        if(cb19.isSelected() == true){
            campylobacter.setPersentase(campylobacter.getPersentase() + (0.5)*(100/4));
        }
        staphylococus_l.setText(staphylococus.getPersentase() + " %");
        jamur_l.setText(jamur.getPersentase() + " %");
        salmonellae_l.setText(salmonellae.getPersentase() + " %");
        clostridium_l.setText(clostridium.getPersentase() + " %");
        campylobacter_l.setText(campylobacter.getPersentase() + " %");
        if(staphylococus.getPersentase() > 80)
            infeksi_l.setText("Staphylococcus Aureus");
        else if(jamur.getPersentase() > 80)
            infeksi_l.setText("Jamur Beracun");
        else if(salmonellae.getPersentase() > 80)
            infeksi_l.setText("Salmonellae");
        else if(clostridium.getPersentase() > 80)
            infeksi_l.setText("Clostridium Botulinum");
        else if(campylobacter.getPersentase() > 80)
            infeksi_l.setText("Campylobacter");
        else
            infeksi_l.setText("Mencret Biasa");
    }//GEN-LAST:event_proses_btnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GastroUsusFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel campylobacter_l;
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb10;
    private javax.swing.JCheckBox cb11;
    private javax.swing.JCheckBox cb12;
    private javax.swing.JCheckBox cb13;
    private javax.swing.JCheckBox cb14;
    private javax.swing.JCheckBox cb15;
    private javax.swing.JCheckBox cb16;
    private javax.swing.JCheckBox cb17;
    private javax.swing.JCheckBox cb18;
    private javax.swing.JCheckBox cb19;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JCheckBox cb4;
    private javax.swing.JCheckBox cb5;
    private javax.swing.JCheckBox cb6;
    private javax.swing.JCheckBox cb7;
    private javax.swing.JCheckBox cb8;
    private javax.swing.JCheckBox cb9;
    private javax.swing.JLabel clostridium_l;
    private javax.swing.JLabel infeksi_l;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jamur_l;
    private javax.swing.JButton proses_btn;
    private javax.swing.JLabel salmonellae_l;
    private javax.swing.JLabel staphylococus_l;
    private javax.swing.JLabel threshold_l;
    // End of variables declaration//GEN-END:variables
}
