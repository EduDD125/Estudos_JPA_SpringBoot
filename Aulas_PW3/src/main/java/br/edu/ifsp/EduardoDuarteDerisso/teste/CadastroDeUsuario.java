package br.edu.ifsp.EduardoDuarteDerisso.teste;

import br.edu.ifsp.EduardoDuarteDerisso.modelo.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CadastroDeUsuario {
    public static void main(String[] args) {

        SpringApplication.run(CadastroDeUsuario.class, args);

        Usuario jao = new Usuario();

        jao.setNome("João Pererei");
        jao.setProfissao("Skatista");

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();

        em.persist(jao);

        em.getTransaction().commit();

        em.close();
    }
}
