package pl.pw.predict.app.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Setter
@Getter
@ToString(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID",nullable = false)
    private Integer id;
    @Column(name = "CREATION_DATE",nullable = false)
    private LocalDateTime creationDate;
    @Column(name = "LAST_MODIFICATION_DATE",nullable = false)
    private LocalDateTime lastModificationDate;

}
