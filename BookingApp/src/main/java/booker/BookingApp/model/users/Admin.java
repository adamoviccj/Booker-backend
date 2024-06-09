package booker.BookingApp.model.users;

import booker.BookingApp.enums.Privilege;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

//@EqualsAndHashCode(callSuper = true)
//@Data
//@Entity
//@DiscriminatorValue("ADMIN")
//public class Admin extends User {
//    private List<Privilege> privileges;
//
//    public static List<Privilege> getPrivileges() {
//        List<Privilege> privilegeList = new ArrayList<>();
//        privilegeList.add(Privilege.ACCOUNT_MANAGEMENT);
//        privilegeList.add(Privilege.APPROVE_ACCOMMODATION);
//        privilegeList.add(Privilege.SEARCH_ACCOMMODATIONS);
//        privilegeList.add(Privilege.VIEW_ACCOMMODATION_DETAILS);
//        privilegeList.add(Privilege.APPROVE_COMMENT);
//        privilegeList.add(Privilege.BLOCK_USER);
//        privilegeList.add(Privilege.HELLO_ADMIN);
//        return privilegeList;
//    }
//}
