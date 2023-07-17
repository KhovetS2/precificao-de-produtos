/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.componentes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Cursor;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;


import GUI.swing.PanelBorda;

/**
 *
 * @author isaqu
 */
public class Menu extends javax.swing.JPanel {

    /**
     * Creates new form Menu
     */
    
    private JDesktopPane jDesktopPanel;
    
    private int round = 15;
    public Menu() {
        initComponents();
    }
    
    public Menu(JDesktopPane jDesktopPanel) {
        this.jDesktopPanel = jDesktopPanel;
        initComponents();
        buscarBtn.setColor(new java.awt.Color(2, 30, 54));
        buscarBtn.setColorOver(new java.awt.Color(2,65,75));
        buscarBtn.setColorClicked(new java.awt.Color(2,65,90));
        cadastrarBtn.setColor(new java.awt.Color(2, 30, 54));
        cadastrarBtn.setColorOver(new java.awt.Color(2,65,75));
        cadastrarBtn.setColorClicked(new java.awt.Color(2,65,90));
        editarBtn.setColor(new java.awt.Color(2, 30, 54));
        editarBtn.setColorOver(new java.awt.Color(2,65,75));
        editarBtn.setColorClicked(new java.awt.Color(2,65,90));
        homeBtn.setColor(new java.awt.Color(2, 30, 54));
        homeBtn.setColorOver(new java.awt.Color(2,65,75));
        homeBtn.setColorClicked(new java.awt.Color(2,65,90));
    }

    

    public void initWinButton(JFrame frame, PanelBorda panel) {
        winButton.initEvent(frame, panel, Menu.this);
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        homeBtn = new GUI.swing.MyButton();
        cadastrarBtn = new GUI.swing.MyButton();
        editarBtn = new GUI.swing.MyButton();
        buscarBtn = new GUI.swing.MyButton();
        jLabel2 = new javax.swing.JLabel();
        winButton = new GUI.swing.winButton();
        editarBtn1 = new GUI.swing.MyButton();

        setBackground(new java.awt.Color(2, 31, 54));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bem-vindo!");

        homeBtn.setForeground(new java.awt.Color(255, 255, 255));
        homeBtn.setText("Home");
        homeBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        homeBtn.setIconTextGap(15);
        homeBtn.setMargin(new java.awt.Insets(3, -4, 3, 14));
        homeBtn.setRadius(15);
        homeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeBtnMouseEntered(evt);
            }
        });
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        cadastrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarBtn.setText("Cadastrar");
        cadastrarBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cadastrarBtn.setIconTextGap(15);
        cadastrarBtn.setMargin(new java.awt.Insets(3, 26, 3, 14));
        cadastrarBtn.setRadius(15);
        cadastrarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cadastrarBtnMouseEntered(evt);
            }
        });
        cadastrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBtnActionPerformed(evt);
            }
        });

        editarBtn.setForeground(new java.awt.Color(255, 255, 255));
        editarBtn.setText("Editar");
        editarBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        editarBtn.setIconTextGap(15);
        editarBtn.setMargin(new java.awt.Insets(3, 0, 3, 14));
        editarBtn.setRadius(15);
        editarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editarBtnMouseEntered(evt);
            }
        });
        editarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBtnActionPerformed(evt);
            }
        });

        buscarBtn.setForeground(new java.awt.Color(255, 255, 255));
        buscarBtn.setText("Buscar");
        buscarBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buscarBtn.setIconTextGap(15);
        buscarBtn.setMargin(new java.awt.Insets(3, 0, 3, 14));
        buscarBtn.setRadius(15);
        buscarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarBtnMouseEntered(evt);
            }
        });
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        winButton.setToolTipText("");

        editarBtn1.setForeground(new java.awt.Color(255, 255, 255));
        editarBtn1.setText("Editar");
        editarBtn1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        editarBtn1.setIconTextGap(15);
        editarBtn1.setMargin(new java.awt.Insets(3, 0, 3, 14));
        editarBtn1.setRadius(15);
        editarBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editarBtn1MouseEntered(evt);
            }
        });
        editarBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cadastrarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(editarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(homeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buscarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(winButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addComponent(editarBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(winButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(cadastrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(editarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(editarBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 =(Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), round, round);
        super.paintChildren(grphcs);
    }

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        jDesktopPanel.removeAll();
        
    }//GEN-LAST:event_homeBtnActionPerformed

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        jDesktopPanel.removeAll();
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void editarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBtnActionPerformed
        jDesktopPanel.removeAll();
    }//GEN-LAST:event_editarBtnActionPerformed

    private void cadastrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBtnActionPerformed
        jDesktopPanel.removeAll();
    }//GEN-LAST:event_cadastrarBtnActionPerformed

    private void homeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_homeBtnMouseEntered

    private void buscarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarBtnMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_buscarBtnMouseEntered

    private void cadastrarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarBtnMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_cadastrarBtnMouseEntered

    private void editarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarBtnMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_editarBtnMouseEntered

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_formMouseEntered

    private void editarBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarBtn1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_editarBtn1MouseEntered

    private void editarBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarBtn1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.swing.MyButton buscarBtn;
    private GUI.swing.MyButton cadastrarBtn;
    private GUI.swing.MyButton editarBtn;
    private GUI.swing.MyButton editarBtn1;
    private GUI.swing.MyButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private GUI.swing.winButton winButton;
    // End of variables declaration//GEN-END:variables

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
        repaint();
    }
}
