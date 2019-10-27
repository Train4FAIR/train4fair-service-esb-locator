package de.fraunhofer.fit.train.util;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

import de.fraunhofer.fit.train.model.EnvENUM;
import de.fraunhofer.fit.train.model.EnvironmentProperties;
import de.fraunhofer.fit.train.model.dev.DEVenvironmentProperties;
import de.fraunhofer.fit.train.model.dev.MicroservicesPropertiesDEVModel;
import de.fraunhofer.fit.train.model.dev.MongoMicroservicesPropertiesDEVModel;
import de.fraunhofer.fit.train.model.dev.TrainModellingToolPropertiesDEVModel;
import de.fraunhofer.fit.train.model.dev.TrainNodesPropertiesDEVModel;
import de.fraunhofer.fit.train.model.dev.WebdavMicroServicesPropertiesDEVModel;
import de.fraunhofer.fit.train.model.prod.MicroservicesPropertiesPRODModel;
import de.fraunhofer.fit.train.model.prod.MongoMicroservicesPropertiesPRODModel;
import de.fraunhofer.fit.train.model.prod.PRODenvironmentProperties;
import de.fraunhofer.fit.train.model.prod.TrainModellingToolPropertiesPRODModel;
import de.fraunhofer.fit.train.model.prod.TrainNodesPropertiesPRODModel;
import de.fraunhofer.fit.train.model.prod.WebdavMicroServicesPropertiesPRODModel;
import de.fraunhofer.fit.train.model.test.MicroservicesPropertiesTESTModel;
import de.fraunhofer.fit.train.model.test.MongoMicroservicesPropertiesTESTModel;
import de.fraunhofer.fit.train.model.test.TESTenvironmentProperties;
import de.fraunhofer.fit.train.model.test.TrainModellingToolPropertiesTESTModel;
import de.fraunhofer.fit.train.model.test.TrainNodesPropertiesTESTModel;
import de.fraunhofer.fit.train.model.test.WebdavMicroServicesPropertiesTESTModel;


@EnableAspectJAutoProxy
@Service
public class DataLoadingUtil {
	
	public static void load(String env) {
		System.out.println("=====>  "+env);
		EnvironmentProperties evprops = new EnvironmentProperties();
		DEVenvironmentProperties dev = new DEVenvironmentProperties();
		dev.setEnv(EnvENUM.DEV.toString());
		MicroservicesPropertiesDEVModel microservicesPropertiesDEVModel = new MicroservicesPropertiesDEVModel();
		microservicesPropertiesDEVModel.setHost("0.0.0.0");
		microservicesPropertiesDEVModel.setPort("9091");
		microservicesPropertiesDEVModel.setUser("admin");
		microservicesPropertiesDEVModel.setPass("21232f297a57a5a743894a0e4a801fc3");
		dev.setMicroservicesPropertiesDEVModel(microservicesPropertiesDEVModel);
				
		MongoMicroservicesPropertiesDEVModel mongoMicroservicesPropertiesDEVModel = new MongoMicroservicesPropertiesDEVModel();
		mongoMicroservicesPropertiesDEVModel.setHost("cloud41.dbis.rwth-aachen.de");
		mongoMicroservicesPropertiesDEVModel.setPort("27017");
		mongoMicroservicesPropertiesDEVModel.setUser("admin");
		mongoMicroservicesPropertiesDEVModel.setPass("21232f297a57a5a743894a0e4a801fc3");
		dev.setMongoMicroservicesPropertiesDEVModel(mongoMicroservicesPropertiesDEVModel);
	
		TrainModellingToolPropertiesDEVModel trainModellingToolPropertiesDEVModel = new TrainModellingToolPropertiesDEVModel();
		trainModellingToolPropertiesDEVModel.setHost("cloud41.dbis.rwth-aachen.de");
		trainModellingToolPropertiesDEVModel.setPort("1880");
		trainModellingToolPropertiesDEVModel.setUser("admin");
		trainModellingToolPropertiesDEVModel.setPass("21232f297a57a5a743894a0e4a801fc3");
		dev.setTrainModellingToolPropertiesDEVModel(trainModellingToolPropertiesDEVModel);
		
		
		
		TrainNodesPropertiesDEVModel trainNodesPropertiesDEVModel = new TrainNodesPropertiesDEVModel();
		trainNodesPropertiesDEVModel.setHost("cloud41.dbis.rwth-aachen.de");
		trainNodesPropertiesDEVModel.setPort("1880");
		trainNodesPropertiesDEVModel.setUser("admin");
		trainNodesPropertiesDEVModel.setPass("21232f297a57a5a743894a0e4a801fc3");
		dev.setTrainNodesPropertiesDEVModel(trainNodesPropertiesDEVModel);
		
		WebdavMicroServicesPropertiesDEVModel webdavMicroServicesPropertiesDEVModel = new WebdavMicroServicesPropertiesDEVModel();
		webdavMicroServicesPropertiesDEVModel.setHost("cloud41.dbis.rwth-aachen.de");
		webdavMicroServicesPropertiesDEVModel.setPort("9999");
		webdavMicroServicesPropertiesDEVModel.setUser("admin");
		webdavMicroServicesPropertiesDEVModel.setPass("21232f297a57a5a743894a0e4a801fc3");
		dev.setWebdavMicroServicesPropertiesDEVModel(webdavMicroServicesPropertiesDEVModel);
		evprops.setDEVenvironmentProperties(dev);
		
		//==PROD
		PRODenvironmentProperties prod = new PRODenvironmentProperties();
		prod.setEnv("PROD");
		MicroservicesPropertiesPRODModel microservicesPropertiesPRODModel = new MicroservicesPropertiesPRODModel();
		microservicesPropertiesPRODModel.setHost("127.0.0.1");
		microservicesPropertiesPRODModel.setPort("9091");
		microservicesPropertiesPRODModel.setUser("admin");
		microservicesPropertiesPRODModel.setPass("21232f297a57a5a743894a0e4a801fc3");
		prod.setMicroservicesPropertiesPRODModel(microservicesPropertiesPRODModel);
				
		MongoMicroservicesPropertiesPRODModel mongoMicroservicesPropertiesPRODModel = new MongoMicroservicesPropertiesPRODModel();
		mongoMicroservicesPropertiesPRODModel.setHost("127.0.0.1");
		mongoMicroservicesPropertiesPRODModel.setPort("27017");
		mongoMicroservicesPropertiesPRODModel.setUser("admin");
		mongoMicroservicesPropertiesPRODModel.setPass("21232f297a57a5a743894a0e4a801fc3");
		prod.setMongoMicroservicesPropertiesPRODModel(mongoMicroservicesPropertiesPRODModel);
	
		TrainModellingToolPropertiesPRODModel trainModellingToolPropertiesPRODModel = new TrainModellingToolPropertiesPRODModel();
		trainModellingToolPropertiesPRODModel.setHost("127.0.0.1");
		trainModellingToolPropertiesPRODModel.setPort("1880");
		trainModellingToolPropertiesPRODModel.setUser("admin");
		trainModellingToolPropertiesPRODModel.setPass("21232f297a57a5a743894a0e4a801fc3");
		prod.setTrainModellingToolPropertiesPRODModel(trainModellingToolPropertiesPRODModel);
		
		
		TrainNodesPropertiesPRODModel trainNodesPropertiesPRODModel = new TrainNodesPropertiesPRODModel();
		trainNodesPropertiesPRODModel.setHost("127.0.0.1");
		trainNodesPropertiesPRODModel.setPort("1880");
		trainNodesPropertiesPRODModel.setUser("admin");
		trainNodesPropertiesPRODModel.setPass("21232f297a57a5a743894a0e4a801fc3");
		prod.setTrainNodesPropertiesPRODModel(trainNodesPropertiesPRODModel);
		
		WebdavMicroServicesPropertiesPRODModel webdavMicroServicesPropertiesPRODModel = new WebdavMicroServicesPropertiesPRODModel();
		webdavMicroServicesPropertiesPRODModel.setHost("127.0.0.1");
		webdavMicroServicesPropertiesPRODModel.setPort("9999");
		webdavMicroServicesPropertiesPRODModel.setUser("admin");
		webdavMicroServicesPropertiesPRODModel.setPass("21232f297a57a5a743894a0e4a801fc3");
		prod.setWebdavMicroServicesPropertiesPRODModel(webdavMicroServicesPropertiesPRODModel);
		evprops.setPRODenvironmentProperties(prod);
		
		//==TEST
		TESTenvironmentProperties test = new TESTenvironmentProperties();
		test.setEnv("TEST");
		MicroservicesPropertiesTESTModel microservicesPropertiesTESTModel = new MicroservicesPropertiesTESTModel();
		microservicesPropertiesTESTModel.setHost("cloud41.dbis.rwth-aachen.de");
		microservicesPropertiesTESTModel.setPort("9091");
		microservicesPropertiesTESTModel.setUser("admin");
		microservicesPropertiesTESTModel.setPass("21232f297a57a5a743894a0e4a801fc3");
		test.setMicroservicesPropertiesTESTModel(microservicesPropertiesTESTModel);
				
		MongoMicroservicesPropertiesTESTModel mongoMicroservicesPropertiesTESTModel = new MongoMicroservicesPropertiesTESTModel();
		mongoMicroservicesPropertiesTESTModel.setHost("127.0.0.1");
		mongoMicroservicesPropertiesTESTModel.setPort("27017");
		mongoMicroservicesPropertiesTESTModel.setUser("admin");
		mongoMicroservicesPropertiesTESTModel.setPass("21232f297a57a5a743894a0e4a801fc3");
		test.setMongoMicroservicesPropertiesTESTModel(mongoMicroservicesPropertiesTESTModel);
	
		TrainModellingToolPropertiesTESTModel trainModellingToolPropertiesTESTModel = new TrainModellingToolPropertiesTESTModel();
		trainModellingToolPropertiesTESTModel.setHost("127.0.0.1");
		trainModellingToolPropertiesTESTModel.setPort("1880");
		trainModellingToolPropertiesTESTModel.setUser("admin");
		trainModellingToolPropertiesTESTModel.setPass("21232f297a57a5a743894a0e4a801fc3");
		test.setTrainModellingToolPropertiesTESTModel(trainModellingToolPropertiesTESTModel);
		
		
		TrainNodesPropertiesTESTModel trainNodesPropertiesTESTModel = new TrainNodesPropertiesTESTModel();
		trainNodesPropertiesTESTModel.setHost("127.0.0.1");
		trainNodesPropertiesTESTModel.setPort("1880");
		trainNodesPropertiesTESTModel.setUser("admin");
		trainNodesPropertiesTESTModel.setPass("21232f297a57a5a743894a0e4a801fc3");
		test.setTrainNodesPropertiesTESTModel(trainNodesPropertiesTESTModel);
		
		WebdavMicroServicesPropertiesTESTModel webdavMicroServicesPropertiesTESTModel = new WebdavMicroServicesPropertiesTESTModel();
		webdavMicroServicesPropertiesTESTModel.setHost("127.0.0.1");
		webdavMicroServicesPropertiesTESTModel.setPort("9999");
		webdavMicroServicesPropertiesTESTModel.setUser("admin");
		webdavMicroServicesPropertiesTESTModel.setPass("21232f297a57a5a743894a0e4a801fc3");
		test.setWebdavMicroServicesPropertiesTESTModel(webdavMicroServicesPropertiesTESTModel);
		evprops.setTESTenvironmentProperties(test);
	}

}
