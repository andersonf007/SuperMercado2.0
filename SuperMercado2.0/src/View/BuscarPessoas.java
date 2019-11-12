/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controllers.PdvController;
import ModelBeans.ModelTabela;
import ModelBeans.PessoaFisicaBeans;
import ModelBeans.PessoaJuridicaBeans;
import ModelDao.PessoaFisicaDAO;
import ModelDao.PessoaJuridicaDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author anderson
 */
public class BuscarPessoas extends javax.swing.JFrame {

    PessoaFisicaDAO pessoaFisicaDAO = new PessoaFisicaDAO();
    PessoaJuridicaDAO pessoaJuridicaDAO = new PessoaJuridicaDAO();
    PessoaFisicaBeans pessoaFisicaBeans = new PessoaFisicaBeans();
    PessoaJuridicaBeans pessoaJuridicaBeans = new PessoaJuridicaBeans();
    ArrayList<PessoaFisicaBeans> ListPessoaFisicaBeans = new ArrayList<PessoaFisicaBeans>();
    ArrayList<PessoaJuridicaBeans> ListPessoaJuridicaBeans = new ArrayList<PessoaJuridicaBeans>();
    ArrayList dados = new ArrayList();
    PdvController pdvController = new PdvController();
    /**
     * Creates new form BuscarPessoas
     */
    public BuscarPessoas() {
        initComponents();
        preencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePessoas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
        jScrollPane1.setBounds(20, 20, 460, 260);

        setSize(new java.awt.Dimension(523, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTablePessoasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePessoasMouseClicked
        int codigo = Integer.parseInt(""+jTablePessoas.getValueAt(jTablePessoas.getSelectedRow(), 0));
        String CnpjCpf = ""+jTablePessoas.getValueAt(jTablePessoas.getSelectedRow(), 2);
        ListPessoaFisicaBeans = pessoaFisicaDAO.buscar();
        ListPessoaJuridicaBeans = pessoaJuridicaDAO.buscar();
        for(int i = 0; i < ListPessoaFisicaBeans.size(); i++){
            if(codigo == ListPessoaFisicaBeans.get(i).getCodigo() && CnpjCpf.equals(ListPessoaFisicaBeans.get(i).getCpf())){
                pessoaFisicaBeans.setCodigo(codigo);
                pessoaFisicaBeans.setNome(ListPessoaFisicaBeans.get(i).getNome());
                pessoaFisicaBeans.setRg(ListPessoaFisicaBeans.get(i).getRg());
                pessoaFisicaBeans.setSexo(ListPessoaFisicaBeans.get(i).getSexo());
                pessoaFisicaBeans.setCpf(CnpjCpf);
                pessoaFisicaBeans.setTelefone(ListPessoaFisicaBeans.get(i).getTelefone());
                pessoaFisicaBeans.setCodEndereco(ListPessoaFisicaBeans.get(i).getCodEndereco());
                pessoaFisicaBeans.setAtivo(ListPessoaFisicaBeans.get(i).getAtivo());
                PdvController.receberInformacoesPessoa(pessoaFisicaBeans,null);
                this.dispose();
            }
        }
        for(int i = 0; i < ListPessoaJuridicaBeans.size(); i++){
            if(codigo == ListPessoaJuridicaBeans.get(i).getCodigo() && CnpjCpf.equals(ListPessoaJuridicaBeans.get(i).getCnpj())){
                pessoaJuridicaBeans.setCodigo(codigo);
                pessoaJuridicaBeans.setNome(ListPessoaJuridicaBeans.get(i).getNome());
                pessoaJuridicaBeans.setIe(ListPessoaJuridicaBeans.get(i).getIe());
                pessoaJuridicaBeans.setCnpj(CnpjCpf);
                pessoaJuridicaBeans.setTelefone(ListPessoaJuridicaBeans.get(i).getTelefone());
                pessoaJuridicaBeans.setCodEndereco(ListPessoaJuridicaBeans.get(i).getCodEndereco());
                pessoaJuridicaBeans.setAtivo(ListPessoaJuridicaBeans.get(i).getAtivo());
                PdvController.receberInformacoesPessoa(null,pessoaJuridicaBeans);
                this.dispose();
            }
        }
        


    }//GEN-LAST:event_jTablePessoasMouseClicked

    public void preencherTabela() {
        
           String[] colunas = new String[]{"ID", "Nome", "CPF / CNPJ", "Telefone"};
        
        try {
            dados.clear();
            ListPessoaFisicaBeans.clear(); //limpa o arrray list
            ListPessoaFisicaBeans = pessoaFisicaDAO.buscar();        
            ListPessoaJuridicaBeans.clear();
            ListPessoaJuridicaBeans = pessoaJuridicaDAO.buscar();
            for(int i = 0; i < ListPessoaFisicaBeans.size(); i++){
                if(ListPessoaFisicaBeans.get(i).getAtivo() == true){
                    dados.add(new Object[]{ListPessoaFisicaBeans.get(i).getCodigo(),ListPessoaFisicaBeans.get(i).getNome(), ListPessoaFisicaBeans.get(i).getCpf(), ListPessoaFisicaBeans.get(i).getTelefone()});
                }
            }
            for(int i = 0; i < ListPessoaJuridicaBeans.size(); i++){
                if(ListPessoaJuridicaBeans.get(i).getAtivo() == true){
                    dados.add(new Object[]{ListPessoaJuridicaBeans.get(i).getCodigo(),ListPessoaJuridicaBeans.get(i).getNome(), ListPessoaJuridicaBeans.get(i).getCnpj(), ListPessoaJuridicaBeans.get(i).getTelefone()});
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel baixar a tabela de preencimento das pessoas\n" + ex);
        }

        ModelTabela modelo = new ModelTabela(dados, colunas);

        jTablePessoas.setModel(modelo);
        jTablePessoas.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTablePessoas.getColumnModel().getColumn(0).setResizable(false);
        jTablePessoas.getColumnModel().getColumn(1).setPreferredWidth(225);
        jTablePessoas.getColumnModel().getColumn(1).setResizable(false);
        jTablePessoas.getColumnModel().getColumn(2).setPreferredWidth(112);
        jTablePessoas.getColumnModel().getColumn(2).setResizable(false);
        jTablePessoas.getTableHeader().setReorderingAllowed(false);
        jTablePessoas.setAutoResizeMode(jTablePessoas.AUTO_RESIZE_OFF);
        jTablePessoas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
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
