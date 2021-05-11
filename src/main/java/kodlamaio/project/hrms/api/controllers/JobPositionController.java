package kodlamaio.project.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.project.hrms.business.abstracts.JobPositionService;
import kodlamaio.project.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping(name="api/jobpositions")
public class JobPositionController {
	private JobPositionService jobPositionService;
	
	@Autowired
	public JobPositionController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping(name = "listjobpositions")
	public List<JobPosition> getAll() {
		return jobPositionService.getAll();
	}
	
}
