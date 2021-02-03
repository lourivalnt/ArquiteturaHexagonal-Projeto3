package conta.servicos.respositorio;

import conta.sistema.dominio.modelo.Conta;
import conta.sistema.porta.ContaRepositorio;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.inject.Inject;
import javax.inject.Named;

import static java.util.Objects.isNull;

// Responsável por implementar a porta de saída (driven) de serviços de banco de dados usando spring jdbc
@Named
public class ContaRepositorioImp implements ContaRepositorio {

    private static final String ERRO = "Erro inesperado de acesso ao banco. Entre em contato com adminstrador.";
    private JdbcTemplate jdbc;

    @Inject
    public ContaRepositorioImp(JdbcTemplate jdbcTemplate) {
        this.jdbc = jdbcTemplate;
    }

    @Override
    public Conta get(Integer integer) {

    }

    @Override
    public void alterar(Conta conta) {

    }
}