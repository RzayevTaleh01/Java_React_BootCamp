package HRMSDemo.hrms.business.concretes;

import HRMSDemo.hrms.business.abstracts.SystemRoleService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.core.utilities.results.SuccessResult;
import HRMSDemo.hrms.dataAccess.abstracts.SystemRoleDao;
import HRMSDemo.hrms.entities.concretes.SystemRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SystemRoleManager implements SystemRoleService {

    private SystemRoleDao systemRoleDao;

    @Autowired
    public SystemRoleManager(SystemRoleDao systemRoleDao) {
        super();
        this.systemRoleDao=systemRoleDao;
    }

    @Override
    public DataResult<List<SystemRole>> getAll() {
        return new SuccessDataResult<List<SystemRole>>
                (this.systemRoleDao.findAll(),"Data Lisstelendi");
    }

    @Override
    public Result add(SystemRole systemRole) {
        this.systemRoleDao.save(systemRole);
        return new SuccessResult("Urun Eklendi");
    }
}
