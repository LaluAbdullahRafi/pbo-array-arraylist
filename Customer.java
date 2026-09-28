public class Customer {
    private String firstName;
    private String lastName;
    private Account[] accounts;
    private int numberOfAccounts;

    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
        this.accounts = new Account[5]; // Batas maksimal 5 rekening per nasabah
        this.numberOfAccounts = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAccount(Account acct) {
        if (numberOfAccounts < accounts.length) {
            accounts[numberOfAccounts] = acct;
            numberOfAccounts++;
        }
    }

    public Account getAccount(int accountIndex) {
        if (accountIndex >= 0 && accountIndex < numberOfAccounts) {
            return accounts[accountIndex];
        }
        return null;
    }

    public int getNumOfAccounts() {
        return numberOfAccounts;
    }
}