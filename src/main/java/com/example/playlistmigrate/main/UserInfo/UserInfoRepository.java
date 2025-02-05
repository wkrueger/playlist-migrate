package com.example.playlistmigrate.main.UserInfo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
  UserInfo findByEmail(String email);
}
