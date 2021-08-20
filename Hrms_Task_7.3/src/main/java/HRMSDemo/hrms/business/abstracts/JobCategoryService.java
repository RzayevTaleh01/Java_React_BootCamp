package HRMSDemo.hrms.business.abstracts;

import java.util.List;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.JobCategory;

public interface JobCategoryService {
	DataResult<List<JobCategory>> getAll();
	Result add(JobCategory jobCategory);
}
