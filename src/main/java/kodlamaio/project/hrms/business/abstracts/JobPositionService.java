package kodlamaio.project.hrms.business.abstracts;

import java.util.List;

import kodlamaio.project.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	
	List<JobPosition> getAll();

}
