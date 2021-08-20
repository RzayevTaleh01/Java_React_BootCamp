package HRMSDemo.hrms.api.controllers;

import HRMSDemo.hrms.business.abstracts.SystemPersonalService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.SystemPersonal;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/system_personal")
public class SystemPersonalController {
    private SystemPersonalService systemPersonalService;

    @Autowired
    public SystemPersonalController(SystemPersonalService systemPersonalService) {
        super();
        this.systemPersonalService=systemPersonalService;
    }
    @GetMapping("/getAll")
    public DataResult<List<SystemPersonal>> getAll(){return this.systemPersonalService.getAll();}
    @PostMapping("/add")
    public Result add(@RequestBody SystemPersonal systemPersonal){
        return this.systemPersonalService.add(systemPersonal);
    }
}
