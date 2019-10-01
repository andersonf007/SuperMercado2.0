package Controllers;
import ModelDao.ProdutoDAO;
import java.util.ArrayList;
import java.util.Random;
import ModelBeans.ProdutoBeans;
public class ProdutosController {
    private ProdutoDAO repositorioProdutos;

    public ProdutosController(){
        repositorioProdutos = new ProdutoDAO();
    }

    public void adicionarProduto(String nome, String tipo, Double estoque,int quantidade, Double valorCusto, Double valorVenda){
        Random gerador = new Random();
        double id = gerador.nextDouble();
        ProdutoBeans produto = new ProdutoBeans(nome,id,tipo,estoque,quantidade,valorCusto,valorVenda);
        repositorioProdutos.adicionarProduto(produto);
    }

    public void excluirProduto(String nome,Double Id, String tipo, Double estoque,int quantidade, Double valorCusto, Double valorVenda){
        ProdutoBeans produto = new ProdutoBeans(nome,Id,tipo,estoque,quantidade,valorCusto,valorVenda);
        repositorioProdutos.excluirProduto(produto);
    }

    public ArrayList<ProdutoBeans> listarProdutos(){
        return repositorioProdutos.getProdutos();
    }

    public ProdutoBeans buscarProdutoId(double Id){
        return repositorioProdutos.procurarProdutoId(Id);
    }

    public ProdutoBeans buscarProdutoNome(String nome){
        return repositorioProdutos.procurarProdutoNome(nome);
    }
}
