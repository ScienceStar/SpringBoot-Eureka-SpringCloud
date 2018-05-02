package com.service.impl;

import com.dao.UserRepository;
import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Create by mac on 2018/4/30
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * 登录
     *
     * @param name
     * @param password
     * @return
     */
    @Override
    public User login(String name, String password) {
        return userRepository.findByNameAndPassword(name, password);
    }

    /**
     * 注册
     *
     * @param user
     * @return
     */
    @Override
    public User register(User user) {
        return userRepository.save(user);
    }

    /**
     * 注销
     *
     * @param user
     * @return
     */
    @Override
    public void writeOff(User user) {
        userRepository.delete(user);
    }

    /**
     * 当前用户是否已经存在
     *
     * @param user
     * @return
     */
    @Override
    public boolean isExists(User user) {
        return userRepository.findOne(user.getId()) != null ? true : false;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findOne(id);
    }
}
