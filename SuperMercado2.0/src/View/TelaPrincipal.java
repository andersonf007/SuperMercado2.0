/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controllers.EstoqueController;
import Controllers.PdvController;
import Controllers.PessoaController;
import Controllers.ProdutosController;
import Controllers.RelatorioController;
import ModelDao.UsuarioDAO;
import Negocio.Exceptions.UsuarioNaoAdmException;
import Negocio.Exceptions.ValidacaoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author anderson
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private final PessoaController PessoaController;
    private final PdvController pdv;
    private final ProdutosController produtosController;
    private final EstoqueController estoqueController;
    private final RelatorioController relatorioController;
    private final String usuarioLogado;
    private final String SenhaDoUsuario;
    private final UsuarioDAO usuarioDAO;
    /**
     * Creates new form TelaPrincipal
     * @param usuarioLogado
     * @param SenhaDoUsuario
     */
    public TelaPrincipal(String usuarioLogado,String SenhaDoUsuario) {
        initComponents();
        PessoaController = new PessoaController();
        pdv = new PdvController();
        produtosController = new ProdutosController();
        estoqueController = new EstoqueController();
        relatorioController = new RelatorioController();
        this.usuarioLogado = usuarioLogado;
        this.SenhaDoUsuario = SenhaDoUsuario;
        usuarioDAO = new UsuarioDAO();
        jLabelLogin.setText(usuarioDAO.buscaNome(usuarioLogado, SenhaDoUsuario));
    }

    private TelaPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonPDV = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButtonCadPessoa = new javax.swing.JButton();
        jButtonCadProduto = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButtonEstoque = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelLogin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Venda"));
        jPanel1.setToolTipText("Venda");
        jPanel1.setLayout(null);

        jButtonPDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pdv.png"))); // NOI18N
        jButtonPDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPDVActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPDV);
        jButtonPDV.setBounds(10, 20, 100, 90);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 21, 130, 130);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro"));
        jPanel2.setLayout(null);

        jButtonCadPessoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadastre-se.png"))); // NOI18N
        jButtonCadPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadPessoaActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCadPessoa);
        jButtonCadPessoa.setBounds(10, 20, 100, 100);

        jButtonCadProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Produtos.png"))); // NOI18N
        jButtonCadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadProdutoActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCadProduto);
        jButtonCadProduto.setBounds(120, 20, 100, 100);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(160, 20, 230, 130);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Estoque"));
        jPanel3.setLayout(null);

        jButtonEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/estoque.png"))); // NOI18N
        jButtonEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEstoqueActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonEstoque);
        jButtonEstoque.setBounds(10, 20, 100, 100);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(400, 20, 120, 130);

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Relatório"));
        jPanel4.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/relatorio.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(10, 20, 100, 130);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(400, 160, 120, 160);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Seja bem vindo: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 400, 140, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo Fenix 2 .png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-60, 150, 420, 280);

        jLabelLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jLabelLogin);
        jLabelLogin.setBounds(410, 400, 120, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo_telaprincipal2.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-260, -10, 800, 460);

        setSize(new java.awt.Dimension(545, 472));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadPessoaActionPerformed
        try{
            usuarioDAO.ValidarAdm(usuarioLogado, SenhaDoUsuario);
            PessoaController.abreCadPessoa();
        }catch(UsuarioNaoAdmException ex){
            JOptionPane.showMessageDialog(null, "Apenas usuario administrador pode acessar essa tela.\nPara acessar como administrador, saia do sistema e entre com um usuario com permissão.");
        } catch (ValidacaoException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonCadPessoaActionPerformed

    private void jButtonPDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPDVActionPerformed
        pdv.abrePdv();
    }//GEN-LAST:event_jButtonPDVActionPerformed

    private void jButtonCadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadProdutoActionPerformed
        try{
            usuarioDAO.ValidarAdm(usuarioLogado, SenhaDoUsuario);
            produtosController.abreCadProdutos();
        }catch(UsuarioNaoAdmException ex){
            JOptionPane.showMessageDialog(null, "Apenas usuario administrador pode acessar essa tela.\nPara acessar como administrador, saia do sistema e entre com um usuario com permissão.");
        } catch (ValidacaoException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonCadProdutoActionPerformed

    private void jButtonEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEstoqueActionPerformed
        try{
            usuarioDAO.ValidarAdm(usuarioLogado, SenhaDoUsuario);
            estoqueController.abrirEstoque();
        }catch(UsuarioNaoAdmException ex){
            JOptionPane.showMessageDialog(null, "Apenas usuario administrador pode acessar essa tela.\nPara acessar como administrador, saia do sistema e entre com um usuario com permissão.");
        } catch (ValidacaoException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonEstoqueActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        relatorioController.abreRelatorio();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCadPessoa;
    private javax.swing.JButton jButtonCadProduto;
    private javax.swing.JButton jButtonEstoque;
    private javax.swing.JButton jButtonPDV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
