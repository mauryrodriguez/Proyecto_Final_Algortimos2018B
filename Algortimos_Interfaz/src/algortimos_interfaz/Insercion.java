/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algortimos_interfaz;

/**
 *
 * @author ADMIN-MINEDUC
 */
public class Insercion extends javax.swing.JFrame {

    int Arreglo[] = {4, 1, 3, 2, 5};

    public Insercion() {
        initComponents();
        this.setTitle("PROYECTO ALGORÍTMOS FUNDAMENTALES");
        for (int i = 0; i < Arreglo.length; i++) {
            String desordenado = Integer.toString(Arreglo[i]);
            lbl1.setText(lbl1.getText() + desordenado + "  ");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl1KOO = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnInsercion = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("ARREGLO ");
        fondo10.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 145, 39));

        jLabel12.setText("ARREGLO ORDENADO");
        fondo10.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 61, 145, 36));

        lbl1KOO.setText("TIEMPO DE EJECUCIÓN");
        fondo10.add(lbl1KOO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 133, 179, 25));

        jLabel10.setText("COMPLEJIDAD");
        fondo10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 134, 36));
        fondo10.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 187, 32));
        fondo10.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 185, 36));
        fondo10.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 196, 43));
        fondo10.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 190, 196, 36));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algortimos_interfaz/fondo2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        fondo10.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, -60, 620, 290));

        jLabel1.setText("ORDENAMIENTO INSERCIÓN");

        btnInsercion.setText("ORDENAR");
        btnInsercion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsercionActionPerformed(evt);
            }
        });

        btn1.setText("VOLVER");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("El método de ordenación por inserción directa consiste en recorrer \ntodo el array comenzando desde el segundo elemento hasta el final. \nPara cada elemento, se trata de colocarlo en el lugar correcto \nentre todos los elementos anteriores a él o sea entre los elementos \na su izquierda en el array.");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(fondo10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnInsercion, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fondo10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsercion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsercionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsercionActionPerformed

        lbl4.setText("n^2");
        double tiempo = 0;
        long time_start, time_end;
        time_start = System.nanoTime();
        int aux = 0;

        for (int i = 1; i < Arreglo.length; i++) {
            aux = Arreglo[i];
            int j = i - 1;
            while (j >= 0 && aux < Arreglo[j]) {
                Arreglo[j + 1] = Arreglo[j];
                j = j - 1;
            }
            Arreglo[j + 1] = aux;
        }
        time_end = System.nanoTime();
        tiempo = (time_end - time_start) / 1e6;

        for (int i = 0; i < Arreglo.length; i++) {
            String ordenado = Integer.toString(Arreglo[i]);
            lbl2.setText(lbl2.getText() + ordenado + "  ");
        }
        lbl3.setText(Double.toString(tiempo));

        btn1.setEnabled(true);
        btnInsercion.setEnabled(false);
    }//GEN-LAST:event_btnInsercionActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        this.setVisible(false);
        Interfaz reabrir = new Interfaz();
        reabrir.setVisible(true);
    }//GEN-LAST:event_btn1ActionPerformed

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
            java.util.logging.Logger.getLogger(Insercion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insercion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insercion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insercion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insercion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btnInsercion;
    private javax.swing.JPanel fondo10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl1KOO;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    // End of variables declaration//GEN-END:variables
}