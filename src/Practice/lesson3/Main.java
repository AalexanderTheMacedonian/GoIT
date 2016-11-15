package Practice.lesson3;

/**
 * Created by alexandrsemenov on 14.11.16.
 */
public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank(1000);

        String[] employees = new String[10];
        employees[0] = "";

        bank.setEmploees(employees);
        bank.setAdress("Kyiv");
        processBankForCompany(bank);

    }

    private static void processBankForCompany(Bank bank) {
        long bankBalance = bank.getBalance();
        bank.setBalance(bankBalance + 9999);
    }

}
