package booker.BookingApp.model.requestsAndReservations;

import booker.BookingApp.enums.ReservationRequestStatus;
import booker.BookingApp.model.base.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
@Entity @AllArgsConstructor @NoArgsConstructor
public @Data class ReservationRequest extends BaseEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    @JoinColumn(name = "guest_id")
//    private String guestId;
    @Column(name = "guest_id")
    private String guestId;
    @JoinColumn(name = "accommodation_id")
    private Long accommodationId;
    @JoinColumn(name = "from_date")
    private String fromDate;
    @JoinColumn(name = "to_date")
    private String toDate;
    @JoinColumn(name = "number_of_guests")
    private int numberOfGuests;
    @JoinColumn(name = "status")
    private ReservationRequestStatus status;
    @JoinColumn(name = "deleted")
    private boolean deleted;
    @JoinColumn(name = "price")
    private double price;

    public ReservationRequest(Long id, LocalDateTime createdAtDate, LocalDateTime lastModifiedDate, String createdBy, String lastModifiedBy, Long accommodationId, String fromDate, String toDate, int numberOfGuests, ReservationRequestStatus status, boolean deleted, double price) {
        super(id, createdAtDate, lastModifiedDate, createdBy, lastModifiedBy);
        this.accommodationId = accommodationId;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.numberOfGuests = numberOfGuests;
        this.status = status;
        this.deleted = deleted;
        this.price = price;
    }
}
