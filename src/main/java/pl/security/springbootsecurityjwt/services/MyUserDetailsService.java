package pl.security.springbootsecurityjwt.services;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //DUMMY IMPLEMENTATION
        if (!"foo".equals(username)) {
            throw new UsernameNotFoundException("User not found");
        }
        return new User("foo", "foo",  true, true, true, true,
                Collections.singletonList(new SimpleGrantedAuthority("USER")));
    }
}
