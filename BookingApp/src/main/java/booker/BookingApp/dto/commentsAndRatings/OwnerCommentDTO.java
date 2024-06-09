package booker.BookingApp.dto.commentsAndRatings;

import booker.BookingApp.model.commentsAndRatings.OwnerComment;
//import booker.BookingApp.model.users.ProfilePicture;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public @Data class OwnerCommentDTO {
    private Long id;
    @NotNull
    private String ownerId;
    @NotNull
    private String guestId;
//    @NotEmpty
//    private String guestName;
//    @NotEmpty
//    private String guestSurname;
//    private ProfilePicture guestProfilePicture;
    @NotEmpty
    private String content;
    @Min(0)
    private double rating;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private boolean reported;
    private boolean deleted;
    private boolean approved;

    public OwnerCommentDTO() {
    }

    public OwnerCommentDTO(OwnerComment ownerComment) {
        this(ownerComment.getId(), ownerComment.getOwnerId(), ownerComment.getGuestId() ,ownerComment.getContent(), ownerComment.getRating(),ownerComment.getDate(), ownerComment.isReported(), ownerComment.isDeleted(), ownerComment.isApproved());
    }

    public OwnerCommentDTO(Long id, String ownerId, String guestId,String content, double rating,Date date, boolean reported, boolean deleted, boolean approved) {
        this.id = id;
        this.ownerId = ownerId;
        this.guestId = guestId;
        this.content = content;
        this.rating = rating;
        this.date = date;
        this.reported = reported;
        this.deleted = deleted;
        this.approved = approved;
    }

    public static OwnerCommentDTO createFromOwnerComment(OwnerComment ownerComment) {
        return new OwnerCommentDTO(ownerComment.getId(),
                ownerComment.getOwnerId(),
                ownerComment.getGuestId(),
//                ownerComment.getGuest().getName(),
//                ownerComment.getGuest().getSurname(),
//                ownerComment.getGuest().getProfilePicture(),
                ownerComment.getContent(),
                ownerComment.getRating(),
                ownerComment.getDate(),
                ownerComment.isReported(),
                ownerComment.isDeleted(),
                ownerComment.isApproved());
    }
}
