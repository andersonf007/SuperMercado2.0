/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import View.Relatorio;

public class RelatorioController {
    private static Relatorio relatorio;

    public static void abreRelatorio(){
        if(relatorio == null) relatorio = new Relatorio();               
        
        relatorio.setVisible(true);
    }
}