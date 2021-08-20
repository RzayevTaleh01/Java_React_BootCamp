package HRMSDemo.hrms.business.concretes;

import HRMSDemo.hrms.business.abstracts.ActivationCodesService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.core.utilities.results.SuccessResult;
import HRMSDemo.hrms.dataAccess.abstracts.ActivationCodesDao;
import HRMSDemo.hrms.entities.concretes.ActivationCodes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ActivationCodesManager implements ActivationCodesService {

    private ActivationCodesDao activationCodesDao;


    @Autowired
    public ActivationCodesManager(ActivationCodesDao activationCodesDao) {
        super();
        this.activationCodesDao = activationCodesDao;
    }


    @Override
    public DataResult<List<ActivationCodes>> getAll() {
        return new SuccessDataResult<List<ActivationCodes>>(this.activationCodesDao.findAll());
    }

    @Override
    public Result add(ActivationCodes activationCodes) {
        this.activationCodesDao.save(activationCodes);
        return new SuccessResult();
    }

    @Override
    public DataResult<ActivationCodes> getById(int id) {
        return new SuccessDataResult<ActivationCodes>(this.activationCodesDao.getOne(id));
    }

    @Override
    public DataResult<ActivationCodes> getByUserId(int userId) {
        return new SuccessDataResult<ActivationCodes>(this.activationCodesDao.getByUserId(userId));
    }
}
