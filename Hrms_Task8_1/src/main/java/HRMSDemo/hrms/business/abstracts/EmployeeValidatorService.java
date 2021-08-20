package HRMSDemo.hrms.business.abstracts;

import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.Employee;

import java.rmi.RemoteException;

public interface EmployeeValidatorService <T extends Employee>{
    Result validate(T t) throws RemoteException;
}
