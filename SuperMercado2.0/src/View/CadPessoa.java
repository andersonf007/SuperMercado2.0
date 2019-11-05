/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import ModelBeans.ModelTabela;
import ModelBeans.PessoaFisicaBeans;
import ModelBeans.PessoaJuridicaBeans;
import ModelBeans.UsuarioBeans;
import ModelDao.PessoaFisicaDAO;
import ModelDao.PessoaJuridicaDAO;
import ModelDao.UsuarioDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anderson
 */
public class CadPessoa extends javax.swing.JFrame {

    //PessoaFisicaDAO pessoaFisicaDAO  = new PessoaFisicaDAO();
    //PessoaJuridicaDAO pessoaJuridicaDAO = new PessoaJuridicaDAO();
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    UsuarioDAO usuarioDAO3 = new UsuarioDAO();
    UsuarioBeans usuarioBeans = new UsuarioBeans();
    ArrayList<UsuarioBeans> ListUsuarioBeans = new ArrayList<UsuarioBeans>();
    ArrayList dados = new ArrayList(); 
    int flag, codigo;//O codigo é o codigo do usuario, pessoa fisica ou juridica
    //flag = 1 - esta editando um usuario do sistema
    /**
     * Creates new form CadastroClientes
     */
    public CadPessoa() {
        initComponents();
        preencherTabelaUsuarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldLogradouro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jTextFieldCep = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldUf = new javax.swing.JTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        jTextFieldCidade = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCPFCNPJ = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldRGIE = new javax.swing.JTextField();
        jDateChooserDataNasc = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jComboBoxSexo = new javax.swing.JComboBox();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComboBoxTipoPessoa = new javax.swing.JComboBox();
        jTextFieldSenha = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jCheckBoxAtivo = new javax.swing.JCheckBox();
        jCheckBoxAdm = new javax.swing.JCheckBox();
        jButtonEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePessoaFisica = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePessoaJuridica = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro"));
        jPanel1.setLayout(null);

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancelar);
        jButtonCancelar.setBounds(880, 270, 110, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Logradouro:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(260, 110, 100, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("CEP:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(40, 110, 40, 20);

        jTextFieldLogradouro.setEnabled(false);
        jPanel1.add(jTextFieldLogradouro);
        jTextFieldLogradouro.setBounds(260, 140, 310, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Cidade:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(670, 110, 60, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Bairro:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(830, 110, 60, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Numero:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(580, 110, 70, 20);

        jTextFieldNumero.setEnabled(false);
        jPanel1.add(jTextFieldNumero);
        jTextFieldNumero.setBounds(580, 140, 80, 30);

        jTextFieldCep.setEnabled(false);
        jPanel1.add(jTextFieldCep);
        jTextFieldCep.setBounds(40, 140, 210, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("UF:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(40, 180, 30, 20);

        jTextFieldUf.setEnabled(false);
        jPanel1.add(jTextFieldUf);
        jTextFieldUf.setBounds(40, 210, 40, 30);

        jTextFieldBairro.setEnabled(false);
        jPanel1.add(jTextFieldBairro);
        jTextFieldBairro.setBounds(830, 140, 190, 30);

        jTextFieldCidade.setEnabled(false);
        jPanel1.add(jTextFieldCidade);
        jTextFieldCidade.setBounds(670, 140, 150, 30);

        jTextFieldTelefone.setEnabled(false);
        jPanel1.add(jTextFieldTelefone);
        jTextFieldTelefone.setBounds(100, 210, 150, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Telefone:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(100, 180, 80, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("CPF/CNPJ:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(260, 180, 90, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Rg/IE:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(480, 180, 60, 20);

        jTextFieldCPFCNPJ.setEnabled(false);
        jPanel1.add(jTextFieldCPFCNPJ);
        jTextFieldCPFCNPJ.setBounds(260, 210, 210, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Data de Nascimento:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(640, 180, 170, 20);

        jTextFieldRGIE.setEnabled(false);
        jPanel1.add(jTextFieldRGIE);
        jTextFieldRGIE.setBounds(480, 210, 150, 30);

        jDateChooserDataNasc.setEnabled(false);
        jPanel1.add(jDateChooserDataNasc);
        jDateChooserDataNasc.setBounds(640, 210, 170, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nome / Razão Social:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 40, 180, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Sexo:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(550, 40, 50, 20);
        jPanel1.add(jTextFieldNome);
        jTextFieldNome.setBounds(40, 70, 360, 30);

        jComboBoxSexo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));
        jComboBoxSexo.setEnabled(false);
        jPanel1.add(jComboBoxSexo);
        jComboBoxSexo.setBounds(550, 70, 150, 30);

        jTextFieldLogin.setEnabled(false);
        jPanel1.add(jTextFieldLogin);
        jTextFieldLogin.setBounds(40, 280, 150, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Senha:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(200, 250, 60, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Login:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 250, 60, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Tipo de pessoa:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(410, 40, 130, 20);

        jComboBoxTipoPessoa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxTipoPessoa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecionar", "Física", "Jurídica", "Funcionário" }));
        jComboBoxTipoPessoa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxTipoPessoaItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboBoxTipoPessoa);
        jComboBoxTipoPessoa.setBounds(410, 70, 130, 30);

        jTextFieldSenha.setEnabled(false);
        jPanel1.add(jTextFieldSenha);
        jTextFieldSenha.setBounds(200, 280, 170, 30);

        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalvar);
        jButtonSalvar.setBounds(620, 270, 110, 40);

        jCheckBoxAtivo.setText("Ativo");
        jCheckBoxAtivo.setEnabled(false);
        jPanel1.add(jCheckBoxAtivo);
        jCheckBoxAtivo.setBounds(500, 280, 70, 30);

        jCheckBoxAdm.setText("Administrador");
        jCheckBoxAdm.setEnabled(false);
        jPanel1.add(jCheckBoxAdm);
        jCheckBoxAdm.setBounds(390, 280, 100, 30);

        jButtonEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEditar);
        jButtonEditar.setBounds(750, 270, 110, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 1040, 340);

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUsuarios);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(710, 380, 340, 190);

        jTablePessoaFisica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTablePessoaFisica);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 380, 340, 190);

        jTablePessoaJuridica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTablePessoaJuridica);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(360, 380, 340, 190);

        setSize(new java.awt.Dimension(1100, 602));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(jComboBoxTipoPessoa.getSelectedItem().equals("Física")){
                String nome = jTextFieldNome.getText();
                String telefone = jTextFieldTelefone.getText();
                String cpfCnpj = jTextFieldCPFCNPJ.getText();
                String rgie = jTextFieldRGIE.getText();
                String sexo = jComboBoxSexo.getSelectedItem().toString();
                Date dataNasc = jDateChooserDataNasc.getDate();
                String tipo = jComboBoxTipoPessoa.getSelectedItem().toString();
                
                String cep = jTextFieldCep.getText();
                String logradouro = jTextFieldLogradouro.getText();
                int numero = Integer.parseInt(jTextFieldNumero.getText());
                String cidade = jTextFieldCidade.getText();
                String bairro = jTextFieldBairro.getText();
                String uf = jTextFieldUf.getText();
                
                //PessoaFisicaBeans pessoaFisica = new PessoaFisicaBeans(cpfCnpj, rgie, sexo, dataNasc, numero, numero, nome, tipo, cep, logradouro, cidade, bairro, uf, telefone);
            //    pessoaFisicaDAO.adicionarClienteFisico(pessoaFisica);
                
                jTextFieldNome.setText("");
                jTextFieldCep.setText("");
                jTextFieldLogradouro.setText("");
                jTextFieldNumero.setText("");
                jTextFieldCidade.setText("");
                jTextFieldBairro.setText("");
                jTextFieldUf.setText("");
                jTextFieldTelefone.setText("");
                jTextFieldCPFCNPJ.setText("");
                jTextFieldRGIE.setText("");
                jTextFieldCep.setEnabled(false);
                jTextFieldLogradouro.setEnabled(false);
                jTextFieldNumero.setEnabled(false);
                jTextFieldCidade.setEnabled(false);
                jTextFieldBairro.setEnabled(false);
                jTextFieldUf.setEnabled(false);
                jTextFieldTelefone.setEnabled(false);
                jTextFieldCPFCNPJ.setEnabled(false);
                jTextFieldRGIE.setEnabled(false);
                jComboBoxSexo.setEnabled(false);
                jDateChooserDataNasc.setEnabled(false);
                jTextFieldLogin.setEnabled(false);
                jTextFieldSenha.setEnabled(false);
                jButtonSalvar.setEnabled(true);
                jButtonCancelar.setEnabled(true);
                
            }else if(jComboBoxTipoPessoa.getSelectedItem().equals("Jurídica")){
                
                String nome = jTextFieldNome.getText();
                String cep = jTextFieldCep.getText();
                String logradouro = jTextFieldLogradouro.getText();
                int numero = Integer.parseInt(jTextFieldNumero.getText());
                String cidade = jTextFieldCidade.getText();
                String bairro = jTextFieldBairro.getText();
                String uf = jTextFieldUf.getText();
                String telefone = jTextFieldTelefone.getText();
                String cpfcnpj = jTextFieldCPFCNPJ.getText();
                String rgie = jTextFieldRGIE.getText();
                String tipo = jComboBoxTipoPessoa.getSelectedItem().toString();
                PessoaJuridicaBeans pessoaJuridica = new PessoaJuridicaBeans(cep, rgie, numero, numero, nome, tipo, cep, logradouro, cidade, bairro, uf, telefone);
            //    pessoaJuridicaDAO.adicionarClienteJuridico(pessoaJuridica);
                
                jTextFieldNome.setText("");
                jTextFieldCep.setText("");
                jTextFieldLogradouro.setText("");
                jTextFieldNumero.setText("");
                jTextFieldCidade.setText("");
                jTextFieldBairro.setText("");
                jTextFieldUf.setText("");
                jTextFieldTelefone.setText("");
                jTextFieldCPFCNPJ.setText("");
                jTextFieldRGIE.setText("");
                jTextFieldCep.setEnabled(false);
                jTextFieldLogradouro.setEnabled(false);
                jTextFieldNumero.setEnabled(false);
                jTextFieldCidade.setEnabled(false);
                jTextFieldBairro.setEnabled(false);
                jTextFieldUf.setEnabled(false);
                jTextFieldTelefone.setEnabled(false);
                jTextFieldCPFCNPJ.setEnabled(false);
                jTextFieldRGIE.setEnabled(false);
                jComboBoxSexo.setEnabled(false);
                jDateChooserDataNasc.setEnabled(false);
                jTextFieldLogin.setEnabled(false);
                jTextFieldSenha.setEnabled(false);
                jButtonSalvar.setEnabled(true);
                jButtonCancelar.setEnabled(true);
                
            }else{
                if(flag == 1){
                    String nome = jTextFieldNome.getText();
                    String login = jTextFieldLogin.getText();
                    String senha = jTextFieldSenha.getText();
                    boolean adm = jCheckBoxAdm.isSelected();
                    boolean ativo = jCheckBoxAtivo.isSelected();
                    int id = codigo;                
                    UsuarioBeans usuario = new UsuarioBeans(nome,adm, id, login, senha,ativo); 
                    usuarioDAO.editar(usuario);
                }else{
                    String nome = jTextFieldNome.getText();
                    String login = jTextFieldLogin.getText();
                    String senha = jTextFieldSenha.getText();
                    boolean adm = jCheckBoxAdm.isSelected();
                    boolean ativo = jCheckBoxAtivo.isSelected();
                    int quantidade = usuarioDAO.confereQuantidadeDeUsuariosRegistrados();
                    int id = ++quantidade;                
                    UsuarioBeans usuario = new UsuarioBeans(nome,adm, id, login, senha,ativo); 
                    usuarioDAO.cadastrar(usuario);
                }
                
                
                preencherTabelaUsuarios();
                
                jTextFieldCep.setEnabled(false);
                jTextFieldLogradouro.setEnabled(false);
                jTextFieldNumero.setEnabled(false);
                jTextFieldCidade.setEnabled(false);
                jTextFieldBairro.setEnabled(false);
                jTextFieldUf.setEnabled(false);
                jTextFieldTelefone.setEnabled(false);
                jTextFieldCPFCNPJ.setEnabled(false);
                jTextFieldRGIE.setEnabled(false);
                jComboBoxSexo.setEnabled(false);
                jDateChooserDataNasc.setEnabled(false);
                jTextFieldLogin.setEnabled(true);
                jTextFieldSenha.setEnabled(true);
                jButtonSalvar.setEnabled(true);
                jButtonCancelar.setEnabled(true);
                jCheckBoxAdm.setEnabled(false);
                jCheckBoxAtivo.setEnabled(false);
                
                flag = 0;
            }

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jComboBoxTipoPessoaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxTipoPessoaItemStateChanged
            if(jComboBoxTipoPessoa.getSelectedItem().equals("Física")){
                jTextFieldCep.setEnabled(true);
                jTextFieldLogradouro.setEnabled(true);
                jTextFieldNumero.setEnabled(true);
                jTextFieldCidade.setEnabled(true);
                jTextFieldBairro.setEnabled(true);
                jTextFieldUf.setEnabled(true);
                jTextFieldTelefone.setEnabled(true);
                jTextFieldCPFCNPJ.setEnabled(true);
                jTextFieldRGIE.setEnabled(true);
                jComboBoxSexo.setEnabled(true);
                jDateChooserDataNasc.setEnabled(true);
                jTextFieldSenha.setEnabled(false);
                jTextFieldLogin.setEnabled(false);
                jButtonSalvar.setEnabled(true);           
                jButtonCancelar.setEnabled(true);
            }else if(jComboBoxTipoPessoa.getSelectedItem().equals("Jurídica")){
                jTextFieldCep.setEnabled(true);
                jTextFieldLogradouro.setEnabled(true);
                jTextFieldNumero.setEnabled(true);
                jTextFieldCidade.setEnabled(true);
                jTextFieldBairro.setEnabled(true);
                jTextFieldUf.setEnabled(true);
                jTextFieldTelefone.setEnabled(true);
                jTextFieldCPFCNPJ.setEnabled(true);
                jTextFieldRGIE.setEnabled(true);
                jButtonSalvar.setEnabled(true);       
                jButtonCancelar.setEnabled(true);
            }else{
                jTextFieldCep.setEnabled(false);
                jTextFieldLogradouro.setEnabled(false);
                jTextFieldNumero.setEnabled(false);
                jTextFieldCidade.setEnabled(false);
                jTextFieldBairro.setEnabled(false);
                jTextFieldUf.setEnabled(false);
                jTextFieldTelefone.setEnabled(false);
                jTextFieldCPFCNPJ.setEnabled(false);
                jTextFieldRGIE.setEnabled(false);
                jComboBoxSexo.setEnabled(false);
                jDateChooserDataNasc.setEnabled(false);
                jTextFieldLogin.setEnabled(true);
                jTextFieldSenha.setEnabled(true);
                jButtonSalvar.setEnabled(true);
                jButtonCancelar.setEnabled(true);
                jCheckBoxAdm.setEnabled(true);
                jCheckBoxAtivo.setEnabled(true);
                
            }
    }//GEN-LAST:event_jComboBoxTipoPessoaItemStateChanged

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldCep.setEnabled(false);
        jTextFieldLogradouro.setEnabled(false);
        jTextFieldNumero.setEnabled(false);
        jTextFieldCidade.setEnabled(false);
        jTextFieldBairro.setEnabled(false);
        jTextFieldUf.setEnabled(false);
        jTextFieldTelefone.setEnabled(false);
        jTextFieldCPFCNPJ.setEnabled(false);
        jTextFieldRGIE.setEnabled(false);
        jComboBoxSexo.setEnabled(false);
        jDateChooserDataNasc.setEnabled(false);
        jTextFieldSenha.setEnabled(false);
        jTextFieldLogin.setEnabled(false);
        jButtonSalvar.setEnabled(false);           
        jButtonCancelar.setEnabled(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        if(flag == 1){
            jTextFieldLogin.setEnabled(true);
            jTextFieldSenha.setEnabled(true);
            jCheckBoxAdm.setEnabled(true);
            jCheckBoxAtivo.setEnabled(true);
            jButtonEditar.setEnabled(false);
            jButtonSalvar.setEnabled(true);
            jButtonCancelar.setEnabled(true);
            jComboBoxTipoPessoa.setSelectedIndex(3);
        }
        
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jTableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuariosMouseClicked
        flag = 1;
        codigo = Integer.parseInt(""+jTableUsuarios.getValueAt(jTableUsuarios.getSelectedRow(), 0));
        ListUsuarioBeans.clear(); //limpa o arrray list
        ListUsuarioBeans = usuarioDAO.busca();
        
        for(int i = 0; i < ListUsuarioBeans.size(); i++){
            if(ListUsuarioBeans.get(i).getId() == codigo){
                jTextFieldNome.setText(ListUsuarioBeans.get(i).getNome());
                jTextFieldLogin.setText(ListUsuarioBeans.get(i).getLogin());
                jTextFieldSenha.setText(ListUsuarioBeans.get(i).getSenha());
                jCheckBoxAdm.setSelected(ListUsuarioBeans.get(i).getAdm());
                jCheckBoxAtivo.setSelected(ListUsuarioBeans.get(i).getAtivo());
            }
        }
    }//GEN-LAST:event_jTableUsuariosMouseClicked

    public void preencherTabelaUsuarios() {
           
        String[] colunas = new String[]{"ID", "nome", "Login", "ADM"};
        
        try {
            dados.clear();
            ListUsuarioBeans.clear(); //limpa o arrray list
            ListUsuarioBeans = usuarioDAO.busca();           
            int quantidadeRegistro = usuarioDAO.confereQuantidadeDeUsuariosRegistrados();
            quantidadeRegistro--;//subtrai para ter o valor correspondente a posicao do array
            if(dados.isEmpty()){
                for(int i = 0; i < ListUsuarioBeans.size(); i++){
                    dados.add(new Object[]{ListUsuarioBeans.get(i).getId(),ListUsuarioBeans.get(i).getNome(), ListUsuarioBeans.get(i).getLogin(), ListUsuarioBeans.get(i).getAdm()});
                }
            }else {
                dados.add(new Object[]{ListUsuarioBeans.get(quantidadeRegistro).getId(),ListUsuarioBeans.get(quantidadeRegistro).getNome(), ListUsuarioBeans.get(quantidadeRegistro).getLogin(), ListUsuarioBeans.get(quantidadeRegistro).getAdm()});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel baixar a tabela de preencimento das pessoas\n" + ex);
        }
        ModelTabela modelo = new ModelTabela(dados, colunas);
        jTableUsuarios.setModel(modelo);
        jTableUsuarios.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTableUsuarios.getColumnModel().getColumn(0).setResizable(false);
        jTableUsuarios.getColumnModel().getColumn(1).setPreferredWidth(132);
        jTableUsuarios.getColumnModel().getColumn(1).setResizable(false);
        jTableUsuarios.getColumnModel().getColumn(2).setPreferredWidth(109);
        jTableUsuarios.getColumnModel().getColumn(2).setResizable(false);
        jTableUsuarios.getColumnModel().getColumn(3).setPreferredWidth(40);
        jTableUsuarios.getColumnModel().getColumn(3).setResizable(false);
        jTableUsuarios.getTableHeader().setReorderingAllowed(false);
        jTableUsuarios.setAutoResizeMode(jTableUsuarios.AUTO_RESIZE_OFF);
        jTableUsuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

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
            java.util.logging.Logger.getLogger(CadPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JCheckBox jCheckBoxAdm;
    private javax.swing.JCheckBox jCheckBoxAtivo;
    private javax.swing.JComboBox jComboBoxSexo;
    private javax.swing.JComboBox jComboBoxTipoPessoa;
    private com.toedter.calendar.JDateChooser jDateChooserDataNasc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTablePessoaFisica;
    private javax.swing.JTable jTablePessoaJuridica;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCPFCNPJ;
    private javax.swing.JTextField jTextFieldCep;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldLogradouro;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldRGIE;
    private javax.swing.JTextField jTextFieldSenha;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JTextField jTextFieldUf;
    // End of variables declaration//GEN-END:variables
}
