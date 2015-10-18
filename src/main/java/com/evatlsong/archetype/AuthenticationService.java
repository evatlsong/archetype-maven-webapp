package com.evatlsong.archetype;

/**
 * Created by evatlsong on 15-10-18.
 */
public interface AuthenticationService {
    boolean isValidLogin(String username, String password);
}
