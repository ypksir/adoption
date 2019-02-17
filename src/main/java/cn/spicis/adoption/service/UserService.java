package cn.spicis.adoption.service;

import cn.spicis.adoption.domain.Users;

public interface UserService {
    Users selectByUsername(String userName);

    Users selectByid(int userId);
}
