package de.fraunhofer.fit.train.facade;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

import de.fraunhofer.fit.train.model.AppENUM;
import de.fraunhofer.fit.train.model.Env;
import de.fraunhofer.fit.train.model.EnvENUM;
import de.fraunhofer.fit.train.model.EnvironmentProperties;
import de.fraunhofer.fit.train.persistence.IEnvironmentPropertiesRepository;

@EnableAspectJAutoProxy
@Service
public class ServiceFacade {
	

	
	@Autowired  
	private IEnvironmentPropertiesRepository repository;
	
	
	public List<EnvironmentProperties>  findAll() {
		List<EnvironmentProperties> allList = new ArrayList<EnvironmentProperties>();
		Iterator<EnvironmentProperties> it = repository.findAll().iterator();while(it.hasNext()) {
			allList.add(it.next());
		}
		return allList;
	}
	
	public Env findEnv(String env, String type) {
		
		Env envObj = null;
		
		Iterator<EnvironmentProperties> it = repository.findAll().iterator();while(it.hasNext()) {
			
			if(EnvENUM.DEV.toString().toLowerCase().equals(env.toLowerCase()) && 
					AppENUM.MS.toString().toLowerCase().equals(type.toLowerCase())) {
				EnvironmentProperties environmentProperties = it.next();
				envObj = environmentProperties.getDEVenvironmentProperties().getMicroservicesPropertiesDEVModel();
				return envObj;
			}

			
			if(EnvENUM.DEV.toString().toLowerCase().equals(env.toLowerCase()) && AppENUM.MONGO_MS.toString().toLowerCase().equals(type.toLowerCase())) {
				EnvironmentProperties environmentProperties = it.next();
				envObj = environmentProperties.getDEVenvironmentProperties().getMongoMicroservicesPropertiesDEVModel();
				return envObj;
			}
			
			if(EnvENUM.DEV.toString().toLowerCase().equals(env.toLowerCase()) && AppENUM.TMT.toString().toLowerCase().equals(type.toLowerCase())) {
				EnvironmentProperties environmentProperties = it.next();
				envObj = environmentProperties.getDEVenvironmentProperties().getTrainModellingToolPropertiesDEVModel();
				return envObj;
			}
			
			
			if(EnvENUM.DEV.toString().toLowerCase().equals(env.toLowerCase()) && AppENUM.NODES.toString().toLowerCase().equals(type.toLowerCase())) {
				EnvironmentProperties environmentProperties = it.next();
				envObj = environmentProperties.getDEVenvironmentProperties().getTrainNodesPropertiesDEVModel();
				return envObj;
			}
			
			if(EnvENUM.DEV.toString().toLowerCase().equals(env.toLowerCase()) && AppENUM.WEBDAV.toString().toLowerCase().equals(type.toLowerCase())) {
				EnvironmentProperties environmentProperties = it.next();
				envObj = environmentProperties.getDEVenvironmentProperties().getWebdavMicroServicesPropertiesDEVModel();
				return envObj;
			}
			
			//test
			
			if(EnvENUM.TEST.toString().toLowerCase().equals(env.toLowerCase()) && AppENUM.MS.toString().toLowerCase().equals(type.toLowerCase())) {
				EnvironmentProperties environmentProperties = it.next();
				envObj = environmentProperties.getTESTenvironmentProperties().getMicroservicesPropertiesTESTModel();
				return envObj;
			}
			
			if(EnvENUM.TEST.toString().toLowerCase().equals(env.toLowerCase()) && AppENUM.MONGO_MS.toString().toLowerCase().equals(type.toLowerCase())) {
				EnvironmentProperties environmentProperties = it.next();
				envObj = environmentProperties.getTESTenvironmentProperties().getMongoMicroservicesPropertiesTESTModel();
				return envObj;
			}
			
			if(EnvENUM.TEST.toString().toLowerCase().equals(env.toLowerCase()) && AppENUM.TMT.toString().toLowerCase().equals(type.toLowerCase())) {
				EnvironmentProperties environmentProperties = it.next();
				envObj = environmentProperties.getTESTenvironmentProperties().getTrainModellingToolPropertiesTESTModel();
				return envObj;
			}
			
			if(EnvENUM.TEST.toString().toLowerCase().equals(env.toLowerCase()) && AppENUM.NODES.toString().toLowerCase().equals(type.toLowerCase())) {
				EnvironmentProperties environmentProperties = it.next();
				envObj = environmentProperties.getTESTenvironmentProperties().getTrainNodesPropertiesTESTModel();
				return envObj;
			}
			
			if(EnvENUM.TEST.toString().toLowerCase().equals(env.toLowerCase()) && AppENUM.WEBDAV.toString().toLowerCase().equals(type.toLowerCase())) {
				EnvironmentProperties environmentProperties = it.next();
				envObj = environmentProperties.getTESTenvironmentProperties().getWebdavMicroServicesPropertiesTESTModel();
				return envObj;
			}
			
			if(EnvENUM.TEST.toString().toLowerCase().equals(env.toLowerCase()) && AppENUM.WEBDAV_DOC.toString().toLowerCase().equals(type.toLowerCase())) {
				EnvironmentProperties environmentProperties = it.next();
				envObj = environmentProperties.getTESTenvironmentProperties().getWebdavMetadataPropertiesTESTModel();
				return envObj;
			}
			
			if(EnvENUM.TEST.toString().toLowerCase().equals(env.toLowerCase()) && AppENUM.WEBDAV_METADATA.toString().toLowerCase().equals(type.toLowerCase())) {
				EnvironmentProperties environmentProperties = it.next();
				envObj = environmentProperties.getTESTenvironmentProperties().getWebdavMicroServicesPropertiesTESTModel();
				return envObj;
			}
			
			if(EnvENUM.TEST.toString().toLowerCase().equals(env.toLowerCase()) && AppENUM.WEBDAV_PAGE.toString().toLowerCase().equals(type.toLowerCase())) {
				EnvironmentProperties environmentProperties = it.next();
				envObj = environmentProperties.getTESTenvironmentProperties().getWebdavPagePropertiesTESTModel();
				return envObj;
			}
			
			
			//prod
			
			if(EnvENUM.PROD.toString().toLowerCase().equals(env.toLowerCase()) && AppENUM.MS.toString().toLowerCase().equals(type.toLowerCase())) {
				EnvironmentProperties environmentProperties = it.next();
				envObj = environmentProperties.getPRODenvironmentProperties().getMicroservicesPropertiesPRODModel();
				return envObj;
			}
			
			if(EnvENUM.PROD.toString().toLowerCase().equals(env.toLowerCase()) && AppENUM.MONGO_MS.toString().toLowerCase().equals(type.toLowerCase())) {
				EnvironmentProperties environmentProperties = it.next();
				envObj = environmentProperties.getPRODenvironmentProperties().getMongoMicroservicesPropertiesPRODModel();
				return envObj;
			}
			
			if(EnvENUM.PROD.toString().toLowerCase().equals(env.toLowerCase()) && AppENUM.TMT.toString().toLowerCase().equals(type.toLowerCase())) {
				EnvironmentProperties environmentProperties = it.next();
				envObj = environmentProperties.getPRODenvironmentProperties().getTrainModellingToolPropertiesPRODModel();
				return envObj;
			}
			
			if(EnvENUM.PROD.toString().toLowerCase().equals(env.toLowerCase()) && AppENUM.NODES.toString().toLowerCase().equals(type.toLowerCase())) {
				EnvironmentProperties environmentProperties = it.next();
				envObj = environmentProperties.getPRODenvironmentProperties().getTrainNodesPropertiesPRODModel();
				return envObj;
			}
			
			if(EnvENUM.PROD.toString().toLowerCase().equals(env.toLowerCase()) && AppENUM.WEBDAV.toString().toLowerCase().equals(type.toLowerCase())) {
				EnvironmentProperties environmentProperties = it.next();
				envObj = environmentProperties.getPRODenvironmentProperties().getWebdavMicroServicesPropertiesPRODModel();
				return envObj;
			}
			
		}

		
		throw new RuntimeException("Properties not found!");
	}
}
