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
    
    public ProdutosController(){
        ProdutoDao = new ProdutoDAO();
    }

    public void adicionarProduto(String nome, String tipo, Double estoque,int quantidade, Double valorCusto, Double valorVenda){
        Random gerador = new Random();
        double id = gerador.nextDouble();
        ProdutoBeans produto = new ProdutoBeans(nome,id,tipo,estoque,quantidade,valorCusto,valorVenda);
        ProdutoDao.adicionarProduto(produto);
    }

    public void excluirProduto(String nome,Double Id, String tipo, Double estoque,int quantidade, Double valorCusto, Double valorVenda){
        ProdutoBeans produto = new ProdutoBeans(nome,Id,tipo,estoque,quantidade,valorCusto,valorVenda);
        ProdutoDao.excluirProduto(produto);
    }

    public ArrayList<ProdutoBeans> listarProdutos(){
        return ProdutoDao.getProdutos();
    }

    public ProdutoBeans buscarProdutoId(double Id){
        return ProdutoDao.procurarProdutoId(Id);
    }

    public ProdutoBeans buscarProdutoNome(String nome){
        return ProdutoDao.procurarProdutoNome(nome);
    }
}
