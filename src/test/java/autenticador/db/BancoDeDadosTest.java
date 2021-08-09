package autenticador.db;

import autenticador.db.BancoDeDados;
import autenticador.model.Usuario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class BancoDeDadosTest {
    private BancoDeDados bancodedados = BancoDeDados.getInstance();

    @Test
    void deveInserirUmUsuarioNaListaDeUsuarios() {
        Usuario usuario = new Usuario("Elias", "kgb", "Klaydd@.com");
        bancodedados.cadastrarUsuario(usuario);
        Usuario usuario1 = bancodedados.buscarUsuario(usuario.getEmail());
        assertNotNull(usuario1);

    }

    @Test
    void deveBuscarUmUsuarioNaListaPorId() {
        Usuario usuario = new Usuario("Willy", "reis", "Rodoxx@.com");
        bancodedados.cadastrarUsuario(usuario);
        Usuario usuario1 = bancodedados.buscarUsuario(usuario.getiD());
        assertNotNull(usuario1);
    }

    @Test
    void deveRetornarListaComTodosUsuarios() {
        bancodedados.limparUsuarios();
        Usuario usuario = new Usuario("Elias", "kgb", "Klaydd@.com");
        bancodedados.cadastrarUsuario(usuario);
        assertEquals(1,bancodedados.getUsuarios().size());


    }

}