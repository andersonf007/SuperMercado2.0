
package ModelDao;

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
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Raquell Vieira
 */
public class GerarRelatorioPDF2 {

    private static Font fonteTable = new Font(Font.FontFamily.HELVETICA, 10, Font.BOLD);
    private static Font fontePadrao = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD);

    public static void main(String[] arq) {

    }

    public void criarRelatorio(String cpf) throws DocumentException, FileNotFoundException {
        
        // Criação do objeto que será um documento PDF
        Document documento = new Document();
        // Faz o apontamento para o arquivo de destino
        PdfWriter.getInstance(documento, new FileOutputStream("Dados/Relatorio-" + LocalDate.now() + ".Pdf"));
        // Realiza a abertura do arquivo para escrita
        documento.open();

        Paragraph paragrafo = new Paragraph("Relatório de Vendas\n\n", fontePadrao);
        paragrafo.setAlignment(Element.ALIGN_CENTER);
        documento.add(paragrafo);

        PdfPTable table = new PdfPTable(new float[]{2f, 5f, 5f, 3f, 4f});

        PdfPCell celulaId = new PdfPCell(new Phrase("Id", fonteTable));
        celulaId.setHorizontalAlignment(Element.ALIGN_CENTER);

        PdfPCell celulaClienteNome = new PdfPCell(new Phrase("Cliente", fonteTable));
        celulaClienteNome.setHorizontalAlignment(Element.ALIGN_CENTER);

        PdfPCell celulaFuncionarioNome = new PdfPCell(new Phrase("Funcionário", fonteTable));
        celulaFuncionarioNome.setHorizontalAlignment(Element.ALIGN_CENTER);

        PdfPCell celulaValor = new PdfPCell(new Phrase("Valor", fonteTable));
        celulaValor.setHorizontalAlignment(Element.ALIGN_CENTER);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        PdfPCell celulaData = new PdfPCell(new Phrase("Data", fonteTable));
        celulaData.setHorizontalAlignment(Element.ALIGN_CENTER);

        table.addCell(celulaId);
        table.addCell(celulaClienteNome);
        table.addCell(celulaFuncionarioNome);
        table.addCell(celulaValor);
        table.addCell(celulaData);

        vendas = fachada.getVendas();

        for (int i = 0; i < vendas.size(); i++) {

            PdfPCell celula1 = new PdfPCell(new Phrase(String.valueOf(vendas.get(i).getId())));
            PdfPCell celula2 = new PdfPCell(new Phrase(vendas.get(i).getCliente().getNome() + "\n" + vendas.get(i).getCliente().getCpf()));
            PdfPCell celula3 = new PdfPCell(new Phrase(vendas.get(i).getFuncionario().getNome() + "\n" + vendas.get(i).getFuncionario().getCpf()));
            PdfPCell celula4 = new PdfPCell(new Phrase(String.valueOf(new DecimalFormat(".00").format(vendas.get(i).getPrecoTotal()))));
            PdfPCell celula5 = new PdfPCell(new Phrase(vendas.get(i).getData().format(formatador)));

            table.addCell(celula1);
            table.addCell(celula2);
            table.addCell(celula3);
            table.addCell(celula4);
            table.addCell(celula5);

        }

        documento.add(table);

        documento.close();
    }

}
