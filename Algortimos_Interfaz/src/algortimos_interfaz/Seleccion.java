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
public class Seleccion extends javax.swing.JFrame {
 int Arreglo[]={4,1,3,2,5};
    public Seleccion() {
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
        btnSeleccion = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("ARREGLO ");
        fondo10.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 145, 39));

        jLabel12.setText("ARREGLO ORDENADO");
        fondo10.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 61, 145, 36));

        lbl1KOO.setText("TIEMPO DE EJECUCIÓN");
        fondo10.add(lbl1KOO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 115, 179, 25));

        jLabel10.setText("COMPLEJIDAD");
        fondo10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 134, 23));
        fondo10.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 187, 32));
        fondo10.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 185, 36));
        fondo10.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 196, 43));
        fondo10.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 196, 36));

        getContentPane().add(fondo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 231));

        btnSeleccion.setText("ORDENAR");
        btnSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionActionPerformed(evt);
            }
        });
        getContentPane().add(btnSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 447, 151, 41));

        btn1.setText("VOLVER");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 447, 127, 41));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ORDENAMIENTO SELECCIÓN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 240, 44));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Consiste en encontrar el menor de todos los elementos \ndel arreglo o vector e intercambiarlo con el que está \nen la primera posición. Luego el segundo mas pequeño, \ny así sucesivamente hasta ordenarlo todo.");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 316, 346, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algortimos_interfaz/fondo2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 0, 570, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionActionPerformed
       

        double tiempo=0;
        long time_start, time_end;
        time_start = System.nanoTime();
       
 int  aux,minimo;


for (int i =0; i <Arreglo.length; i++) {
    minimo= i; 
    for (int j= i + 1; j< Arreglo.length; j++) {

        if (Arreglo[j] <Arreglo[minimo]) {
           	minimo= j;
		   }
       }
       aux = Arreglo[i];
       Arreglo[i] =Arreglo[minimo];
       Arreglo[minimo] = aux;
   }
        time_end = System.nanoTime();
        tiempo=(time_end - time_start)/1e6;

        for (int i = 0; i < Arreglo.length; i++) {
            String ordenado = Integer.toString(Arreglo[i]);
            lbl2.setText(lbl2.getText() + ordenado + "  ");
        }
        lbl3.setText(Double.toString(tiempo));
        lbl4.setText("n^2");
        btn1.setEnabled(true);
        btnSeleccion.setEnabled(false);
    }//GEN-LAST:event_btnSeleccionActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
         this.setVisible(false);
        Interfaz reabrir= new Interfaz ();
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
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seleccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btnSeleccion;
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
