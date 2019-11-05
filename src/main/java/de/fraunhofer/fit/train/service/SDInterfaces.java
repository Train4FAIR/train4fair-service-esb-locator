package de.fraunhofer.fit.train.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import de.fraunhofer.fit.train.facade.ServiceFacade;
import de.fraunhofer.fit.train.model.Env;
import de.fraunhofer.fit.train.model.EnvironmentProperties;

@EnableAspectJAutoProxy
@RestController
@Service
public class SDInterfaces {

	@Autowired
	private ServiceFacade facade;




	@GetMapping(value = "/train/service/discovery/{env}/{type}/{token}", produces = MediaType.APPLICATION_JSON_VALUE)
	Env findEnv(@PathVariable String env, @PathVariable String type, @PathVariable String token) throws Exception {
		if(!"admin".equals(token)) {
			throw new RuntimeException("Invalid Token!");
		}
		Env envObj = null;
		envObj = facade.findEnv(env, type);
		return envObj;
	}
	
	@PostMapping(value = "/train/service/discovery/", produces = MediaType.APPLICATION_JSON_VALUE)
	List<EnvironmentProperties> findAll() throws Exception {
		return facade.findAll();
	}


}
