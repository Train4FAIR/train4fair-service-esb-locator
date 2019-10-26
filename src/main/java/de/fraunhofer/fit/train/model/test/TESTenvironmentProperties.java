package de.fraunhofer.fit.train.model.test;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Repository;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@Repository
@Document(collection = "testenvironmentproperties")
public class TESTenvironmentProperties {
	
	@Id
	@SerializedName("_id")
	@Expose
	private ObjectId _id;
	
	
	@SerializedName("env")
	@Expose
	private String env = "TEST";
	
	//DEV
	
	@SerializedName("microservicesPropertiesTESTModel")
	@Expose
	private MicroservicesPropertiesTESTModel microservicesPropertiesTESTModel;
	
	
	@SerializedName("mongoMicroservicesPropertiesTESTModel")
	@Expose
	private MongoMicroservicesPropertiesTESTModel mongoMicroservicesPropertiesTESTModel;
	
	@SerializedName("trainModellingToolPropertiesTESTModel")
	@Expose
	private TrainModellingToolPropertiesTESTModel trainModellingToolPropertiesTESTModel;
	
	@SerializedName("trainNodesPropertiesTESTModel")
	@Expose
	private TrainNodesPropertiesTESTModel trainNodesPropertiesTESTModel;
	
	@SerializedName("webdavMicroServicesPropertiesTESTModel")
	@Expose
	private WebdavMicroServicesPropertiesTESTModel webdavMicroServicesPropertiesTESTModel;

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}

	public MicroservicesPropertiesTESTModel getMicroservicesPropertiesTESTModel() {
		return microservicesPropertiesTESTModel;
	}

	public void setMicroservicesPropertiesTESTModel(MicroservicesPropertiesTESTModel microservicesPropertiesTESTModel) {
		this.microservicesPropertiesTESTModel = microservicesPropertiesTESTModel;
	}

	public MongoMicroservicesPropertiesTESTModel getMongoMicroservicesPropertiesTESTModel() {
		return mongoMicroservicesPropertiesTESTModel;
	}

	public void setMongoMicroservicesPropertiesTESTModel(
			MongoMicroservicesPropertiesTESTModel mongoMicroservicesPropertiesTESTModel) {
		this.mongoMicroservicesPropertiesTESTModel = mongoMicroservicesPropertiesTESTModel;
	}

	public TrainModellingToolPropertiesTESTModel getTrainModellingToolPropertiesTESTModel() {
		return trainModellingToolPropertiesTESTModel;
	}

	public void setTrainModellingToolPropertiesTESTModel(
			TrainModellingToolPropertiesTESTModel trainModellingToolPropertiesTESTModel) {
		this.trainModellingToolPropertiesTESTModel = trainModellingToolPropertiesTESTModel;
	}

	public TrainNodesPropertiesTESTModel getTrainNodesPropertiesTESTModel() {
		return trainNodesPropertiesTESTModel;
	}

	public void setTrainNodesPropertiesTESTModel(TrainNodesPropertiesTESTModel trainNodesPropertiesTESTModel) {
		this.trainNodesPropertiesTESTModel = trainNodesPropertiesTESTModel;
	}

	public WebdavMicroServicesPropertiesTESTModel getWebdavMicroServicesPropertiesTESTModel() {
		return webdavMicroServicesPropertiesTESTModel;
	}

	public void setWebdavMicroServicesPropertiesTESTModel(
			WebdavMicroServicesPropertiesTESTModel webdavMicroServicesPropertiesTESTModel) {
		this.webdavMicroServicesPropertiesTESTModel = webdavMicroServicesPropertiesTESTModel;
	}
	
	
	

}
