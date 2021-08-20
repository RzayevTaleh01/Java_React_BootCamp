package nLayeredDemo2.business.abstracts;
import nLayeredDemo2.entities.conceretes.User;
import java.util.List;
public interface UserService {
    void add(User user);
    void addCompletion(User user, boolean result);
    List<User> getAll();
}
