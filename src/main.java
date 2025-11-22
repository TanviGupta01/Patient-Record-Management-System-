import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        PatientManager manager = new PatientManager();

        while(true) {
            Menu.showMenu();
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter gender: ");
                    String gender = sc.nextLine();

                    System.out.print("Enter problem: ");
                    String problem = sc.nextLine();

                    if(Validator.isEmpty(name) || Validator.isEmpty(gender) || Validator.isEmpty(problem)
                        || !Validator.isValidAge(age)) {

                        System.out.println("❌ Invalid input!");
                    } else {
                        manager.addPatient(new Patient(name, age, gender, problem));
                    }
                    break;

                case 2:
                    System.out.print("Enter name to search: ");
                    String searchName = sc.nextLine();
                    manager.searchPatient(searchName);
                    break;

                case 3:
                    manager.viewAll();
                    break;

                case 4:
                    System.out.println("✅ Exiting...");
                    System.exit(0);

                default:
                    System.out.println("❌ Invalid choice!");
            }
        }
    }
}
