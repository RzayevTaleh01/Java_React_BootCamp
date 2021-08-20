package HRMSDemo.hrms.business.concretes;

import HRMSDemo.hrms.business.abstracts.SystemPersonalService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.core.utilities.results.SuccessResult;
import HRMSDemo.hrms.dataAccess.abstracts.SystemPersonalDao;
import HRMSDemo.hrms.entities.concretes.SystemPersonal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemPersonalManager implements SystemPersonalService {

    private SystemPersonalDao systemPersonalDao;

    @Autowired
    public SystemPersonalManager(SystemPersonalDao systemPersonalDao) {
        super();
        this.systemPersonalDao=systemPersonalDao;
    }

    @Override
    public DataResult<List<SystemPersonal>> getAll() {
        return new SuccessDataResult<List<SystemPersonal>>(
                this.systemPersonalDao.findAll(),"Data Listelendi"
        );
    }

    @Override
    public Result add(SystemPersonal systemPersonal) {
        this.systemPersonalDao.save(systemPersonal);
        return new SuccessResult("Urun Eklendi");
    }
}
