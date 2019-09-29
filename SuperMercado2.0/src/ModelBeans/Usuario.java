package ModelBeans;
public class Usuario extends Pessoa{

    private String login;
    private String senha;

    public Usuario(String login, String senha, String nome) {
        super(nome);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public String getSenha() {
        return senha;
    }
}
