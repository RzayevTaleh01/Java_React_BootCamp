package nLayeredDemo2.core.conceretes;

import nLayeredDemo2.Google.GoogleManager;
import nLayeredDemo2.core.abstracts.WithLoginService;
import nLayeredDemo2.entities.conceretes.User;

public class GoogleManagerAdapter implements WithLoginService {
    @Override
    public void withLogin() {
        User user=new User(1,"Taleh","Rzayev","talehrzayev2002@gmail.com","123456");
        GoogleManager googleManager=new GoogleManager();
        googleManager.loginGoogle(user);
    }
}
