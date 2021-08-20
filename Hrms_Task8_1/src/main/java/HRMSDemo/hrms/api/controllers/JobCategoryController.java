package HRMSDemo.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMSDemo.hrms.business.abstracts.JobCategoryService;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.entities.concretes.JobCategory;


@RestController
@RequestMapping("/api/job_category")
public class JobCategoryController {
	
	private JobCategoryService jobCategoryService;

	@Autowired
	public JobCategoryController(JobCategoryService jobCategoryService) {
		super();
		this.jobCategoryService = jobCategoryService;
	}

	@GetMapping("/getall")
	public DataResult<List<JobCategory>> getAll(){
		return this.jobCategoryService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobCategory jobCategory) {
		return this.jobCategoryService.add(jobCategory);
	}

}
