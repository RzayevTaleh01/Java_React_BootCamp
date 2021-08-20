package HRMSDemo.hrms.entities.concretes;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "job_category")
@AllArgsConstructor
@NoArgsConstructor
public class JobCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "category_name")
	private String categoryName;

//	@OneToMany(mappedBy = "job_category")
//	private List<Employee> employees;
//	@OneToMany(mappedBy = "job_category")
//	private List<Jobs> jobs;
}
