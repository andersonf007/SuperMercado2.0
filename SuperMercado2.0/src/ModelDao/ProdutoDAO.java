package ModelDao;
import ModelBeans.CadastroProdutos;
import ModelBeans.CadastroUsuarioBeans;
import ModelBeans.ProdutoBeans;
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

public class ProdutoDAO extends CadastroProdutos{

    ArrayList<ProdutoBeans> ListProdutosBeans = new ArrayList<ProdutoBeans>();
    
    @Override
    public void cadastrar(ProdutoBeans object) {
        try {
            FileOutputStream arquivo = new FileOutputStream("produto.txt",true);
            PrintWriter pr = new PrintWriter(arquivo);
            pr.println(object.getId()+"#"+object.getNome()+"#"+object.getEstoque()+"#"+object.getValorCusto()+"#"+object.getValorVenda()+"#"+object.getAtivo());
            pr.close();
            arquivo.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro: "+ ex);
        }
    }

    @Override
    public void editar(ProdutoBeans object) {
    try {
        //lê o arquivo e edita a linha de interesse
        ArrayList<String> conteudoDoArquivo = new ArrayList<>();
        File file = new File("produto.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        Object[] linhas = br.lines().toArray();
        for (Object l : linhas) {
            String linha = (String) l;
            String[] palavras = linha.split("#");
            if (Integer.parseInt(palavras[0]) == object.getId()) {
                linha = linha.replace(linha,object.getId() + "#" + object.getNome() + "#" + object.getEstoque() + "#" + object.getValorCusto() + "#" + object.getValorVenda() + "#" + object.getAtivo());
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
    public ArrayList<ProdutoBeans> busca() {
        String linha;
        try {
            FileInputStream arquivo = new FileInputStream("produto.txt");
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader buffer = new BufferedReader(input);
            
            do{
                linha = buffer.readLine();
                if(linha != null){
                    ProdutoBeans produtoBeans = new ProdutoBeans();
                    String[] palavras = linha.split("#");
                        produtoBeans.setId(Integer.parseInt(palavras[0]));
                        produtoBeans.setNome(palavras[1]);
                        produtoBeans.setEstoque(Double.parseDouble(palavras[2]));
                        produtoBeans.setValorCusto(Double.parseDouble(palavras[3]));
                        produtoBeans.setValorVenda(Double.parseDouble(palavras[4]));
                        produtoBeans.setAtivo(Boolean.parseBoolean(palavras[5]));
                        ListProdutosBeans.add(produtoBeans);
                    }                    
            }while(linha != null);
                        
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "Não existe arquivo de usuario! " + ex);
        }
        return ListProdutosBeans;
    }

    @Override
    public int confereQuantidadeDeProdutosRegistrados() {
         String linha;
            int contador = 0;
        try {
            FileInputStream arquivo = new FileInputStream("produto.txt");
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