package nLayeredDemo2.business.conceretes;

import nLayeredDemo2.business.abstracts.LoginService;
import nLayeredDemo2.core.abstracts.WithLoginService;
import nLayeredDemo2.dataAccess.abstracts.UserDao;
import nLayeredDemo2.entities.conceretes.User;

public class LoginManager implements LoginService {
    private UserDao userDao;
    private WithLoginService withLoginService;

    public LoginManager(UserDao userDao) {
        this.userDao = userDao;
    }

    public LoginManager(UserDao userDao, WithLoginService withLoginService) {
        this.userDao = userDao;
        this.withLoginService = withLoginService;
    }

    @Override
    public void login(String userEmail, String userPassword) {
        User defaultUser=userDao.get(userEmail);

        if (defaultUser==null) {

            System.out.println("eMail ünvanızı yenidən yoxlayın");
        }

        else if(userEmail==defaultUser.getEmail()&&userPassword==defaultUser.getPassword()) {

            System.out.println("Sistemə Uğurla Daxil Oldunuz. Xoş Gəldin! " + defaultUser.getFirstname());
        }

        else if(userEmail==defaultUser.getEmail()&&userPassword!=defaultUser.getPassword()){

            System.out.println("Şifrənizin doğruluğunu yoxlayın");
        }

    }

    @Override
    public void withLogin() {
        withLoginService.withLogin();
    }
}
