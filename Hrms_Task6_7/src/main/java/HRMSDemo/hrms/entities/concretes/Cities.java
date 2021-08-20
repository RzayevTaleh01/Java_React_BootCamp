package HRMSDemo.hrms.entities.concretes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "cities")
@AllArgsConstructor
@NoArgsConstructor
public class Cities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="city_name")
    private String cityName;

//    @OneToMany(mappedBy = "cities")
//    private List<Jobs> jobs;

}