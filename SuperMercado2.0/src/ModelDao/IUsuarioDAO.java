package ModelDao;

import ModelBeans.UsuarioBeans;

import java.util.ArrayList;

public interface IUsuarioDAO {

    public void cadastrar(UsuarioBeans object);

    public void editar(UsuarioBeans object);

    public ArrayList<UsuarioBeans> busca();

    public int confereQuantidadeDeUsuariosRegistrados();

}
