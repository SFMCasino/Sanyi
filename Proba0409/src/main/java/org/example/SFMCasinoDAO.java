package org.example;

import java.util.List;

public interface SFMCasinoDAO extends AutoCloseable {
    public void saveUser(User a);
    public void deleteUser(User a);
    public void findUser(User a);
    public void updateUser(User a);
    public List<User> getUser();

}
