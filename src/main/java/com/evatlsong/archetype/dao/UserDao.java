package com.evatlsong.archetype.dao;

import com.evatlsong.archetype.domain.User;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * Created by evatlsong on 15-10-26.
 */
public interface UserDao {
    void save(User user) throws DataAccessException;
    User getUser(Integer id);
    List<User> getUserList();
}
