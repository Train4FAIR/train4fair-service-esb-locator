package de.fraunhofer.fit.train.persistence;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import de.fraunhofer.fit.train.model.EnvironmentProperties;

public interface IEnvironmentPropertiesRepository extends CrudRepository<EnvironmentProperties, String>, QueryByExampleExecutor<EnvironmentProperties> {

	@Query("{ '?0' : { $regex: ?1 } }")
	List<EnvironmentProperties> findOneByQuery(String fieldStr,String cotent);

	@Query("{ ?0 : { $regex: ?1 } }")
	List<EnvironmentProperties> findOneBySmampleQuery(String fieldStr,String cotent);
	
	@Query(value="{}", fields="{ '?0' : ?1}")
	List<EnvironmentProperties> findOneBySimpleQuery(String fieldStr,String cotent);

	@Query("{ ?0 : { $regex: ?1 } }")
	List<EnvironmentProperties> findOneByRegexQuery(String fieldStr, String cotent);
	
	
}
