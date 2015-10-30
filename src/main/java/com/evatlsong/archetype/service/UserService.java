package com.evatlsong.archetype.service;

import com.evatlsong.archetype.dao.UserDao;
import com.evatlsong.archetype.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by evatlsong on 15-10-26.
 */
@Service
@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;
    public void save(User user) {
        userDao.save(user);
    }
    public List<User> getAllUser() {
        return userDao.getUserList();
    }
}
