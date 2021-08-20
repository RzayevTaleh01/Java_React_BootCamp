package HRMSDemo.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "jobs")
public class Jobs {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int jobsId;

    @Column(name = "job_name")
    private String jobName;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "min_salary")
    private int minSalary;

    @Column(name = "max_salary")
    private int maxSalary;

    @Column(name = "date_end")
    private String dateEnd;
    @Column(name = "created_date")
    private LocalDateTime createdDate = LocalDateTime.now();
    @Column(name = "vacancy_num")
    private int vacancyNum;

    @Column(name = "is_active")
    private boolean isActive;

    @ManyToOne()
    @JoinColumn(name = "job_cat_id")
    private JobCategory jobCategory;

    @ManyToOne()
    @JoinColumn(name = "job_city_id")
    private Cities cities;

    @ManyToOne()
    @JoinColumn(name = "employer_id")
    private  Employer employer;

}
