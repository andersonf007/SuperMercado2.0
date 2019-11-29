/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import View.TelaLoginAdm;

/**
 *
 * @author anderson
 */
public class LoginAdmController {
    private TelaLoginAdm telaLoginAdm;
    
    public void abriTelaLoginAdm(){
        if(telaLoginAdm == null) telaLoginAdm = new TelaLoginAdm();
        
        telaLoginAdm.setVisible(true);
    }
}
