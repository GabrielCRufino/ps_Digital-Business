package br.com.fiap.dao;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.fiap.model.Visitante;

@Named
@RequestScoped
public class VisitanteDao {
	
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("progamer-persistence-unit");
	private EntityManager manager = factory.createEntityManager();
	
	public void create(Visitante visitante) {
		
		manager.getTransaction().begin();
		manager.persist(visitante);
		manager.getTransaction().commit();
		
		manager.clear();
	}
	
	public List<Visitante> listAll(){
		TypedQuery<Visitante> query = manager.createQuery("SELECT u FROM User u", Visitante.class);
		
		return query.getResultList();
	}
	
	public boolean exist(Visitante visitante) {
		
		String jpql = "SELECT u FROM User u "
				+ "WHERE id=:id ";
		
		TypedQuery<Visitante> query = manager.createQuery(jpql , Visitante.class);
		query.setParameter("id", visitante.getId());
		
		try {
			query.getSingleResult();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
}
