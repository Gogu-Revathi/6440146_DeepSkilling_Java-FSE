import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<String, Customer> customers = new HashMap<>();

    public CustomerRepositoryImpl() {
        customers.put("101", new Customer("101", "Revathi"));
        customers.put("102", new Customer("102", "Srinidhi"));
        customers.put("103", new Customer("103", "Manasa"));
    }

    @Override
    public Customer findCustomerById(String id) {
        return customers.get(id);
    }
}
