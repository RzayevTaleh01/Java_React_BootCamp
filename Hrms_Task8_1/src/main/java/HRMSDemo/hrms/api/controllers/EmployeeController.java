package HRMSDemo.hrms.api.controllers;

import HRMSDemo.hrms.business.abstracts.EmployeeService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.Employee;
import HRMSDemo.hrms.entities.concretes.JobCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        super();
        this.employeeService=employeeService;
    }
    @GetMapping("/getall")
    public DataResult<List<Employee>> getAll(){
        return this.employeeService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Employee employee) {
        return this.employeeService.add(employee);
    }

}
