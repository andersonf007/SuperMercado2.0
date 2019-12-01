/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import ModelBeans.CadastroVenda;
import ModelBeans.VendaBeans;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class VendaDAO extends CadastroVenda{

    private ArrayList<VendaBeans> ListVendaBeans = new ArrayList<>();
    
    @Override
    public void cadastrar(VendaBeans object) {
        try {
            FileOutputStream arquivo = new FileOutputStream("venda.txt",true);
            PrintWriter pr = new PrintWriter(arquivo);
            pr.println(object.getId()
                    +"#"+object.getIdCliente()
                    +"#"+object.getValor()
                    +"#"+object.getValorAcrescimo()
                    +"#"+object.getValorDescontro()
                    +"#"+object.getFormaPagamento()
                    +"#"+object.getTipoPessoa());
                    
            pr.close();
            arquivo.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro: "+ ex);
        }
    }

    @Override
    public ArrayList<VendaBeans> buscarTodosOsRegistros() {
        String linha;
        try {
            FileInputStream arquivo = new FileInputStream("venda.txt");
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader buffer = new BufferedReader(input);
            
            do{
                linha = buffer.readLine();
                if(linha != null){
                    VendaBeans vendaBeans = new VendaBeans();
                    String[] palavras = linha.split("#");
                        vendaBeans.setId(Integer.parseInt(palavras[0]));
                        vendaBeans.setIdCliente(Integer.parseInt(palavras[1]));
                        vendaBeans.setValor(Double.parseDouble(palavras[2]));
                        vendaBeans.setValorAcrescimo(Double.parseDouble(palavras[3]));
                        vendaBeans.setValorDescontro(Double.parseDouble(palavras[4]));
                        vendaBeans.setFormaPagamento(palavras[5]);
                        vendaBeans.setTipoPessoa(palavras[6]);
                        ListVendaBeans.add(vendaBeans);
                    }                    
            }while(linha != null);
                        
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "Não existe arquivo de usuario! " + ex);
        }
        return ListVendaBeans;
    }

    @Override
    public int confereQuantidadeDeVendasRegistradas() {
        String linha;
        int contador = 0;
        try {
            FileInputStream arquivo = new FileInputStream("venda.txt");
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

    @Override
    public ArrayList<VendaBeans> buscarRegistrosExpecificosDeClientes(String id, String tipo) {
        String linha;
        try {
            FileInputStream arquivo = new FileInputStream("venda.txt");
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader buffer = new BufferedReader(input);
            
            do{
                linha = buffer.readLine();
                if(linha != null){
                    VendaBeans vendaBeans = new VendaBeans();
                    String[] palavras = linha.split("#");
                    if(palavras[1].equals(id) && palavras[6].equals(tipo)){
                        vendaBeans.setId(Integer.parseInt(palavras[0]));
                        vendaBeans.setIdCliente(Integer.parseInt(palavras[1]));
                        vendaBeans.setValor(Double.parseDouble(palavras[2]));
                        vendaBeans.setValorAcrescimo(Double.parseDouble(palavras[3]));
                        vendaBeans.setValorDescontro(Double.parseDouble(palavras[4]));
                        vendaBeans.setFormaPagamento(palavras[5]);
                        vendaBeans.setTipoPessoa(palavras[6]);
                        ListVendaBeans.add(vendaBeans);
                    }                        
                }                    
            }while(linha != null);        
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "Não existe arquivo de usuario! " + ex);
        }
        return ListVendaBeans;
    }
    
}
