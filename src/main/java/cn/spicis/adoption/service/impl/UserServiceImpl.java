package cn.spicis.adoption.service.impl;

import cn.spicis.adoption.domain.Users;
import cn.spicis.adoption.repository.UsersMapper;
import cn.spicis.adoption.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UsersMapper usersMapper;

    @Override
    public Users selectByUsername(String username) {
        return usersMapper.selectByUsername(username);
    }

    public Users selectByid(int userId) {
        return usersMapper.selectByPrimaryKey(userId);
    }
}
