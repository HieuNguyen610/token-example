package hieu.tokenexample.dao;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SignupRequest {
    private String username;
    private String email;
    private Set<String> role;
    private String password;

}
