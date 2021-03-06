package moe.src.leyline.interfaces.dto.user;

import lombok.AllArgsConstructor;
import moe.src.leyline.framework.interfaces.dto.LeylineDTO;

/**
 * Created by bytenoob on 6/18/16.
 */
@AllArgsConstructor
public class UserLoginDTO implements LeylineDTO {
    public Long id;
    public String username;
    public String password;
    public String domain;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(final String domain) {
        this.domain = domain;
    }
}