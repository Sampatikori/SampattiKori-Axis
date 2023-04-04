package Exception;

public class InvalidAgeException extends Throwable {
    public InvalidAgeException(String userIsAminer) {
        super(userIsAminer);

    }
}
