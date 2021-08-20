package HRMSDemo.hrms.api.controllers;

import HRMSDemo.hrms.business.abstracts.ActivationCodesService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.ActivationCodes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/activation-codes")
public class ActivationCodesController {

    private ActivationCodesService activationCodesService;

    @Autowired
    public ActivationCodesController(ActivationCodesService activationCodesService) {
        super();
        this.activationCodesService = activationCodesService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody ActivationCodes activationCodes){
        return this.activationCodesService.add(activationCodes);
    }



    @GetMapping("/getByUserId")
    DataResult<ActivationCodes> geteByUserId(int userId){
        return this.activationCodesService.getByUserId(userId);
    }

}