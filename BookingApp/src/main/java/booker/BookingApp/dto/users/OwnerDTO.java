package booker.BookingApp.dto.users;

import booker.BookingApp.enums.Role;
import booker.BookingApp.model.commentsAndRatings.OwnerComment;
import booker.BookingApp.model.commentsAndRatings.OwnerRating;
import booker.BookingApp.model.users.Owner;
import booker.BookingApp.model.users.ProfilePicture;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class OwnerDTO extends UserDTO {
    private boolean reported;
    private boolean blocked;
    private boolean deleted;
    private ArrayList<OwnerRating> ratings;
    private ArrayList<OwnerComment> comments;
    private String password;

    public OwnerDTO(Long id, String name, String surname, String email, String address,
                    String phone, Role role, ProfilePicture profilePicture, boolean reported, boolean blocked,
                    boolean deleted, ArrayList<OwnerRating> ratings, ArrayList<OwnerComment> comments, String password){
        super(id, name, surname, email, address, phone, role, profilePicture);
        this.reported = reported;
        this.blocked = blocked;
        this.deleted = deleted;
        this.ratings = ratings;
        this.comments = comments;
        this.password = password;
    }

    public static OwnerDTO makeFromOwner(Owner owner){
        return new OwnerDTO(owner.getId(), owner.getName(), owner.getSurname(), owner.getEmail(),
                owner.getAddress(), owner.getPhone(), owner.getRole(), owner.getProfilePicture(),
                owner.isReported(), owner.isBlocked(), owner.isDeleted(), owner.getRatings(),
                owner.getComments(), owner.getPassword());
    }
}
