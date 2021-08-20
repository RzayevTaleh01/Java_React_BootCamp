package nLayeredDemo2.Google;

import nLayeredDemo2.entities.conceretes.User;

public class GoogleManager {
    public void loginGoogle(User user) {
        System.out.println("Google ilə giriş edildi. Xoş Gəldin! :  " + user.getFirstname());
    }
}
