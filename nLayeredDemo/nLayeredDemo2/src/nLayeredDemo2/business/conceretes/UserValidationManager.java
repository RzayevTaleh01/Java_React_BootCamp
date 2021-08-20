package nLayeredDemo2.business.conceretes;

import nLayeredDemo2.business.abstracts.UserValidationService;
import nLayeredDemo2.entities.conceretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidationManager implements UserValidationService {
    @Override
    public boolean CheckIfValidation(User user) {
        boolean result = true;
        try {

            if (!(user.getFirstname().length() >= 2 && user.getLastname().length() >= 2)) {

                System.out.println("Ad və Soyad ən azı 2 simvoldan ibarət olmalıdır.");
                result=false;


            }

            if (!(user.getPassword().length()>=6)) {

                System.out.println("Şifrə ən azı 6 simvol olmalıdır.");
                result=false;
            }

            String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

            Pattern pattern = Pattern.compile(regex);

            Matcher matcher = pattern.matcher(user.getEmail());

            if (!matcher.matches()) {

                System.out.println("Emaili düzgün daxil etmədiniz");



            }

            return result;

        } catch (Exception e) {
            result=true;
        }

        return result;




    }

}
