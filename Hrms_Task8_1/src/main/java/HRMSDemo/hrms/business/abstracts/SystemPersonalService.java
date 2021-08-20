package HRMSDemo.hrms.business.abstracts;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.SystemPersonal;
import HRMSDemo.hrms.entities.concretes.SystemRole;

import java.util.List;

public interface SystemPersonalService {
    DataResult<List<SystemPersonal>> getAll();
    Result add(SystemPersonal systemPersonal);
}
