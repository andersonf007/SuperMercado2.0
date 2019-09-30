package ModelBeans;

public class EstoqueBeans { // Terminar
    private int TamanhoTotal;
    private ProdutoBeans Produtos[];
    private String Tipo;

    public EstoqueBeans(int tamanhototal, String tipo){
        TamanhoTotal = tamanhototal;
        Produtos  = new ProdutoBeans[TamanhoTotal];
        Tipo = tipo;
    }





}
