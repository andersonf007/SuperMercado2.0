package ModelDao;

import ModelBeans.CadastroPessoaFisicaBeans;
import ModelBeans.PessoaFisicaBeans;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class PessoaFisicaDAO extends CadastroPessoaFisicaBeans {

    ArrayList<PessoaFisicaBeans> ListPessoaFisicaBeans = new ArrayList<PessoaFisicaBeans>();

    @Override
    public void cadastrar(PessoaFisicaBeans object) {
        try {
            FileOutputStream arquivo = new FileOutputStream("pessoaFisica.txt", true);
            PrintWriter pr = new PrintWriter(arquivo);
            pr.println(object.getCodigo()
                    + "#" + object.getNome()
                    + "#" + object.getCpf()
                    + "#" + object.getRg()
                    + "#" + object.getSexo()
                    + "#" + object.getTelefone()
                    + "#" + object.getCodEndereco()
                    + "#" + object.getAtivo());
            pr.close();
            arquivo.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro: " + ex);
        }
    }

    @Override
    public void editar(PessoaFisicaBeans object) {
        try {
            //lê o arquivo e edita a linha de interesse
            ArrayList<String> conteudoDoArquivo = new ArrayList<>();
            File file = new File("pessoaFisica.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            Object[] linhas = br.lines().toArray();
            for (Object l : linhas) {
                String linha = (String) l;
                String[] palavras = linha.split("#");
                if (Integer.parseInt(palavras[0]) == object.getCodigo()) {
                    linha = linha.replace(linha, object.getCodigo()
                            + "#" + object.getNome()
                            + "#" + object.getCpf()
                            + "#" + object.getRg()
                            + "#" + object.getSexo()
                            + "#" + object.getTelefone()
                            + "#" + object.getCodEndereco()
                            + "#" + object.getAtivo());
                }
                conteudoDoArquivo.add(linha);
            }
            br.close();

            //reescreve o arquivo
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (String linha : conteudoDoArquivo) {
                bw.append(linha).append("\n");
            }
            bw.flush();
            bw.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    @Override
    public ArrayList<PessoaFisicaBeans> buscar() {
        String linha;
        try {
            FileInputStream arquivo = new FileInputStream("pessoaFisica.txt");
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader buffer = new BufferedReader(input);

            do {
                linha = buffer.readLine();
                if (linha != null) {
                    PessoaFisicaBeans pessoaFisicaBeans = new PessoaFisicaBeans();
                    String[] palavras = linha.split("#");
                    pessoaFisicaBeans.setCodigo(Integer.parseInt(palavras[0]));
                    pessoaFisicaBeans.setNome(palavras[1]);
                    pessoaFisicaBeans.setCpf(palavras[2]);
                    pessoaFisicaBeans.setRg(palavras[3]);
                    pessoaFisicaBeans.setSexo(palavras[4]);
                    pessoaFisicaBeans.setTelefone(palavras[5]);
                    pessoaFisicaBeans.setCodEndereco(Integer.parseInt(palavras[6]));
                    pessoaFisicaBeans.setAtivo(Boolean.parseBoolean(palavras[7]));
                    ListPessoaFisicaBeans.add(pessoaFisicaBeans);
                }
            } while (linha != null);

        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "Não existe arquivo de usuario! " + ex);
        }
        return ListPessoaFisicaBeans;
    }

    @Override
    public int confereQuantidadeDeRegistros() {
        String linha;
        int contador = 0;
        try {
            FileInputStream arquivo = new FileInputStream("pessoaFisica.txt");
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader buffer = new BufferedReader(input);

            do {
                linha = buffer.readLine();
                if (linha != null) {
                    contador++;
                }
            } while (linha != null);

        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "Não existe arquivo de usuario! " + ex);
        }
        return contador;
    }

    public boolean validadorPessoaFisica(PessoaFisicaBeans pessoaFisica) {
        char[] especiais = {'#', '@', '%', '&', '*', '(', ')', '+', '-', '$', '!', '?', '/', '|', '=', '§', '¹', '²', '³', '£', '*', '-', ',', '<', '>', '.', ';', ':'};
        char[] numeros = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int count = -1;
        for (int i = 0; i < pessoaFisica.getCpf().length(); i++) {
            for (int k = 0; k < numeros.length; k++) {
                if (pessoaFisica.getCpf().charAt(i) == numeros[k]) {
                    count += 1;
                }
            }
        }
        if (count != pessoaFisica.getCpf().length()) {
            return false;
        } else {
            count = -1;
        }
        for (int i = 0; i < pessoaFisica.getRg().length(); i++) {
            for (int k = 0; k < numeros.length; k++) {
                if (pessoaFisica.getRg().charAt(i) == numeros[k]) {
                    count += 1;
                }
            }
        }
        if (count != pessoaFisica.getRg().length()) {
            return false;
        }
        for (int i = 0; i < pessoaFisica.getNome().length(); i++) {
            for (int k = 0; k < especiais.length; k++) {
                if (pessoaFisica.getNome().charAt(i) == especiais[k]) {
                    return false;
                }
            }
        }
        for(int i = 0; i < pessoaFisica.getTelefone().length(); i++){
            for (int k = 0; k < numeros.length; k++){
                if(pessoaFisica.getTelefone().charAt(i) == numeros[k]){
                    count += 1;
                }
            }
        }
        if(count != pessoaFisica.getTelefone().length()){
            return false;
        }
        return true;
    }


}
