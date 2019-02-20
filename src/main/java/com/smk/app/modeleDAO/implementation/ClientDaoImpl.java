package com.smk.app.modeleDAO.implementation;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import com.smk.app.entite.Client;
import com.smk.app.modeleDAO.IClientDao;

@Transactional
public class ClientDaoImpl implements IClientDao{

	
	private EntityManager entityManager;
	
	public ClientDaoImpl() {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("UP_GESTION_STOCK");
		this.entityManager=entityManagerFactory.createEntityManager();
		
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public Client save(Client entity) {
		
		entityManager.persist(entity);
			
		return entity;
	
	}

	@Override
	public Client update(Client entity) {
		return entityManager.merge(entity);
	
	}

	@Override
	public void remove(Long id) {
		
		Client tab= entityManager.getReference(Client.class, id);
		entityManager.remove(tab);
		
	}

	@Override
	public List<Client> selectAll() {

		Query query=entityManager.createQuery("select t from Client t" );
		return query.getResultList();
	}

	@Override
	public Client getById(Long id) {

		return entityManager.find(Client.class,id);
		
	}
	

}
