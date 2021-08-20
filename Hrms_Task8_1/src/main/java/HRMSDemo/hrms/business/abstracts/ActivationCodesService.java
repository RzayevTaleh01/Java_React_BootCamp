package HRMSDemo.hrms.business.abstracts;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.ActivationCodes;

import java.util.List;

public interface ActivationCodesService {
    DataResult<List<ActivationCodes>> getAll();
    Result add(ActivationCodes activationCodes);
    DataResult<ActivationCodes> getById(int id);
    DataResult<ActivationCodes> getByUserId(int userId);
}
