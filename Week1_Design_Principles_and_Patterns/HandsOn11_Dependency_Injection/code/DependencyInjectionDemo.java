import java.util.Scanner;

public class DependencyInjectionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        System.out.print("Enter Customer ID to search: ");
        String id = scanner.nextLine();

        service.displayCustomerById(id);
        scanner.close();
    }
}
