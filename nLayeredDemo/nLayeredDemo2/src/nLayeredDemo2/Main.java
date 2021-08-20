package nLayeredDemo2;

import nLayeredDemo2.business.abstracts.LoginService;
import nLayeredDemo2.business.abstracts.UserService;
import nLayeredDemo2.business.conceretes.LoginManager;
import nLayeredDemo2.business.conceretes.UserManager;
import nLayeredDemo2.business.conceretes.UserValidationManager;
import nLayeredDemo2.business.conceretes.VerificationEmailManager;
import nLayeredDemo2.core.conceretes.GoogleManagerAdapter;
import nLayeredDemo2.dataAccess.conceretes.HibernateUserDao;
import nLayeredDemo2.entities.conceretes.User;



    public class Main {

        public static void main(String[] args) {

            UserService userService = new UserManager(new HibernateUserDao(), new UserValidationManager(),
                    new VerificationEmailManager());

            User user = new User(1,"Taleh","Rzayev","as@as","asd");

            System.out.println("**********************************");
            userService.add(user);

            System.out.println("**********************************");

            LoginService loginService = new LoginManager(new HibernateUserDao());
            loginService.login("engin@hotmail.com", "sifre123");

            System.out.println("**********************************");

            LoginService loginService2 = new LoginManager(new HibernateUserDao(), new GoogleManagerAdapter());
            loginService2.withLogin();

        }

    }
