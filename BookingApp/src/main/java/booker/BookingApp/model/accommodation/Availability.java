package booker.BookingApp.model.accommodation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity @JsonIgnoreProperties(value= {"accommodation"})
public @Data @AllArgsConstructor @NoArgsConstructor class Availability {
    @Id
    private Long id;
    private Date startDate;
    private Date endDate;
    @ManyToOne
    @JoinColumn(name = "accommodation_id")
    private Accommodation accommodation;
}
