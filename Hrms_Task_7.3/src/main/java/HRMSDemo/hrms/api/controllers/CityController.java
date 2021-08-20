package HRMSDemo.hrms.api.controllers;

import java.util.List;

import HRMSDemo.hrms.business.abstracts.CityService;
import HRMSDemo.hrms.entities.concretes.Cities;
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
@RequestMapping("/api/cities")
public class CityController {

    private CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        super();
        this.cityService = cityService;
    }

    @GetMapping("/getall")
    public DataResult<List<Cities>> getAll(){
        return this.cityService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Cities cities) {
        return this.cityService.add(cities);
    }

}
