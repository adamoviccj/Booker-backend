//package booker.BookingApp.security;
//
//import booker.BookingApp.enums.Privilege;
//import booker.BookingApp.model.users.Admin;
//import booker.BookingApp.model.users.Guest;
//import booker.BookingApp.model.users.Owner;
//import jakarta.validation.constraints.NotNull;
//import org.springframework.core.convert.converter.Converter;
//import org.springframework.security.authentication.AbstractAuthenticationToken;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.oauth2.jwt.Jwt;
//import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
//import org.springframework.security.oauth2.server.resource.authentication.JwtGrantedAuthoritiesConverter;
//
//import java.util.Collection;
//import java.util.stream.Stream;
//
//import static java.util.stream.Collectors.toSet;
//
//public class KeycloakJwtAuthConverter implements Converter<Jwt, AbstractAuthenticationToken> {
//
//    @Override
//    public AbstractAuthenticationToken convert(@NotNull Jwt source) {
//        return new JwtAuthenticationToken(
//                source,
//                Stream.concat(
//                        new JwtGrantedAuthoritiesConverter().convert(source).stream(),
//                        extractResourceRoles(source).stream())
//                        .collect(toSet()));
//    }
//
//    private Collection<? extends GrantedAuthority> extractResourceRoles(Jwt jwt) {
//        String role = jwt.getClaimAsString("role");
//        System.out.println("UDJE OVDE!!!!");
//        System.out.println(role);
//        Collection<Privilege> privileges = switch (role) {
//            case "OWNER" -> Owner.getPrivileges();
//            case "ADMIN" -> Admin.getPrivileges();
//            //case "SUPER_ADMIN" -> SuperAdmin.getPrivileges();
//            default -> Guest.getPrivileges();
//        };
//        return privileges.stream().map(privilege -> new SimpleGrantedAuthority(privilege.name())).collect(toSet());
//    }
//
//    @Override
//    public <U> Converter<Jwt, U> andThen(Converter<? super AbstractAuthenticationToken, ? extends U> after) {
//        return Converter.super.andThen(after);
//    }
//}
