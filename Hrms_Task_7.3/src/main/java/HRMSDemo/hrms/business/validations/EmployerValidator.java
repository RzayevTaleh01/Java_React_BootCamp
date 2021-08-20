package HRMSDemo.hrms.business.validations;

import HRMSDemo.hrms.business.abstracts.EmployerValidatorService;
import HRMSDemo.hrms.core.RegexEmailChecker;
import HRMSDemo.hrms.core.utilities.results.ErrorResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessResult;
import HRMSDemo.hrms.entities.concretes.Employer;
import org.springframework.stereotype.Component;

import java.rmi.RemoteException;
@Component("EmployerV")
public class EmployerValidator implements EmployerValidatorService<Employer> {

    @Override
    public Result validate(Employer employer) throws RemoteException {
        if (!RegexEmailChecker.match(employer.getEmail())) {
            return new ErrorResult("E-mail, e-mail formatında olmalıdır.");
        }


        String[] splitStringArr1 = employer.getEmail().split("@");
        String[] splitStringArr2 = employer.getWebsite().split("\\.");


        if( !splitStringArr1[1].equals(splitStringArr2[1] + "." + splitStringArr2[2]) ) {
            return new ErrorResult("E-mail domain'i ilə web sitesi domain'i aynı olmalıdır.");
        }


        System.out.println(splitStringArr1[0] + " " + splitStringArr1[1]);

        System.out.println(splitStringArr2[0] + " " + splitStringArr2[1] + " " + splitStringArr2[2]);

        System.out.println(String.format("%s %s", splitStringArr1[0], splitStringArr1[1]));

        return new SuccessResult();

    }
}
