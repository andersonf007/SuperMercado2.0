/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controllers.PdvController;
import Controllers.PessoaController;
import Controllers.ProdutosController;
import ModelBeans.ModelTabela;
import ModelBeans.PessoaBeans;
import ModelBeans.PessoaFisicaBeans;
import ModelBeans.PessoaJuridicaBeans;
import ModelBeans.ProdutoBeans;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author anderson
 */
public class PDV extends javax.swing.JFrame {

    private static PDV pdv;
    String descricao;
    int id, idCliente;
    double valorTotal, valorUnitario, quantidade;
    ArrayList lista = new ArrayList();  
    double total =0;
    
    /**
     * Creates new form PDV
     */
    public PDV() {
        initComponents();
        jTextFieldCodigo.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNomeProduto = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldValorUnitario = new javax.swing.JTextField();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaDeProdutos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabelCpfCnpj = new javax.swing.JLabel();
        jLabelValorTotal = new javax.swing.JLabel();
        jButtonConfirmar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelNomeProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNomeProduto.setText("NOME DO PRODUTO");
        getContentPane().add(jLabelNomeProduto);
        jLabelNomeProduto.setBounds(220, 32, 330, 40);

        jTextFieldCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldCodigo);
        jTextFieldCodigo.setBounds(20, 150, 240, 50);

        jTextFieldValorUnitario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextFieldValorUnitario);
        jTextFieldValorUnitario.setBounds(20, 250, 240, 50);

        jTextFieldQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldQuantidadeKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidade);
        jTextFieldQuantidade.setBounds(20, 350, 240, 50);

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Adicionar Cliente");
        jLabel2.setToolTipText("");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 440, 160, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Código:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 100, 160, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("Valor Unitário:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 200, 240, 50);

        jTableListaDeProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableListaDeProdutos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(270, 110, 470, 370);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("CPF/CNPJ:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 530, 70, 20);
        getContentPane().add(jLabelCpfCnpj);
        jLabelCpfCnpj.setBounds(80, 530, 200, 20);

        jLabelValorTotal.setBackground(new java.awt.Color(204, 255, 255));
        jLabelValorTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jLabelValorTotal);
        jLabelValorTotal.setBounds(610, 490, 130, 40);

        jButtonConfirmar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmar);
        jButtonConfirmar.setBounds(623, 550, 120, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setText("Quantidade:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 300, 200, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Nome:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 500, 60, 20);
        getContentPane().add(jLabelNome);
        jLabelNome.setBounds(60, 500, 200, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo_telaprincipal.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-20, -60, 2060, 1300);

        setSize(new java.awt.Dimension(768, 645));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void receberProduto(ProdutoBeans produtoBeans){   
        jTextFieldCodigo.setText(Integer.toString(produtoBeans.getId()));
        jLabelNomeProduto.setText(produtoBeans.getNome());
        jTextFieldValorUnitario.setText(Double.toString(produtoBeans.getValorVenda()));
        jTextFieldQuantidade.setText(Integer.toString(1));
        jTextFieldQuantidade.setEnabled(true);
        jTextFieldValorUnitario.setEnabled(true);    
        jTextFieldQuantidade.requestFocus();
        getContentPane().repaint();   
    }
    
    public void receberPessoa(PessoaFisicaBeans pessoaFisicaBean,PessoaJuridicaBeans pessoaJuridicaBeans){
        if(pessoaJuridicaBeans == null){
            idCliente = pessoaFisicaBean.getCodigo();
            jLabelNome.setText(pessoaFisicaBean.getNome());
            jLabelCpfCnpj.setText(pessoaFisicaBean.getCpf());
        }else{
            idCliente = pessoaJuridicaBeans.getCodigo();
            jLabelNome.setText(pessoaJuridicaBeans.getNome());
            jLabelCpfCnpj.setText(pessoaJuridicaBeans.getCnpj());
        } 
        
    }
    
    private void jTextFieldCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoKeyPressed
        if(evt.getKeyCode() == 113){
            ProdutosController.abrirListagemProdutos();
        }
    }//GEN-LAST:event_jTextFieldCodigoKeyPressed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jTextFieldQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeKeyPressed
        if(evt.getKeyCode() == 10){
            if(jTextFieldCodigo.getText().isEmpty() || jTextFieldQuantidade.getText().isEmpty() || jTextFieldValorUnitario .getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Favor, preencha todos os campos \n ou selecione o campo codigo e aperte F2");
            }else{
                preencherTabela();
                jTextFieldCodigo.setText("");
                jLabelNomeProduto.setText("");
                jTextFieldValorUnitario.setText("");
                jTextFieldQuantidade.setText("");
                jTextFieldCodigo.requestFocus();    
            }
        }
    }//GEN-LAST:event_jTextFieldQuantidadeKeyPressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        PessoaController.openBuscarPessoa();
    }//GEN-LAST:event_jLabel2MouseClicked
    
    public void preencherTabela() {
           
           id = Integer.parseInt(jTextFieldCodigo.getText());
           descricao = jLabelNomeProduto.getText(); 
           //try{
           valorUnitario = Double.parseDouble(jTextFieldValorUnitario.getText());
           quantidade = Double.parseDouble(jTextFieldQuantidade.getText());
           valorTotal = valorUnitario * quantidade;
           total += valorTotal;
           jLabelValorTotal.setText(Double.toString(total));
           //}catch(ArithmeticException ex){
           //    JOptionPane.showMessageDialog(null, "Digite Os valores correspondentes ao valor unitário e quantidade corretamente! \n"+ex);
           //}
           
        String[] colunas = new String[]{"ID", "Descrição","V. unitário", "Quantidade", "V. total"};
        
        lista.add(new Object[]{id, descricao,valorUnitario, quantidade,valorTotal });            
        
        ModelTabela modelo = new ModelTabela(lista, colunas);

        jTableListaDeProdutos.setModel(modelo);
        jTableListaDeProdutos.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTableListaDeProdutos.getColumnModel().getColumn(0).setResizable(false);
        jTableListaDeProdutos.getColumnModel().getColumn(1).setPreferredWidth(203);
        jTableListaDeProdutos.getColumnModel().getColumn(1).setResizable(false);
        jTableListaDeProdutos.getColumnModel().getColumn(2).setPreferredWidth(70);
        jTableListaDeProdutos.getColumnModel().getColumn(2).setResizable(false);
        jTableListaDeProdutos.getColumnModel().getColumn(3).setPreferredWidth(78);
        jTableListaDeProdutos.getColumnModel().getColumn(3).setResizable(false);
        jTableListaDeProdutos.getColumnModel().getColumn(4).setPreferredWidth(70);
        jTableListaDeProdutos.getColumnModel().getColumn(4).setResizable(false);
        jTableListaDeProdutos.getTableHeader().setReorderingAllowed(false);
        jTableListaDeProdutos.setAutoResizeMode(jTableListaDeProdutos.AUTO_RESIZE_OFF);
        jTableListaDeProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jButtonConfirmar.setEnabled(true);
        jTextFieldQuantidade.setEnabled(false);
        jTextFieldValorUnitario.setEnabled(false);
    }
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
            java.util.logging.Logger.getLogger(PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PDV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelCpfCnpj;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNomeProduto;
    private javax.swing.JLabel jLabelValorTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListaDeProdutos;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldValorUnitario;
    // End of variables declaration//GEN-END:variables
}
