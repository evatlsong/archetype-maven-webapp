package com.evatlsong.archetype.dao.impl;

import com.evatlsong.archetype.dao.UserDao;
import com.evatlsong.archetype.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.transaction.Transactional;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by evatlsong on 15-10-29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
@ActiveProfiles("h2db")
public class TestUserDao {
    @Autowired
    private UserDao userDao;
    @Test
    @Transactional
    public void shouldInsertOwner() {
        User user = new User();
        user.setUsername("test");
        user.setPassword("test");
        userDao.save(user);
    }
    @Test
    @Transactional
    public void shouldfindUser() {
        userDao.getUser(1);
    }
    @Test
    @Transactional
    public void shouldFindAllUser() {
        List<User> userList = userDao.getUserList();
        assertEquals(3, userList.size());
    }
}
