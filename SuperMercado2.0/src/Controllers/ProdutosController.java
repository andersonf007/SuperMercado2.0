package Controllers;
import View.BuscarProdutos;
import View.CadProdutos;

public class ProdutosController {
    private CadProdutos cadProdutos;
    private BuscarProdutos buscarProdutos;
    
    public void abreBuscarProdutos(){
        if(buscarProdutos == null)buscarProdutos = new BuscarProdutos();               
        
        buscarProdutos.setVisible(true);
    }
    
    public void abreCadProdutos(){
        if(cadProdutos == null) cadProdutos = new CadProdutos();               
        
        cadProdutos.setVisible(true);
    }
   
    public void abrirListagemProdutos(){
        new BuscarProdutos().setVisible(true);
    }
}
