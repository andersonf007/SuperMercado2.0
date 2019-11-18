package ModelDao;
import ModelBeans.CadastroPessoaJuridicaBeans;
import ModelBeans.PessoaJuridicaBeans;
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

public class PessoaJuridicaDAO extends CadastroPessoaJuridicaBeans{

    ArrayList<PessoaJuridicaBeans> ListPessoaJuridicaBeans = new ArrayList<PessoaJuridicaBeans>();
    
    @Override
    public void cadastrar(PessoaJuridicaBeans object) {
        try {
            FileOutputStream arquivo = new FileOutputStream("pessoajuridica.txt",true);
            PrintWriter pr = new PrintWriter(arquivo);
            pr.println(object.getCodigo()
                       +"#"+object.getNome()
                       +"#"+object.getCnpj()
                       +"#"+object.getIe()
                       +"#"+object.getTelefone()
                       +"#"+object.getCodEndereco()
                       +"#"+object.getAtivo());
            pr.close();
            arquivo.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro: "+ ex);
        }
    }
    @Override
    public void editar(PessoaJuridicaBeans object) {
        try {
            //lê o arquivo e edita a linha de interesse
            ArrayList<String> conteudoDoArquivo = new ArrayList<>();
            File file = new File("pessoajuridica.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            Object[] linhas = br.lines().toArray();
            for (Object l : linhas) {
                String linha = (String) l;
                String[] palavras = linha.split("#");
                if (Integer.parseInt(palavras[0]) == object.getCodigo()) {
                    linha = linha.replace(linha,object.getCodigo()
                                                +"#"+object.getNome()
                                                +"#"+object.getCnpj()
                                                +"#"+object.getIe()
                                                +"#"+object.getTelefone()
                                                +"#"+object.getCodEndereco()
                                                +"#"+object.getAtivo());
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
    public ArrayList<PessoaJuridicaBeans> buscar() {
        String linha;
        try {
            FileInputStream arquivo = new FileInputStream("pessoajuridica.txt");
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader buffer = new BufferedReader(input);
            
            do{
                linha = buffer.readLine();
                if(linha != null){
                    PessoaJuridicaBeans pessoaJuridicaBeans = new PessoaJuridicaBeans();
                    String[] palavras = linha.split("#");
                        pessoaJuridicaBeans.setCodigo(Integer.parseInt(palavras[0]));
                        pessoaJuridicaBeans.setNome(palavras[1]);
                        pessoaJuridicaBeans.setCnpj(palavras[2]);
                        pessoaJuridicaBeans.setIe(palavras[3]);
                        pessoaJuridicaBeans.setTelefone(palavras[4]);
                        pessoaJuridicaBeans.setCodEndereco(Integer.parseInt(palavras[5]));
                        pessoaJuridicaBeans.setAtivo(Boolean.parseBoolean(palavras[6]));
                        ListPessoaJuridicaBeans.add(pessoaJuridicaBeans);
                    }                    
            }while(linha != null);
                        
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro na busca de pessoas juridicas " + ex);
        }
        return ListPessoaJuridicaBeans;
    }

    @Override
    public int ConfereQuantidadeDeRegistros() {
        String linha;
        int contador = 0;
        try {
            FileInputStream arquivo = new FileInputStream("pessoajuridica.txt");
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

    public boolean validadorPessoaJuridica(PessoaJuridicaBeans pessoaJuridica){
        char[] especiais = {'#', '@', '%', '&', '*', '(', ')', '+', '-', '$', '!', '?', '/', '|', '=', '§', '¹', '²', '³', '£', '*', '-', ',', '<', '>', '.', ';', ':'};
        char[] numeros = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        String[] UF = {"PE","AL","PB","RN","CE","PI","MA","RN","SE","BA","TO","PA","AP","RR","AM","RO","AC","MT","GO","DF","MS","MG","ES","RJ","SP","PR","SC","RS"};
        int count = -1;
        for (int i = 0; i < pessoaJuridica.getCnpj().length(); i++) {
            for (int k = 0; k < numeros.length; k++) {
                if (pessoaJuridica.getCnpj().charAt(i) == numeros[k]) {
                    count += 1;
                }
            }
        }
        if (count != pessoaJuridica.getCnpj().length()) {
            return false;
        } else {
            count = -1;
        }
        for (int i = 0; i < pessoaJuridica.getIe().length(); i++) {
            for (int k = 0; k < numeros.length; k++) {
                if (pessoaJuridica.getIe().charAt(i) == numeros[k]) {
                    count += 1;
                }
            }
        }
        if (count != pessoaJuridica.getIe().length()) {
            return false;
        }else {
            count = -1;
        }
        for (int i = 0; i < pessoaJuridica.getNome().length(); i++) {
            for (int k = 0; k < especiais.length; k++) {
                if (pessoaJuridica.getNome().charAt(i) == especiais[k]) {
                    return false;
                }
            }
        }
        for(int k = 0; k < UF.length;k++){
            //if(pessoaJuridica.)
        }

        return true;
    }


}
