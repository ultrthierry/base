package org.formation.base.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.formation.base.entity.Client;
import org.formation.base.service.IClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiRestController {

	
	  private IClientService clientService;
	  
	  
	  public ApiRestController(IClientService clientService) {
		this.clientService = clientService;
	}

	@GetMapping("/clients")
	public List<Client> getAllClient() {
		return clientService.listClient();
	  }
	  
	  @PostMapping("/clients")
	  public Client createClient(@RequestBody Client c) {
		return clientService.addClient(c);
		}
}
