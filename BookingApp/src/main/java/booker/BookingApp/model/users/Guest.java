//package booker.BookingApp.model.users;
//
//import booker.BookingApp.enums.Privilege;
//import jakarta.persistence.Column;
//import jakarta.persistence.DiscriminatorValue;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Table;
//import lombok.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@EqualsAndHashCode(callSuper = true)
////@Table(name = "GUESTS")
//@ToString
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@DiscriminatorValue("GUEST")
//public class Guest extends User {
//    @Column(name = "reported")
//    private boolean reported;
//    @Column(name = "blocked")
//    private boolean blocked;
//    @Column(name = "deleted")
//    private boolean deleted;
//    @Column(name = "favourite_accommodations")
//    private ArrayList<Long> favouriteAccommodations;
//    @Column(name = "notificationEnabled")
//    private boolean notificationEnabled;
//    private List<Privilege> privileges;
//
//    public static List<Privilege> getPrivileges() {
//        List<Privilege> privilegeList = new ArrayList<>();
//        privilegeList.add(Privilege.ACCOUNT_MANAGEMENT);
//        privilegeList.add(Privilege.DELETE_ACCOUNT);
//        privilegeList.add(Privilege.SEARCH_ACCOMMODATIONS);
//        privilegeList.add(Privilege.VIEW_ACCOMMODATION_DETAILS);
//        privilegeList.add(Privilege.REQUEST_RESERVATION);
//        privilegeList.add(Privilege.VIEW_REQUESTS);
//        privilegeList.add(Privilege.DELETE_REQUEST);
//        privilegeList.add(Privilege.CANCEL_RESERVATION);
//        privilegeList.add(Privilege.COMMENT_OWNER);
//        privilegeList.add(Privilege.COMMENT_ACCOMMODATION);
//        privilegeList.add(Privilege.NOTIFICATIONS);
//        privilegeList.add(Privilege.REPORT_USER);
//        privilegeList.add(Privilege.FAVOURITE_ACCOMMODATIONS);
//        privilegeList.add(Privilege.HELLO_GUEST);
//        return privilegeList;
//    }
//}
