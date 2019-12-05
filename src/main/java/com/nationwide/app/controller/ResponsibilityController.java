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

@RestController
@CrossOrigin("*")
public class ResponsibilityController {

	@Autowired
	private ResponsibilityRepository repo;
	
	@RequestMapping("/API/showResponsibilities")
	public List<Responsibilities> showResponsibilities() {
		return repo.findAll();
	}


//	@RequestMapping("/create")
//	public String create(@RequestBody IndividualProjectBlogs blog) {
//
//		IndividualProjectBlogs b = individualProjectBlogsService.create(blog);
//		System.out.println("Hi");
//		return b.toString();
//	}
//
//	@RequestMapping("/insertComment")
//	public String insertComment(@RequestParam String id, @RequestParam String comment, @RequestParam String username) {
//		IndividualProjectBlogs b = individualProjectBlogsService.insertComment(id, comment, username);
//		return b.toString();
//
//	}
//
//	@RequestMapping("/get")
//	public Optional<IndividualProjectBlogs> getBlogs(@RequestParam String id) {
//		return individualProjectBlogsService.getById(id);
//	}
//


//	@RequestMapping("/delete/{id}")
//	public String delete(@PathVariable String id) {
//		individualProjectBlogsService.delete(id);
//		return "Deleted " + id;
//	}

}

