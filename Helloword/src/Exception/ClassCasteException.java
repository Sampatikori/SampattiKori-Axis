package Exception;

public class ClassCasteException extends Throwable {
    public static void main(String[] args) throws InvalidAgeException, InvalidCountryException {
        Employee e = new RegularEmployee();
        e.work();
        ContractBasedEmployee ce = new ContractBasedEmployee();
        ce.work();

        Employee e1=new Employee();
        try {
            e1.registerProfile(19, "America");
        }catch (InvalidAgeException e2){
            System.out.println("user is minor");
        }catch (InvalidCountryException e3){
            System.out.println("Invalid country");
        }
    }
}
