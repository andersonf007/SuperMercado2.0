package Controllers;
import View.BuscarProdutos;
import View.CadProdutos;

public class ProdutosController {
    static CadProdutos cadProdutos;
    static BuscarProdutos buscarProdutos;
    
    public static void abreBuscarProdutos(){
        if(buscarProdutos == null) buscarProdutos = new BuscarProdutos();
        
        buscarProdutos.setVisible(true);
    }
    
    public static void abreCadProdutos(){
        if(cadProdutos == null) cadProdutos = new CadProdutos();
        
        cadProdutos.setVisible(true);
    }
   
    public static void abrirListagemProdutos(){
        new BuscarProdutos().setVisible(true);
    }
}
