package hieu.tokenexample.dao;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JwtResponse {
    private String accessToken;
    private String refreshToken;
    private Long id;
    private String username;
    private String email;
    private List<String> role;
}
