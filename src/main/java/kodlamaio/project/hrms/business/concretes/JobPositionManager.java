package kodlamaio.project.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.project.hrms.business.abstracts.JobPositionService;
import kodlamaio.project.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.project.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}


	@Override
	public List<JobPosition> getAll() {
		return jobPositionDao.findAll();
	}

}
