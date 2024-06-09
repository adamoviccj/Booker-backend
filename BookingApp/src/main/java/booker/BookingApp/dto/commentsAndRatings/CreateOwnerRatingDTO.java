package booker.BookingApp.dto.commentsAndRatings;

import booker.BookingApp.model.commentsAndRatings.OwnerRating;
//import booker.BookingApp.model.users.Owner;
import lombok.Data;

import java.util.Date;

public @Data class CreateOwnerRatingDTO {
    private String ownerId;
    private String guestId;
    private float rate;
//    private Date date;

    public CreateOwnerRatingDTO() {
    }

    public CreateOwnerRatingDTO(OwnerRating ownerRating) {
        this(ownerRating.getOwnerId(), ownerRating.getGuestId(), ownerRating.getRate());
    }

    public CreateOwnerRatingDTO(String ownerId, String guestId, float rate) {
        this.ownerId = ownerId;
        this.guestId = guestId;
        this.rate = rate;
    }
}
