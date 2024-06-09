package booker.BookingApp.model.users;

import booker.BookingApp.model.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

//@Getter
//@Setter
//@SuperBuilder
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@JsonIgnoreProperties(value= {"user"})
//public class ProfilePicture extends BaseEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    Long id;
//    @Column(name = "path_front", nullable = false)
//    String path;
//    @Column(name = "path_mobile", nullable = false)
//    String path_mobile;
//    @OneToOne
//    @JoinColumn(name = "user_id", nullable = false, unique = true)
//    private User user;
////    @Column(name = "user_id")
////    private String userId;
//
//
//}
