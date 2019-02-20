package com.smk.app.modeleDAO;

import java.util.List;

import com.smk.app.entite.Client;

public interface  IClientDao {

	public Client save(Client entity);

	public Client update(Client entity);
	
	public void remove(Long id);
	
	public List<Client> selectAll();
	
	public Client getById(Long id);	
}
