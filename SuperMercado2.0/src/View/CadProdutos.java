/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controllers.PdvController;
import Controllers.ProdutosController;
import ModelBeans.ProdutoBeans;
import ModelDao.ProdutoDAO;

/**
 *
 * @author anderson
 */
public class CadProdutos extends javax.swing.JFrame {

    ProdutoDAO produtoDao = ProdutosController.CriaProdutoDao();  
    
    /**
     * Creates new form CadProdutos
     */
    public CadProdutos() {
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

        jLabel2 = new javax.swing.JLabel();
        jTextFieldValorDeVenda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldValorDeCusto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldEstoque = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Valor de venda:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 270, 150, 40);
        getContentPane().add(jTextFieldValorDeVenda);
        jTextFieldValorDeVenda.setBounds(30, 310, 140, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Valor de custo:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 190, 150, 40);
        getContentPane().add(jTextFieldValorDeCusto);
        jTextFieldValorDeCusto.setBounds(30, 230, 140, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Estoque:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 110, 150, 40);
        getContentPane().add(jTextFieldEstoque);
        jTextFieldEstoque.setBounds(30, 150, 140, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Descrição:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 30, 150, 40);
        getContentPane().add(jTextFieldDescricao);
        jTextFieldDescricao.setBounds(30, 70, 140, 40);

        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar);
        jButtonSalvar.setBounds(300, 150, 100, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo_telaprincipal.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, -10, 530, 390);

        setSize(new java.awt.Dimension(461, 413));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        String descricao = jTextFieldDescricao.getText();
        Double estoque = Double.parseDouble(jTextFieldEstoque.getText());
        Double valorCusto = Double.parseDouble(jTextFieldValorDeCusto.getText());
        Double valorVenda = Double.parseDouble(jTextFieldValorDeVenda.getText());
        ProdutoBeans produto = new ProdutoBeans(descricao, estoque, descricao, estoque, WIDTH, valorCusto, valorVenda);
        produtoDao.adicionarProduto(produto);
        
        jTextFieldDescricao.setText("");
        jTextFieldEstoque.setText("");
        jTextFieldValorDeCusto.setText("");
        jTextFieldValorDeVenda.setText("");
        
        PdvController.abrirListagemProdutos();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(CadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldEstoque;
    private javax.swing.JTextField jTextFieldValorDeCusto;
    private javax.swing.JTextField jTextFieldValorDeVenda;
    // End of variables declaration//GEN-END:variables
}
