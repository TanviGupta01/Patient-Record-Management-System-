public class Patient {
    private String name;
    private int age;
    private String gender;
    private String problem;

    public Patient(String name, int age, String gender, String problem) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.problem = problem;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " | " + age + " | " + gender + " | " + problem;
    }
}
