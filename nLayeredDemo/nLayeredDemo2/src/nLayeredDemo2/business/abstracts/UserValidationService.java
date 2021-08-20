package nLayeredDemo2.business.abstracts;

import nLayeredDemo2.entities.conceretes.User;

public interface UserValidationService {
    boolean  CheckIfValidation(User user);
}
