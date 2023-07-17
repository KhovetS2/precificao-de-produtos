/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.swing;

import GUI.componentes.Menu;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

/**
 *
 * @author isaqu
 */
public class winButton extends javax.swing.JPanel {


    public winButton() {
        initComponents();
        setOpaque(false);
    }

    

    public void initEvent(JFrame frame, PanelBorda panel, Menu menu) {
          cmdClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
          });
          cmdMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setState(JFrame.ICONIFIED);
            }
          });
          
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdClose = new GUI.swing.MyButton();
        cmdMi = new GUI.swing.MyButton();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        cmdClose.setColor(new java.awt.Color(255, 0, 0));
        cmdClose.setColorClicked(new java.awt.Color(255, 0, 0));
        cmdClose.setColorOver(new java.awt.Color(255, 51, 51));
        cmdClose.setPreferredSize(new java.awt.Dimension(20, 20));
        cmdClose.setRadius(20);
        cmdClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmdCloseMouseEntered(evt);
            }
        });

        cmdMi.setColor(new java.awt.Color(255, 204, 0));
        cmdMi.setColorClicked(new java.awt.Color(255, 255, 51));
        cmdMi.setColorOver(new java.awt.Color(255, 255, 0));
        cmdMi.setPreferredSize(new java.awt.Dimension(20, 20));
        cmdMi.setRadius(20);
        cmdMi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmdMiMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(cmdClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdMi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdMi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdCloseMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_cmdCloseMouseEntered

    private void cmdMiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdMiMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_cmdMiMouseEntered

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_formMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.swing.MyButton cmdClose;
    private GUI.swing.MyButton cmdMi;
    // End of variables declaration//GEN-END:variables
}
