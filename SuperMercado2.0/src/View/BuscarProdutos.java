/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controllers.PdvController;
import Controllers.ProdutosController;
import ModelBeans.ModelTabela;
import ModelBeans.ProdutoBeans;
import ModelDao.ProdutoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author anderson
 */
public class BuscarProdutos extends javax.swing.JFrame {

    ProdutoDAO produtoDao = new ProdutoDAO();
    ArrayList<ProdutoBeans> ListProdutoBeans = new ArrayList<ProdutoBeans>();
    ArrayList dados = new ArrayList();
    PdvController pdvController = new PdvController();
    /**
     * Creates new form BuscarProdutos
     */
    public BuscarProdutos() {
        initComponents();
        preencherTabela();
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
        jTableProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProdutos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 452, 330);

        setSize(new java.awt.Dimension(491, 389));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutosMouseClicked
        int idProduto = Integer.parseInt(""+jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 0));
        for(int i = 0; i < ListProdutoBeans.size(); i++){
            if(idProduto == ListProdutoBeans.get(i).getId()){
                ProdutoBeans produtoBeans = new ProdutoBeans();
                produtoBeans.setId(ListProdutoBeans.get(i).getId());
                produtoBeans.setNome(ListProdutoBeans.get(i).getNome());
                produtoBeans.setEstoque(ListProdutoBeans.get(i).getEstoque());
                produtoBeans.setValorCusto(ListProdutoBeans.get(i).getValorCusto());
                produtoBeans.setValorVenda(ListProdutoBeans.get(i).getValorVenda());
                PdvController.RecebeInformacoesProduto(produtoBeans);
            }
        }
        //ProdutoBeans produtoBeansInstancia = produtoDAO.procurarProdutoNome(nome_Produto);
        this.dispose();

    }//GEN-LAST:event_jTableProdutosMouseClicked

    public void preencherTabela() {
        
           String[] colunas = new String[]{"ID", "Descrição", "Estoque", "V. Venda"};
        
        try {
            dados.clear();
            ListProdutoBeans.clear(); //limpa o arrray list
            ListProdutoBeans = produtoDao.busca();                     
            for(int i = 0; i < ListProdutoBeans.size(); i++){
                if(ListProdutoBeans.get(i).getAtivo() == true){
                    dados.add(new Object[]{ListProdutoBeans.get(i).getId(),ListProdutoBeans.get(i).getNome(), ListProdutoBeans.get(i).getEstoque(), ListProdutoBeans.get(i).getValorVenda()});
                }              
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel baixar a tabela de preencimento das pessoas\n" + ex);
        }

        ModelTabela modelo = new ModelTabela(dados, colunas);

        jTableProdutos.setModel(modelo);
        jTableProdutos.getColumnModel().getColumn(0).setPreferredWidth(44);
        jTableProdutos.getColumnModel().getColumn(0).setResizable(false);
        jTableProdutos.getColumnModel().getColumn(1).setPreferredWidth(225);
        jTableProdutos.getColumnModel().getColumn(1).setResizable(false);
        jTableProdutos.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTableProdutos.getColumnModel().getColumn(2).setResizable(false);
        jTableProdutos.getTableHeader().setReorderingAllowed(false);
        jTableProdutos.setAutoResizeMode(jTableProdutos.AUTO_RESIZE_OFF);
        jTableProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
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
            java.util.logging.Logger.getLogger(BuscarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    // End of variables declaration//GEN-END:variables
}
