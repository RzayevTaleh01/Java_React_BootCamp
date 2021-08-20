package HRMSDemo.hrms.dataAccess.abstracts;

import HRMSDemo.hrms.entities.concretes.Cities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<Cities,Integer> {

}
