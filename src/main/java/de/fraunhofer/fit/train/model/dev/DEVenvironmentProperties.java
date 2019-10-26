package de.fraunhofer.fit.train.model.dev;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Repository;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@Repository
@Document(collection = "devenvironmentproperties")
public class DEVenvironmentProperties {
	
	@Id
	@SerializedName("_id")
	@Expose
	private ObjectId _id;
	
	
	@SerializedName("env")
	@Expose
	private String env = "DEV";
	
	//DEV
	
	@SerializedName("microservicesPropertiesDEVModel")
	@Expose
	private MicroservicesPropertiesDEVModel microservicesPropertiesDEVModel;
	
	
	@SerializedName("mongoMicroservicesPropertiesDEVModel")
	@Expose
	private MongoMicroservicesPropertiesDEVModel mongoMicroservicesPropertiesDEVModel;
	
	@SerializedName("trainModellingToolPropertiesDEVModel")
	@Expose
	private TrainModellingToolPropertiesDEVModel trainModellingToolPropertiesDEVModel;
	
	@SerializedName("trainNodesPropertiesDEVModel")
	@Expose
	private TrainNodesPropertiesDEVModel trainNodesPropertiesDEVModel;
	
	@SerializedName("webdavMicroServicesPropertiesDEVModel")
	@Expose
	private WebdavMicroServicesPropertiesDEVModel webdavMicroServicesPropertiesDEVModel;

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}

	public MicroservicesPropertiesDEVModel getMicroservicesPropertiesDEVModel() {
		return microservicesPropertiesDEVModel;
	}

	public void setMicroservicesPropertiesDEVModel(MicroservicesPropertiesDEVModel microservicesPropertiesDEVModel) {
		this.microservicesPropertiesDEVModel = microservicesPropertiesDEVModel;
	}

	public MongoMicroservicesPropertiesDEVModel getMongoMicroservicesPropertiesDEVModel() {
		return mongoMicroservicesPropertiesDEVModel;
	}

	public void setMongoMicroservicesPropertiesDEVModel(
			MongoMicroservicesPropertiesDEVModel mongoMicroservicesPropertiesDEVModel) {
		this.mongoMicroservicesPropertiesDEVModel = mongoMicroservicesPropertiesDEVModel;
	}

	public TrainModellingToolPropertiesDEVModel getTrainModellingToolPropertiesDEVModel() {
		return trainModellingToolPropertiesDEVModel;
	}

	public void setTrainModellingToolPropertiesDEVModel(
			TrainModellingToolPropertiesDEVModel trainModellingToolPropertiesDEVModel) {
		this.trainModellingToolPropertiesDEVModel = trainModellingToolPropertiesDEVModel;
	}

	public TrainNodesPropertiesDEVModel getTrainNodesPropertiesDEVModel() {
		return trainNodesPropertiesDEVModel;
	}

	public void setTrainNodesPropertiesDEVModel(TrainNodesPropertiesDEVModel trainNodesPropertiesDEVModel) {
		this.trainNodesPropertiesDEVModel = trainNodesPropertiesDEVModel;
	}

	public WebdavMicroServicesPropertiesDEVModel getWebdavMicroServicesPropertiesDEVModel() {
		return webdavMicroServicesPropertiesDEVModel;
	}

	public void setWebdavMicroServicesPropertiesDEVModel(
			WebdavMicroServicesPropertiesDEVModel webdavMicroServicesPropertiesDEVModel) {
		this.webdavMicroServicesPropertiesDEVModel = webdavMicroServicesPropertiesDEVModel;
	}
	
	
	
	
}
