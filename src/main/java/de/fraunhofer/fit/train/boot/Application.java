package de.fraunhofer.fit.train.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({ "de.fraunhofer.fit.train" })
@EntityScan("de.fraunhofer.fit.train")
@SpringBootApplication(exclude = { MongoAutoConfiguration.class, MongoDataAutoConfiguration.class })
public class Application extends SpringBootServletInitializer {


	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
	
//	public static void main(String[] args) {
//		SpringApplication sa = new SpringApplication(Application.class);
//		String env = getCommandlineEnv(args);
//		String loadDb = loadDb(args);
//		
//		if(loadDb!=null && loadDb!=null && "true".equals(loadDb)) {
//			Boolean loaddb = new Boolean(loadDb);
//			if(loaddb && env!=null) {
//				DataLoadingUtil.load(env);				
//			}
//		}
//		sa.run(args);
//	}

//	private static String getCommandlineEnv(String[] args) {
//		for(int i = 0; i< args.length;i++) {
//			String arg = args[i];
//			if(arg.startsWith("--app.env=")) {
//				return arg.split("--app.env=")[1];
//			}
//		}
//		return null;
//	}
//	
//	private static String loadDb(String[] args) {
//		for(int i = 0; i< args.length;i++) {
//			String arg = args[i];
//			if(arg.startsWith("--load.db=")) {
//				return arg.split("--load.db=")[1];
//			}
//		}
//		return null;
//	}

}
