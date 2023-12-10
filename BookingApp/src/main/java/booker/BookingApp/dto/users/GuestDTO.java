package booker.BookingApp.dto.users;

import booker.BookingApp.enums.Role;
import booker.BookingApp.model.users.Guest;
import booker.BookingApp.model.users.ProfilePicture;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class GuestDTO extends UserDTO{
    private boolean reported;
    private boolean blocked;
    private boolean deleted;
    private ArrayList<Long> favouriteAccommodations;
    private String password;

    public GuestDTO(Long id, String name, String surname, String email, String address, String phone,
                    Role role, ProfilePicture profilePicture, boolean reported, boolean blocked,
                    boolean deleted, ArrayList<Long> favouriteAccommodations, String password){
        super(id, name, surname, email, address, phone, role, profilePicture);
        this.reported = reported;
        this.blocked = blocked;
        this.deleted = deleted;
        this.favouriteAccommodations = favouriteAccommodations;
        this.password = password;
    }

    public static GuestDTO makeFromGuest(Guest guest){
        return new GuestDTO(guest.getId(), guest.getName(), guest.getSurname(),
                guest.getEmail(), guest.getAddress(), guest.getPhone(),
                guest.getRole(), guest.getProfilePicture(), guest.isReported(), guest.isBlocked(),
                guest.isDeleted(), guest.getFavouriteAccommodations(), guest.getPassword());
    }


}
