package HRMSDemo.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "jobs")
public class Jobs {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

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

    @Column(name = "is_active")
    private boolean isActive;
//
//    @ManyToOne()
//    @JoinColumn(name = "job_category")
//    private JobCategory jobCategory;
//
//    @ManyToOne()
//    @JoinColumn(name = "cities")
//    private Cities cities;

}
