package HRMSDemo.hrms.business.abstracts;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.Jobs;

import java.util.List;

public interface JobsService {
    DataResult<List<Jobs>> getAll();
    Result add(Jobs jobs);
}
