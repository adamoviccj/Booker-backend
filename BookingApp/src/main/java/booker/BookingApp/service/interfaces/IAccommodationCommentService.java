package booker.BookingApp.service.interfaces;

import booker.BookingApp.dto.accommodation.AccommodationCommentDTO;
import booker.BookingApp.dto.accommodation.CreateAccommodationCommentDTO;
import booker.BookingApp.model.accommodation.AccommodationComment;
import org.springframework.security.core.Authentication;

import java.util.List;

public interface IAccommodationCommentService {
    public AccommodationComment findOne(Long id);
    public List<AccommodationComment> findAll();
    public List<AccommodationComment> findAllForAccommodation(Long accommodationId);
    public void remove(Long id);
    public AccommodationCommentDTO create(CreateAccommodationCommentDTO accommodationCommentDTO, Authentication connectedUser);
    public AccommodationCommentDTO update(AccommodationCommentDTO accommodationCommentDTO);
    public void delete(Long id, Authentication connectedUser);
    public void report(Long id);
    public AccommodationComment save(AccommodationComment accommodationComment);
    public List<AccommodationComment> findAllReported();
    public List<AccommodationCommentDTO> findAllNotDeletedForAccommodation(Long accommodationId);
    public void deleteForAdmin(Long id);
    public void approveComment(Long id);
}
