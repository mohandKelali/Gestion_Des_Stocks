package com.smk.app.service;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.smk.app.entite.Client;
import com.smk.app.modeleDAO.IClientDao;
import com.smk.app.modeleDAO.implementation.ClientDaoImpl;


@Transactional
public class ClientService implements IClientDao{

	private ClientDaoImpl client;
	
		
	public ClientService() {
		
		this.client=new ClientDaoImpl();
		
	}

	@Override
	public Client save(Client entity) {

		return client.save(entity);
	}

	@Override
	public Client update(Client entity) {
		
		return client.update(entity);
	}

	@Override
	public void remove(Long id) {
		
		client.remove(id);
		
	}

	@Override
	public List<Client> selectAll() {
		
		return this.client.selectAll();
	}

	@Override
	public Client getById(Long id) {
	
		return client.getById(id);
	}

	
	
	
}
