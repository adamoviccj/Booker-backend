package booker.BookingApp.service.interfaces;

import booker.BookingApp.dto.commentsAndRatings.CreateOwnerCommentDTO;
import booker.BookingApp.dto.commentsAndRatings.OwnerCommentDTO;
import booker.BookingApp.model.commentsAndRatings.OwnerComment;
import org.springframework.security.core.Authentication;

import java.util.List;

public interface IOwnerCommentService {
    public OwnerComment findOne(Long id);
    public List<OwnerComment> findAll();
    public List<OwnerCommentDTO> findAllForOwner(String ownerId);
    public void remove(Long id, Authentication connectedUser);
    public OwnerCommentDTO create(CreateOwnerCommentDTO ownerCommentDTO, Authentication connectedUser);
    public OwnerCommentDTO update(OwnerCommentDTO ownerCommentDTO);
    public void delete(Long id);
    public List<OwnerComment> findAllReported();
    public void report(Long id);
    public List<OwnerCommentDTO> findAllNotDeletedForOwner(String ownerId);
    public void deleteForAdmin(Long id);
    public void approveComment(Long id);
}
