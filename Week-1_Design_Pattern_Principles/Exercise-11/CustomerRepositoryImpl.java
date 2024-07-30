public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(String id) {
        // For demonstration purposes, returning a dummy customer
        return new Customer(id, "John Doe", "johndoe@example.com");
    }
}
