public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    public Bank() {
        this.customers = new Customer[10]; // Batas maksimal 10 nasabah
        this.numberOfCustomers = 0;
    }

    public void addCustomer(String f, String l) {
        if (numberOfCustomers < customers.length) {
            Customer c = new Customer(f, l);
            customers[numberOfCustomers] = c;
            numberOfCustomers++;
        }
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        if (index >= 0 && index < numberOfCustomers) {
            return customers[index];
        }
        return null;
    }
}