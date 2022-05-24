package org.formation.base.service;

import java.util.List;
import java.util.Optional;

import org.formation.base.entity.Client;

public interface IClientService {
	
	Client addClient(Client c);
	List<Client> listClient();

}
