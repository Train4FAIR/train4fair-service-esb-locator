package de.fraunhofer.fit.train.model.prod;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Repository;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@Repository
@Document(collection = "prodenvironmentproperties")
public class PRODenvironmentProperties {
	
	@Id
	@SerializedName("_id")
	@Expose
	private ObjectId _id;
	
	
	@SerializedName("env")
	@Expose
	private String env = "PROD";
	
	@SerializedName("microservicesPropertiesPRODModel")
	@Expose
	private MicroservicesPropertiesPRODModel microservicesPropertiesPRODModel;
	
	
	@SerializedName("mongoMicroservicesPropertiesPRODModel")
	@Expose
	private MongoMicroservicesPropertiesPRODModel mongoMicroservicesPropertiesPRODModel;
	
	@SerializedName("trainModellingToolPropertiesPRODModel")
	@Expose
	private TrainModellingToolPropertiesPRODModel trainModellingToolPropertiesPRODModel;
	
	@SerializedName("trainNodesPropertiesPRODModel")
	@Expose
	private TrainNodesPropertiesPRODModel trainNodesPropertiesPRODModel;
	
	@SerializedName("webdavMicroServicesPropertiesPRODModel")
	@Expose
	private WebdavMicroServicesPropertiesPRODModel webdavMicroServicesPropertiesPRODModel;

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}

	public MicroservicesPropertiesPRODModel getMicroservicesPropertiesPRODModel() {
		return microservicesPropertiesPRODModel;
	}

	public void setMicroservicesPropertiesPRODModel(MicroservicesPropertiesPRODModel microservicesPropertiesPRODModel) {
		this.microservicesPropertiesPRODModel = microservicesPropertiesPRODModel;
	}

	public MongoMicroservicesPropertiesPRODModel getMongoMicroservicesPropertiesPRODModel() {
		return mongoMicroservicesPropertiesPRODModel;
	}

	public void setMongoMicroservicesPropertiesPRODModel(
			MongoMicroservicesPropertiesPRODModel mongoMicroservicesPropertiesPRODModel) {
		this.mongoMicroservicesPropertiesPRODModel = mongoMicroservicesPropertiesPRODModel;
	}

	public TrainModellingToolPropertiesPRODModel getTrainModellingToolPropertiesPRODModel() {
		return trainModellingToolPropertiesPRODModel;
	}

	public void setTrainModellingToolPropertiesPRODModel(
			TrainModellingToolPropertiesPRODModel trainModellingToolPropertiesPRODModel) {
		this.trainModellingToolPropertiesPRODModel = trainModellingToolPropertiesPRODModel;
	}

	public TrainNodesPropertiesPRODModel getTrainNodesPropertiesPRODModel() {
		return trainNodesPropertiesPRODModel;
	}

	public void setTrainNodesPropertiesPRODModel(TrainNodesPropertiesPRODModel trainNodesPropertiesPRODModel) {
		this.trainNodesPropertiesPRODModel = trainNodesPropertiesPRODModel;
	}

	public WebdavMicroServicesPropertiesPRODModel getWebdavMicroServicesPropertiesPRODModel() {
		return webdavMicroServicesPropertiesPRODModel;
	}

	public void setWebdavMicroServicesPropertiesPRODModel(
			WebdavMicroServicesPropertiesPRODModel webdavMicroServicesPropertiesPRODModel) {
		this.webdavMicroServicesPropertiesPRODModel = webdavMicroServicesPropertiesPRODModel;
	}
	
	

}
