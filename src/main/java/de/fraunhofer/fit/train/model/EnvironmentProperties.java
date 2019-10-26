package de.fraunhofer.fit.train.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Repository;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import de.fraunhofer.fit.train.model.dev.DEVenvironmentProperties;
import de.fraunhofer.fit.train.model.prod.PRODenvironmentProperties;
import de.fraunhofer.fit.train.model.test.TESTenvironmentProperties;


@Repository
@Document(collection = "environmentproperties")
public class EnvironmentProperties {
	
	@Id
	@SerializedName("_id")
	@Expose
	private ObjectId _id;
	
	
	@SerializedName("ENV_DEV")
	@Expose
	private DEVenvironmentProperties DEVenvironmentProperties;
	
	@SerializedName("ENV_TEST")
	@Expose
	private TESTenvironmentProperties TESTenvironmentProperties;
	
	@SerializedName("ENV_PROD")
	@Expose
	private PRODenvironmentProperties PRODenvironmentProperties;

	public DEVenvironmentProperties getDEVenvironmentProperties() {
		return DEVenvironmentProperties;
	}

	public void setDEVenvironmentProperties(DEVenvironmentProperties dEVenvironmentProperties) {
		DEVenvironmentProperties = dEVenvironmentProperties;
	}

	public TESTenvironmentProperties getTESTenvironmentProperties() {
		return TESTenvironmentProperties;
	}

	public void setTESTenvironmentProperties(TESTenvironmentProperties tESTenvironmentProperties) {
		TESTenvironmentProperties = tESTenvironmentProperties;
	}

	public PRODenvironmentProperties getPRODenvironmentProperties() {
		return PRODenvironmentProperties;
	}

	public void setPRODenvironmentProperties(PRODenvironmentProperties pRODenvironmentProperties) {
		PRODenvironmentProperties = pRODenvironmentProperties;
	}
	

	
	

}
