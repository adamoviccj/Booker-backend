package booker.BookingApp.dto.requestsAndReservations;

import booker.BookingApp.enums.ReservationRequestStatus;
import booker.BookingApp.model.base.BaseEntity;
import booker.BookingApp.model.requestsAndReservations.Reservation;
import booker.BookingApp.model.requestsAndReservations.ReservationRequest;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

public @Data @AllArgsConstructor class ReservationRequestDTO {
    private Long id;
    @NotNull
    private String guestId;
    @NotNull
    private Long accommodationId;
    @NotEmpty
    private String fromDate;
    @NotEmpty
    private String toDate;
    @Min(1)
    private int numberOfGuests;
    @NotNull
    private ReservationRequestStatus status;

    private boolean deleted;
    @Min(0)
    private double price;
    private LocalDateTime createdAtDate;
    private LocalDateTime lastModifiedDate;
    private String createdBy;
    private String lastModifiedBy;



    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public static ReservationRequestDTO makeFromRequest(ReservationRequest request){
        ReservationRequestDTO requestDTO = new ReservationRequestDTO(
                request.getId(),
                request.getCreatedBy(),
                request.getAccommodationId(),
                request.getFromDate(),
                request.getToDate(),
                request.getNumberOfGuests(),
                request.getStatus(),
                request.isDeleted(),
                request.getPrice(),
                request.getCreatedAtDate(),
                request.getLastModifiedDate(),
                request.getCreatedBy(),
                request.getLastModifiedBy()
        );
        return  requestDTO;
    }

    public static ReservationRequest makeRequestFromDTO(ReservationRequestDTO requestDTO){
        ReservationRequest request = new ReservationRequest(
                requestDTO.getId(),
                requestDTO.getCreatedAtDate(),
                requestDTO.getLastModifiedDate(),
                requestDTO.getCreatedBy(),
                requestDTO.getLastModifiedBy(),
                requestDTO.getAccommodationId(),
                requestDTO.getFromDate(),
                requestDTO.getToDate(),
                requestDTO.getNumberOfGuests(),
                requestDTO.getStatus(),
                requestDTO.isDeleted(),
                requestDTO.getPrice()

        );
        return  request;
    }
}
