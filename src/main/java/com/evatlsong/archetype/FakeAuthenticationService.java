package com.evatlsong.archetype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by evatlsong on 15-10-18.
 */
public class FakeAuthenticationService implements AuthenticationService {
    private Map<String, String> user = new HashMap<String, String>();
    public void addUser(String username, String password) {
        user.put(username, password);
    }
    @Override
    public boolean isValidLogin(String username, String password) {
        return user.containsKey(username) && password.equals(user.get(username));
    }
}
