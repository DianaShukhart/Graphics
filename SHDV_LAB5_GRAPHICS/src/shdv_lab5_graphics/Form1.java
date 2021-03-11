/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shdv_lab5_graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.event.ComponentEvent;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JPanel;

//Rectangle2D r2 = new Rectangle2D.Float(25,25,150,150);
//   g2.drawOval(100, 100,100,100);
public class Form1 extends javax.swing.JFrame {

    public class MyPicture extends JPanel {

      //  Graphics2D canvas;   // Класс рисования
      //  BufferedImage buff;  // Буферное изображение
        int x = 400; // Константа размера полотна по х
        int y = 250; // Константа размера полотна по y

        public void paint(Graphics g) {

            Graphics2D g2 = (Graphics2D) g;
   
            //https://colorscheme.ru/color-converter.html конвертер цветов
            g2.setPaint(Color.getHSBColor(0.0f, 0.003f, 0.90f)); // Устанавливаем цвет рисования 
            g2.fillRect(0, 0, x, y); // Заливаем полотно для рисования

            g2.setPaint(Color.BLACK);
            g2.drawArc(120, 60, 50, 55, 0, 180);//верх будильника граница
             // градиент 
            GradientPaint gp = new GradientPaint(180, 5, Color.BLACK, 80, 50, Color.white, true);
            g2.setPaint(gp);
            g2.fillArc(120, 60, 50, 55, 0, 180);//градиент верх будильника

            // градиент круга
            GradientPaint gp2 = new GradientPaint(500, 80, Color.BLUE, 180, 100, Color.white, true);
            g2.setPaint(gp2);
            g2.fillOval(100, 80, 90, 90);//градиент круга
            
            g2.setPaint(Color.BLACK);
            g2.drawOval(100, 80, 90, 90);  // Отрисовываем большой овал граница

            //стрелки
            g2.setPaint(Color.BLACK);
            g2.drawLine(143, 124, 160, 150);
            g2.drawLine(143, 90, 143, 124);
            //ножки
            g2.drawLine(174, 161, 190, 180);
            g2.drawLine(118, 161, 100, 180);

            //точки
            g2.setPaint(Color.DARK_GRAY);

            g2.fillOval(143, 159, 4, 4);
            g2.fillOval(120, 150, 4, 4);
            g2.fillOval(161, 154, 4, 4);
            g2.fillOval(163, 94, 4, 4);
            g2.fillOval(124, 94, 4, 4);
            g2.fillOval(113, 105, 4, 4);
            g2.fillOval(110, 138, 4, 4);
            g2.fillOval(174, 138, 4, 4);
            g2.fillOval(174, 108, 4, 4);
            g2.fillOval(143, 85, 4, 4);
            g2.fillOval(107, 123, 4, 4);
            g2.fillOval(176, 123, 4, 4);
            
            
            //устанавливаем стиль и пишим текст
            g2.setPaint(Color.BLACK);
            g2.setFont(new Font("Tahoma", Font.ITALIC, 20));
            g2.drawString("ШДВ-15", 25, 50);
        }

    }

    public Form1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new MyPicture();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Работа с графикой");
        setResizable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
