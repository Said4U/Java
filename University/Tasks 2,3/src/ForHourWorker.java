/**
@author Shihsaid
@version 1.0

*/

public class ForHourWorker extends Salary implements Comparable<ForHourWorker>{

    int id;
    String name;
    int rate;
    double salary;

    public ForHourWorker(int id, String name, int rate) {
        this.id = id;
        this.name = name;
        this.rate = rate;
        this.salary = calculation();
    }

    public ForHourWorker(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
    @return salary = 20.8*8*this.rate
     */
    @Override
    public double calculation() {
        return 20.8*8*this.rate;
    }

    @Override
    public String toString() {
        return "[" +
                "id=" + id +
                ", name='" + name +
                ", salary=" + salary +
                ']';
    }

    @Override
    public int compareTo(ForHourWorker worker) {
        int result = Double.compare(this.salary, worker.salary) * (-1);

        if (result == 0)
            result = this.name.compareTo(worker.name);
        return result;
    }


}
