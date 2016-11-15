package Practice.lesson3;

/**
 * Created by alexandrsemenov on 14.11.16.
 */
    class Bank {
    private long balance;
    private String[] emploees;
    private String adress;

    public Bank(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setEmploees(String[] emploees) {
        this.emploees = emploees;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
