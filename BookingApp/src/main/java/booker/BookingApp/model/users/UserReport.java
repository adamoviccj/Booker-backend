package booker.BookingApp.model.users;

import booker.BookingApp.model.base.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
public @Data class UserReport extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name = "reported_id")
//    private Long reportedId;
//
//    @Column(name = "reporter_id")
//    private Long reporterId;
    @Column(name = "reported_id")
    private String reportedId;

    @Column(name = "reporter_id")
    private String reporterId;

    @Column(name = "reason")
    private String reason;

    @Column(name = "date", nullable = false)
    private Date date;
}
