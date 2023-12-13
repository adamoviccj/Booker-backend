package booker.BookingApp.service.implementation;

import booker.BookingApp.dto.accommodation.AccommodationListingDTO;
import booker.BookingApp.dto.users.GuestDTO;
import booker.BookingApp.dto.users.OwnerDTO;
import booker.BookingApp.dto.users.UpdateUserDTO;
import booker.BookingApp.enums.Role;
import booker.BookingApp.model.users.Guest;
import booker.BookingApp.model.users.ProfilePicture;
import booker.BookingApp.model.users.User;
import booker.BookingApp.repository.UserRepository;
import booker.BookingApp.service.interfaces.IGuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class GuestService implements IGuestService {

    @Autowired
    UserRepository userRepository;

    @Override
    public ArrayList<GuestDTO> findAll() {
        List<Guest> guests = userRepository.getAllGuests();
        ArrayList<GuestDTO> dtos = new ArrayList<>();
        for (Guest g : guests){
            dtos.add(GuestDTO.makeFromGuest(g));
        }
        return dtos;
    }

    @Override
    public GuestDTO getGuestById(Long id) {
        Guest g = (Guest) userRepository.getOne(id);
        return GuestDTO.makeFromGuest(g);
    }

    @Override
    public GuestDTO getGuestByEmail(String email) {
        ArrayList<Long> faves = new ArrayList<>();
        faves.add(1L); faves.add(2L);
        ProfilePicture profilePicture = new ProfilePicture(1L, "src/main/resources/images/profile1.png", new User());
        return new GuestDTO(1L, "Pera", "Peric", "pera123@gmail.com", "aaaa", null, null, Role.GUEST, profilePicture, false, false, false, faves);
    }

    @Override
    public GuestDTO insert(GuestDTO guest) {
        return guest;
    }

    @Override
    public GuestDTO update(GuestDTO guest, UpdateUserDTO updateUser) {
        Guest g = (Guest) userRepository.getOne(guest.getId());
        if (g != null){
            g.setName(updateUser.getName());
            g.setSurname(updateUser.getSurname());
            g.setEmail(updateUser.getEmail());
            g.setAddress(updateUser.getAddress());
            g.setPhone(updateUser.getPhone());
            g.setProfilePicturePath(updateUser.getProfilePicture().getPath());
            g.setPassword(updateUser.getPassword());
            userRepository.save(g);
            return GuestDTO.makeFromGuest(g);
        }

        return guest;
    }

    @Override
    public void delete(Long id) {
    }

    @Override
    public void block(Long id) {
    }

    @Override
    public OwnerDTO reportOwner(String ownerEmail) {
        ProfilePicture profilePicture = new ProfilePicture(1L, "src/main/resources/images/profile1.png", new User());
        return new OwnerDTO(1L, "Mika", "Mikic", "mika123@gmail.com", "bbbb", null, null, Role.OWNER, profilePicture, true, false, false, null, null);
    }

    @Override
    public ArrayList<GuestDTO> getAllBlocked() {
        ArrayList<GuestDTO> all = findAll();
        ArrayList<GuestDTO> blocked = new ArrayList<>();
        for (GuestDTO g : all){
            if (g.isBlocked()){
                blocked.add(g);
            }
        }
        return blocked;
    }

    @Override
    public ArrayList<GuestDTO> getAllReported() {
        ArrayList<GuestDTO> all = findAll();
        ArrayList<GuestDTO> reported = new ArrayList<>();
        for (GuestDTO g : all){
            if (g.isReported()){
                reported.add(g);
            }
        }
        return reported;
    }

    @Override
    public ArrayList<Long> addToFavouriteAccommodations(GuestDTO guest, Long accommodationId) {
        GuestDTO guestDTO = getGuestById(guest.getId());
        if (guestDTO == null){
            return null;
        }
        ArrayList<Long> favourites = guestDTO.getFavouriteAccommodations();
        favourites.add(accommodationId);
        guest.setFavouriteAccommodations(favourites);
        return favourites;
    }

    @Override
    public ArrayList<Long> removeFromFavouriteAccommodations(GuestDTO guest, Long accommodationId) {
        GuestDTO guestDTO = getGuestById(guest.getId());
        if (guestDTO == null){
            return null;
        }
        ArrayList<Long> favourites = guestDTO.getFavouriteAccommodations();
        favourites.remove(accommodationId);
        guest.setFavouriteAccommodations(favourites);
        return favourites;
    }

    @Override
    public ArrayList<AccommodationListingDTO> findAllFavouriteAccommodations(GuestDTO guest) throws IOException {
        ArrayList<Long> favouriteIds = guest.getFavouriteAccommodations();
        ArrayList<AccommodationListingDTO> favourites = new ArrayList<>();
        AccommodationService accommodationService = new AccommodationService();
        ArrayList<AccommodationListingDTO> all = accommodationService.findAll();
        for(AccommodationListingDTO a : all){
            if(favouriteIds.contains(a.getId())){
                favourites.add(a);
            }
        }
        return favourites;
    }


}
