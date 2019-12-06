package com.nationwide.app.repository;


import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.nationwide.app.model.Responsibilities;

/**Communicates with {@link ResponsibilityController} with the {@link findAll} function.
 * @author willg
 *
 */
@Repository
public interface ResponsibilityRepository extends MongoRepository<Responsibilities, String> {
	public List<Responsibilities> findAll();
	
}

