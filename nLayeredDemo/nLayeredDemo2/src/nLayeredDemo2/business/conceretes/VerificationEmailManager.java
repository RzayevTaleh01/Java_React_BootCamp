package nLayeredDemo2.business.conceretes;

import nLayeredDemo2.business.abstracts.VerificationService;
import nLayeredDemo2.entities.conceretes.User;

public class VerificationEmailManager implements VerificationService {

    @Override
    public void verify(User user) {
        System.out.println("Sistemə Girişiniz Doğrulandı");
    }

    @Override
    public void sendVerification(User user) {
        System.out.println("Xoşgəldin: " + user.getFirstname() +" "+ user.getEmail()
                + " Email ünvanınıza doğrulama kodu göndərildi onu təsdiqləyin.");
    }

    @Override
    public boolean getVerification(User user) {
        return false;
    }
}
