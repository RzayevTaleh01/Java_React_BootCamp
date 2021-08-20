package HRMSDemo.hrms.dataAccess.abstracts;

import HRMSDemo.hrms.entities.concretes.SystemPersonal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemPersonalDao  extends JpaRepository<SystemPersonal,Integer> {
}
