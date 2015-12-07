package in.clayfish.elusen.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * @author shuklaalok7
 * @since 07/12/15
 */
@Getter
@Setter
public class User {
    private String username;
    private String password;

    private Set<Role> roles;
}
