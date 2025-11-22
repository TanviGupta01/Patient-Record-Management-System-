public class Validator {

    public static boolean isEmpty(String input) {
        return input == null || input.trim().isEmpty();
    }

    public static boolean isValidAge(int age) {
        return age > 0 && age < 120;
    }
}

