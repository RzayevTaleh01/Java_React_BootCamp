package HRMSDemo.hrms.business.concretes;

import HRMSDemo.hrms.business.abstracts.JobsService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.core.utilities.results.SuccessResult;
import HRMSDemo.hrms.dataAccess.abstracts.JobsDao;
import HRMSDemo.hrms.entities.concretes.Jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobsManager implements JobsService {
    private JobsDao jobsDao;

    @Autowired
    public JobsManager(JobsDao jobsDao) {
        super();
        this.jobsDao=jobsDao;
    }

    @Override
    public DataResult<List<Jobs>> getAll() {
        return new SuccessDataResult<List<Jobs>>(
                this.jobsDao.findAll(),"Data Listelendi"
        );
    }



    @Override
    public Result add(Jobs jobs) {
        this.jobsDao.save(jobs);
        return new SuccessResult("Urun Eklendi");
    }
}
