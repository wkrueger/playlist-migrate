package com.example.playlistmigrate.main._Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.playlistmigrate.main.UserInfo.UserInfo;
import com.example.playlistmigrate.main.UserInfo.UserInfoRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

  @Autowired
  private UserInfoRepository userInfoRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    UserInfo userInfo = userInfoRepository.findByEmail(username);
    if (userInfo == null) {
      throw new UsernameNotFoundException("User not found");
    }
    return User.withUsername(userInfo.getUsername())
        .password(userInfo.getPassword())
        .roles(userInfo.getRoles())
        .build();
  }

}
