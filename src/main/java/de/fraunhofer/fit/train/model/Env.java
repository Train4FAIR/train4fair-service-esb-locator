package de.fraunhofer.fit.train.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Repository;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@Repository
@Document(collection = "env")
public class Env {
	
	@SerializedName("env")
	@Expose
	private String env;
	
	@SerializedName("app")
	@Expose
	private String app;
	
	@SerializedName("host")
	@Expose
	private String host;
	
	
	@SerializedName("port")
	@Expose
	private String port;
	
	
	@SerializedName("user")
	@Expose
	private String user;
	
	
	@SerializedName("pass")
	@Expose
	private String pass;


	public String getHost() {
		return host;
	}


	public void setHost(String host) {
		this.host = host;
	}


	public String getPort() {
		return port;
	}


	public void setPort(String port) {
		this.port = port;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getEnv() {
		return env;
	}


	public void setEnv(String env) {
		this.env = env;
	}


	public String getApp() {
		return app;
	}


	public void setApp(String app) {
		this.app = app;
	}
	
	

}
