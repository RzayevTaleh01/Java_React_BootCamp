package nLayeredDemo2.dataAccess.abstracts;
import nLayeredDemo2.entities.conceretes.User;
import java.util.List;
public interface UserDao {
    void add(User user);
    void delete(User user);
    void update(User user);
    User get(int id);
    User get(String email);
    List<User> getAll();

    boolean get(boolean b);
}
