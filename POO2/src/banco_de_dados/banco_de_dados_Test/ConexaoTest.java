package banco_de_dados.banco_de_dados_Test;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import banco_de_dados.Conexao;

public class ConexaoTest {
    @Test
    void conexaoTest() {
        assertNotNull(Conexao.conectaMySql());
    }
}
