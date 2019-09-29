package ModelBeans;

public class Funcionario{
    private boolean Cargo; // False para funcionario e True para Administrador
    private String Nome;
    private String Cpf;
    private Double Salario;
    private String EstadoCivil;
    private int NumeroResidencia;
    private String Telefone;
    private String Logradouro;
    private String Cidade;
    private String Bairro;
    private String Id;
    private String Login;
    private String Senha;


    public Funcionario(String nome,boolean cargo,double salario, String cpf, String estadoCivil, int numeroResidencia, String telefone, String logradouro, String cidade, String bairro, String id, String login, String senha) {
        Nome = nome;
        Cargo = cargo;
        Salario = salario;
        Cpf = cpf;
        EstadoCivil = estadoCivil;
        NumeroResidencia = numeroResidencia;
        Telefone = telefone;
        Logradouro = logradouro;
        Cidade = cidade;
        Bairro = bairro;
        Id = id;
        Login = login;
        Senha = senha;

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        EstadoCivil = estadoCivil;
    }

    public int getNumeroResidencia() {
        return NumeroResidencia;
    }

    public void setNumeroResidencia(int numeroResidencia) {
        NumeroResidencia = numeroResidencia;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(String logradouro) {
        Logradouro = logradouro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public boolean isADM() {
        return Cargo;
    }
    public void setCargo(boolean cargo) {
        Cargo = cargo;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double salario) {
        Salario = salario;
    }
}
