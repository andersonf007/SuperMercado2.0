package ModelBeans;
public class UsuarioBeans{

 private boolean Cargo; // False para funcionario e True para Administrador
    private String Nome;
    private int Id;
    private String Login;
    private String Senha;


    public UsuarioBeans(String nome, int id, String login, String senha) {
        this.Nome = nome;
        this.Id = id;
        this.Login = login;
        this.Senha = senha;

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
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

  }
