package HRMSDemo.hrms.dataAccess.abstracts;

import HRMSDemo.hrms.entities.concretes.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobsDao extends JpaRepository<Jobs,Integer> {
}
