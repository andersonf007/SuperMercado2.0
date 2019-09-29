package ModelBeans;

public class Estoque { // Terminar
    private int TamanhoTotal;
    private Produto Produtos[];
    private String Tipo;

    public Estoque(int tamanhototal, String tipo){
        TamanhoTotal = tamanhototal;
        Produtos  = new Produto[TamanhoTotal];
        Tipo = tipo;
    }





}
