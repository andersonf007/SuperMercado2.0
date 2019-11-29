/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import ModelBeans.CadastroEndereco;
import ModelBeans.EnderecoBeans;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author anderson
 */
public class EnderecoDAO extends CadastroEndereco{
    private String[] UF = {"PE","AL","PB","RN","CE","PI","MA","RN","SE","BA","TO","PA","AP","RR","AM","RO","AC","MT","GO","DF","MS","MG","ES","RJ","SP","PR","SC","RS"};
    private ArrayList<EnderecoBeans> ListEnderecoBeans = new ArrayList<EnderecoBeans>();

    @Override
    public void cadastrar(EnderecoBeans object) {
        try {
            FileOutputStream arquivo = new FileOutputStream("endereco.txt",true);
            PrintWriter pr = new PrintWriter(arquivo);
            pr.println(object.getId()
                       +"#"+object.getCep()
                       +"#"+object.getCidade()
                       +"#"+object.getBairro()
                       +"#"+object.getLogradouro()
                       +"#"+object.getUf()
                       +"#"+object.getNumero() );
            pr.close();
            arquivo.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro: "+ ex);
        }
    }

    @Override
    public void editar(EnderecoBeans object) {
        try {
            //lê o arquivo e edita a linha de interesse
            ArrayList<String> conteudoDoArquivo = new ArrayList<>();
            File file = new File("endereco.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            Object[] linhas = br.lines().toArray();
            for (Object l : linhas) {
                String linha = (String) l;
                String[] palavras = linha.split("#");
                if (Integer.parseInt(palavras[0]) == object.getId()) {
                    linha = linha.replace(linha,object.getId()
                                                +"#"+object.getCep()
                                                +"#"+object.getCidade()
                                                +"#"+object.getBairro()
                                                +"#"+object.getLogradouro()
                                                +"#"+object.getUf()
                                                +"#"+object.getNumero() );
                }
                conteudoDoArquivo.add(linha);
            }
            br.close();

            //reescreve o arquivo
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for(String linha: conteudoDoArquivo){
                bw.append(linha).append("\n");
            }
            bw.flush();
            bw.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    @Override
    public ArrayList<EnderecoBeans> busca() {
    String linha;
        try {
            FileInputStream arquivo = new FileInputStream("endereco.txt");
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader buffer = new BufferedReader(input);
            
            do{
                linha = buffer.readLine();
                if(linha != null){
                    EnderecoBeans enderecoBeans = new EnderecoBeans();
                    String[] palavras = linha.split("#");
                        enderecoBeans.setId(Integer.parseInt(palavras[0]));
                        enderecoBeans.setCep(palavras[1]);
                        enderecoBeans.setCidade(palavras[2]);
                        enderecoBeans.setBairro(palavras[3]);
                        enderecoBeans.setLogradouro(palavras[4]);
                        enderecoBeans.setUf(palavras[5]);
                        enderecoBeans.setNumero(palavras[6]);
                        ListEnderecoBeans.add(enderecoBeans);
                    }                    
            }while(linha != null);
                        
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "Não existe arquivo de usuario! " + ex);
        }
        return ListEnderecoBeans;
    }

    @Override
    public int ConfereQuantidadeRegistros() {
            String linha;
            int contador = 0;
        try {
            FileInputStream arquivo = new FileInputStream("Endereco.txt");
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader buffer = new BufferedReader(input);
            
            do{
                linha = buffer.readLine();
                if(linha != null){
                    contador ++;
                }
            }while(linha != null);
                        
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "Não existe arquivo de usuario! " + ex);
        }
        return contador;
    }

    
    public boolean validarEndereco(EnderecoBeans endereco){
        for(int k = 0; k < UF.length;k++){

        }
        return false;
    }
}
