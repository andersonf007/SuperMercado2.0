/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import View.Relatorio;
/**
 *
 * @author anderson
 */
public class RelatorioController {
    private Relatorio relatorio;

    public void abreRelatorio(){
        if(relatorio == null) relatorio = new Relatorio();               
        
        relatorio.setVisible(true);
    }
}