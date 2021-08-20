package HRMSDemo.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMSDemo.hrms.business.abstracts.JobCategoryService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.core.utilities.results.SuccessResult;
import HRMSDemo.hrms.dataAccess.abstracts.JobCategoryDao;
import HRMSDemo.hrms.entities.concretes.JobCategory;
@Service
public class JobCategoryManager implements JobCategoryService {
	private JobCategoryDao jobCategoryDao;
	
	@Autowired
	public JobCategoryManager(JobCategoryDao jobCategoryDao) {
		super();
		this.jobCategoryDao = jobCategoryDao;
	}
	

	@Override
	public DataResult<List<JobCategory>> getAll() {

		return new SuccessDataResult<List<JobCategory>>
		(this.jobCategoryDao.findAll(),"Data listelendi");
		}


	@Override
	public Result add(JobCategory jobCategory) {
		this.jobCategoryDao.save(jobCategory);
		return new SuccessResult("Ürün eklendi");
	}

}
