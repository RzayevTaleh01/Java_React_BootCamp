package HRMSDemo.hrms.dataAccess.abstracts;

import HRMSDemo.hrms.entities.concretes.SystemRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemRoleDao extends JpaRepository<SystemRole,Integer> {

}
