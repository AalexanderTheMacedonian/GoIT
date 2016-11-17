package module4.homework;

/**
 * Created by alexandrsemenov on 16.11.16.
 */
public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (this.getCurrency() == Currency.USD) return 100;
        else return 150;
    }

    @Override
    public int getLimitOfFunding() {
        if (this.getCurrency() == Currency.EUR) return 5000;
        else return 10000;
    }

    @Override
    public int getMonthlyRate() {
        if (this.getCurrency() == Currency.USD) return 1;
        else return 0;
    }

    @Override
    public int getCommission(int amount) {
        if (this.getCurrency() == Currency.USD) {
            if (amount < 1000) return 3;
            else return 5;
        } else {
            if (amount < 1000) return 1;
            else return 11;
        }

    }
}
