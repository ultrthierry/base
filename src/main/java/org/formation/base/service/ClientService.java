package org.formation.base.service;

import java.util.List;

import org.formation.base.entity.Client;
import org.formation.base.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService implements IClientService {
	
	private ClientRepository clientRepository;
	
	
	public ClientService(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}

	@Override
	public Client addClient(Client c) {
		
		return clientRepository.save(c);
	}

	@Override
	public List<Client> listClient() {
	
		return null;
	}

}
