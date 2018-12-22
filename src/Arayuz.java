
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JOptionPane;

public class Arayuz extends javax.swing.JFrame {
    Graphics gc;
    QuadTree qt;
    int cap=0;
    DaireCiz daire = new DaireCiz();
    Random rastgele = new Random();
    
    public Arayuz() {
        qt=new QuadTree();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ekran = new javax.swing.JPanel();
        btnRastgele = new javax.swing.JButton();
        btnDaireCiz = new javax.swing.JButton();
        btnYenile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("140201051 Onur Karakaya");

        Ekran.setBackground(new java.awt.Color(255, 255, 255));
        Ekran.setPreferredSize(new java.awt.Dimension(512, 512));
        Ekran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EkranMousePressed(evt);
            }
        });

        javax.swing.GroupLayout EkranLayout = new javax.swing.GroupLayout(Ekran);
        Ekran.setLayout(EkranLayout);
        EkranLayout.setHorizontalGroup(
            EkranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );
        EkranLayout.setVerticalGroup(
            EkranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );

        btnRastgele.setBackground(new java.awt.Color(204, 255, 204));
        btnRastgele.setText("Rastgele");
        btnRastgele.setPreferredSize(new java.awt.Dimension(100, 150));
        btnRastgele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRastgeleActionPerformed(evt);
            }
        });

        btnDaireCiz.setBackground(new java.awt.Color(204, 255, 204));
        btnDaireCiz.setText("DaireCiz");
        btnDaireCiz.setPreferredSize(new java.awt.Dimension(100, 150));
        btnDaireCiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaireCizActionPerformed(evt);
            }
        });

        btnYenile.setBackground(new java.awt.Color(204, 255, 204));
        btnYenile.setText("Yenile");
        btnYenile.setPreferredSize(new java.awt.Dimension(100, 150));
        btnYenile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYenileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Ekran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRastgele, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDaireCiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnYenile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Ekran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRastgele, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDaireCiz, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnYenile, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void btnRastgeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRastgeleActionPerformed
        if(cap==0){
        qt.RastgeleEkle(Ekran); 
        }else{
            daire.paintComponent(getGraphics(),rastgele.nextInt(512), rastgele.nextInt(512), cap);
            cap = 0;
        }
    }//GEN-LAST:event_btnRastgeleActionPerformed

    private void btnDaireCizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaireCizActionPerformed
        String r = JOptionPane.showInputDialog("Cap degeri giriniz:");
        cap = Integer.valueOf(r);
        System.out.println("Girilen cap degeri: "+cap);      
    }//GEN-LAST:event_btnDaireCizActionPerformed

    private void btnYenileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYenileActionPerformed
        qt = new QuadTree();
        Ekran.repaint();
    }//GEN-LAST:event_btnYenileActionPerformed

    private void EkranMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EkranMousePressed
        if (evt.getX() <= 512 && evt.getY() <= 512 && cap==0) {
            qt.ekle(evt.getX(), evt.getY(), Ekran);
        }
        else{
            daire.paintComponent(getGraphics(), evt.getX(), evt.getY(), cap);
            cap = 0;
        }
    }//GEN-LAST:event_EkranMousePressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arayuz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Ekran;
    private javax.swing.JButton btnDaireCiz;
    private javax.swing.JButton btnRastgele;
    private javax.swing.JButton btnYenile;
    // End of variables declaration//GEN-END:variables
}
