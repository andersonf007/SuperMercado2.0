package ModelDao;

import ModelBeans.CadastroPessoaFisicaBeans;
import ModelBeans.PessoaFisicaBeans;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class PessoaFisicaDAO extends CadastroPessoaFisicaBeans{

    @Override
    public void cadastrar(PessoaFisicaBeans object) {
       try {
            FileOutputStream arquivo = new FileOutputStream("pessoaFisica.txt",true);
            PrintWriter pr = new PrintWriter(arquivo);
            pr.println(object.getCodigo()
                       +"#"+object.getNome()
                       +"#"+object.getCpf()
                       +"#"+object.getRg()
                       +"#"+object.getSexo()
                       +"#"+object.getTelefone()
                       +"#"+object.getDataNascimento()
                       +"#"+object.getCodEndereco()
                       +"#"+object.getAtivo());
            pr.close();
            arquivo.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro: "+ ex);
        }
    }

    @Override
    public void editar(PessoaFisicaBeans object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PessoaFisicaBeans buscar(PessoaFisicaBeans object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int confereQuantidadeDeRegistros() {
        String linha;
        int contador = 0;
        try {
            FileInputStream arquivo = new FileInputStream("pessoaFisica.txt");
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
