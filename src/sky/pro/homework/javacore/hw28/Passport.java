package sky.pro.homework.javacore.hw28;

import java.util.Objects;

public class Passport {

    private String id;
    private String surname;
    private String name;
    private String middleName;
    private String birthDate;

    public Passport(String id, String surname, String name, String middleName, String birthDate) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.birthDate = birthDate;

        if (id == null || surname == null || name == null || birthDate == null){
            throw new IllegalArgumentException("Поля не могут быть пустыми!");
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id='" + id + '\'' +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(id, passport.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
