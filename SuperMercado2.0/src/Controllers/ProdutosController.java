package Controllers;
import ModelDao.ProdutoDAO;
import java.util.ArrayList;
import java.util.Random;
import ModelBeans.ProdutoBeans;
import View.BuscarProdutos;
import View.PDV;
public class ProdutosController {
    private static ProdutoDAO ProdutoDao;
    static BuscarProdutos buscarProdutos;
    
    public static void abreBuscarProdutos(){
        if(buscarProdutos == null) buscarProdutos = new BuscarProdutos();
        
        buscarProdutos.setVisible(true);
    }
    
    public static ProdutoDAO CriaProdutoDao(){
        if(ProdutoDao == null){
            ProdutoDao = new ProdutoDAO();
            return ProdutoDao;
        }         
            return ProdutoDao;
    }
}
