package kodlamaio.project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.project.hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer>{

}
