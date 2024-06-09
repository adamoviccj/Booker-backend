package booker.BookingApp.model.commentsAndRatings;

import booker.BookingApp.model.base.BaseEntity;
//import booker.BookingApp.model.users.Owner;
//import booker.BookingApp.model.users.Owner;
//import booker.BookingApp.model.users.User;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OwnerRating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "owner")
//    private Owner owner;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "guest")
//    private User guest;

    @Column(name = "owner_id")
    private String ownerId;

    @Column(name = "guest_id")
    private String guestId;

    @Column(name = "rate", nullable = false)
    private float rate;

    @Column(name = "date", nullable = false)
    private Date date;
    @Column(name = "reported", nullable = false)
    private boolean reported;
    @Column(name = "deleted", nullable = false)
    private boolean deleted;
}
