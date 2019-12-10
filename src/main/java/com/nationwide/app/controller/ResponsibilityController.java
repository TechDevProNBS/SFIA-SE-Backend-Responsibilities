package com.nationwide.app.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.nationwide.app.repository.ResponsibilityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nationwide.app.model.Responsibilities;

/**Maps the {@link findAll} function from {@link ResponsibilityRepository} 
 * @author willg
 *
 */
@RestController
@CrossOrigin("*")
public class ResponsibilityController {

	@Autowired
	private ResponsibilityRepository repo;
	
	@RequestMapping("/API/showResponsibilities")
	public List<Responsibilities> showResponsibilities() {
		return repo.findAll();
	}

}

