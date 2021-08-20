package HRMSDemo.hrms.business.concretes;

import java.util.List;

import HRMSDemo.hrms.business.abstracts.CityService;
import HRMSDemo.hrms.dataAccess.abstracts.CityDao;
import HRMSDemo.hrms.entities.concretes.Cities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.core.utilities.results.SuccessResult;
import HRMSDemo.hrms.dataAccess.abstracts.JobCategoryDao;
import HRMSDemo.hrms.entities.concretes.JobCategory;
@Service
public class CityManager implements CityService {
    private CityDao cityDao;

    @Autowired
    public CityManager(CityDao cityDao) {
        super();
        this.cityDao = cityDao;
    }


    @Override
    public DataResult<List<Cities>> getAll() {

        return new SuccessDataResult<List<Cities>>
                (this.cityDao.findAll(),"Data listelendi");
    }


    @Override
    public Result add(Cities cities) {
        this.cityDao.save(cities);
        return new SuccessResult("Ürün eklendi");
    }

}
