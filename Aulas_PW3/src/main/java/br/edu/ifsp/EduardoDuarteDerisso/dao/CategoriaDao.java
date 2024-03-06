package br.edu.ifsp.EduardoDuarteDerisso.dao;

import br.edu.ifsp.EduardoDuarteDerisso.modelo.Categoria;
import jakarta.persistence.EntityManager;

public class CategoriaDao {
    private EntityManager em;

    public CategoriaDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Categoria categoria) {this.em.persist(categoria);}
}
