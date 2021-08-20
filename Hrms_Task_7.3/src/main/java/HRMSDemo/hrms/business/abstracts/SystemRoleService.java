package HRMSDemo.hrms.business.abstracts;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.SystemRole;

import java.util.List;

public interface SystemRoleService {
    DataResult<List<SystemRole>> getAll();
    Result add(SystemRole systemRole);
}
