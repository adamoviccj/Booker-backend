//package booker.BookingApp.model.users;
//
//import booker.BookingApp.enums.Privilege;
//import booker.BookingApp.model.commentsAndRatings.OwnerComment;
//import booker.BookingApp.model.commentsAndRatings.OwnerRating;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import jakarta.persistence.*;
//import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.ToString;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@EqualsAndHashCode(callSuper = true)
//@Data
//@Entity
//@ToString(exclude = {"ratings", "comments"})
//@DiscriminatorValue("OWNER")
//public class Owner extends User {
//    @Column(name = "reported")
//    private boolean reported;
//    @Column(name = "blocked")
//    private boolean blocked;
//    @Column(name = "deleted")
//    private boolean deleted;
//    @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JsonIgnore
//    private List<OwnerRating> ratings;
//    @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JsonIgnore
//    private List<OwnerComment> comments;
//    @Column(name = "requestNotificationEnabled")
//    private boolean requestNotificationEnabled;
//    @Column(name = "cancellationNotificationEnabled")
//    private boolean cancellationNotificationEnabled;
//    @Column(name = "ratingNotificationEnabled")
//    private boolean ratingNotificationEnabled;
//    @Column(name = "accNotificationEnabled")
//    private boolean accNotificationEnabled;
//    private List<Privilege> privileges;
//
//    public static List<Privilege> getPrivileges() {
//        List<Privilege> privilegeList = new ArrayList<>();
//        privilegeList.add(Privilege.VIEW_ACCOMMODATIONS);
//        privilegeList.add(Privilege.CREATE_ACCOMMODATION);
//        privilegeList.add(Privilege.UPDATE_ACCOMMODATION);
//        privilegeList.add(Privilege.ACCOUNT_MANAGEMENT);
//        privilegeList.add(Privilege.DELETE_ACCOUNT);
//        privilegeList.add(Privilege.DEFINE_AVAILABILITY);
//        privilegeList.add(Privilege.UPDATE_ACCOMMODATION);
//        privilegeList.add(Privilege.SEARCH_ACCOMMODATIONS);
//        privilegeList.add(Privilege.VIEW_ACCOMMODATION_DETAILS);
//        privilegeList.add(Privilege.DEFINE_CONFIRMATION_METHOD);
//        privilegeList.add(Privilege.VIEW_REQUESTS);
//        privilegeList.add(Privilege.CONFIRM_RESERVATION);
//        privilegeList.add(Privilege.CANCEL_RESERVATION);
//        privilegeList.add(Privilege.REPORT_COMMENT);
//        privilegeList.add(Privilege.NOTIFICATIONS);
//        privilegeList.add(Privilege.REPORT_USER);
//        privilegeList.add(Privilege.REPORTS);
//        privilegeList.add(Privilege.HELLO_OWNER);
//        return privilegeList;
//    }
//}
