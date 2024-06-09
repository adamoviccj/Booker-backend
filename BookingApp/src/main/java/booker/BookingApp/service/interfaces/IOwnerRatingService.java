package booker.BookingApp.service.interfaces;

import booker.BookingApp.dto.commentsAndRatings.CreateOwnerRatingDTO;
import booker.BookingApp.dto.commentsAndRatings.OwnerRatingDTO;
import booker.BookingApp.model.commentsAndRatings.OwnerRating;
import org.springframework.security.core.Authentication;

import java.util.List;

public interface IOwnerRatingService {
    public OwnerRating findOne(Long id);
    public List<OwnerRating> findAll();
    public List<OwnerRating> findAllReported();
    public void delete(Long id);
    //public OwnerRating save(OwnerRating ownerRating);
    public OwnerRatingDTO create(CreateOwnerRatingDTO ownerRatingDTO, Authentication connectedUser);
    public OwnerRatingDTO update(OwnerRatingDTO ownerRatingDTO);
    public List<OwnerRating> getAllForOwner(String ownerId);

    public void report(Long id);
    public void deleteForAdmin(Long id);
}
