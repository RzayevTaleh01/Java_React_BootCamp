package HRMSDemo.hrms.api.controllers;

import java.util.Date;
import java.util.List;

import HRMSDemo.hrms.business.abstracts.JobsService;
import HRMSDemo.hrms.entities.concretes.Jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/update")
    public Result update(@RequestBody Jobs jobs) {
        return this.jobsService.update(jobs);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody int id) {
        return this.jobsService.delete(id);
    }

    @GetMapping("/changeStatus")
    public DataResult<Jobs> changeStatus(@RequestParam int employerId,@RequestParam int jobsId,@RequestParam boolean isActive) {
        return this.jobsService.changeStatus(employerId,jobsId,isActive);
    }


    @GetMapping("/getByJobName")
    public DataResult<Jobs> getByJobName(@RequestParam String jobName){
        return this.jobsService.getByJobName(jobName);
    }

    @GetMapping("/getByJobNameContains")
    public DataResult<List<Jobs>> getByJobNameContains(@RequestParam String jobName){
        return this.jobsService.getByJobNameContains(jobName);
    }

    @GetMapping("/getByJobNameStartingWith")
    public DataResult<List<Jobs>> getByJobNameStartingWith(@RequestParam String jobName){
        return this.jobsService.getByJobNameStartingWith(jobName);
    }
    @GetMapping("/getByJobCategoryIdIn")
    public DataResult<List<Jobs>> getByJobCategoryIdIn(@RequestParam List<Integer> jobCategories){
        return this.jobsService.getByJobCategoryIdIn(jobCategories);
    }

    @GetMapping("/getByEmployer_CompanyNameIn")
    public DataResult<List<Jobs>> getByEmployer_CompanyNameIn(@RequestParam List<String> employers){
        return this.jobsService.getByEmployer_CompanyNameIn(employers);
    }

    @GetMapping("/getByNameAndEmployer")
    public DataResult<List<Jobs>> getByNameAndEmployer(@RequestParam String jobName,boolean isActive){
        return this.jobsService.getByNameAndIsActive(jobName,isActive);
    }
    @GetMapping("/findByIsActiveTrue")
    public DataResult<List<Jobs>> findByIsActiveTrue(){
        return this.jobsService.findByIsActiveTrue();
    }
    @GetMapping("/findByIsActiveTrueAndCreatedDate")
    public DataResult<List<Jobs>> findByIsActiveTrueAndCreatedDate(@RequestParam Date createdDate){
        return this.jobsService.findByIsActiveTrueAndCreatedDate(createdDate);
    }



}
