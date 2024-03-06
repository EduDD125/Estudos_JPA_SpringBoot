package br.edu.ifsp.EduardoDuarteDerisso.teste;

import br.edu.ifsp.EduardoDuarteDerisso.dao.ProdutoDao;
import br.edu.ifsp.EduardoDuarteDerisso.modelo.Categoria;
import br.edu.ifsp.EduardoDuarteDerisso.modelo.Produto;
import br.edu.ifsp.EduardoDuarteDerisso.util.JPAUtil;
import jakarta.persistence.EntityManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class CadastroDeProduto {
    public static void main(String[] args) {

        SpringApplication.run(CadastroDeProduto.class, args);

        Categoria celulares = new Categoria("CELULARES");
        // Criando um objeto da Classe Produto:
        Produto celular = new Produto("XIAOMI sei la qual", "Xing Ling",
                new BigDecimal("1250"), celulares);

        EntityManager em = JPAUtil.getEntityManager();

        ProdutoDao dao = new ProdutoDao(em);

        em.getTransaction().begin();

        dao.cadastrar(celular);

        em.getTransaction().commit();

        em.close();
    }
}