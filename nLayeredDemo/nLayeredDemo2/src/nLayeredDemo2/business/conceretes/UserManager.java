package nLayeredDemo2.business.conceretes;

import nLayeredDemo2.business.abstracts.UserService;
import nLayeredDemo2.business.abstracts.UserValidationService;
import nLayeredDemo2.business.abstracts.VerificationService;
import nLayeredDemo2.dataAccess.abstracts.UserDao;
import nLayeredDemo2.entities.conceretes.User;

import java.util.List;
public class UserManager implements UserService {
    private UserDao userDao;
    private UserValidationService checkValidationService;
    private VerificationService verificationService;

    public UserManager(UserDao userDao, UserValidationService checkValidationService, VerificationService verificationService) {
        this.userDao = userDao;
        this.checkValidationService = checkValidationService;
        this.verificationService = verificationService;
    }

    @Override
    public void add(User user) {
        if (checkValidationService.CheckIfValidation(user)) {

            if (userDao.get(user.getEmail() != null))
            {

                System.out.println("Bu email adresi ilə istifadəçi bazada mövcuddur: " + user.getFirstname());
                return;
            }

            System.out.println("Qeydiyyatınız uğurludur.");
            this.userDao.add(user);
            this.verificationService.sendVerification(user);

        }

        else {
            System.out.println("Səhv! Məlumatlarınızın düzgünlüyünü yenidən yoxlayın...");
        }
    }


    @Override
    public void addCompletion(User user, boolean result) {
        if (result==true) {

            System.out.println("Qeydiyyat uğurla başa çatdı. Sistemə Daxil Ola Bilərsiniz: " + user.getFirstname());
        }

        else {
            System.out.println("Qeydiyyatı sonlandırmaq üçün " + user.getEmail()
                    + " email adresinizə göndərilən aktivləşdirmə linkini tıklayın.");
        }

    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
