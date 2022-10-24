package sky.pro.homework.javacore.hw28;

import java.util.HashSet;
import java.util.Set;

public class PassportWork {

    private Set<Passport> passportList = new HashSet<>();

    public static void main(String[] args) {

        PassportWork passportWork = new PassportWork();

        Passport passport1 = new Passport("12345", "Иванов", "Иван", "Иванович", "2000");
        Passport passport2 = new Passport("12345", "Иванов", "Иван", "Иванович", "1988");

        passportWork.addPassport(passport1);
        passportWork.addPassport(passport2);

        passportWork.printPassportList();

        System.out.println(passportWork.findPassportById("123"));
    }

    private void addPassport(Passport passport){
        if (passportList.contains(passport)){
            System.out.println("Паспорт уже есть в коллекции! Подробности по паспорту: " + passport);
            passportList.remove(passport);
            passportList.add(passport); // обновляем поля
        }else {
            passportList.add(passport);
        }
    }

    private Passport findPassportById(String passportId){
        for (Passport passport : passportList){
            if (passport.getId().equals(passportId)){
                return passport;
            }
        }
        return null;
    }

    private void printPassportList(){
        passportList.stream().forEach(System.out::println);
    }

}