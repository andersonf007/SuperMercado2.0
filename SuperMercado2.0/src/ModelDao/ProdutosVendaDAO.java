/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import ModelBeans.CadastroProdutosVenda;
import ModelBeans.ProdutosVendaBeans;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author anderson
 */
public class ProdutosVendaDAO extends CadastroProdutosVenda{
    
    private ArrayList<ProdutosVendaBeans> ListProdutosVendaBeans = new ArrayList<>();

    @Override
    public void cadastrar(ProdutosVendaBeans object) {
        try {
            FileOutputStream arquivo = new FileOutputStream("ProdutosVendidos.txt",true);
            PrintWriter pr = new PrintWriter(arquivo);
            pr.println(object.getIdVenda()+"#"+object.getIdProduto());
            pr.close();
            arquivo.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro: "+ ex);
        }
    }

    @Override
    public ArrayList<ProdutosVendaBeans> buscar() {
        String linha;
        try {
            FileInputStream arquivo = new FileInputStream("ProdutosVendidos.txt");
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader buffer = new BufferedReader(input);
            
            do{
                linha = buffer.readLine();
                if(linha != null){
                    ProdutosVendaBeans produtosVendaBeans = new ProdutosVendaBeans();
                    String[] palavras = linha.split("#");
                        produtosVendaBeans.setIdVenda(Integer.parseInt(palavras[0]));
                        produtosVendaBeans.setIdProduto(Integer.parseInt(palavras[1]));
                        ListProdutosVendaBeans.add(produtosVendaBeans);
                    }                    
            }while(linha != null);
                        
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "Não existe arquivo de usuario! " + ex);
        }
        return ListProdutosVendaBeans;
    }

    @Override
    public boolean validarCaracteresEspeciaisProduto(String codigo, String valor, String quantidade) {
        try {
            int cod = Integer.parseInt(codigo);
        }catch(Exception ex){

        }
        try {
            double val = Double.parseDouble(valor);
       }catch(Exception ex){

        }
        try {
            double quant = Double.parseDouble(quantidade);
        }catch(Exception ex){

        }
        return true;
    }

}
