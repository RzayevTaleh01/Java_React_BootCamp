package HRMSDemo.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "activation_codes")
@AllArgsConstructor
@NoArgsConstructor
public class ActivationCodes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "activation_code")
    private String activationCode;

    @Column(name = "is_verified")
    private boolean isVerified = false;

    @Column(name = "confirmed_date_time")
    private LocalDateTime confirmDateTime;

    @Column(name = "created_date_time")
    private LocalDateTime createdDateTime = LocalDateTime.now();


    @Column(name = "expiration_date_time")
    private LocalDateTime expirationDateTime = LocalDateTime.now().plusHours(24);

    @Column(name = "user_id")
    private int userId;
}
