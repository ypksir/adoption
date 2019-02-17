package cn.spicis.adoption.security;

import cn.spicis.adoption.domain.Users;
import cn.spicis.adoption.repository.UsersMapper;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class SigninUserService implements UserDetailsService {

    @Resource
    private UsersMapper usersMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = usersMapper.selectByUsername(username);

        List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
        if (user != null) {
            String role = "ROLE_USER";
            if (1 == user.getAuthority()) {
                role = "ROLE_ADMIN";
            }
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role);
            grantedAuthorities.add(grantedAuthority);
            return new User(user.getUsername(), user.getPassword(), grantedAuthorities);

        } else {
            throw new UsernameNotFoundException("admin: " + username + " do not exist!");
        }
    }
}
