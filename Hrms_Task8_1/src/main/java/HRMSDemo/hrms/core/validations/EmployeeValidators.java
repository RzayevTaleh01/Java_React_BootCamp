package HRMSDemo.hrms.core.validations;

import HRMSDemo.hrms.business.abstracts.EmployeeValidatorService;
import HRMSDemo.hrms.core.RegexEmailChecker;
import HRMSDemo.hrms.core.utilities.results.ErrorResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessResult;
import HRMSDemo.hrms.entities.concretes.Employee;
import org.springframework.stereotype.Component;

import java.rmi.RemoteException;
@Component("EmployeeV")
public class EmployeeValidators implements EmployeeValidatorService<Employee> {
    @Override
    public Result validate(Employee employee) throws RemoteException {
        if (!RegexEmailChecker.match(employee.getEmail())) {
            return new ErrorResult("E-mail, e-mail formatında olmalıdır.");
        }

        return new SuccessResult();

    }
}
