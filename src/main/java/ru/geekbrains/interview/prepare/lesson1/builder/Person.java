package ru.geekbrains.interview.prepare.lesson1.builder;

public class Person {

    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static class Builder {
        private final Person newPerson;

        public Builder() {
            newPerson = new Person();
        }

        public Builder setFirstName(String firstName) {
            newPerson.firstName = firstName;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            newPerson.middleName = middleName;
            return this;
        }

        public Builder setLastName(String lastName) {
            newPerson.lastName = lastName;
            return this;
        }

        public Builder setCountry(String country) {
            newPerson.country = country;
            return this;
        }

        public Builder setAddress(String address) {
            newPerson.address = address;
            return this;
        }

        public Builder setPhone(String phone) {
            newPerson.phone = phone;
            return this;
        }

        public Builder setAge(int age) {
            newPerson.age = age;
            return this;
        }

        public Builder setGender(String gender) {
            newPerson.gender = gender;
            return this;
        }

        public Person build() {
            return newPerson;
        }

    }
}
