package moe.src.leyline.framework.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javaslang.collection.Stream;
import moe.src.leyline.framework.domain.user.LeylineUser;
import moe.src.leyline.framework.domain.user.LeylineUserRepo;

/**
 * Created by POJO on 6/8/16.
 */
@Service
public abstract class LeylineUserDetailsService<T extends LeylineUserRepo, D extends LeylineUser> extends LeylineDomainService<T,D> implements UserDetailsService {
    @Autowired
    private T userRepo;

    @SuppressWarnings(value = "unchecked")
    @Override
    public User loadUserByUsername(String username) throws
            UsernameNotFoundException {
        D user = (D) userRepo.findByNameEquals(username);
        if (user == null) {
            throw new UsernameNotFoundException("Username " + username + " not found");
        }
        return new User(username, getPassword(user), getRole(user));
    }

    public String getPassword(D user) {
        return user.getPassword();
    }

    public Collection<? extends GrantedAuthority> getRole(D user) {
        return Stream.of(new SimpleGrantedAuthority("ROLE_USER")).toJavaList();
    }

    public User getCurrentUser() {
        AbstractAuthenticationToken auth = (AbstractAuthenticationToken)
                SecurityContextHolder.getContext().getAuthentication();
        return  auth.getPrincipal() instanceof User ? (User)auth.getPrincipal() : null;
    }

    public Boolean isLoggedInUserEq(LeylineUser user){
        return getCurrentUser()!=null && user.getName().equals(getCurrentUser().getUsername());
    }

}
