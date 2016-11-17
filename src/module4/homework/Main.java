package module4.homework;

/**
 * Created by alexandrsemenov on 16.11.16.
 */
public class Main {
    public static void main(String[] args) {
        USBank usa = new USBank(722337,"USA",Currency.USD,2000,2133,2113,881);
        EUBank eur = new EUBank(993233,"NDL",Currency.EUR,1132,7653,2833,111);
        ChinaBank chi = new ChinaBank(9098899, "CHI", Currency.USD, 5004, 1710, 5011, 300);

        BankSystemImpl bankSystem = new BankSystemImpl();

        User user1 = new User(7878,"Alex", 100, 4, "Company", 2500, usa);
        User user2 = new User(7879,"John", 2000, 3, "Company", 4200, usa);
        User user3 = new User(7880,"Bob", 2, 4, "Company", 2000, eur);
        User user4 = new User(7881,"Alex", 22112, 5, "Company", 1000, eur);
        User user5 = new User(7882,"Alex", 432, 4, "Company", 2000, chi);
        User user6 = new User(7883,"Alex", 100, 2, "Company", 5000, chi);

        System.out.println("User1 name is "+user1.getName());
        System.out.println("John`s bank is in the "+user2.getBank().getBankCountry());
        System.out.println("Bob`s company is "+user3.getCompanyName());

        bankSystem.withdrawOfUser(user4, 999999);
        bankSystem.fundUser(user5, 500);
        bankSystem.paySalary(user6);
        bankSystem.transferMoney(user3,user1,99999);

        System.out.println(user1.toString());
    }
}
