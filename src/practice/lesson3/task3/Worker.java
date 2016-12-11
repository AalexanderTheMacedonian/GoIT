package practice.lesson3.task3;

/**
 * Created by alexandrsemenov on 17.11.16.
 */
public class Worker {
    private String adres;
    private long salary;

    public Worker(String adres, long salary) {
        this.adres = adres;
        this.salary = salary;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
