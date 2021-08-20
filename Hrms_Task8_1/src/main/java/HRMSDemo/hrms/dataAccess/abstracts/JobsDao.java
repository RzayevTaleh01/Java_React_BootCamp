package HRMSDemo.hrms.dataAccess.abstracts;

import HRMSDemo.hrms.entities.concretes.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface JobsDao extends JpaRepository<Jobs,Integer> {
    Jobs getByJobName(String jobName);
    List<Jobs> getByEmployer_EmployerId(int id);
    Jobs getByJobsId(int id);
    List<Jobs> getByJobCategory_JobCategoryIdIn(List<Integer> jobCategories);//Kategoriya görə axtarır
    List<Jobs> getByJobNameContains(String jobName);//İşin adına görə axtarır
    List<Jobs> getByJobNameStartingWith(String jobName);//Verilmiş adla başlayanları axtarır
    List<Jobs> findByIsActiveTrue();//Aktiv is elanlarini secir
    @Query("From Jobs where jobName=:jobName and isActive=:isActive")
    List<Jobs> getByNameAndIsActive(String jobName, boolean isActive);
    List<Jobs> findByIsActiveTrueAndCreatedDate(Date createdDate);//Sistemdəki aktiv iş elanlarını verilmiş tarixə görə axtarır
    List<Jobs> getByEmployer_CompanyNameIn(List<String> employers);//Employere görə Elan axtarır
}
