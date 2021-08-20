package HRMSDemo.hrms.business.concretes;

import HRMSDemo.hrms.business.abstracts.JobsService;
import HRMSDemo.hrms.core.utilities.results.*;
import HRMSDemo.hrms.dataAccess.abstracts.JobsDao;
import HRMSDemo.hrms.entities.concretes.Jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
    public Result update(Jobs jobs) {
        this.jobsDao.save(jobs);
        return new SuccessResult("İş Arayan Güncellendi");
    }


    @Override
    public Result delete(int id) {
        this.jobsDao.deleteById(id);
        return new SuccessResult("İş Arayan Silindi");
    }




    @Override
    public DataResult<List<Jobs>> getByEmployer_EmployerId(int id) {
        return new SuccessDataResult<List<Jobs>>
                (this.jobsDao.getByEmployer_EmployerId(id));
    }


    @Override
    public Result add(Jobs jobs) {
        if (!CheckField(jobs)) {
            return new ErrorResult("You have entered missing information. Please fill in all fields.");  //Eksik bilgi girdiniz. lütfen bütün boşlukları doldurun
        }
        this.jobsDao.save(jobs);
        return new SuccessResult("Urun Eklendi");
    }

    @Override
    public DataResult<Jobs> getByJobName(String jobName) {
        return new SuccessDataResult<Jobs>(
                this.jobsDao.getByJobName(jobName),"Data Listelendi");
    }


    @Override
    public DataResult<List<Jobs>> getByJobCategoryIdIn(List<Integer> jobCategories) {
        return new SuccessDataResult<List<Jobs>>(
                this.jobsDao.getByJobCategory_JobCategoryIdIn(jobCategories),"Data Listelendi");
    }
    @Override
    public DataResult<List<Jobs>> getByEmployer_CompanyNameIn(List<String> employers) {
        return new SuccessDataResult<List<Jobs>>
                (this.jobsDao.getByEmployer_CompanyNameIn(employers),"Data Listelendi");
    }

    @Override
    public DataResult<List<Jobs>> getByJobNameContains(String jobName) {
        return new SuccessDataResult<List<Jobs>>(
                this.jobsDao.getByJobNameContains(jobName),"Data Listelendi");
    }

    @Override
    public DataResult<List<Jobs>> getByJobNameStartingWith(String jobName) {
        return new SuccessDataResult<List<Jobs>>(
                this.jobsDao.getByJobNameStartingWith(jobName),"Data Listelendi");
    }

    @Override
    public DataResult<List<Jobs>> getByNameAndIsActive(String jobName, boolean isActive) {
        return new SuccessDataResult<List<Jobs>>
                (this.jobsDao.getByNameAndIsActive(jobName,isActive),"Data Listelendi");
    }

    @Override
    public DataResult<List<Jobs>> findByIsActiveTrue() {
        return new SuccessDataResult<List<Jobs>>
                (this.jobsDao.findByIsActiveTrue(),"Bütün aktiv iş elanları listələndi");
    }

    @Override
    public DataResult<List<Jobs>> findByIsActiveTrueAndCreatedDate(Date createdDate) {
        return new SuccessDataResult<List<Jobs>>
                (this.jobsDao.findByIsActiveTrueAndCreatedDate(createdDate),"Tarixə görə yerləşdirilmiş elanlar");
    }




    private boolean CheckField(Jobs jobs) {
        if (jobs.getJobName() != null && jobs.getJobTitle() != null && jobs.getCities() != null
                && jobs.getVacancyNum() != 0 && jobs.getJobCategory() != null) {
            return true;
        }
        return false;
    }
    @Override
    public DataResult<Jobs> changeStatus(int employerId,int jobsId, boolean isActive) {

        List<Jobs> jobscheck = this.jobsDao.getByEmployer_EmployerId(employerId);

        for (Jobs jobs : jobscheck) {
            if (jobsId == jobs.getJobsId()) {
                jobs.setActive(isActive);
                this.jobsDao.save(jobs);
                return new SuccessDataResult<Jobs>(this.jobsDao.getByJobsId(jobsId));
            }
        }

        return new ErrorDataResult<Jobs>();
    }



}
