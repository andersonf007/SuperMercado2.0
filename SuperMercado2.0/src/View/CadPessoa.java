
package View;

import ModelDao.*;
import Negocio.EnderecoNegocio;
import Negocio.Exceptions.*;
import ModelBeans.EnderecoBeans;
import ModelBeans.ModelTabela;
import ModelBeans.PessoaFisicaBeans;
import ModelBeans.PessoaJuridicaBeans;
import ModelBeans.UsuarioBeans;
import Negocio.PessoaFisicaNegocio;
import Negocio.PessoaJuridicaNegocio;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import Negocio.UsuarioNegocio;
/**
 *
 * @author anderson
 */
public final class CadPessoa extends javax.swing.JFrame {
    private UsuarioNegocio usuarioNegocio;
    private PessoaFisicaNegocio pessoaFisicaNegocio;
    private PessoaJuridicaNegocio pessoaJuridicaNegocio;
    private EnderecoNegocio enderecoNegocio;
    private PessoaFisicaDAO pessoaFisicaDAO;
    private PessoaJuridicaDAO pessoaJuridicaDAO;
    private UsuarioDAO usuarioDAO;
    private EnderecoDAO enderecoDAO;
    private UsuarioBeans usuarioBeans;
    private ArrayList<UsuarioBeans> ListUsuarioBeans;
    private ArrayList<EnderecoBeans> ListEnderecoBeans;
    private ArrayList<PessoaFisicaBeans> ListPessoaFisicaBeans;
    private ArrayList<PessoaJuridicaBeans> ListPessoaJuridicaBeans;
    private ArrayList dadosUsuarios; 
    private ArrayList dadosPessoasFisicas; 
    private ArrayList dadosPessoasJuridicas; 
    private int flag, codigoPessoa, codigoEndereco;//O codigoPessoa é o codigoPessoa do usuario, pessoa fisica ou juridica
    //flag = 1 - esta editando um usuario do sistema
    //flag = 2 - esta editando uma pessoa fisica no sistema
    //flag = 3 - esta editando uma pessoa juridica no sistema
   
    public CadPessoa() {
        initComponents();        
        pessoaFisicaDAO  = new PessoaFisicaDAO();
        pessoaJuridicaDAO = new PessoaJuridicaDAO();
        usuarioDAO = new UsuarioDAO();
        enderecoDAO = new EnderecoDAO();
        usuarioBeans = new UsuarioBeans();
        ListUsuarioBeans = new ArrayList<>();
        ListEnderecoBeans = new ArrayList<>();
        ListPessoaFisicaBeans = new ArrayList<>();
        ListPessoaJuridicaBeans = new ArrayList<>();
        dadosUsuarios = new ArrayList(); 
        dadosPessoasFisicas = new ArrayList(); 
        dadosPessoasJuridicas = new ArrayList(); 
        usuarioNegocio = new UsuarioNegocio(usuarioDAO);
        pessoaFisicaNegocio = new PessoaFisicaNegocio(pessoaFisicaDAO);
        pessoaJuridicaNegocio = new PessoaJuridicaNegocio(pessoaJuridicaDAO);
        enderecoNegocio = new EnderecoNegocio(enderecoDAO);
        preencherTabelaPessoaFisica();
        preencherTabelaUsuarios();
        preencherTabelaPessoaJuridica();
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
        jTextFieldRGIE = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jComboBoxSexo = new javax.swing.JComboBox();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComboBoxTipoPessoa = new javax.swing.JComboBox();
        jButtonSalvar = new javax.swing.JButton();
        jCheckBoxAtivo = new javax.swing.JCheckBox();
        jCheckBoxAdm = new javax.swing.JCheckBox();
        jButtonEditar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePessoaFisica = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePessoaJuridica = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        jTextFieldRGIE.setEnabled(false);
        jPanel1.add(jTextFieldRGIE);
        jTextFieldRGIE.setBounds(480, 210, 150, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nome / Razão Social:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 40, 180, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Sexo:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(550, 40, 50, 20);

        jTextFieldNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldNomeMouseClicked(evt);
            }
        });
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

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Tipo de pessoa:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(410, 40, 130, 20);

        jComboBoxTipoPessoa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxTipoPessoa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecionar", "Física", "Jurídica", "Funcionário" }));
        jComboBoxTipoPessoa.setEnabled(false);
        jComboBoxTipoPessoa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxTipoPessoaItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboBoxTipoPessoa);
        jComboBoxTipoPessoa.setBounds(410, 70, 130, 30);

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
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEditar);
        jButtonEditar.setBounds(750, 270, 110, 40);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Login:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(40, 250, 60, 20);

        jPasswordFieldSenha.setEnabled(false);
        jPanel1.add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(200, 280, 170, 30);

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
        jTablePessoaFisica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePessoaFisicaMouseClicked(evt);
            }
        });
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
        jTablePessoaJuridica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePessoaJuridicaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTablePessoaJuridica);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(360, 380, 340, 190);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Listagem de usuarios");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(790, 350, 180, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Listagem de pessoas físicas");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(70, 350, 230, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Listagem de pessoas jurídicas");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(410, 350, 240, 30);

        setSize(new java.awt.Dimension(1100, 602));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        
        String nome = jTextFieldNome.getText();
        String telefone = jTextFieldTelefone.getText();
        String cpfCnpj = jTextFieldCPFCNPJ.getText();
        String rgie = jTextFieldRGIE.getText();
        String sexo = jComboBoxSexo.getSelectedItem().toString();
        boolean ativo = jCheckBoxAtivo.isSelected();

        String cep = jTextFieldCep.getText();
        String logradouro = jTextFieldLogradouro.getText();
        String numero = jTextFieldNumero.getText();
        String cidade = jTextFieldCidade.getText();
        String bairro = jTextFieldBairro.getText();
        String uf = jTextFieldUf.getText();

        String login = jTextFieldLogin.getText();
        String senha = jPasswordFieldSenha.getText();
        boolean adm = jCheckBoxAdm.isSelected();
        try{
            if(jComboBoxTipoPessoa.getSelectedItem().equals("Física")){
                if(flag == 2){
                    int idEndereco = codigoEndereco;
                    int idPessoa = codigoPessoa;
                    EnderecoBeans enderecoBeans = new EnderecoBeans(idEndereco,cep,logradouro,cidade,bairro,uf,numero);
                    enderecoNegocio.editarEndereco(enderecoBeans);
                    PessoaFisicaBeans pessoaFisica = new PessoaFisicaBeans(cpfCnpj,rgie,sexo,idPessoa,nome,telefone,idEndereco,ativo);
                    pessoaFisicaNegocio.editarPessoaFisica(pessoaFisica);
                }else if(flag == 0){
                    int quantidadePessoas = pessoaFisicaDAO.confereQuantidadeDeRegistros();
                    int idPessoa = ++quantidadePessoas;
                    int quantidadeEndereco = enderecoDAO.ConfereQuantidadeRegistros();
                    int idEndereco = ++quantidadeEndereco;
                    EnderecoBeans enderecoBeans = new EnderecoBeans(idEndereco,cep,logradouro,cidade,bairro,uf,numero);
                    enderecoNegocio.cadastrarEndereco(enderecoBeans);
                    PessoaFisicaBeans pessoaFisica = new PessoaFisicaBeans(cpfCnpj,rgie,sexo,idPessoa,nome,telefone,idEndereco,ativo);
                    pessoaFisicaNegocio.cadastrarPessoaFisica(pessoaFisica);
                }
                preencherTabelaPessoaFisica();

            }else if(jComboBoxTipoPessoa.getSelectedItem().equals("Jurídica")){

                if(flag == 3){
                    int idEndereco = codigoEndereco;
                    int idPessoa = codigoPessoa;
                    EnderecoBeans enderecoBeans = new EnderecoBeans(idEndereco,cep,logradouro,cidade,bairro,uf,numero);
                    enderecoNegocio.editarEndereco(enderecoBeans);
                    PessoaJuridicaBeans pessoaJuridicaBeans = new PessoaJuridicaBeans(cpfCnpj, rgie, idPessoa, nome, telefone, idEndereco, ativo);
                    pessoaJuridicaNegocio.editarPessoaJuridica(pessoaJuridicaBeans);

                }else if(flag == 0){
                    int quantidadePessoas = pessoaJuridicaDAO.ConfereQuantidadeDeRegistros();
                    int idPessoa = ++quantidadePessoas;
                    int quantidadeEndereco = enderecoDAO.ConfereQuantidadeRegistros();
                    int idEndereco = ++quantidadeEndereco;
                    EnderecoBeans enderecoBeans = new EnderecoBeans(idEndereco,cep,logradouro,cidade,bairro,uf,numero);
                    enderecoNegocio.cadastrarEndereco(enderecoBeans);
                    PessoaJuridicaBeans pessoaJuridicaBeans = new PessoaJuridicaBeans(cpfCnpj, rgie, idPessoa, nome, telefone, idEndereco, ativo);
                    pessoaJuridicaNegocio.cadastrarPessoaJuridica(pessoaJuridicaBeans);
                }
                preencherTabelaPessoaJuridica();

            }else{

                if(flag == 1){
                    int id = codigoPessoa;                
                    UsuarioBeans usuario = new UsuarioBeans(nome,adm, id, login, senha,ativo); 
                    usuarioNegocio.editarUsuario(usuario);
                }else if(flag == 0){
                    int quantidade = usuarioDAO.confereQuantidadeDeUsuariosRegistrados();
                    int id = ++quantidade;                
                    UsuarioBeans usuario = new UsuarioBeans(nome,adm, id, login, senha,ativo);
                    usuarioNegocio.cadastrarUsuario(usuario);

                }
                preencherTabelaUsuarios();
            }
            validarInformacoesDepoisDeSalvar();
        } catch(NomeInvalidoException ex){
            JOptionPane.showMessageDialog(null, ex);
            jTextFieldNome.requestFocus();
        }catch(LoginRepetidoException ex) {
            JOptionPane.showMessageDialog(null, ex);
            jTextFieldLogin.requestFocus();
        }catch(SenhaInvalidaException ex){
            JOptionPane.showMessageDialog(null, ex);
            jPasswordFieldSenha.requestFocus();
        }catch(CpfInvalidoException | CnpjInvalidoException ex){
            JOptionPane.showMessageDialog(null, ex);
            jTextFieldCPFCNPJ.requestFocus();
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, ex);
            jTextFieldNumero.requestFocus();
        }catch(RgInvalidoException | IeInvalidoException ex){
            JOptionPane.showMessageDialog(null, ex);
            jTextFieldRGIE.requestFocus();
        } catch(TelefoneInvalidoExcepition ex){
            JOptionPane.showMessageDialog(null, ex);
            jTextFieldTelefone.requestFocus();
        } catch(ValidacaoException ex ){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jComboBoxTipoPessoaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxTipoPessoaItemStateChanged
            if(jComboBoxTipoPessoa.getSelectedItem().equals("Física")){
                validarSelecaoAoSelecionarTabela();
                jComboBoxSexo.setEnabled(true);
            }else if(jComboBoxTipoPessoa.getSelectedItem().equals("Jurídica")){
                validarSelecaoAoSelecionarTabela();
                jComboBoxSexo.setEnabled(false);
            }else if(jComboBoxTipoPessoa.getSelectedItem().equals("Funcionário")){
                                
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
                jButtonEditar.setEnabled(false);
                jTablePessoaFisica.setEnabled(false);
                jTablePessoaJuridica.setEnabled(false);
                jTableUsuarios.setEnabled(false);
                
                jTextFieldLogin.setEnabled(true);
                jPasswordFieldSenha.setEnabled(true);
                jCheckBoxAdm.setEnabled(true);
                jCheckBoxAtivo.setEnabled(true);
                jButtonSalvar.setEnabled(true);
                jButtonCancelar.setEnabled(true);
                
            }
    }//GEN-LAST:event_jComboBoxTipoPessoaItemStateChanged

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
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
        jTextFieldLogin.setText("");
        jPasswordFieldSenha.setText("");
        jComboBoxTipoPessoa.setSelectedIndex(0);        
        jCheckBoxAdm.setSelected(false);
        jCheckBoxAtivo.setSelected(false);
        
        jCheckBoxAdm.setEnabled(false);
        jCheckBoxAtivo.setEnabled(false);
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
        jComboBoxTipoPessoa.setEnabled(false);
        jPasswordFieldSenha.setEnabled(false);
        jTextFieldLogin.setEnabled(false);
        jButtonSalvar.setEnabled(false);           
        jButtonCancelar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        
        jTextFieldNome.setEnabled(true);
        jTablePessoaFisica.setEnabled(true);
        jTablePessoaJuridica.setEnabled(true);
        jTableUsuarios.setEnabled(true);
        flag = 0;
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        if(flag == 1){
            jComboBoxTipoPessoa.setSelectedIndex(3);
            validarCamposBotaoEditar();
        }else if(flag == 2){
            jComboBoxTipoPessoa.setSelectedIndex(1);
            validarCamposBotaoEditar();
        }else if(flag == 3){
            jComboBoxTipoPessoa.setSelectedIndex(2);
            validarCamposBotaoEditar();
        }
        
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jTableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuariosMouseClicked
        validacaoDeCampos1();
        jTextFieldNome.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jCheckBoxAdm.setEnabled(true);        
        jCheckBoxAtivo.setEnabled(true);                
        jTextFieldLogin.setEnabled(true);        
        jPasswordFieldSenha.setEnabled(true); 
        jTablePessoaJuridica.setEnabled(false);
        jTablePessoaFisica.setEnabled(false);
                
        flag = 1;
        codigoPessoa = Integer.parseInt(""+jTableUsuarios.getValueAt(jTableUsuarios.getSelectedRow(), 0));
        ListUsuarioBeans.clear(); //limpa o arrray list
        ListUsuarioBeans = usuarioDAO.busca();
        
        for(int i = 0; i < ListUsuarioBeans.size(); i++){
            if(ListUsuarioBeans.get(i).getId() == codigoPessoa){
                jTextFieldNome.setText(ListUsuarioBeans.get(i).getNome());
                jTextFieldLogin.setText(ListUsuarioBeans.get(i).getLogin());
                jPasswordFieldSenha.setText(ListUsuarioBeans.get(i).getSenha());
                jCheckBoxAdm.setSelected(ListUsuarioBeans.get(i).getAdm());
                jCheckBoxAtivo.setSelected(ListUsuarioBeans.get(i).getAtivo());
            }
        }
    }//GEN-LAST:event_jTableUsuariosMouseClicked

    private void jTablePessoaFisicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePessoaFisicaMouseClicked
        validacaoDeCampos2();
        jTablePessoaJuridica.setEnabled(false);
        jTableUsuarios.setEnabled(false);
        
        flag = 2;
        codigoPessoa = Integer.parseInt(""+jTablePessoaFisica.getValueAt(jTablePessoaFisica.getSelectedRow(), 0));
        ListPessoaFisicaBeans.clear();
        ListPessoaFisicaBeans = pessoaFisicaDAO.buscarTodosOsRegistros();
        ListEnderecoBeans.clear();
        ListEnderecoBeans = enderecoDAO.busca();
        
        for(int i = 0; i < ListPessoaFisicaBeans.size(); i++){
            if(codigoPessoa == ListPessoaFisicaBeans.get(i).getCodigo()){
                jTextFieldNome.setText(ListPessoaFisicaBeans.get(i).getNome());
                jTextFieldTelefone.setText(ListPessoaFisicaBeans.get(i).getTelefone());
                jTextFieldCPFCNPJ.setText(ListPessoaFisicaBeans.get(i).getCpf());
                jTextFieldRGIE.setText(ListPessoaFisicaBeans.get(i).getRg());
                jCheckBoxAtivo.setSelected(ListPessoaFisicaBeans.get(i).getAtivo());
                if("Masculino".equals(ListPessoaFisicaBeans.get(i).getSexo())){
                    jComboBoxSexo.setSelectedIndex(0);
                }else{
                    jComboBoxSexo.setSelectedIndex(1);
                }
                codigoEndereco = ListPessoaFisicaBeans.get(i).getCodEndereco();
            }            
        }
        
        for(int i =0; i < ListEnderecoBeans.size(); i++){
            if(ListEnderecoBeans.get(i).getId() == codigoEndereco){
                //codigoEndereco = ListEnderecoBeans.get(i).getId();
                jTextFieldCep.setText(ListEnderecoBeans.get(i).getCep());
                jTextFieldLogradouro.setText(ListEnderecoBeans.get(i).getLogradouro());
                jTextFieldNumero.setText(ListEnderecoBeans.get(i).getNumero());
                jTextFieldCidade.setText(ListEnderecoBeans.get(i).getCidade());
                jTextFieldBairro.setText(ListEnderecoBeans.get(i).getBairro());
                jTextFieldUf.setText(ListEnderecoBeans.get(i).getUf());
            }
        }
        
        
    }//GEN-LAST:event_jTablePessoaFisicaMouseClicked

    private void jTextFieldNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNomeMouseClicked
        if(flag == 1 || flag == 2 || flag ==3){
            jComboBoxTipoPessoa.setEnabled(false);
        }else{
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
            jTextFieldLogin.setText("");
            jPasswordFieldSenha.setText("");
            jCheckBoxAdm.setSelected(false);
            jCheckBoxAtivo.setSelected(false);
            jComboBoxTipoPessoa.setEnabled(true);
        }
        
    }//GEN-LAST:event_jTextFieldNomeMouseClicked

    private void jTablePessoaJuridicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePessoaJuridicaMouseClicked
        validacaoDeCampos2();
        jTablePessoaFisica.setEnabled(false);
        jTableUsuarios.setEnabled(false);
        flag = 3;
        codigoPessoa = Integer.parseInt(""+jTablePessoaJuridica.getValueAt(jTablePessoaJuridica.getSelectedRow(), 0));
        ListPessoaJuridicaBeans.clear();
        ListPessoaJuridicaBeans = pessoaJuridicaDAO.buscar();
        ListEnderecoBeans.clear();
        ListEnderecoBeans = enderecoDAO.busca();
        
        for(int i = 0; i < ListPessoaJuridicaBeans.size(); i++){
            if(codigoPessoa == ListPessoaFisicaBeans.get(i).getCodigo()){
                jTextFieldNome.setText(ListPessoaJuridicaBeans.get(i).getNome());
                jTextFieldTelefone.setText(ListPessoaJuridicaBeans.get(i).getTelefone());
                jTextFieldCPFCNPJ.setText(ListPessoaJuridicaBeans.get(i).getCnpj());
                jTextFieldRGIE.setText(ListPessoaJuridicaBeans.get(i).getIe());
                jCheckBoxAtivo.setSelected(ListPessoaJuridicaBeans.get(i).getAtivo());
                codigoEndereco = ListPessoaJuridicaBeans.get(i).getCodEndereco();
            }            
        }
        
        for(int i =0; i < ListEnderecoBeans.size(); i++){
            if(ListEnderecoBeans.get(i).getId() == codigoEndereco){
                jTextFieldCep.setText(ListEnderecoBeans.get(i).getCep());
                jTextFieldLogradouro.setText(ListEnderecoBeans.get(i).getLogradouro());
                jTextFieldNumero.setText(ListEnderecoBeans.get(i).getNumero());
                jTextFieldCidade.setText(ListEnderecoBeans.get(i).getCidade());
                jTextFieldBairro.setText(ListEnderecoBeans.get(i).getBairro());
                jTextFieldUf.setText(ListEnderecoBeans.get(i).getUf());
            }
        }
    }//GEN-LAST:event_jTablePessoaJuridicaMouseClicked

    public void preencherTabelaUsuarios() {
           
        String[] colunas = new String[]{"ID", "nome", "Login", "ADM"};
        
        try {
            dadosUsuarios.clear();
            ListUsuarioBeans.clear(); //limpa o arrray list
            ListUsuarioBeans = usuarioDAO.busca();           
            if(dadosUsuarios.isEmpty()){
                for(int i = 0; i < ListUsuarioBeans.size(); i++){
                    dadosUsuarios.add(new Object[]{ListUsuarioBeans.get(i).getId(),ListUsuarioBeans.get(i).getNome(), ListUsuarioBeans.get(i).getLogin(), ListUsuarioBeans.get(i).getAdm()});
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel baixar a tabela de preencimento das pessoas\n" + ex);
        }
        ModelTabela modelo = new ModelTabela(dadosUsuarios, colunas);
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
    
    public void preencherTabelaPessoaFisica() {
           
        String[] colunas = new String[]{"ID", "nome", "CPF"};
        
        try {
            dadosPessoasFisicas.clear();
            ListPessoaFisicaBeans.clear(); //limpa o arrray list
            ListPessoaFisicaBeans = pessoaFisicaDAO.buscarTodosOsRegistros();           
            if(dadosPessoasFisicas.isEmpty()){
                for(int i = 0; i < ListPessoaFisicaBeans.size(); i++){
                    dadosPessoasFisicas.add(new Object[]{ListPessoaFisicaBeans.get(i).getCodigo(),ListPessoaFisicaBeans.get(i).getNome(), ListPessoaFisicaBeans.get(i).getCpf()});
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel baixar a tabela de preencimento das pessoas\n" + ex);
        }
        ModelTabela modelo = new ModelTabela(dadosPessoasFisicas, colunas);
        jTablePessoaFisica.setModel(modelo);
        jTablePessoaFisica.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTablePessoaFisica.getColumnModel().getColumn(0).setResizable(false);
        jTablePessoaFisica.getColumnModel().getColumn(1).setPreferredWidth(152);
        jTablePessoaFisica.getColumnModel().getColumn(1).setResizable(false);
        jTablePessoaFisica.getColumnModel().getColumn(2).setPreferredWidth(130);
        jTablePessoaFisica.getColumnModel().getColumn(2).setResizable(false);
        jTablePessoaFisica.getTableHeader().setReorderingAllowed(false);
        jTablePessoaFisica.setAutoResizeMode(jTablePessoaFisica.AUTO_RESIZE_OFF);
        jTablePessoaFisica.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }
    
    public void preencherTabelaPessoaJuridica() {
           
        String[] colunas = new String[]{"ID", "nome", "CNPJ"};
        
        try {
            dadosPessoasJuridicas.clear();
            ListPessoaJuridicaBeans.clear(); //limpa o arrray list
            ListPessoaJuridicaBeans = pessoaJuridicaDAO.buscar();           
            if(dadosPessoasJuridicas.isEmpty()){
                for(int i = 0; i < ListPessoaJuridicaBeans.size(); i++){
                    dadosPessoasJuridicas.add(new Object[]{ListPessoaJuridicaBeans.get(i).getCodigo(),ListPessoaJuridicaBeans.get(i).getNome(), ListPessoaJuridicaBeans.get(i).getCnpj()});
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel baixar a tabela de preencimento das pessoas\n" + ex);
        }
        ModelTabela modelo = new ModelTabela(dadosPessoasJuridicas, colunas);
        jTablePessoaJuridica.setModel(modelo);
        jTablePessoaJuridica.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTablePessoaJuridica.getColumnModel().getColumn(0).setResizable(false);
        jTablePessoaJuridica.getColumnModel().getColumn(1).setPreferredWidth(152);
        jTablePessoaJuridica.getColumnModel().getColumn(1).setResizable(false);
        jTablePessoaJuridica.getColumnModel().getColumn(2).setPreferredWidth(130);
        jTablePessoaJuridica.getColumnModel().getColumn(2).setResizable(false);
        jTablePessoaJuridica.getTableHeader().setReorderingAllowed(false);
        jTablePessoaJuridica.setAutoResizeMode(jTablePessoaJuridica.AUTO_RESIZE_OFF);
        jTablePessoaJuridica.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }
    
    public void validacaoDeCampos1(){
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
        jTextFieldLogin.setText("");
        jPasswordFieldSenha.setText("");
        jComboBoxTipoPessoa.setSelectedIndex(0);
        jComboBoxSexo.setSelectedIndex(0);
        jCheckBoxAdm.setSelected(false);
        jCheckBoxAtivo.setSelected(false);
        
        jTextFieldCep.setEnabled(false);
        jTextFieldLogradouro.setEnabled(false);
        jTextFieldNumero.setEnabled(false);
        jTextFieldCidade.setEnabled(false);        
        jTextFieldBairro.setEnabled(false);        
        jTextFieldUf.setEnabled(false);        
        jTextFieldTelefone.setEnabled(false);        
        jTextFieldCPFCNPJ.setEnabled(false);        
        jTextFieldRGIE.setEnabled(false);       
        jComboBoxTipoPessoa.setEnabled(false);        
        jComboBoxSexo.setEnabled(false);          
      
        jButtonSalvar.setEnabled(false);
    }
    
    public void validacaoDeCampos2(){
        jTextFieldLogin.setEnabled(false);
        jPasswordFieldSenha.setEnabled(false);
        jCheckBoxAdm.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        
        jCheckBoxAtivo.setEnabled(true);
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
        jButtonCancelar.setEnabled(true);            
        jButtonEditar.setEnabled(true);
        jComboBoxTipoPessoa.setEnabled(false);
    }
    
    public void validarCamposBotaoEditar(){
        jButtonSalvar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jTablePessoaFisica.setEnabled(false);
        jTablePessoaJuridica.setEnabled(false);
        jTableUsuarios.setEnabled(false);
    }
    
    public void validarSelecaoAoSelecionarTabela(){
        
                jTextFieldCep.setEnabled(true);
                jTextFieldLogradouro.setEnabled(true);
                jTextFieldNumero.setEnabled(true);
                jTextFieldCidade.setEnabled(true);
                jTextFieldBairro.setEnabled(true);
                jTextFieldUf.setEnabled(true);
                jTextFieldTelefone.setEnabled(true);
                jTextFieldCPFCNPJ.setEnabled(true);
                jTextFieldRGIE.setEnabled(true);                
                jCheckBoxAtivo.setEnabled(true);
                jButtonSalvar.setEnabled(true);           
                jButtonCancelar.setEnabled(true);
                
                jPasswordFieldSenha.setEnabled(false);
                jTextFieldLogin.setEnabled(false);
                jCheckBoxAdm.setEnabled(false);
                jTablePessoaFisica.setEnabled(false);
                jTablePessoaJuridica.setEnabled(false);
                jTableUsuarios.setEnabled(false);
    }
    
    public void validarInformacoesDepoisDeSalvar(){
        validacaoDeCampos1();
        jButtonCancelar.setEnabled(false);
        jButtonEditar.setEnabled(false);             
        jCheckBoxAdm.setEnabled(false);        
        jCheckBoxAtivo.setEnabled(false);                
        jTextFieldLogin.setEnabled(false);        
        jPasswordFieldSenha.setEnabled(false);

        jTextFieldNome.setEnabled(true);
        jTablePessoaFisica.setEnabled(true);
        jTablePessoaJuridica.setEnabled(true);
        jTableUsuarios.setEnabled(true);

        flag = 0;

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldSenha;
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
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JTextField jTextFieldUf;
    // End of variables declaration//GEN-END:variables
}
