package nLayeredDemo2.business.abstracts;

import nLayeredDemo2.entities.conceretes.User;

public interface VerificationService {
    void verify(User user);
    void sendVerification(User user);
    boolean getVerification(User user);
}
