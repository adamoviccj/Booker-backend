package booker.BookingApp.model.base;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
    @Id
    @GeneratedValue
    private Long id;

    @CreatedDate
    @Column(name = "created_at_date", nullable = false, updatable = false)
    private LocalDateTime createdAtDate;

    @LastModifiedDate
    @Column(name = "last_modified_date",insertable = false)
    private LocalDateTime lastModifiedDate;

    @CreatedBy
    @Column(name="created_by", nullable = false, updatable = false)
    private String createdBy;
    @LastModifiedBy
    @Column(name="last_modified_by", nullable = false, updatable = false)
    private String lastModifiedBy;

}
