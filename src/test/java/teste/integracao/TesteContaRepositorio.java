package teste.integracao;

import conta.sistema.dominio.modelo.NegocioException;
import conta.sistema.porta.ContaRepositorio;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.inject.Inject;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Serviço de banco de dados - Conta")
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = Config.class)
public class TesteContaRepositorio {

    @Test
    @DisplayName("pesquisa conta com número nulo")
    void teste1() {
        try {
          System.out.println("teste ola");
        } catch (NegocioException e) {
            fail("Deve carregar uma conta nula.");
        }
    }
}
