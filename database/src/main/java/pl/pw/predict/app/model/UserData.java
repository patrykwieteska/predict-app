package pl.pw.predict.app.model;

import lombok.*;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;

@Data
@Setter
@Getter
@ToString(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Table(name = "USER_DATA")
public class UserData extends BaseEntity{

    @Column(name = "USERNAME", nullable = false)
    private String username;
    @Column(name = "USER_PASS", nullable = false)
    private String userPass;
    @Column(name="EMAIL_ADDRESS",nullable = false)
    private String email;
    @Column(name="IS_ACTIVE", nullable = false)
    private Boolean isActive;
}
