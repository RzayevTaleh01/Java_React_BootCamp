package HRMSDemo.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMSDemo.hrms.entities.concretes.JobCategory;

public interface JobCategoryDao extends JpaRepository<JobCategory,Integer> {

}
