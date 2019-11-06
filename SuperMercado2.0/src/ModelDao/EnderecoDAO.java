/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import ModelBeans.CadastroEndereco;
import ModelBeans.EnderecoBeans;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author anderson
 */
public class EnderecoDAO extends CadastroEndereco{

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
}
