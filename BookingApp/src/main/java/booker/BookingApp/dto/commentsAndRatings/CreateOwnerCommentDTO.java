package booker.BookingApp.dto.commentsAndRatings;

import booker.BookingApp.model.commentsAndRatings.OwnerComment;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;

public @Data class CreateOwnerCommentDTO {
    @NotNull
    private String ownerId;
    @NotNull
    private String guestId;
    @NotEmpty
    private String content;
    @Min(1) @Max(5)
    private double rating;
//    private Date date;

    public CreateOwnerCommentDTO() {
    }

    public CreateOwnerCommentDTO(OwnerComment ownerComment) {
        this(ownerComment.getOwnerId(), ownerComment.getGuestId(), ownerComment.getContent(), ownerComment.getRating());
    }

    public CreateOwnerCommentDTO(String ownerId, String guestId, String content, double rating) {
        this.ownerId = ownerId;
        this.guestId = guestId;
        this.content = content;
        this.rating = rating;
    }
}
