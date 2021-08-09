package autenticador.auth;

import autenticador.db.BancoDeDados;
import autenticador.model.Usuario;

public class Autenticador {
    public static final String USUARIO_AUTENTICADO_COM_SUCESSO = "Usuário autenticado com sucesso";
    public static final String NAO_FOI_POSSÍVEL_AUTENTICAR_COM_OS_DADOS_INFORMADOS = "Não foi possível autenticar com os dados informados";
    private BancoDeDados bancoDeDados;

    private static Autenticador instance;

    public static Autenticador getInstance() {
        if (instance == null) {
            instance = new Autenticador();

        }
        return instance;
    }

    private Autenticador() {
        this.bancoDeDados = BancoDeDados.getInstance();
    }

    public String autenticar(String email, String senha) {

        Usuario usuario = bancoDeDados.buscarUsuario(email);
        if (usuario != null && usuario.getSenha().equals(senha)) {
            return USUARIO_AUTENTICADO_COM_SUCESSO;
        }

        return NAO_FOI_POSSÍVEL_AUTENTICAR_COM_OS_DADOS_INFORMADOS;
    }

}
