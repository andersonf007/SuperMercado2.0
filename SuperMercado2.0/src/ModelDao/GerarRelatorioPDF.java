
package ModelDao;

import ModelBeans.PessoaFisicaBeans;
import ModelBeans.PessoaJuridicaBeans;
import ModelBeans.ProdutoBeans;
import ModelBeans.VendaBeans;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author anderson
 */
public class GerarRelatorioPDF {

    private final Font fonteTable; //todas as variaveis que estam como final é porque elas tem que ser constante
    private final Font fontePadrao;
    private PessoaFisicaDAO pessoaFisicaDAO;
    private PessoaFisicaBeans pessoaFisicaBeans;
    private PessoaJuridicaDAO pessoaJuridicaDAO;
    private PessoaJuridicaBeans pessoaJuridicaBeans;
    private ProdutoDAO produtoDAO;
    private ArrayList<VendaBeans> ListVendaBeans;
    private ArrayList<ProdutoBeans> ListProdutosBeans;
    private VendaDAO vendaDAO;
    private double valorTotal = 0;
    private int quantidade = 0;
    private final Document documento;// Criação do objeto que será um documento PDF
    private PdfPTable table;
    private final PdfPCell celulaClienteNome;
    private final PdfPCell celulaQuantidadeDeCompras;
    private final PdfPCell celularValorTotalDeCompras;
    private final PdfPCell celulaProduto;
    private final PdfPCell celulaEstoque;

    public GerarRelatorioPDF() {
        fonteTable = new Font(Font.FontFamily.HELVETICA, 10, Font.BOLD);
        fontePadrao = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD);
        pessoaFisicaDAO = new PessoaFisicaDAO();
        pessoaFisicaBeans = new PessoaFisicaBeans();
        pessoaJuridicaDAO = new PessoaJuridicaDAO();
        pessoaJuridicaBeans = new PessoaJuridicaBeans();
        produtoDAO = new ProdutoDAO();
        ListVendaBeans = new ArrayList<>();
        ListProdutosBeans = new ArrayList<>();
        vendaDAO = new VendaDAO();
        documento = new Document();
        celulaClienteNome = new PdfPCell(new Phrase("Nome", fonteTable));
        celulaQuantidadeDeCompras = new PdfPCell(new Phrase("Quantidade", fonteTable));
        celularValorTotalDeCompras = new PdfPCell(new Phrase("Valor total", fonteTable));
        celulaProduto = new PdfPCell(new Phrase("produto", fonteTable));
        celulaEstoque = new PdfPCell(new Phrase("Estoque", fonteTable));
    }
  
    public void criarRelatorioSomatorio(String cpfCnpj, int flag) throws DocumentException, FileNotFoundException {
        String nome = "";
        if(flag == 0){//busca o registro da pessoa fisica ou juridica
            pessoaFisicaBeans = pessoaFisicaDAO.buscarRegistroPorId(cpfCnpj);
            nome = pessoaFisicaBeans.getNome();
            ListVendaBeans = vendaDAO.buscarRegistrosExpecificosDeClientes(String.valueOf(pessoaFisicaBeans.getCodigo()), "F");
        }else{
            pessoaJuridicaBeans = pessoaJuridicaDAO.buscarRegistroPorId(cpfCnpj);
            nome = pessoaJuridicaBeans.getNome();
            ListVendaBeans = vendaDAO.buscarRegistrosExpecificosDeClientes(String.valueOf(pessoaJuridicaBeans.getCodigo()), "J");
        }
        
        ValorTotal(flag);
        
        // Faz o apontamento para o arquivo de destino
        PdfWriter.getInstance(documento, new FileOutputStream("\\Registros Fenix Sistemas\\relatorios\\Relatorio de "+nome +" "+ LocalDate.now() +".Pdf"));
        // Realiza a abertura do arquivo para escrita
        documento.open();
        //cabeçalho
        Paragraph cabecalho = new Paragraph("Somatório de compras do cliente "+nome+"\n\n", fontePadrao);
        cabecalho.setAlignment(Element.ALIGN_CENTER);
        documento.add(cabecalho);

        celulaClienteNome.setHorizontalAlignment(Element.ALIGN_CENTER);
        celulaQuantidadeDeCompras.setHorizontalAlignment(Element.ALIGN_CENTER);
        celularValorTotalDeCompras.setHorizontalAlignment(Element.ALIGN_CENTER);
        
        table = new PdfPTable(new float[]{2f, 5f, 5f});

        table.addCell(celulaClienteNome);
        table.addCell(celulaQuantidadeDeCompras);
        table.addCell(celularValorTotalDeCompras);

        PdfPCell celula1 = new PdfPCell(new Phrase(nome));
        PdfPCell celula2 = new PdfPCell(new Phrase(String.valueOf(quantidade)));
        PdfPCell celula3 = new PdfPCell(new Phrase(String.valueOf(valorTotal)));

        table.addCell(celula1);
        table.addCell(celula2);
        table.addCell(celula3);
        
        documento.add(table);

        documento.close();
        
        
    }
    
    public void ValorTotal(int flag){
        
        if(flag == 0){
            for(int i = 0; i < ListVendaBeans.size(); i++){
                if(ListVendaBeans.get(i).getIdCliente() == pessoaFisicaBeans.getCodigo() && ListVendaBeans.get(i).getTipoPessoa().equals("F")){
                    valorTotal += ListVendaBeans.get(i).getValor();
                    ++quantidade;
                }
            }
        }else{
            for(int i = 0; i < ListVendaBeans.size(); i++){
                if(ListVendaBeans.get(i).getIdCliente() == pessoaJuridicaBeans.getCodigo() && ListVendaBeans.get(i).getTipoPessoa().equals("J")){
                    valorTotal += ListVendaBeans.get(i).getValor();
                    ++quantidade;
                }
            }
        }        
    }
    
    public void criarRelatorioEstoque() throws DocumentException, FileNotFoundException{
        
        ListProdutosBeans = produtoDAO.busca();
        
        PdfWriter.getInstance(documento, new FileOutputStream("\\Registros Fenix Sistemas\\relatorios\\Relatorio de estoque "+ LocalDate.now() +".Pdf"));
        documento.open();
        
        Paragraph cabecalho = new Paragraph("Relatório de estoque\n\n", fontePadrao);
        cabecalho.setAlignment(Element.ALIGN_CENTER);
        documento.add(cabecalho);
        
        celulaProduto.setHorizontalAlignment(Element.ALIGN_CENTER);
        celulaEstoque.setHorizontalAlignment(Element.ALIGN_CENTER);
        
        table = new PdfPTable(new float[]{6f, 2f});
        
        table.addCell(celulaProduto);
        table.addCell(celulaEstoque);
        
        for(int i = 0; i < ListProdutosBeans.size(); i++){
            PdfPCell celula1 = new PdfPCell(new Phrase(ListProdutosBeans.get(i).getNome()));
            PdfPCell celula2 = new PdfPCell(new Phrase(String.valueOf(ListProdutosBeans.get(i).getEstoque())));
            
            table.addCell(celula1);
            table.addCell(celula2);
        }
        documento.add(table);
        documento.close();        
    }
}
