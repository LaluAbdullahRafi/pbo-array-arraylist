public class Main {
    public static void main(String[] args) {
        System.out.println(" EKSPLORASI ARRAY SYSTEM BANK ");

        Bank bank = new Bank();

        bank.addCustomer("Lalu", "Rafi");
        bank.addCustomer("Budi", "Santoso");

        System.out.println("Total Nasabah Terdaftar: " + bank.getNumOfCustomers());

        // 3. Tambah Rekening ke Nasabah Pertama (Lalu Rafi)
        Customer nasabah1 = bank.getCustomer(0);
        nasabah1.setAccount(new Account(500000)); // Rekening 1: Rp 500.000
        nasabah1.setAccount(new Account(1000000)); // Rekening 2: Rp 1.000.000

        System.out.println("\nNasabah: " + nasabah1.getFirstName() + " " + nasabah1.getLastName());
        System.out.println("Jumlah Rekening Milik Nasabah: " + nasabah1.getNumOfAccounts());

        // 4. Tampilkan Saldo Masing-masing Rekening (Eksplorasi Perulangan Array)
        for (int i = 0; i < nasabah1.getNumOfAccounts(); i++) {
            Account acc = nasabah1.getAccount(i);
            System.out.println(" - Saldo Rekening ke-" + (i + 1) + ": Rp " + acc.getBalance());
        }

        // 5. Uji Coba Transaksi (Deposit & Withdraw)
        System.out.println("\n--- UJI TRANSAKSI REKENING 1 ---");
        Account acc1 = nasabah1.getAccount(0);

        System.out.println("Setor Tunai Rp 200.000...");
        acc1.deposit(200000);
        System.out.println("Saldo Sekarang: Rp " + acc1.getBalance());

        System.out.println("Tarik Tunai Rp 150.000...");
        if (acc1.withdraw(150000)) {
            System.out.println("Penarikan Berhasil!");
        } else {
            System.out.println("Penarikan Gagal!");
        }
        System.out.println("Saldo Akhir: Rp " + acc1.getBalance());

        // 6. Menampilkan Semua Nasabah di Bank
        System.out.println("\n--- DAFTAR SELURUH NASABAH BANK ---");
        for (int i = 0; i < bank.getNumOfCustomers(); i++) {
            Customer c = bank.getCustomer(i);
            System.out.println((i + 1) + ". " + c.getFirstName() + " " + c.getLastName() + 
                               " | Total Rekening: " + c.getNumOfAccounts());
        }
    }
}