/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controllers.PdvController;
import ModelBeans.PessoaBeans;
import ModelBeans.PessoaFisicaBeans;

/**
 *
 * @author anderson
 */
public class BuscarPessoas extends javax.swing.JFrame {

    PessoaBeans pessoaBeans = new PessoaBeans();
    PessoaFisicaBeans pessoaFisicaBeans = new PessoaFisicaBeans();
     
    /**
     * Creates new form BuscarPessoas
     */
    public BuscarPessoas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePessoas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTablePessoas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePessoas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePessoasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePessoas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 20, 360, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTablePessoasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePessoasMouseClicked
        String nome_pessoa = ""+jTablePessoas.getValueAt(jTablePessoas.getSelectedRow(), 1);
        //pessoaBeans.setPesquisa(nome_pessoa);
        //PessoaBeans pessoaBeansInstancia = pessoaDAO.buscarPessoa(pessoaBeans)
        //PdvController.receberInformacoesPessoa(pessoaBeansInstancia);
    }//GEN-LAST:event_jTablePessoasMouseClicked

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
            java.util.logging.Logger.getLogger(BuscarPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarPessoas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePessoas;
    // End of variables declaration//GEN-END:variables
}
