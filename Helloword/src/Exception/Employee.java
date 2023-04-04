package Exception;

public class Employee {
    int age;
    String country;

    public Employee() {
    }

    public Employee(int age, String country) {
        this.age = age;
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", country='" + country + '\'' +
                '}';
    }

    void work(){
        System.out.println("Employee is working in a reputed company");
    }

    public void registerProfile(int age,String country) throws InvalidCountryException, InvalidAgeException {
        if(!"India".equals(country)){
            throw new InvalidCountryException("user outside india cannot be registered");
        }
        if(age<18){
            throw new InvalidAgeException("user is aminer");
        }
    }
}
