package HRMSDemo.hrms.business.abstracts;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.Employer;
import HRMSDemo.hrms.entities.concretes.Jobs;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface JobsService {
    DataResult<List<Jobs>> getAll();
    Result add(Jobs jobs);
    DataResult<Jobs> getByJobName(String jobName);
    Result update(Jobs jobs);
    Result delete(int id);
    DataResult<List<Jobs>> getByEmployer_EmployerId(int id);
    DataResult<Jobs> changeStatus(int employerId,int jobsId, boolean isActive);
    DataResult<List<Jobs>> getByJobCategoryIdIn(List<Integer> jobCategories);//Kategoriya görə axtarır
    DataResult<List<Jobs>> getByJobNameContains(String jobName);//İşin adına görə axtarır
    DataResult<List<Jobs>> getByJobNameStartingWith(String jobName);//Verilmiş adla başlayanları axtarır
    DataResult<List<Jobs>> getByNameAndIsActive(String jobName, boolean isActive);//verilmiş ad və onun aktivliyinə görə sorğu aparır
    DataResult<List<Jobs>> findByIsActiveTrue();//Sistemdeki aktiv is elanlarini cek
    DataResult<List<Jobs>> findByIsActiveTrueAndCreatedDate(Date createdDate);//Sistemdəki aktiv iş elanlarını verilmiş tarixə görə axtarır
    DataResult<List<Jobs>> getByEmployer_CompanyNameIn(List<String> employers);//Employere görə Elan axtarır








//    DataResult<Jobs> updateActive(int id, boolean active);


//    DataResult<List<Jobs>> findByActiveTrue();
//    DataResult<List<Jobs>> findByEmployerAndActiveTrue(String companyName);
//    DataResult<List<Jobs>> findByActiveTrueOrdOrderByCreatedDate();
//    DataResult<Jobs> findByIdAndActiveTrue(int id);
}
