/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelConections;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author anderson
 */
public class Conection {
    
    public void abrirConexao(String txt) throws FileNotFoundException{
        FileOutputStream arquivo = new FileOutputStream(txt);
        PrintWriter pr = new PrintWriter(arquivo);
            
    }
    
}
