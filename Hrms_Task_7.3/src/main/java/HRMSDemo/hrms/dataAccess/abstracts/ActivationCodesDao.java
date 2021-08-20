package HRMSDemo.hrms.dataAccess.abstracts;

import HRMSDemo.hrms.entities.concretes.ActivationCodes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivationCodesDao extends JpaRepository<ActivationCodes,Integer> {

    ActivationCodes getByUserId(int userId);

}
