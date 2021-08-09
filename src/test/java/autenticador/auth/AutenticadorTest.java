package autenticador.auth;

import autenticador.auth.Autenticador;
import autenticador.db.BancoDeDados;
import autenticador.model.Usuario;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutenticadorTest {
    private Autenticador autenticador = Autenticador.getInstance();
    private Autenticador autenticador2 = Autenticador.getInstance();


    private BancoDeDados bancoDeDados = BancoDeDados.getInstance();

    @Test
    @DisplayName("Deve Retornar mensagem de autenticação com Sucecesso, quando email e senha for validos")
    void autenticarTesteCase01() {
        bancoDeDados.cadastrarUsuario(new Usuario("willy", "kgb", "willy@com"));
        String mensagemDeRetorno = autenticador.autenticar("willy@com", "kgb");
        assertEquals(Autenticador.USUARIO_AUTENTICADO_COM_SUCESSO, mensagemDeRetorno);
    }
}