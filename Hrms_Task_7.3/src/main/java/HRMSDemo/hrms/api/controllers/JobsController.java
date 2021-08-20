package HRMSDemo.hrms.api.controllers;

import java.util.List;

import HRMSDemo.hrms.business.abstracts.JobsService;
import HRMSDemo.hrms.entities.concretes.Jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.DataResult;


@RestController
@RequestMapping("/api/jobs")
public class JobsController {

    private JobsService jobsService;

    @Autowired
    public JobsController(JobsService jobsService) {
        super();
        this.jobsService = jobsService;
    }

    @GetMapping("/getall")
    public DataResult<List<Jobs>> getAll(){
        return this.jobsService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Jobs jobs) {
        return this.jobsService.add(jobs);
    }

}
