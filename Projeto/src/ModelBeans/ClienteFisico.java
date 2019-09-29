package ModelBeans;
import java.util.Date;
public class ClienteFisico extends Cliente {
    private String cpf;
    private String rg;
    private String sexo;
    private Date dataNascimento;

    public ClienteFisico(String cpf, String rg, String sexo, Date dataNascimento, int codigo, int numero, String nome, String tipo, String cep, String logradouro, String cidade, String bairro, String uf, String telefone) {
        super(codigo, numero, nome, tipo, cep, logradouro, cidade, bairro, uf, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
