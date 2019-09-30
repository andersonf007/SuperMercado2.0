/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelBeans;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ander
 */
public class ModelTabela extends AbstractTableModel{
    
    private ArrayList linhas = null;
    private String[] colunas = null;
    
      public ModelTabela(ArrayList lin,String[] col){
        setLinhas(lin);
        setColunas(col);
    }

    public ModelTabela() {
       
    }

    /**
     * @return the linhas
     */
    public ArrayList getLinhas() {
        return linhas;
    }

    /**
     * @param linhas the linhas to set
     */
    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    /**
     * @return the colunas
     */
    public String[] getColunas() {
        return colunas;
    }

    /**
     * @param colunas the colunas to set
     */
    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    //vai contar quantas colunas tem na nossa tabela
    public int getColumnCount(){
        return colunas.length;
    }
    //vai contar quantas linhas tem na nossa tabela
    public int getRowCount(){
        return linhas.size();
    }
    //responsavem por pegar o nome das colunas e depois vai retornar quantas colunas deu
    public String getColumnName(int numCol){
        return colunas[numCol];
    }
    //responsavel por montar a nossa tabela, responsavel por adicionar as linhas...
    public Object getValueAt(int numLin, int numCol){
        Object[] linha = (Object[])getLinhas().get(numLin);
        return linha[numCol];
    }
    
}
