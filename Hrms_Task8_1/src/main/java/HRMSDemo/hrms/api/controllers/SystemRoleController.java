package HRMSDemo.hrms.api.controllers;

import HRMSDemo.hrms.business.abstracts.SystemRoleService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.SystemRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/system_role")
public class SystemRoleController {
    private SystemRoleService systemRoleService;

    @Autowired
    public SystemRoleController(SystemRoleService systemRoleService) {
        super();
        this.systemRoleService=systemRoleService;
    }

    @GetMapping("/getAll")
    public DataResult<List<SystemRole>> getAll(){
        return this.systemRoleService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody SystemRole systemRole){
        return this.systemRoleService.add(systemRole);
    }
}
