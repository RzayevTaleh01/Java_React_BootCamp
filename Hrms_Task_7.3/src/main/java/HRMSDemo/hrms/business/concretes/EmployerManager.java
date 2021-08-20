package HRMSDemo.hrms.business.concretes;

import java.util.List;

import HRMSDemo.hrms.business.abstracts.CityService;
import HRMSDemo.hrms.business.abstracts.EmployerService;
import HRMSDemo.hrms.dataAccess.abstracts.CityDao;
import HRMSDemo.hrms.dataAccess.abstracts.EmployerDao;
import HRMSDemo.hrms.entities.concretes.Cities;
import HRMSDemo.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.core.utilities.results.SuccessResult;
import HRMSDemo.hrms.dataAccess.abstracts.JobCategoryDao;
import HRMSDemo.hrms.entities.concretes.JobCategory;
@Service
public class EmployerManager implements EmployerService {
    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao) {
        super();
        this.employerDao = employerDao;
    }


    @Override
    public DataResult<List<Employer>> getAll() {

        return new SuccessDataResult<List<Employer>>
                (this.employerDao.findAll(),"Data listelendi");
    }


    @Override
    public Result add(Employer employer) {
        this.employerDao.save(employer);
        return new SuccessResult("Ürün eklendi");
    }

}
