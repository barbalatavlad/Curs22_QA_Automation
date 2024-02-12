import java.util.Random;

public class Constants {
    public static final String URL = "https://tutorialsninja.com/demo/";
    public static final String FIRST_NAME = "Vlad";
    public static final String LAST_NAME = "George";
    public static final String EMAIL = "vlad1@test.ro";
    public static final String RANDOM_EMAIL = generateEmail();
    public static final String TELEPHONE = "0727217217";
    public static final String PASSWORD = "Vlad123!";

    private static String generateEmail(){
        Random rnd = new Random();
        return "vlad" + rnd.nextInt(10000) + "@test.ro";
    }

}
