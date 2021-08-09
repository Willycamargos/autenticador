package autenticador.db;

import autenticador.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
    private List<Usuario> usuarios = new ArrayList<>();
    private static BancoDeDados instance;

    public static BancoDeDados getInstance() {
        if (instance == null) {
            instance = new BancoDeDados();
        }
        return instance;
    }

    private BancoDeDados() {
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuario.setiD(usuarios.size() + 1);
        usuarios.add(usuario);
    }

    public Usuario buscarUsuario(String email) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email)) {
                return usuario;
            }
        }
        return null;
    }

    public Usuario buscarUsuario(Integer iD) {
        for (Usuario usuario : usuarios) {
            if (iD.equals(usuario.getiD())) {
                return usuario;
            }
        }
        return null;
    }


    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    public void limparUsuarios(){
        usuarios.clear();
    }
}

