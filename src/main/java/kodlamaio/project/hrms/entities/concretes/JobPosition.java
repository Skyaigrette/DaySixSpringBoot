package kodlamaio.project.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "job_positions")
public class JobPosition {
	@Id
	@GeneratedValue
	
	@Column(name = "job_position_id")
	int positionId;
	
	@Column(name = "still_active")
	boolean stillActive;
	
	@Column(name = "creation_time")
	Date creationTime;
	
	@Column(name = "description")
	String description;

	
	public JobPosition(int positionId, boolean stillActive, Date creationTime, String description) {
		super();
		this.positionId = positionId;
		this.stillActive = stillActive;
		this.creationTime = creationTime;
		this.description = description;
	}

}
