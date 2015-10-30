package com.evatlsong.archetype.dao.impl;

import com.evatlsong.archetype.dao.UserDao;
import com.evatlsong.archetype.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by evatlsong on 15-10-26.
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;
    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }
    @Override
    public void save(User user) throws DataAccessException {
        currentSession().save(user);
    }

    @Override
    public User getUser(Integer id) {
        return (User)currentSession().get(User.class, id);
    }

    @Override
    public List<User> getUserList() {
        return (List<User>)currentSession().createCriteria(User.class).list();
    }
}
