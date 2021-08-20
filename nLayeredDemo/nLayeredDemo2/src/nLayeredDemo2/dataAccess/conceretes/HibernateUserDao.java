package nLayeredDemo2.dataAccess.conceretes;
import nLayeredDemo2.dataAccess.abstracts.UserDao;
import nLayeredDemo2.entities.conceretes.User;
import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {
    List<User> users = new ArrayList<User>();

    public HibernateUserDao() {

        User user1 = new User(1,"Taleh","Rzayev","e@e","12345");
        User user2 = new User(2,"Talehx","Rzayev","a@e","12345");

        users.add(user1);
        users.add(user2);
    }

    @Override
    public void add(User user) {
        System.out.println(user.getFirstname()+" adlı istifadəçi əlavə olundu");
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getFirstname()+ " adlı istifadəçi silindi");
    }

    @Override
    public void update(User user) {
        System.out.println(user.getFirstname()+ " adlı istifadəçinin məlumatları yeniləndi");
    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public boolean get(boolean b) {
        return false;
    }

    @Override
    public User get(String email) {

        for (User user : users) {

            if (user.getEmail() == email) {

                return user;

            }

        }

        return null;

    }

}



