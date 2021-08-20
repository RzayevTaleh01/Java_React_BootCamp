package HRMSDemo.hrms.business.abstracts;

import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.Employer;

import java.rmi.RemoteException;

public interface EmployerValidatorService<T extends Employer> {
    Result validate(T t) throws RemoteException;
}
